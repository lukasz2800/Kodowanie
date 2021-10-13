package programowanie;

public class Krasomowca {

	public static void main(String[] args) {
		String[] listaSlow1 = {"architektura wielowarstwowa", "3000 metrow", "rozwiazanie", "szesc sigma"};
		String[] listaSlow2 = {"zwieksza mozliwosci", "poprawia atrakcyjnosc", "rozproszona", "sieciowa"};
		String[] listaSlow3 = {"procesu", "punktu wpisywania", "portalu", "witryny"};
		
		int lista1Dlugosc = listaSlow1.length;
		int lista2Dlugosc = listaSlow2.length;
		int lista3Dlugosc = listaSlow3.length;   // length okresla dlugosc lancucha listaSlow
		
		int rnd1 = (int) (Math.random() * lista1Dlugosc);
		int rnd2 = (int) (Math.random() * lista2Dlugosc);  //losujemy randomowe slowo z kazdej listy
		int rnd3 = (int) (Math.random() * lista3Dlugosc);
		
		String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + " " + listaSlow3[rnd3];  // tworzy zdanie z 3 rand elementow
		
		System.out.println("To jest to " + zdanie);   // wyswietla zdanie
		
		

	}

}
