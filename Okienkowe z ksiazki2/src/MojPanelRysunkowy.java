import java.awt.*;


import javax.swing.JPanel;

public class MojPanelRysunkowy extends JPanel	{
	public void paint(Graphics g)	{
		
		int czerwony = (int) (Math.random() * 256);
		int zielony = (int) (Math.random() * 256);
		int niebieski = (int) (Math.random() * 256);
		
		
		
		Color kolorLosowy = new Color(czerwony, zielony, niebieski);
		
		g.setColor(kolorLosowy);
		g.fillOval(50,50,150,100);
	}


}
