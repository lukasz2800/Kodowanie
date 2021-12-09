import javax.swing.*;
import java.awt.*;



public class Ramka {
	JFrame okno;
	JButton przycisk1, przycisk2, przycisk3, przycisk4;
	JTextField pole1;
	JLabel pole2;
	JPanel p1;

	public static void main(String[] args) {
		Ramka ok = new Ramka();
		ok.doRoboty();		
	}
	public void doRoboty() {
		JFrame okno = new JFrame();
		JFrame bebe = new JFrame();
		JPanel p1 = new JPanel();
		String [] listaOpcji = {"alfa", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "teta"};
		JList lista = new JList(listaOpcji);
		JScrollPane przewijanie = new JScrollPane(lista);
		przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		
		bebe.add(przewijanie);
		lista.setVisibleRowCount(6);
		
		
		p1.setBackground(Color.red);
	;
		
		bebe.setSize(500,500);		
		bebe.setVisible(true);
		
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setSize(500,300);
				
		
		przycisk1 = new JButton("nacisnij");
		Font duzaCzcionka = new Font("serif", Font.BOLD, 28);
		przycisk1.setFont(duzaCzcionka);
		przycisk2 = new JButton("lele");
		przycisk3 = new JButton("inflacja");
		przycisk4 = new JButton("leszek");
		pole1 = new JTextField("wpisz tekst");
		pole2 = new JLabel("Nie wpisuj");
		
		bebe.add(przycisk4);
		okno.getContentPane().add(BorderLayout.SOUTH, przycisk1);
		okno.getContentPane().add(BorderLayout.NORTH, przycisk2);
		okno.getContentPane().add(przycisk3);
		okno.getContentPane().add(BorderLayout.EAST, pole1);
		okno.getContentPane().add(BorderLayout.WEST, pole2);
		
		okno.setVisible(true);
		
		
		

}
}