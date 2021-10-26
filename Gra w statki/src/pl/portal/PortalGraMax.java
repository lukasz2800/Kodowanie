package pl.portal;

import java.util.Random;



public class PortalGraMax {

	public static void main(String[] args) {		
		
		int iloscRuchow = 0;       // tworzymy zmienna okreslajaca ile ruchow wykonal gracz
		
		PomocnikGry pomocnik = new PomocnikGry(); // specjalnie napisana przez nas klasa, kt�ra posiada metod� pobieraj�c� dane wejsciowe
											      // podawane przez gracza i udaje, ze jest cz�cia j�zyka Java
		Portal portal = new Portal(); // tworzymy nowy obiekt w ProstyPortal	
		
		int liczbaLosowa = (int) (Math.random() *5);  // generujemy liczbe losow�, kt�ra b�dzie zapisana w pierwszej komorce tablicy i na jej
												      // podstawie okreslamy zawartosc tablicy polozenia
		int[] polozenie = {liczbaLosowa, liczbaLosowa + 1, liczbaLosowa + 2};
		portal.ppol(polozenie);     // przekazujemy do obiektu ProstyPortal jego polozenie 	(w formie tablicy)
		
		boolean czyIstnieje = true;  // tworzymy zmienna logiczna okreslajaca, czy gra wciaz powinna sie toczyc; jest uzywana w petli while
		
		while (czyIstnieje == true) {
			String pole = pomocnik.pobierzDaneWejsciowe("Podaj liczb�");  //pobieramy lancuch znakow podany przez gracza
			
			String wynik = portal.sprawdz(pole);  // obiekt ProstyPortal sprawdza pole podane przez gracza, zwrocony wynik zapisywany jako 
																// lancuch znakow
			
			iloscRuchow++;             // inkrementujemy wartosc zmiennej iloscRuchow
			
			if (wynik.equals("zatopiony")) {      		// jesli portal zostal zatopiony przypisujemy zmiennej czyIstnieje wartosc false
				czyIstnieje = false;					// petla nie zostanie juz wiecej wykonana i wyswietlamy ilosc ruchow
				System.out.println(iloscRuchow  + "ruchow");
				
			}
			
		}
	

	}

}
