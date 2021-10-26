package pl.portal;

import java.util.ArrayList;           //importujemy obiekt ArrayList	


public class Portal {
	
	private ArrayList<String> polaPolozenia;      //Tworzymy tablice ArrayList  - polaPolozenia
	
	public void setpolaPolozenia(ArrayList<String> ppol)	{  //nadajemy tablicy ArrayList polaPolozenia nazwe ppol
		polaPolozenia = ppol;		
	}
	public String sprawdz(String ruch)	{   // nowa, ulepszona wersja argumentu
		String wynik = "pudlo";
		
	int indeks = polaPolozenia.indexOf(ruch);  // Sprawdzamy czy pole wskazane przez gracze znajduje sie w ArrayList. W tym celu podajemy pole
											   // Jezeli pola nie bedzie to metoda indexOf() zwroci wartosc -1
	
	if (indeks >= 0) {   // jesli indeks ma wartosc wieksza lub rowna 0, to wskazane przez gracza pole na pewno znajduje sie w tablicy
		polaPolozenia.remove(indeks);	//w takim razie usuwamy je
		
		if	(polaPolozenia.isEmpty()) {   //jesli tablica jest pusta to bylo to ostateczne trafienie
			wynik = "zatopiony";
		}	else {
			wynik = "trafiony";
		}
	}
	return wynik;
		
	}
}
