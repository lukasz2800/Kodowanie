package ksiazka;

import java.awt.*;

import javax.swing.text.AttributeSet.ColorAttribute;


public class Kanwa extends Canvas {
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)	g;    //wykonujemy rzutowanie abysmy mogli wykorzystac mozliwosci od Graphics 2D(lepsze)
		GradientPaint gradient = new GradientPaint(70,70, Color.blue, 150,150, Color.orange);
		GradientPaint gradient2	= new GradientPaint(70,70, Color.red, 150,150, Color.black);
		
		g2d.setPaint(gradient);                 
		g.fillRoundRect(30,30,190,100,10,20);
		
		g2d.setPaint(gradient2);
		g.fillOval(50,50,150,100);
		
		g.setColor(Color.blue);
		g.drawLine(10,10,280,150);
		
		Font f = new Font("TimesRoman",Font.BOLD,36);
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("Wow ", 60, 100);
}
}
