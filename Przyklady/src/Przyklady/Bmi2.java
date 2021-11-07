package Przyklady;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Bmi2 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	JPanel p;
	JPanel p2;
	JLabel wzrost, wynik, pytanie, pytanie2, zkoniec;
	JTextField wagaTekst, wzrostTekst;
	double xwaga, xwzrost, xwynik, lele, xkoniec, koniec;
	String dana;
	JButton obliczGuzik, wyczyscGuzik;
	
	
	public Bmi2() {
		
		
		setSize(525, 550);
		setLocation(100, 100);
		setTitle("Program Ulaniec");
		this.setLayout(new FlowLayout(20));
		p = new JPanel(new GridLayout(5,1));
		p.setPreferredSize(new Dimension(500, 250));
		p.setBorder(BorderFactory.createTitledBorder("Dane"));
		p.setBackground(Color.green);
		
		
		
		
		pytanie = new JLabel("Wpisz wage ulancu");
		wagaTekst = new JTextField("");
		pytanie2 = new JLabel("Wpisz wzrost potencjalny ulancu");
		wzrostTekst = new JTextField("");
		obliczGuzik = new JButton("Potwierdz");
		obliczGuzik.addActionListener(this);
		
		
		p.add(pytanie);
		p.add(wagaTekst);
		p.add(pytanie2);
		p.add(wzrostTekst);
		p.add(obliczGuzik);
		
		add(p);
		this.setLayout(new FlowLayout(20));
		p2 = new JPanel(new GridLayout(4,1));
		p2.setPreferredSize(new Dimension(500, 250));
		p2.setBorder(BorderFactory.createTitledBorder("Body Mass Index"));
		p2.setBackground(Color.yellow);
		add(p2);
		
		
		pytanie = new JLabel("");
		wynik = new JLabel("");
		
		p2.add(pytanie);
		p2.add(wynik);
		wyczyscGuzik = new JButton("Wyczysc");
		wyczyscGuzik.addActionListener(this);
		p2.add(wyczyscGuzik);		
		
		
		
	}
		
		
	@Override
	public void actionPerformed(ActionEvent e) {
		if	(e.getSource() == obliczGuzik)
			xwaga = Double.parseDouble(wagaTekst.getText());
			xwzrost = Double.parseDouble(wzrostTekst.getText());
			xwynik = xwaga/(xwzrost*xwzrost)*10000;
			pytanie.setText("Wspolczynnik:     " + String.format("%2.2f",xwynik));							
		
	
		if (xwynik < 18.5)	{
			
			wynik.setText("Masz niedowage...");
			}	else if (xwynik > 18.5 && xwynik <=24.9)	{
				wynik.setText("Twoja waga jest prawid³owa.");
			} 	else if (xwynik > 24.9 && xwynik < 29.9) {
				wynik.setText("Masz nadwage..");
			}	else {
				wynik.setText("Nie ¿ryj tyle grubasie!!!!!!!");
			}
		
		if (e.getSource()== wyczyscGuzik) {
			wagaTekst.setText("");
			wzrostTekst.setText("");
			pytanie.setText("");
			wynik.setText("");
			zkoniec.setText("");
		}
		xkoniec = xwzrost-100-(xwzrost-100)/20;
		zkoniec = new JLabel("Musisz schudnac " + (xwaga-xkoniec) + " kilogramów ¿eby osi¹gnaæ wymarzon¹ wagê");
			
		p2.add(zkoniec);
		
		
		if (e.getSource()== wyczyscGuzik) {
			wagaTekst.setText("");
			wzrostTekst.setText("");
			pytanie.setText("");
			wynik.setText("");
			zkoniec.setText("");
			
		
			
		}
	}	
}
	
	
	
	
	
	
	
	