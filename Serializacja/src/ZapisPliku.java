import java.io.*;

public class ZapisPliku {

	public static void main(String[] args) {
		try {
			FileWriter pisarz = new FileWriter("tekst.doc");  // dopisujemy lub tworzymy plik tekst.txt
			
			pisarz.write("Witamy w pliku tekstowym! treœæ pliku");  // metoda .write() wymaga przekazania lancucha znakow
			
			pisarz.close();                            // zamykamy strumien
		
		}	catch	(IOException ex) {
			ex.printStackTrace();
		}
	}
}
				// jezeli wszystko jest ok to program utworzyl nowy plik tekstowy tekst.txt/doc (zalezy jaki wybralismy)
               // wszystkie operacje wejscia-wyjscia musz¹ byæ umieszczone wewn¹trz bloku try-catch!!!!!!
               //Ka¿da z nich moze zglosic wyjatek IOException!