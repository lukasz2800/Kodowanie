package ff;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;

public class Okno extends JFrame {
	Okno()	{
		setSize(200 , 150);
		setLocation(100, 100);
		setTitle("Java jest OK");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container wnetrze = this.getContentPane();
		wnetrze.setBackground(Color.yellow);
	}
	
	

	private static final long serialVersionUID = 1L;
		

}

