
import javax.swing.*;
import java.awt.*;


public class ProstaAnimacja {
	
	int x = 70;               // w glownej klasie zewnetrznej definiujemy wspolrzedne polozenia kolka
	int y = 70;
	

	public static void main(String[] args) {         // metoda glowna, glownej klasy. Tworzymy w niej nowy obiekt gui i deklarujemy metode
		ProstaAnimacja gui = new ProstaAnimacja();	// tego obiektu doRoboty();
		gui.doRoboty();
	}
	public void doRoboty() {						
		JFrame ramka = new JFrame();
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MojPanelRysunkowy panel = new MojPanelRysunkowy();  // nowy obiekt klasy MojPanelRysunkowy w klasie ProstaAnimacja
		
		ramka.getContentPane().add(panel);
		ramka.setSize(300,300);
		ramka.setVisible(true);
		
		for (int i = 0; i < 130; i++) {             // metoda repaint(); odswiezy sie 130 razy z nowymi lokalizacjami x i y kolka
			x++;
			y++;
			
			panel.repaint();							//odswiezanie  swojej zawartosci w celu wyswietlenia kolka w nowym miejscu
			try {							
				Thread.sleep(50);					// zwalniamy dzialanie aplikacji zeby zobaczyc dzialanie
			}	catch	(Exception ex)	{ }
		}
		for (int i=0; i < 200; i++) {
			x--;
			y--;
			panel.repaint();
			try {
				Thread.sleep(20);
			}	catch	(Exception ex) {}
			
		}
	}
	class MojPanelRysunkowy extends JPanel {
		public void paintComponent(Graphics g) {	
			g.setColor(Color.blue);
			g.fillRect(0,0,this.getWidth(), this.getHeight());               // wykorzystujemy wciaz modyfikowane wspolrzedne z klasy zewnetrznej
			
			g.setColor(Color.green);
			g.fillOval(x,y,40,40);
		
		}
	}
}
