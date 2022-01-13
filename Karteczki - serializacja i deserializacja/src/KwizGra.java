import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;


public class KwizGra {
	
	private JTextArea pytanie;
	private JTextArea odpowiedz;
	private ArrayList<KartaKwizowa> listaKart;
	private KartaKwizowa biezacaKarta;
	private int indeksBiezacejKarty;
	private JFrame ramka;
	private JButton przyciskNastepnaKarta;
	private boolean czyPrezentowanaOdpowiedz;	

	public static void main(String[] args) {
		KwizGra gra = new KwizGra();
		gra.doDziela();
	}
	
	public void doDziela() {
		
		// tworzymy graficzny GUI
		ramka = new JFrame("Kwiz");
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panelGlowny = new JPanel();
		Font czcionkaDuza = new Font("sanserif", Font.BOLD, 24);
		
		pytanie = new JTextArea(10,20);
		pytanie.setFont(czcionkaDuza);
		pytanie.setLineWrap(true);
		pytanie.setEditable(false);
		
		JScrollPane przewijanieP = new JScrollPane(pytanie);
		przewijanieP.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanieP.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		przyciskNastepnaKarta = new JButton("Pokaz pytanie");
		panelGlowny.add(przewijanieP);
		panelGlowny.add(przyciskNastepnaKarta);
		przyciskNastepnaKarta.addActionListener(new NastepnaKartaListener());
		
		JMenuBar pasekMenu = new JMenuBar();
		JMenu menuPlik = new JMenu("Plik");
		JMenuItem opcjaOtworz = new JMenuItem("Otworz zbior kart");
		opcjaOtworz.addActionListener(new OtworzMenuListener());
		menuPlik.add(opcjaOtworz);
		pasekMenu.add(menuPlik);
		ramka.getContentPane().add(BorderLayout.CENTER, panelGlowny);
		ramka.setSize(640, 500);
		ramka.setVisible(true);
	}
	
	public class NastepnaKartaListener implements ActionListener	{    // Sprawdzamy flage logiczna czyPrezentowanaOdpowiedz, aby 
		public void actionPerformed(ActionEvent zd)	{					// sprawdzic czy uzytkownik aktualnie oglada odpowiedz na 
			if (czyPrezentowanaOdpowiedz)	{							// pytanie, oraz aby wykonac odpowiednie czynnosci w 
				// pokaz odpowiedz bo uzytkownik widzial juz pytanie	// zaleznosci od odpowiedzi
				pytanie.setText(biezacaKarta.getOdpowiedz());
				przyciskNastepnaKarta.setText("Nastepna karta");
				czyPrezentowanaOdpowiedz = false;				
			}	else	{
				// pokaz nastepne pytanie
				if (indeksBiezacejKarty < listaKart.size()) {
				
					pokazNastepnaKarte();
				}	else {
					// nie ma wiecej kart
					pytanie.setText("To byla ostatnia karta");
					przyciskNastepnaKarta.setEnabled(false);
			}
		}
	}
}
	
	public class OtworzMenuListener implements ActionListener	{   // wyswietlany okno dialogowe do obslugi plikow i dajemy
		public void actionPerformed(ActionEvent ev)	{				// uzytkownikowi mozliwosc wybrania i otworzenia pliku
			JFileChooser dialogFile = new JFileChooser();
			dialogFile.showOpenDialog(ramka);
			wczytajPlik(dialogFile.getSelectedFile());
		}
	}
	
	private void wczytajPlik(File file)	{
		listaKart = new ArrayList<KartaKwizowa>();
		try {    																// tworzymy strumien BufferedReader polaczony z FileREader
			BufferedReader czytelnik = new BufferedReader(new FileReader(file));// a do drugiego z nich przekazujemy obikt File reprezentujacy
			String wiersz = null;												// plik  wybrany przez uzytkownika w oknie dialogowym
			while ((wiersz = czytelnik.readLine()) != null) {		// odczytujemy zawartosc pliku wiersz po wierszu, przekazujac odczytane 
				tworzKarte(wiersz);									// wiersze do metody tworzKarte(), ktora je przetwarza i na ich podstawie
			}														// tworzy obiekty KartaKwizowa, ktore sa dodawane do obiektu ArrayList
			czytelnik.close();
	}	catch (Exception ex)	{
		System.out.println(("Nie mozna odczytac pliku z kartami"));
		ex.printStackTrace();
	}	
		//czas zaczynac
		pokazNastepnaKarte();
}
private void tworzKarte(String wierszDanych)	{				// kazdy wiersz kodu odpowiada jednej karteczce kwizowej, jednak
	String[] wyniki = wierszDanych.split("/");					// musimy przetworzyc je w taki sposob, aby uzyskac pytanie i odpowiedz
	KartaKwizowa card = new KartaKwizowa(wyniki[0], wyniki[1]); // reprezentowane przez niezalezne lancuchy znakow w tym celu wykorzystamy 
	listaKart.add(card);										// metode split();
	System.out.println("Utworzono karte");			
}

private void pokazNastepnaKarte()	{
	biezacaKarta = listaKart.get(indeksBiezacejKarty);
	indeksBiezacejKarty++;
	pytanie.setText(biezacaKarta.getPytanie());
	przyciskNastepnaKarta.setText("Pokaz odpowiedz");
	czyPrezentowanaOdpowiedz = true;
}
	
	
	
	
	
	
	
	
	
	
	
	

}
