package Przyklady;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Wskaznik extends JFrame implements ActionListener {

   
	private static final long serialVersionUID = 1L;
	JLabel waga, wzrost, lwynik;
    JTextField twaga, twzrost, wynik;
    double tempwaga, tempwzrost, twynik;
    JButton oblicz;

    public Wskaznik(){

        setSize(600, 600);
        setTitle("Oblicz swój wskaŸnik BMI");
        setLayout(null);

        wzrost = new JLabel("Wzrost");
        wzrost.setBounds(50, 60, 200, 100);
        add(wzrost);
        
        twzrost = new JTextField("wzrost");
        twzrost.setBounds(200, 140, 130, 20);
        add(twzrost);
        twzrost.addActionListener(this);
        
        waga = new JLabel("Waga");
        waga.setBounds(50, 50, 200, 200);
        add(waga);        
                        
        twaga = new JTextField("waga");
        twaga.setBounds(200, 100, 130, 20);
        add(twaga);
        twaga.addActionListener(this);
                                         
                
        lwynik = new JLabel("Wynik");
        lwynik.setBounds(160, 170, 130, 20);
        add(lwynik);

        wynik = new JTextField(" ");
        wynik.setBounds(200, 170, 130, 20);
        add(wynik);
        wynik.addActionListener(this);

        oblicz = new JButton("Oblicz");
        oblicz.setBounds(200, 200, 40, 20);
        add(oblicz);
        oblicz.addActionListener(this);

    }

    public static void main(String arg[]){
        Wskaznik b = new Wskaznik();
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	tempwzrost = Double.parseDouble(twzrost.getText());
        tempwaga = Double.parseDouble(twaga.getText());
        twynik = (tempwaga/(tempwzrost*tempwzrost)) * 10000;
        wynik.setText(String.valueOf(twynik));
    }

}