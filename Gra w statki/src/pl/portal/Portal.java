package pl.portal;

import java.util.*;           //importujemy obiekt ArrayList	


public class Portal {
	
	private ArrayList<String> polaPolozenia; //Skladowe obiektu Portal ArrayList zawierajacy pola zajmowane przez Portal oraz nazwa Portalu)
	private String nazwa;
	
	public void setpolaPolozenia(ArrayList<String> ppol)	{  //Metoda sluzaca do zapisania polozenia Portalu. Poolozenie jest generowane
		polaPolozenia = ppol;								// losowo przez metode rozmiescPortal() klasy PomocnikGry.		
	}
	
	public void setNazwa(String nzwPortalu) {   // prosta metoda ustawiajaca nazwe portalu
		nazwa = nzwPortalu;		
	}
			
	public String sprawdz(String ruch)	{   // nowa, ulepszona wersja argumentu
		String wynik = "pudlo";		
		int indeks = polaPolozenia.indexOf(ruch);  // Sprawdzamy czy pole wskazane przez gracze znajduje sie w ArrayList. W tym celu podajemy pole
											   // Jezeli pola nie bedzie to metoda indexOf() zwroci wartosc -1	
		if (indeks >= 0) {   // jesli indeks ma wartosc wieksza lub rowna 0, to wskazane przez gracza pole na pewno znajduje sie w tablicy
			polaPolozenia.remove(indeks);	 //  w takim razie usuwamy je
		
		if	(polaPolozenia.isEmpty()) {   //Zastosowanie metody ArrayList.isEmpty() w celu sprawdzenia, czy wszystkie pola zajmowane
			wynik = "zatopiony";			// przez Portal zostaly juz trafione
			System.out.println("Zatopiles portal" + nazwa + " : ( ");  // informujemy gracza kiedy portal zostal zatopiony
		}	else {
			wynik = "trafiony";  // zwraca wynik pudlo, trafiony lub zatopiony
		}
	}
	return wynik;
		
	}
}
