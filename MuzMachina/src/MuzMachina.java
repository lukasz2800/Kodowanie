import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;


public class MuzMachina implements MetaEventListener	{
	
	JPanel panelGlowny;
	ArrayList<JCheckBox> listaPolWyboru;               // wszystkie pola wyboru umieszczamy w obiekcie ArrayList
	Sequencer sekwenser;
	Sequence sekwencja;
	Track sciezka;
	JFrame ramkaGlowna;
	
	String[] nazwyInstrumentow = {"Bass Drum", "Closed Hi-Hat", "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal", "Hand Clap", "High Tom",
									"Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", "Vibraslap", "Low-mid Tom", "High Agogo",
									"Open Hi Conga"};
	int[] instrumenty = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};   // nuty grane na bebnie (35 - Bass Drum itd)	

	public static void main(String[] args) {
		new MuzMachina().tworzGUI();
	}
	public void tworzGUI() {
		ramkaGlowna = new JFrame();
		ramkaGlowna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout uklad = new BorderLayout();
		JPanel panelTla = new JPanel(uklad);
		panelTla.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));  // tzw pusta ramka pozwala na stworzenie odstepow miedzy krawedziami
																			// panelu a obszarem umieszczenia komponentow.
		listaPolWyboru = new ArrayList<JCheckBox>();
		Box obszarPrzyciskow = new Box(BoxLayout.Y_AXIS);
		
		JButton start = new JButton("Start");
		start.addActionListener(new MojStartListener());
		obszarPrzyciskow.add(start);
		
		JButton stop = new JButton("Stop");
		stop.addActionListener(new MojStopListener());
		obszarPrzyciskow.add(stop);
		
		JButton tempoG = new JButton("Szybciej");
		tempoG.addActionListener(new MojTempoGListener());
		obszarPrzyciskow.add(tempoG);
		
		JButton tempoD = new JButton("Wolniej");
		tempoD.addActionListener(new MojTempoDListener());
		obszarPrzyciskow.add(tempoD);
		
		Box obszarNazw = new Box(BoxLayout.Y_AXIS);
		for (int i=0; i < 16; i++)	{
			obszarNazw.add(new Label(nazwyInstrumentow[i]));
		}
		panelTla.add(BorderLayout.EAST, obszarPrzyciskow);
		panelTla.add(BorderLayout.WEST, obszarNazw);
		
		ramkaGlowna.getContentPane().add(panelTla);
		
		GridLayout siatkaPolWyboru = new GridLayout(16,16);
		siatkaPolWyboru.setVgap(1);
		siatkaPolWyboru.setHgap(2);
		panelGlowny = new JPanel(siatkaPolWyboru);
		panelTla.add(BorderLayout.CENTER, panelGlowny);
		
		for (int i = 0; i < 256; i++) {      // tworzymy pola wyboru, przypisujemy kazdemu z nich wartosci false
			JCheckBox c = new JCheckBox();	// zeby nie byly zaznaczone i dodajemy do obiektu ArrayList oraz panelu
			c.setSelected(false);
			listaPolWyboru.add(c);
			panelGlowny.add(c);
	}
		
		konfigurujMidi();
		
		ramkaGlowna.setBounds(50,50,30,300);
		ramkaGlowna.pack();
		ramkaGlowna.setVisible(true);
		
	}
	public void konfigurujMidi()	{
		try	{	
			sekwenser = MidiSystem.getSequencer();		//standardowy kod konfiguracji MIDI sluzacy do pobrania obiektow 
			sekwenser.open();							// Sequencer, Sequence oraz Track
			sekwencja = new Sequence(Sequence.PPQ,4);
			sciezka = sekwencja.createTrack();
			sekwenser.setTempoInBPM(120);
		}	catch(Exception e)	{e.printStackTrace();}
	}
	public void utworzSciezkeIOdtworz() {
		int[] listaSciezki = null;			// Tworzymy 16 elementowa tablice, ktora bedzie przechowywala info o 16 taktach dla 
											// instrumentu. 
		sekwencja.deleteTrack(sciezka);
		sciezka = sekwencja.createTrack();  // usuwamy sciezke i tworzymy nowa
		
		for (int i = 0; i < 16; i++) {		// Kolejne czynnosci wykonujemy dla Wszystkich szesnastu wierszy
			listaSciezki = new int[16];
			
			int klucz = instrumenty[i];     // Zapisujemy wartosc klucza, okresla jaki instrument jest uzywany (Bass itd)
											// tablica przechowuje faktyczne numery dla kazdego instrumentu
			for (int j = 0; j < 16; j++) {  // kolejne czynnosci wykonujemy dla kazdego z taktow w wierszu
				JCheckBox jc = (JCheckBox)	listaPolWyboru.get(j + (16*i));
				if (jc.isSelected()) {		// Czy pole w danym takcie jest zaznaczone? Jesli tak to zapisujemy wartosc klucza.
					listaSciezki[j] = klucz;	// jezeli nie to nie ma grac
				}	else	{
					listaSciezki[j] = 0;
				}
			}										// tworzymy zdarzenia do danego instrumentu i wszystkich szesnastu taktow
			utworzSciezke(listaSciezki);			// po czym zapisujemy na sciezce
			sciezka.add(tworzZdarzenie(176, 1, 127, 0, 16));
		}
		sciezka.add(tworzZdarzenie(192, 9, 1, 0, 15));  // chcemy upewnic sie, ze zawsze w ostatnim takcie pojawi sie zdarzenie..
		try {											// w przeciwnym razie program moze nie odtworzyc wszystkich taktow przed
			sekwenser.setSequence(sekwencja);			// ponownym odtworzeniem sciezki
			sekwenser.setLoopCount(sekwenser.LOOP_CONTINUOUSLY); // petla bedzie powtarzana w nieskonczonosc
			sekwenser.start();
			sekwenser.setTempoInBPM(120);
		}	catch(Exception e)	{e.printStackTrace();}
	}

	
public class MojStartListener implements ActionListener	{
	public void actionPerformed(ActionEvent a) {
		utworzSciezkeIOdtworz();
	}
}
public class MojStopListener implements ActionListener	{
	public void actionPerformed(ActionEvent a)	{
		sekwenser.stop();
	}
}
public class MojTempoGListener implements ActionListener	{
	public void actionPerformed(ActionEvent a) {
		float wspTempa = sekwenser.getTempoFactor();
		sekwenser.setTempoFactor((float)wspTempa * 1.03);
	}
}
public class MojTempoDListener implements ActionListener	{
	public void actionPerformed(ActionEvent a)	{
		float wspTempa = sekwenser.getTempoFactor();
		sekwenser.setTempoFactor((float)wspTempa * 0.97);
	}
}
	public void utworzSciezke(int[] lista) {
		for (int i = 0; i < 16; i++) {
			int klucz = lista[i];
			if (klucz != 0) {
				sciezka.add(tworzZdarzenie(144, 9, klucz, 100, i));
				sciezka.add(tworzZdarzenie(128, 9, klucz, 100, i+1));
			}
		}		
	}
	public static MidiEvent tworzZdarzenie(int plc, int kanal, int jeden, int dwa, int takt)	{
		MidiEvent zdarzenie = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(plc, kanal, jeden, dwa);
			zdarzenie = new MidiEvent(a, takt);
		}	catch(Exception e)	{ e.printStackTrace();}
		return zdarzenie;
		}
	}
				
	
	


