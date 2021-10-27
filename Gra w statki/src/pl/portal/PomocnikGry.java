package pl.portal;
import java.io.*;
import java.util.*;

public class PomocnikGry {
	private static final String alfabet = "abcdefg";
	private int dlugoscPlanszy = 7;
	private int wielkoscPlanszy = 49;
	private int [] plansza = new int[wielkoscPlanszy];
	private int iloscPortali = 0;
	
	public String pobierzDaneWejsciowe(String komunikat) {
		String daneWejsciowe = null;
		System.out.print("komunikat " + " ");
		try {
			BufferedReader is = new BufferedReader(
					new InputStreamReader(System.in));
			daneWejsciowe = is.readLine();
			if (daneWejsciowe.length() == 0) return null;
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		return daneWejsciowe.toLowerCase();		
	}
	
	public ArrayList rozmiescPortal(int wielkoscPortalu) {
		ArrayList<String> zajetePola = new ArrayList<String>();
		String [] wspolrzedneLnc = new String [wielkoscPortalu];  // zawiera wspolrzedne zapisane jako 'f6'
		String pomoc = null;									  // pomocniczy lancuch znakow
		int [] wspolrzedne = new int[wielkoscPortalu];			  // biezace proponowane wspolrzedne
		int prob = 0;											  // licznik ilosci prob
		boolean powodzenie = false;								 // flaga = czy znaleziono dobre miejsce
		int polozenie = 0;										 // biezace miejsce poczatkowe
		
		iloscPortali++;                                          // n-ty portal do rozmieszczenia
		int inkr = 1;											 // okreslenie przyrostu w poziomie
		if ((iloscPortali % 2) == 1) {							 // jesli nieparzysty portal (rozmieszczany w pionie)
			inkr = dlugoscPlanszy;								 // okreslenie przyrostu w pionie
		}
		while (!powodzenie & prob++ < 200) {                     // glowna petla poszukiwania
			polozenie = (int) (Math.random() * wielkoscPlanszy); // wybor losowego punktu poczatkowego
			System.out.print(" sprawdz" + polozenie);			 
			int x = 0;                                           // n-ty fragment rozmieszczanego portalu
			powodzenie = true;								     // zakladamy, ze sie udalo
				while (powodzenie && x < wielkoscPortalu) {		 // szukamy sasiadujacych pol planszy jesli jeszcze nie zajete
					if (plansza[polozenie] == 0) {                
						wspolrzedne[x++] = polozenie;			 // zapisujemy miejsce			
						polozenie += inkr;						// sprawdzamy nastepne sasiadujace pole
						if (polozenie >= wielkoscPlanszy) {		 // poza zakresem "dol planszy"
							powodzenie = false;		              // niepowodzenie					
						}
						if (x > 0 & (polozenie % dlugoscPlanszy == 0)) {
							powodzenie = false;
						}
					}	else {
						System.out.print(" juz zajete ");
						powodzenie = false;
					}
				}						
		}
		int x = 0;
		int wiersz = 0;
		int kolumna = 0;
		System.out.println("\n");
		while (x < wielkoscPortalu) {
			plansza[wspolrzedne[x]] = 1;
			wiersz = (int) (wspolrzedne [x] / dlugoscPlanszy);
			kolumna = wspolrzedne[x] % dlugoscPlanszy;
			pomoc = String.valueOf(alfabet.charAt(kolumna));
			zajetePola.add(pomoc.concat(Integer.toString(wiersz)));
			x++;
			System.out.print(" wspolrzedne " + x + " = " + zajetePola.get(x-1));
		}
		System.out.println("\n");
		return zajetePola;		
	
	}
}
