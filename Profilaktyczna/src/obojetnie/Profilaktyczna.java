package obojetnie;

public class Profilaktyczna {

	String imie;
	String zawod;
	String auto;
	int wiek;
	int waga;
	int zarobki;
	
	
	void przedstawSie() {
		System.out.println("Czeœæ, jestem " + imie + " i pracuje jako " + zawod);
	}
	void ileMaszLat() {
		if (wiek < 30) {
		System.out.println("Jestem jeszcze mlody bo mam " + wiek + "lat/a");
		}
		else if (wiek > 30 && wiek < 40) {
			System.out.println("Jestem w kwiecie wieku i mam " + wiek + " lat/a");
		}	
		else {
			System.out.println("Mam kryzys poniewa¿ mam ponad " + wiek + " lat/a");
		}
	}
	void zwazymy() {
		if (waga < 80) {
			System.out.println("Jestem chudziutki/a bo waze tylko " + waga);
		}
		else if (waga > 80 && waga < 100) {
			System.out.print("Cos tam cwicze i waze " + waga);
		}
		else {
			System.out.println("Jestem bykiem bo waze " + waga);
		}
		
	
		}
	}
	


