package ksiazka;



import javax.swing.*;
import java.awt.event.*;


public class ProstyGUI implements ActionListener	{
		
		JButton przycisk;

	public static void main(String[] args) {
		
		ProstyGUI apGUI = new ProstyGUI();
		apGUI.doDziela();
		}
	
		
	public void doDziela() {
		JFrame ramka = new JFrame();
		JButton przycisk = new JButton("Kliknij");
			
		
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.getContentPane().add(przycisk);                    // dodaje przycisk do zawartosci okna
		ramka.setSize(300,300);
		ramka.setVisible(true);		
	
	
		przycisk.addActionListener(new ActionListener()	{		
			public void actionPerformed(ActionEvent zdarzenie) {
				przycisk.setText("Zostalem klikniety");
		}
		}
	);
}
}
