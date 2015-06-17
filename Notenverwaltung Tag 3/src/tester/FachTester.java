package tester;

import problemdomain.Fach;
import problemdomain.Pruefung;
import problemdomain.Referat;
import problemdomain.Sport;

public class FachTester {

	public static void main(String[] args) {
		try {
			// Prüfungen
			Fach f = new Fach("Mathe", 2);
			f.initFach();
			System.out.println(f);
			Pruefung p = new Pruefung("1.1.2000");
			f.neuePruefungHinzufuegen("1.1.2000");
			f.neuePruefungHinzufuegen(p);
			System.out.println(f);
			f.neuePruefungHinzufuegen("2.2.2000", 5.0);
			System.out.println(f);
			Pruefung p1 = f.getPruefung("1.1.2000");
			System.out.println(p1);
			if(p!=null){
				p1.setNote(6.0);
			}
			System.out.println(p1);
			
			// Referat
			f.neuesReferatHinzufuegen("3.3.2000", 0.2);
			Referat r = f.getReferat("3.3.2000");
			System.out.println(r);
			if(r!=null){
				r.setNoten(1.0, 5.0);
			}
			System.out.println(r);
			
			// Sport
			f.neuesSportHinzufuegen("4.4.2000", 3.0, 4.0, 5.5, 5.0, 4.0);
			Sport s = f.getSport("4.4.2000"); // sucht das Element mit dem Datum 4.4.2000
			System.out.println(s);
			
		} catch(IllegalArgumentException e){
			System.out.println("Falsches Argument: " + e);
		}
	}

}
