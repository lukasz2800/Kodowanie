
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class DwaPrzyciski	{   // glowna klasa gui nie implementuje juz ActionListenera
	
	JFrame ramka;
	JLabel etykieta;

	public static void main(String[] args) {
		DwaPrzyciski gui = new DwaPrzyciski();
		gui.doRoboty();
	}
	
	public void doRoboty() {
		ramka = new JFrame();
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton przyciskEtyk = new JButton("Zmien etykiete");
		przyciskEtyk.addActionListener(new EtykietaListener());  // zamiast odwolania this, do metody rejestrujacej przekazywany jest
																// obiekt klasy wewnetrznej
		JButton przyciskKolor = new JButton("Zmien kolor");
		przyciskKolor.addActionListener(new PrzyciskListener());
		
		etykieta = new JLabel("Oto etykieta");
		MojPanelRysunkowy panel = new MojPanelRysunkowy();
		
		ramka.getContentPane().add(BorderLayout.SOUTH, przyciskKolor);
		ramka.getContentPane().add(BorderLayout.CENTER, panel);
		ramka.getContentPane().add(BorderLayout.EAST, przyciskEtyk);
		ramka.getContentPane().add(BorderLayout.WEST, etykieta);
		
		ramka.setSize(450,300);
		ramka.setVisible(true);
	}
	

	class EtykietaListener implements ActionListener	{    // teraz w jednej klasie glownej mamy dwoch odbiorcow implementujacych
		public void actionPerformed(ActionEvent zdarzenie) {	// interfejs ActionListener
			etykieta.setText("Auuu");							// klasa wewnetrzna wie o skladowej 'etykieta'
		}	
	}
	class PrzyciskListener implements ActionListener	{		
		public void actionPerformed(ActionEvent zdarzenie) {
			ramka.repaint();									// Klasa wewnetrzna moze poslugiwac sie skladowa 'ramka' bez koniecznosci
		}														// jawnego odwolania do klasy zewnetrznej
	}
}






