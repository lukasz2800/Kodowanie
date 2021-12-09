import java.io.*;


public class Pudelko implements Serializable	{   // samo dodanie interfejsu Serializable stanowi sygnal do JVM ¿e mozne 
													// przeprowadzic serializacje obiektow tego typu
	private int szerokosc;
	private int wysokosc;                          // te dwie wartosci beda zapisywane

	private void setSzerokosc(int s) {
		szerokosc = s;
	}
	
	private void setWysokosc(int w)	{
		wysokosc = w;
	}
	
	public static void main(String[] args) {
		
		Pudelko mojePudelko = new Pudelko();
		mojePudelko.setSzerokosc(50);
		mojePudelko.setWysokosc(20);
		
		try {								// operacje wejscia-wyjscia moga zglaszac wyjatki
			FileOutputStream fs = new FileOutputStream("pudelko.ser"); // nawiazujemy polaczenie z plikiem pudelko.ser jesli taki istnieje. 
																		//jesli nie to zostanie utworzony
			ObjectOutputStream os = new ObjectOutputStream(fs);  // Tworzymy strumieñ ObjectOutputStream po³¹czone ze strumieniem FileOutputStream
			os.writeObject(mojePudelko);						// nastepnie nakazujemy zapisac obiekt w strumieniu
			os.close();
		}	catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
