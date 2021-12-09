package nie;

import javax.sound.midi.*;

public class Miniodtwarzacz {

	public static void main(String[] args) {
		try {
			Sequencer sekwenser = MidiSystem.getSequencer();  // tworzymy i otwieramy sekwenser
			sekwenser.open();
			
			Sequence sekw = new Sequence(Sequence.PPQ, 4);  // tworzymy sekwencje i sciezke
			Track sciezka = sekw.createTrack();
			
			for (int i = 5; i < 64; i+=4) {                  	// tworzymy grupe zdarzen, ktore pozwola nam zagrac nuty od 5 do 61. Wywolujemy metode
				sciezka.add(tworzZdarzenie(144,1,i,100,i));		// tworzZdarzenie() w celu stworzenia komunikatu i zdarzenia, nastepnie uzyskany wynik
				sciezka.add(tworzZdarzenie(128,1,i,100,i + 2));	// (obiekt MidiEvent zwrocony przez metode tworzZdarzenie() dodajemy do sciezki. Te dwa 						
			}													// wiersze kodu tworza pare zdarzen NOTE ON 144 i NOTE OFF 128
			
			sekwenser.setSequence(sekw);
			sekwenser.setTempoInBPM(220);                       // uruchamiamy odtwarzanie
			sekwenser.start();
		}	catch (Exception ex)	{	ex.printStackTrace();	}	
	}
	
	public static MidiEvent tworzZdarzenie(int plc, int kanal, int jeden, int dwa, int takt)	{
		MidiEvent zdarzenie = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(plc, kanal, jeden, dwa);
			zdarzenie = new MidiEvent(a, takt);
		}	catch (Exception e)	{ }
		return zdarzenie;
		}
}
