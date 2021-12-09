import javax.swing.*;
import java.awt.*;

public class Bl {
		
	public static void main(String[] args) {
		Bl gui = new Bl();
		gui.doRoboty();
	}
	public void doRoboty() {
		JFrame ramka = new JFrame();
		JPanel panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));    //konstruktor obiektu BoxLayout bedzie operowac na panelu oraz
																	// wzdluz osi  Y (Y_AXIS)
		panel.setBackground(Color.darkGray);
		JButton przycisk = new JButton("To szok");
		JButton przycisk2 = new JButton("Przycisk");
		panel.add(przycisk);
		panel.add(przycisk2);
		
		JTextArea tekst = new JTextArea(5,5);
		ramka.add(tekst);
		
//		System.out.println(pole.getText());           // pobieranie tresci z pola
		ramka.getContentPane().add(BorderLayout.EAST, panel);
		ramka.setSize(200,200);
		ramka.setVisible(true);
				
		
	}

}
