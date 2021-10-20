package programowanie;

public class Pies {
	String imie;   // przypisujemy zmiennej imie typ String
	

	public static void main(String[] args) {
		
		Pies pies1 = new Pies();   // tworzymy obiekt Pies i uzywamy go
		pies1.szczekaj();
		pies1.imie = "Azorek";
		
		Pies[] mojePsy = new Pies[3];   // tworzymy liste mojepsy z trzema elementami
		
		mojePsy[0] = new Pies();   // tworzymy tablice obiektow Pies i zapisujemy w niej obiekty
		mojePsy[1] = new Pies();
		mojePsy[2] = pies1;   // przypisujemy pies1 jako ostatniego psa w liscie
		
		mojePsy[0].imie = "Szarik";  // uzyskujemy dostep do obiektow odwolujac sie do nich przez tablice
		mojePsy[1].imie = "Cywil";
		
		System.out.println("Ostatni pies ma na imie " + mojePsy[2].imie);
		
		int x = 0;
		while (x < mojePsy.length) {   // kazemy wszystkim psom szczekac
			mojePsy[x].szczekaj();
			x = x + 1;
						
		}			
	}
	public void szczekaj() {
		System.out.println(imie + " szczeka: Hau Hau!");
}
}