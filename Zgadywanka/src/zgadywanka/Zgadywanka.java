package zgadywanka;

public class Zgadywanka {
	Gracz p1;
	Gracz p2;                  // klasa zgadywanka ma 3 skladowe sluzace do przechowywania trzech obiektow Gracz
	Gracz p3;
	
	public void rozpocznijGre() {
		p1 = new Gracz();
		p2 = new Gracz();   // utworzenie trzech obiektow Gracz i zapisanie ich w 3 skladowych
		p3 = new Gracz();
		
		int typp1 = 0;
		int typp2 = 0;      // Deklaracja trzech zmiennych, w ktorych beda przechowywane trzy typy liczb
		int typp3 = 0;		// wytypowanych przez graczy 
		
		boolean p1odgadl = false;
		boolean p2odgadl = false;  // deklaracja trzech zmiennych, ktore beda przechowywac wartosci true lub false,
		boolean p3odgadl = false;  // w zaleznosci od odpowiedzi gracza
		
		int liczbaOdgadywana = (int) (Math.random() * 10); // wyznaczenie liczby, jaka beda musieli odgadnac gracze
		System.out.println("Myslê o liczbie z zakresu od 0 do 9...");
		
		while(true) {
			System.out.println("Nalezy wytypowaæ liczbê: " + liczbaOdgadywana);
			
			p1.zgaduj();
			p2.zgaduj();    // Wywolanie metody zgaduj dla kazdego z graczy
			p3.zgaduj();
			
			typp1 = p1.liczba;                                                 // pobranie liczb od graczy
			System.out.println("Gracz pierwszy wytypowal liczbe: " + typp1);   // (wynikow wywolania metody zgaduj()
																               // poprzed odczytanie jej ze skladowych 
			typp2 = p2.liczba;												   // obiektow graczy
			System.out.println("Gracz drugi wytypowal liczbe: " + typp2);
			
			typp3 = p3.liczba;
			System.out.println("Gracz trzeci wytypowal liczbe:" + typp3);
			
			if (typp1 == liczbaOdgadywana) {
				p1odgadl = true;				// Sprawdzenie czy gracze wytypowali wlasciwa liczbe. Jesli gracz
			}									// wytypowal poprawnie to odpowiedniej zmiennej przypisywana jest
			if (typp2 == liczbaOdgadywana) {	// wartosc True (domyslnie false)
				p2odgadl = true;
			}
			if (typp3 == liczbaOdgadywana) {
				p3odgadl = true;
			}
			if (p1odgadl || p2odgadl || p3odgadl) {  // Jezekli gracz1 lub gracz2 lub gracz3 odgadl || - lub
				System.out.println("Mamy zwyciezce!");
				System.out.println("Czy gracz piewrszy wytypowa³ poprawnie? " + p1odgadl);
				System.out.println("Czy gracz drugi wytypowa³ poprawnie? " + p2odgadl);
				System.out.println("Czy gracz trzeci wytypowa³ poprawnie? " + p3odgadl);
				System.out.println("Koniec gry");
				break;  // Gra skonczona, zatem wychodzimy z petli while
			
			}	else	{
				System.out.println("Zagrajmy jeszcze raz.");  // W przeciwnym wypadku petla jest realizowana ponownie
				
			}			
		} 		
	}
}
