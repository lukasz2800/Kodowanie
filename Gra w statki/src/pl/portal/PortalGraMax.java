package pl.portal;

import java.util.*;



public class PortalGraMax {
	
	private PomocnikGry pomocnik = new PomocnikGry();					// utworzenie obiektu ArrayList zawierajacego obiekty Portal - mozna
	private ArrayList<Portal> listaPortali = new ArrayList<Portal>();   // zapisac tylko obiekty Portal  
	private int iloscRuchow = 0;
	
	private void przygotujGre() {
		
		Portal pierwszy = new Portal();
		pierwszy.setNazwa("onet.pl");
		Portal drugi = new Portal();	// utworzenie trzech obiektow Portal, nadanie im nazw i zapisanie w tablicy ArrayList
		drugi.setNazwa("wp.pl");
		Portal trzeci = new Portal();
		trzeci.setNazwa("go2.com");
		
		listaPortali.add(pierwszy);
		listaPortali.add(drugi);
		listaPortali.add(trzeci);	
		
		System.out.println("Twoim celem jest zatopienie trzech portali");    // wyswietlanie informacji dla gracza
		System.out.println("onet.pl, wpl.pl, go2.com");
		System.out.println("Postaraj sie je zatopic w jak najmniejszej liczbie ruchow");
		
		for (Portal rozmieszczanyPortal : listaPortali) {   // powtarzanie dla kazdego portalu w tablicy
			ArrayList<String> nowePolozenie = pomocnik.rozmiescPortal(3); // poproszenie PomocnikaGry o wygenerowanie polozenia Portalu
			rozmieszczanyPortal.setpolaPolozenia(nowePolozenie);   // Wywolanie metody ustawiajacej tego obiektu Portal w celu zapisania
																  // jego polozenia wygenerowanego przez pomocnika gry.
		}
	}
	
	private void rozpocznijGre() {
		while(!listaPortali.isEmpty()) {	// Dopoki tablica portali NIE jest pusta (znak ! oznacza przeczenie = listaPortali.isEmpty() = false)
			String ruchGracza = pomocnik.pobierzDaneWejsciowe("Podaj pole");  // pobranie ruchu gracza
			sprawdzRuchGracza(ruchGracza);  // Wywolanie metody sprawdzRuchGracza()
		}
		zakonczGre();  // Wywolanie metody zakonczGre()
	}
	
	private void sprawdzRuchGracza(String ruch) {
		iloscRuchow++;									// inkrementacja ilosci ruchow wykonanych przez uzytkownika
		String wynik = "pud³o";							// Poczatkowo zakladamy, ze gracz spudlowal (chyba ze okaze sie inaczej)
		
		for (Portal portalDoSprawdzenia : listaPortali) {  // powtarzanie dla kazdego Portalu w tablicy
			wynik = portalDoSprawdzenia.sprawdz(ruch);     // nakazanie Portalowi, by sprawdzil ruch i okreslil czy zostal trafiony lub zatopiony
			if (wynik.equals("trafiony")) {				
				break;                            // przerwanie dzialania petli, dalsze sprawdzanie jest bezcelowe
			}
			if (wynik.equals("zatopiony")) {
				listaPortali.remove(portalDoSprawdzenia);  // jezeli portal jest zatopiony trzeba go usunac z tablicy i przerwac petle
				break;
			}
			System.out.println("wynik");   // wyswietlanie rezultatow ruchu
		}
		
		
	}
	
	private void zakonczGre() {
		System.out.println("Wszystkie portale zostaly zatopione! Teraz Twoje informacje nie maja znaczenia.");
		if (iloscRuchow <= 18) {
			System.out.println("Wykonales jedynie " + iloscRuchow + "ruchow");
			System.out.println("Wydostales sie, zanim Twoje informacje zatonely");
		}	else {
			System.out.println("Wykonales az " + iloscRuchow + "ruchow");
			System.out.println("Teraz rybki plywaja pomiedzy Twoimi informacjami.");
		}
	}
	public static void main(String[] args) {	
		PortalGraMax gra = new PortalGraMax();   //utworzenie obiektu gry
		gra.przygotujGre();						// przygotowanie Gry
		gra.rozpocznijGre();					//informacja dla obiektu gry aby rozpoczal glowna petle( gdzie program pyta gracza o ruchy
												// i je sprawdza
		
	}

}
