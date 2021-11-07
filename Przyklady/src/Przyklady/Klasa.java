package Przyklady;

import java.util.Scanner;

public class Klasa {
	
	String imie;
	int wiek;

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Jakie Twoje imie judaszu? ");
		String imie = scan.nextLine();
		
		System.out.println("Ile masz lat judaszu? ");      ///syso ctrl+spacja
		int wiek = scan.nextInt();
		
		System.out.println("Witaj " + imie + " w wieku " + wiek + " lat");
		
		if(wiek > 18) {
			System.out.println("Chodz na piwsko");
		}	else {
			System.out.println("Idz do domu Judaszu");
		}
		}

	}


