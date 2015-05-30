package tester;

import problemdomain.Fach;
import problemdomain.Pruefung;

public class PruefungTester {

	public static void main(String[] args) {
//		Pruefung p = new Pruefung("1.1.2000");
//		System.out.println(p);
//		p.setNote(1.0);
//		System.out.println(p);
//		p.setNote(5.0);
//		System.out.println(p);
//		
//		Pruefung p1 = new Pruefung("2.2.2000", 3.5);
//		System.out.println(p1);
//		p1.setNote(6.0);
//		System.out.println(p1);
		
		try {
			Pruefung p = new Pruefung("1.1.2000");
			System.out.println(p);
			p.setNote(5.0);
			System.out.println(p);
		} catch(IllegalArgumentException e){
			System.out.println("Falsches Argument: " + e);
		}


	}

}
