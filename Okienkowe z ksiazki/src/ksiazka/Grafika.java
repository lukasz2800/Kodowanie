package ksiazka;
import javax.swing.*;


public class Grafika extends JFrame	{

	public static void main(String[] args) {
		Grafika ok = new Grafika();
		
		ok.setTitle("java");	
		ok.setSize(300,200);
		ok.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ok.add(new Kanwa());
		ok.setVisible(true);
	}

}
