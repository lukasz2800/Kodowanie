package programowanie;

public class Trojkat {
	double pole;          // przypisujemy zmienna zmiennoprzecinkowa dla pole
	int wysokosc;         // deklarujemy wysokosc i dlugosc
	int dlugosc;	

	public static void main(String[] args) {
		
		int x = 0;
		Trojkat[] ta = new Trojkat[4];     // tworzymy nowa liste trojkatow o dlugosci 4 obiektow
		while(x < 4) {                     // iterujemy po wszystkich trojkatach
			ta[x] = new Trojkat();
			ta[x].wysokosc = (x + 1) * 2;
			ta[x].dlugosc = x + 4;
			ta[x].okreslPole();
			System.out.print("trojkat  "+x+", pole");
			System.out.println(" = " + ta[x].pole);
			x = x + 1;
		}
		int y = x;               
		x = 27;
		Trojkat t5 = ta[2];
		ta[2].pole = 343;
		System.out.print("y = " + y);
		System.out.print(", pole t5 = " + t5.pole);
	}
	
	void okreslPole() {
		pole = (wysokosc * dlugosc) / 2;
		
	}

}
