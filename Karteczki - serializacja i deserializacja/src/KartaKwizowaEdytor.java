import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class KartaKwizowaEdytor {
	
	private JTextArea pytanie;
	private JTextArea odpowiedz;
	private ArrayList<KartaKwizowa> listakart;
	private JFrame ramka;	

	public static void main(String[] args) {
		KartaKwizowaEdytor edytor = new KartaKwizowaEdytor();
		edytor.doDziela();
	}
	
	public void doDziela() {
		// utworzenie graficznego interfejsu uzytkownika
		ramka = new JFrame("Edytor kart kwizowych");
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panelGlowny = new JPanel();
		Font czcionkaDuza = new Font("sanserif", Font.BOLD, 24);
		
		pytanie = new JTextArea(6, 20);
		pytanie.setLineWrap(true);
		pytanie.setWrapStyleWord(true);
		pytanie.setFont(czcionkaDuza);
		
		JScrollPane przewijaniePyt	= new JScrollPane(pytanie);
		przewijaniePyt.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijaniePyt.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		odpowiedz = new JTextArea(6, 20);
		odpowiedz.setLineWrap(true);
		odpowiedz.setWrapStyleWord(true);
		odpowiedz.setFont(czcionkaDuza);
		
		JScrollPane przewijanieOdp = new JScrollPane(odpowiedz);
		przewijanieOdp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanieOdp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton przyciskNastepna = new JButton("Nastepna karta");
		
		listaKart = new ArrayList<KartaKwizowa>();
		
		JLabel etykietaPyt = new JLabel("Pytanie");
		JLabel etykietaOdp = new JLabel("Odpowiedz");
		
		panelGlowny.add(etykietaPyt);
		panelGlowny.add(przewijaniePyt);
		panelGlowny.add(etykietaOdp);
		panelGlowny.add(przewijanieOdp);
		panelGlowny.add(przyciskNastepna);
		przyciskNastepna.addActionListener(new NastepnaKartaListener());
		
		JMenuBar menu = new JMenuBar();
		JMenu menuPlik = new JMenu("Plik");
		JMenuItem opcjaNowa = new JMenuItem("Nowy");
		JMenuItem opcjaZapisz = new JMenuItem("Zapisz");
		opcjaNowa.addActionListener(new NowyMenuListener());
		
		opcjaZapisz.addActionListener(new ZapiszMenuListener());
		menuPlik.add(opcjaNowa);
		menuPlik.add(opcjaZapisz);
		menu.add(menuPlik);
		ramka.setJMenuBar(menu);
		ramka.getContentPane().add(BorderLayout.CENTER, panelGlowny);
		ramka.setSize(500, 600);
		ramka.setVisible(true);
	}

		
	public class NastepnaKartaListener implements ActionListener	{
		public void actionPerformed(ActionEvent zd)	{
			KartaKwizowa karta = new KartaKwizowa(pytanie.getText(), odpowiedz.getText());
			listaKart.add(karta);
			czyscKarte();
	}
}
	public class ZapiszMenuListener implements ActionListener	{
		public void actionPerformed(ActionEvent zd)	{
			KartaKwizowa karta = new KartaKwizowa(pytanie.getText(), odpowiedz.getText());
			listaKart.add(karta);
			
			JFileChooser plikiDanych = new JFileChooser();  // wyswietla okno dialogowe do obslugi plikow (o nazwie sawe). Realizacja programu 
			plikDanych.showSaveDialog(ramka);				// zatrzymuje sie na tym wierszu i jest wznawiana dopiero, gdy uzytkownik kliknie
			zapiszPlik(plikDanych.getSelectedFile());		// przycisk save. Cala obsluga wykonywana przez klase JFileChooser.		
		}
	}
	
	public class NowyMenuListener implements ActionListener		{
		public void actionPerformed(ActionEvent zd)	{
			listaKart.clear();
			czyscKarte();
		}
	}
	
	private void czyscKarte() {
		pytanie.setText(" ");
		odpowiedz.setText(" ");
		pytanie.requestFocus();
	}
	
	private void zapiszPlik(File plik) {  // metoda pozwalajaca na zapisanie danych w pliku, wywolywana przez ZapiszMenuListener, 
		try {							  // Argumentem jest obiekt File, reprezentujacy plik, ktory uzytkownik zapisuje
			BufferedWriter pisarz = new BufferedWriter(new FileWriter(plik));  // Laczymy strumien BufferedReader z FileWriter
														// aby poprawic efektywnosc operacji
			for (KartaKwizowa karta : listaKart)	{   // pobieramy cala zawartosc listy kart i zapisujemy je po kolei w pliku.
				pisarz.write(karta.getPytanie() + "/");	// Kazda karta jest zapisywana w nowym wierszu, pytanie jest oddzielone "/"
				pisarz.write(karta.getOdpowiedz() + "\n");	// a na koncu kazdego wiersza umieszczamy "\n"		
			}
			pisarz.close();
		}	catch	(IOException ex)	{
			System.out.println("Nie mozna zapisac pliku kart!");
			ex.printStackTrace();
		}
	}
	

		
		
		
		
	}


