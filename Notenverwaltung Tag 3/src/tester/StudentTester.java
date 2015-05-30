package tester;

import problemdomain.Student;
import problemdomain.Fach;

public class StudentTester {

	public static void main(String[] args) {
		
//		Student s = null;
//		Fach f = null;

		try {
			Student s = new Student ("Steffen", "Walter", 25, 12, 1981);
			// Faecher mit Gewichtung
			s.neuesFachHinzufuegen("Deutsch", 1);		// Fach 1
			s.neuesFachHinzufuegen("Bio", 3);			// Fach 2
			s.neuesFachHinzufuegen("Physik", 3);		// Fach 3
			s.getNotenSchnitt2();
			System.out.println(s);
			
			// Neues Fach
			Fach f = new Fach ("Neues Fach", 12);
//			Fach f2 = s.getFach ("Zauberei");
//			Fach f3 = s.getFach("Reden");
			
			// Anzahl Prüfungen
			f.neuePruefungHinzufuegen ("01.01.2015", 3);
//			f2.neuePruefungHinzufuegen ("02.02.2002", 2);
//			f3.neuePruefungHinzufuegen ("12.12.2012", 3);
			System.out.println (f);
			
			
		}
		catch (IllegalArgumentException e){					
			System.out.println("Irgendetwas laeuft nicht rund: " + e);
		}
		
	}

}
