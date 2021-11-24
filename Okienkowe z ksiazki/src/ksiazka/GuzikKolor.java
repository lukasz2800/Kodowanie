package ksiazka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GuzikKolor implements ActionListener	{
	
	JFrame ramka;
	

	public static void main(String[] args) {
		GuzikKolor apGUI = new GuzikKolor();
		apGUI.doDziela();	
	}

	private void doDziela() {
		ramka = new JFrame();
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton przycisk = new JButton("Zmiana koloru");
		przycisk.addActionListener(this);                  // dodajemy odbiorce zdarzen do przycisku, jest nim biezacy obiekt - this
		
		MojPanelRysunkowy panelR = new MojPanelRysunkowy();
		
		ramka.getContentPane().add(BorderLayout.SOUTH, przycisk);
		ramka.getContentPane().add(BorderLayout.CENTER, panelR);
		ramka.setSize(300,300);
		ramka.setVisible(true);
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ramka.repaint();
		
	}
	
	

}
