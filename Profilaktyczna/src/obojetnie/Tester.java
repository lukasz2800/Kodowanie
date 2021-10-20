package obojetnie;

public class Tester {

	public static void main(String[] args) {
		
		Profilaktyczna czlowiek1 = new Profilaktyczna();
		czlowiek1.imie = "Marek";
		czlowiek1.zawod = "kierowca";
		czlowiek1.auto = "BMW";
		czlowiek1.wiek = 32;
		czlowiek1.waga = 95;
		czlowiek1.zarobki = 3000;
		
		czlowiek1.przedstawSie();
		czlowiek1.ileMaszLat();
		czlowiek1.zwazymy();
		System.out.println("   ");
		System.out.println("   ");
		
		Profilaktyczna czlowiek2 = new Profilaktyczna();
		czlowiek2.imie = "Krzysztof";
		czlowiek2.zawod = "rzeznik";
		czlowiek2.auto = "Opel";
		czlowiek2.wiek = 42;
		czlowiek2.waga = 105;
		czlowiek2.zarobki = 4000;
		
		czlowiek2.przedstawSie();
		czlowiek2.ileMaszLat();
		czlowiek2.zwazymy();
		System.out.println("   ");
		
		
		Profilaktyczna czlowiek3 = new Profilaktyczna();
		czlowiek3.imie = "Mariola";
		czlowiek3.zawod = "kasjer";
		czlowiek3.waga = 55;
		czlowiek3.przedstawSie();
		czlowiek3.zwazymy();
		String xd = "czlowiek3.imie";
		char result = xd.charAt(2);
		System.out.println(result);
				
	}

}
