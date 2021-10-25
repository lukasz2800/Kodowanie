package ff;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.*;

import java.awt.Color;
import java.awt.Container;

public class Okno extends JFrame {
	
	JPanel p;
	JLabel pytanie;	
	JLabel powitanie;
	JButton wez;
	JTextField dana;
	
	
	
	Okno()	{
		setSize(400 , 300);
		setLocation(100, 100);
		setTitle("Moja aplikacja");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p = new JPanel();
		p.setLayout(new GridLayout(4,1));
		
		p.setBackground(Color.yellow);
		add(p);
		
		Container wnetrze = this.getContentPane();
		
		pytanie = new JLabel("Jak Ci na imie?");
		powitanie = new JLabel("Witaj ");
		dana = new JTextField(10);
		wez = new JButton("Wez dane");
		
		wez.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent zdarzenie) {
				powitanie.setText("Witaj gnojku co masz na imie " + dana.getText());				
				}
			}
		);
		
		p.add(powitanie);
		p.add(pytanie);
		p.add(dana);
		p.add(wez);
		
		
	}
	
	

	private static final long serialVersionUID = 1L;
		

}

