package zgadywanka;

public class Gracz {
	int liczba = 0;             // tu jest zapisywana typowana liczba
	
	void zgaduj() {
		liczba = (int) (Math.random() * 10);
		System.out.println("Typuj� liczb�: " + liczba);  // gracz typuje liczb�
	}
}
