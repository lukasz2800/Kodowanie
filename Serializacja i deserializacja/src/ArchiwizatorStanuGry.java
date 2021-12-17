import java.io.*;

public class ArchiwizatorStanuGry {
	
	public static void main(String[] args) {
		Bohater postac1 = new Bohater(50, "Elf", new String[] {"³uk", "miecz", "py³"});
		Bohater postac2 = new Bohater(200, "Troll", new String[] {"piêœci", "wielki topór"});
		Bohater postac3 = new Bohater(120, "Magik", new String[] {"czary", "niewidzialnoœæ"});
		
		
		// tu wykonujemy operacje , ktore moga zmienic stan postaci a nastepnie je zapisujemy te obiekty
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Gra.ser"));
			os.writeObject(postac1);
			os.writeObject(postac2);
			os.writeObject(postac3);
			os.close();
		}	catch (IOException ex) {
			ex.printStackTrace();
		}
		postac1 = null;
		postac2 = null;			// przypisujemy tym zmiennym wartosci null ¿eby uniemozliwic odwolanie sie do obiektow na stercie
		postac3 = null;
		
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("Gra.ser"));  // odczytujemy bohaterow z pliku
			Bohater p1N = (Bohater) is.readObject();
			Bohater p2N = (Bohater) is.readObject();
			Bohater p3N = (Bohater) is.readObject();
			
			System.out.println("Typ postaci 1.:" + p1N.getTyp() + ", jego moc to:" + p1N.getMoc() + " a bronie to:" + p1N.getBronie());
			System.out.println("Typ postaci 2.:" + p2N.getTyp());  // sprawdzamy czy wszystko ok
			System.out.println("Typ postaci 3.:" + p3N.getTyp());
			System.out.println("Moc postaci 3.:" + p2N.getMoc());
		}	catch(Exception ex)	{
			ex.printStackTrace();
		}
	}
		
	

}
