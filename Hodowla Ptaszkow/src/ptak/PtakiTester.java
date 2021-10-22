package ptak;

public class PtakiTester {

	public static void main(String[] args) {
		
		Ptaki a = new Ptaki();   // dodaje nowego ptaka do klasy Ptaki
		Ptaki b = new Ptaki();
		a.gatunek = "Koliber";
		a.imie = "Miras";
		a.wielkosc = 5;
		a.waga = 2;
		a.kolor = "czerwony";
		a.jajko = "znoszê jajka";
		a.zycie = "Ameryka Po³udniowa";
		a.iloscjajek = 1;
		
		a.przedstawsie();
		a.zniesjajko();
		a.gdziemieszkasz();
		a.podajkolor();
		a.podajwielkosc();
		a.wazymy();
		System.out.println(" ");
		
		b.gatunek = "Czapla szara";
		b.imie = "Helena";
		b.wielkosc = 25;
		b.waga = 20;
		b.kolor = "bialy";
		b.jajko = "znoszê jajka";
		b.zycie = "Polska";
		b.iloscjajek = 0;
		
		b.przedstawsie();
		b.zniesjajko();
		b.gdziemieszkasz();
		b.podajkolor();
		b.kolor = "czarny";   // przeciazenie metody podajkolor
		b.podajkolor();
		b.podajwielkosc();
		b.wazymy();
		
	}
}