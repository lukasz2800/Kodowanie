package programowanie;

import java.util.ArrayList;
import java.util.Date;

public class Trolowska {

	public static void main(String[] args) {
		int x = 32;
		int e = 22;
		String s = "piekarz";
		
		ArrayList tbl = new ArrayList();
		tbl.add(x);
		tbl.add(e);
		tbl.add(s);
		
		System.out.println(x);
		System.out.println("czy x");
		
		System.out.println(e + x + " " + s);
		System.out.println(tbl);
		System.out.println(tbl.get(0));
		ArrayList<Integer> bbl = new tbl();
		
		int z = 50;
		bbl.add(z);
		tbl.add(bbl);
		System.out.println(tbl);
		System.out.println(bbl);
		
		Date dzis = new Date();
		String.format("%tA, %<tB, %<td", dzis);
		System.out.println(dzis);
		System.out.println(tbl.indexOf(s));
	
	}

}
