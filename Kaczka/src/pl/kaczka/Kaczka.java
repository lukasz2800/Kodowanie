package pl.kaczka;

public class Kaczka {
	int wielkosc;
	
	public Kaczka(int wielkoscK, String rasa) {                         // do konstruktora klasy Kaczka dodajemy parametr typu int oraz String
		System.out.println("Kwak");
		wielkosc = wielkoscK;                              // uzywamy wartosci argumentu aby okreslic wartosc skladowej
		System.out.println("Wielkosc kaczki " + wielkosc + rasa);
	}
}



