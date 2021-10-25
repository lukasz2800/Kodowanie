package ff;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Container;

public class Okno extends JFrame {
	
	JPanel p;
	JLabel pytanie;	
	JLabel powitanie;
	JButton wez;
	JButton hej;
	JButton wyczysc;
	JTextField dana;
	JTextField odglos;
	JButton wynik;
	
	
	
	Okno()	{
		setSize(400 , 300);
		setLocation(400, 100);
		setTitle("Moja aplikacja");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p = new JPanel();
		p.setLayout(new GridLayout(6,1));
		
		p.setBackground(Color.yellow);
		add(p);
		
		Container wnetrze = this.getContentPane();
		
		pytanie = new JLabel("Odg³os powy¿szego samca to ");
		powitanie = new JLabel("Witaj uzytkowniku ");
		dana = new JTextField(10);
		odglos = new JTextField(15);
		wez = new JButton("Potwierdz imie");
		hej = new JButton("Odglos");
		wyczysc = new JButton("Wyczysz wszystko");
		wynik = new JButton("Wynik");
		
		wez.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent zdarzenie) {
				powitanie.setText("Czesc " + dana.getText());				
				}
			}
		);
		
		hej.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent szczekanie) {
				pytanie.setText(dana.getText() + " robi " + odglos.getText());
				}
			}
		);
		
		wyczysc.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent czyszczenie) {
				dana.setText(" ");
				odglos.setText(" ");
				powitanie.setText(" ");
				pytanie.setText(" ");
				}
			}
		);
		
		wynik.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent lele) {
				wynik.setText("wynik");
				}
			}
		);
		
		p.add(powitanie);
		p.add(pytanie);
		p.add(dana);
		p.add(wez);
		p.add(odglos);
		p.add(hej);
		p.add(wyczysc);
		p.add(wynik);
		
		
	}
	
	

	private static final long serialVersionUID = 1L;
		

}

