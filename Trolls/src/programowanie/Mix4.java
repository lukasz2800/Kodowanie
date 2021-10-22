package programowanie;

public class Mix4 {
	int licznik = 0;

	public static void main(String[] args) {
		int ilosc = 0;
		Mix4[] m4a = new Mix4[20];    // tworzymy nowa liste o 20 pozycjach
		int x = 0;
		while (x < 9)	{   // powtarzamy petle dopoki x < 9
			
			m4a[x] = new Mix4();       
			m4a[x].licznik = m4a[x].licznik + 1;
			
			ilosc = ilosc + 1;
			ilosc = ilosc + m4a[x].mozeNowa(x);
			x = x + 1;		
		}
		System.out.println(ilosc + " " + m4a[1].licznik);
	}
	public int mozeNowa(int indeks) {
		if (indeks < 5) {
			Mix4 m4 = new Mix4();
			m4.licznik = m4.licznik + 1;
			return 1;		
		}
		return 0;
	}
}
