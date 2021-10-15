package programowanie;

public class PiosenkaOPiwie {

	public static void main(String[] args) {
		int iloscButelek = 4;
		String slowo = "bottles";
		
		if (iloscButelek > 0); { // dopoki ilosc butelek jest wieksza niz 0
			{
			System.out.println(iloscButelek + " " + slowo + " of beer on the wall");
			System.out.println(iloscButelek + " " + slowo + " of beer");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			iloscButelek = iloscButelek - 1;
			if (iloscButelek < 0) {
				System.out.println(iloscButelek + slowo + " of beer on the wall");
			}	else {
				System.out.println("No more beer on the wall");
				
			}  // koniec else			
		}  // koniec while
	}  // koniec metody
}  // koniec klasy
}
