package nie;
import javax.sound.midi.*;


public class Muzyka {

	
		
	public void graj() {
		try {
			Sequencer sekwenser = MidiSystem.getSequencer();  // Pobieramy obiekt Sequencer i otwieramy go (sam sie nie otworzy)
			sekwenser.open();
			Sequence sekw = new Sequence(Sequence.PPQ, 4);
			Track sciezka = sekw.createTrack();              // Prosba do obiektu Sequence o zwrocenie sciezki obiektu Track
			
			ShortMessage a = new ShortMessage();			// utworzenie obiektu komunikatu
			a.setMessage(144, 1, 44, 100);					// umieszczenie  instrukcji w komunikacie, komunikat informuje: zacznij grac nute 44
			MidiEvent nutaP = new MidiEvent(a, 1);			// utworzenie zdarzenia MidiEvent przy wykorzystaniu komunikatu
			sciezka.add(nutaP);								// dodanie zdarzenia do sciezki
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128, 2, 33, 100);
			MidiEvent nutaK = new MidiEvent(b, 2);         // zdarzenie MidiEvent to instrukcje dotyczace fragmentow piosenki (cos jak zapis nutowy)
			sciezka.add(nutaK);								// okresla co oraz kiedy nalezy zrobic
			
			sekwenser.setSequence(sekw);           			// przekazujemy obiekt Sequence do obiektu Sequencer(plyta do odtworzenia)
			
			sekwenser.start();                              // rozpoczynamy odtwarzanie (cos jak play)
			
			
		}	catch (Exception ex) {ex.printStackTrace();}
		
	}
	public static void main(String[] args) {
		Muzyka mini = new Muzyka();
		mini.graj();
	}

}
