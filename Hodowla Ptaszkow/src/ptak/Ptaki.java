package ptak;

public class Ptaki {
	String imie;
	int wielkosc;
	int waga;
	int iloscjajek;
	String gatunek;
	String jajko;
	String kolor;
	String zycie;
	
	void przedstawsie() {
		System.out.println("Jestem " + gatunek + " i mam na imie "+ imie);
	}
	void zniesjajko() {
		if (iloscjajek == 1) {
			System.out.println(jajko);
		}	else 
			System.out.println("Nie znosze jajek");
	}
	void gdziemieszkasz() {
		System.out.println("Mieszkam w miejscu zwanym " + zycie);
	}
	void podajkolor() {
		System.out.println("Kolor mojego upierzenia to " + kolor + " oraz " + jajko + " kolorowe");
	}
	void podajwielkosc() {
		if (wielkosc > 20) {
			System.out.println("Jestem ogromnym ptakiem");
		}	
		else if (wielkosc < 20 && wielkosc > 10) {			/// wielkosc < 20 oraz wielkosc > 10 (&& = oraz)	
			System.out.println("Jestem przecietniakiem");
		}	
		else if (wielkosc < 10) {
			System.out.println("Jestem maluszkiem");
		}
	}
}
