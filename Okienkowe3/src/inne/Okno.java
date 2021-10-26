package inne;

import javax.swing.*;
import java.awt.GridLayout;    // do rozmieszczenia komponentow
import java.awt.FlowLayout;   
import java.awt.event.*;		// do obslugi zdarzen
import javax.swing.border.*;	// do obramowania panelu	
import java.awt.Dimension;		// do ustalenia wymiarów

import java.awt.Font;      // do czcionki
import java.awt.Color;	

public class Okno extends JFrame implements ActionListener	{
	
	private static final long serialVersionUID = 1L;
	
	JPanel p1, p2;                   // skladniki okna: 2 panele
	JLabel lImie, lWiek, powitanie;  // 3 etykiety
	JTextField tImie, tWiek;		 // 2 pola tekstowe
	JButton bWez, bWyczysc; 		 // 2 przyciski
	
	Okno()	{                        // konstruktor okna
		setSize(260, 200);
		setTitle("2 przyciski demo");
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout(20));                        //wewnatrz 20px odstepu
				
		p1 = new JPanel(new GridLayout(3,2));                      // pierwszy panel dla danych
		p1.setBorder(BorderFactory.createTitledBorder("Dane"));
		p1.setBackground(Color.yellow);
		
		lImie = new JLabel("Jak Ci na imie?");
		lWiek = new JLabel("Ile masz lat?");
		tImie = new JTextField(10);
		tWiek = new JTextField(10);	
		
		bWez = new JButton("wez dane");
		bWyczysc = new JButton("wyczysc dane");
		
		bWez.addActionListener(this);      //przylacza actionlistener do przyciskow
		bWyczysc.addActionListener(this);
		
		
		
		p1.add(lImie);     //dodaje komponenty do panelu p1
		p1.add(tImie);
		p1.add(lWiek);
		p1.add(tWiek);
		p1.add(bWez);
		p1.add(bWyczysc);
		add(p1);          // dodaje panel p1 do wewnetrznego kontenera klasy okno
		
		p2 = new JPanel(new GridLayout(1,11));   // drugi panel p2 dla powitania
		p2.setBorder(BorderFactory.createTitledBorder("Powitanie"));
		p2.setBackground(Color.pink);
		
		powitanie = new JLabel("");
		powitanie.setPreferredSize(new Dimension(230, 20));
		powitanie.setFont(new Font("Monotype Corsiva", 1, 16));
		p2.add(powitanie);
		add(p2);           // dodaje panel p2 do wewnetrznego kontenera klasy okno
				
	}

	
	public void actionPerformed(ActionEvent e) {
		if	(e.getSource() == bWez)	{             // obsluga klikniecia przycisku "Wez dane"
			try {
				int wiek = Integer.parseInt(tWiek.getText());
				if (wiek < 18) powitanie.setText("Witaj " + tImie.getText() + " dziecino");
						 else powitanie.setText("Witaj " + tImie.getText() + " chodzmy na piwo");
			} catch (Exception ex) {	powitanie.setText("bledne dane"); }	
		}
		if (e.getSource()==bWyczysc) {
			tImie.setText("");
			tWiek.setText("");
			powitanie.setText("");
			
		}
	}
}
