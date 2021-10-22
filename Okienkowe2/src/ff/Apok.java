package ff;

import javax.swing.*;

public class Apok {
	public static void main(String[] args) {
		Okno ok = new Okno();
		ok.setVisible(true);
		
	}

}

class Okno extends JFrame	{
	Okno()	{
		setSize(200 , 150);
		setLocation(100, 100);
		setTitle("Java jest OK");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	

	private static final long serialVersionUID = 1L;
	
	
	
}
