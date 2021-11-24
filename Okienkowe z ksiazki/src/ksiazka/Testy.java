package ksiazka;

import javax.swing.*;
import java.awt.*;

public class Testy extends JFrame {


public Testy()	{		
		
	super("Ramka 1");		
	setSize(500,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);			
}
public void paintComponent(Graphics g) {
	g.setColor(Color.green);
	g.fillRect(20,50,100,100);
}
public static void main(String[] args) {
		
	new Testy();	
		
	}
}