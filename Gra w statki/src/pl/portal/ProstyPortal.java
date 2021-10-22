package pl.portal;

public class ProstyPortal {
	
	int [] polaPolozenia;
	int iloscTrafien;
	
	
	public void setPolaPolozenia(int [] ppol) {
		polaPolozenia = ppol;
	}
	
	
	public String sprawdz(String stringPole)	{   //pobierz pole wskazane przez gracza
		int strzal = Integer.parseInt(stringPole);  // konwersja ³ancucha znakow na liczbe calkowita
		
		String wynik = "pudlo";    // utworzenie zmiennej przechowujacej wynik metody
		
		for (int pole : polaPolozenia) { // czynnosci w petli beda okreslane dla kazdej komorki okreslajacej polozenie Portalu()
			if (strzal == pole)	{
				
				wynik = "trafiony"; 
				iloscTrafien++;          // zwiekszamy ilosc trafien o 1
				break;                   // przerwanie petli, gdyz dalsze sprawdzanie komorek nie jest konieczne
			}
		}
		if (iloscTrafien == polaPolozenia.length) {  // sprawdzamy czy portal zostal trafiony 3 razy i w razie co zmieniamy wynik
			wynik = "zatopiony";
		}
		System.out.println(wynik);   //wyswietlenie wyniku pudlo, chyba ze domyslny zostal zmieniony na trafiony lub zatopiony
		return wynik;   // zwrocenie wyniku do metody wywolujacej
	}

	
		
	

}
