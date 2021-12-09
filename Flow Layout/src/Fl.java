import javax.swing.*;
import java.awt.*;

public class Fl {	
	public static void main(String[] args) {
		Fl gui = new Fl();
		gui.doRoboty();
	}
	public void doRoboty() {
		JFrame ramka = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		
		JButton przycisk = new JButton("szok");
		JButton przycisk2 = new JButton("drugi");
		JButton przycisk3 = new JButton("trzeci");
		panel.add(przycisk);
		panel.add(przycisk2);
		panel.add(przycisk3);
		
		ramka.getContentPane().add(BorderLayout.EAST, panel);
		ramka.setSize(200,200);
		ramka.setVisible(true);
		
	
		

	}

}
