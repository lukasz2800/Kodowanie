package nie;
import javax.sound.midi.*;
public class Wyjatki {
	
	public void graj() {
		try {
			Sequencer sekwenser = MidiSystem.getSequencer();
			System.out.println("mamy sekwenser");
		} catch (MidiUnavailableException e) {
			System.out.println("mamy problem");
			
		}
		
	}

	public static void main(String[] args) {
		Wyjatki mt = new Wyjatki();
		mt.graj();
		

	}

}
