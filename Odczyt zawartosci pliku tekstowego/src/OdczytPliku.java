import java.io.*;

public class OdczytPliku {

	public static void main(String[] args) {
		
		try {
			File mojPlik = new File("tekst.txt");
			FileReader czytelnikF = new FileReader(mojPlik);  // strumien nawiazujacy polaczenie z plikiem tekstowym, umowliwia odczytywanie znakow
			BufferedReader czytelnik = new BufferedReader(czytelnikF);
			// Aby poprawic efektywnosc odczytu nalezy polaczyc strumien FileREader ze strumieniem BufferedReader. W tym przypadku dane
			// beda pobierane z pkiku dopiero wtedy, kiedy caly bufor zostanie oprozniony gdy program go odczyta
			
			String wiersz = null;  // zmienna, w ktorej beda przechowywane odczytywane wiersze tekstu
			
			while ((wiersz = czytelnik.readLine()) != null)	{  // odczytaj wiersz tekstu i zapisz go w zmiennej wiersz. Tak dlugo jak
				System.out.println(wiersz);		// zawartosc zmiennej jest rozna od null wyswietlaj lancuch znakow 
			}
			czytelnik.close();
				
		}	catch (Exception zd) {
			zd.printStackTrace();
		}
	}

}
