package programowanie;

public class PiosenkaOPiwie {
	int iloscButelek;
	int x = iloscButelek;
	
	public static void main(String[] args) {
		int x = 5;		
		String slowo = "bottles";
		String jedna = "bottle";
		
		while (x > 1) {                   // dopoki ilosc butelek jest wieksza niz 0			
			System.out.println(x + " " + slowo + " of beer on the wall");
			System.out.println(x + " " + slowo + " of beer");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			x = x - 1;
		if (x < 2) {
			System.out.println(x + " " +  jedna + " on the wall");
			x = x - 1;
		}
		
		if (x < 1) {
		System.out.println("No more beer on the wall");	
		}	 			
		}	 
	}  
}
