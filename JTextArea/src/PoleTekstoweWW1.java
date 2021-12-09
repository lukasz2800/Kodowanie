import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PoleTekstoweWW1 implements ActionListener{
	
	JTextArea tekst;
	JCheckBox poleWyboru;

	public static void main(String[] args) {
		PoleTekstoweWW1 gui = new PoleTekstoweWW1();
		gui.tworzGUI();
	}
	public void tworzGUI() {
		JFrame ramka = new JFrame();
		JPanel panel = new JPanel();
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton przycisk = new JButton("kliknij");
		przycisk.addActionListener(this);
		tekst = new JTextArea(10,20);
		tekst.setLineWrap(true);
		JCheckBox poleWyboru = new JCheckBox("Grasz dalej?");
		poleWyboru.addActionListener(this);
		poleWyboru.setSelected(true);
		
		
		JScrollPane przewijanie = new JScrollPane(tekst);
		przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanie.setHorizontalScrollBar(null);
		
		panel.add(przewijanie);
		panel.add(poleWyboru);
		
		ramka.getContentPane().add(BorderLayout.CENTER, panel);
		ramka.getContentPane().add(BorderLayout.SOUTH, przycisk);
		
		ramka.setSize(350,300);
		ramka.setVisible(true);	
	}
	public void itemStateChanged(ItemEvent zdarzenie) {
		String wlaczoneCzyNie = "wy³¹czone";
		if (poleWyboru.isSelected()) wlaczoneCzyNie = "w³¹czone";
		System.out.println("Pole jest wlaczone");
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		tekst.append("przycisk klikniety \n");
		
	}
	

}
