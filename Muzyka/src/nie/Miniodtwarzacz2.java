
package nie;
import javax.sound.midi.*;

public class Miniodtwarzacz2 implements ControllerEventListener	{

	
	public static void main(String[] args) {
		Miniodtwarzacz2 mini = new Miniodtwarzacz2();
		mini.doRoboty();
	}
	public void doRoboty() {	
		try {
			Sequencer sekwenser = MidiSystem.getSequencer();
			sekwenser.open();
			                                                  // rejestrujemy odbiorce zdarzen w sekwenserze. Metoda rejestracyjna 
			int[] zdarzenieObslugiwane = {127};				// wymaga przekazania odbiorcy zdarzen oraz tablicy liczb ca³kowitych
			sekwenser.addControllerEventListener(this, zdarzenieObslugiwane); // typu int reprezentujacej liste zdarzen ControllerEvent
																// które chcemy odbierac. Interesuja nas zdarzenia o nr 127
			
			Sequence sekw = new Sequence(Sequence.PPQ, 4);
			Track sciezka = sekw.createTrack();
			
			for (int i = 5; i < 61; i+=4) {
				sciezka.add(tworzZdarzenie(144,1,i,100,i));
				
				sciezka.add(tworzZdarzenie(176,1,127,0,i));
				sciezka.add(tworzZdarzenie(128,1,i,100,i+2));
			}
			
			sekwenser.setSequence(sekw);
			sekwenser.setTempoInBPM(420);
			sekwenser.start();
		}	catch	(Exception ex)	{	ex.printStackTrace();	}
	}
	public void controlChange(ShortMessage zdarzenie) {
		System.out.println("laj");
			
	}
	public static MidiEvent tworzZdarzenie(int plc, int kanal, int jeden, int dwa, int takt) {
		MidiEvent zdarzenie = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(plc, kanal, jeden, dwa);
			zdarzenie = new MidiEvent(a, takt);			
		}	catch(Exception e)	{ }
		return zdarzenie;
	}

}
