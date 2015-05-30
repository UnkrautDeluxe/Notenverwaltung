package tester;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import problemdomain.Fach;

public class FachtesterAndy {
	private Fach f;
	
	@Before
	public void setup() {
		f = new Fach("Mathe", 2);
	}

	@Test(expected=ClassNotFoundException.class)
	public void test() throws ClassNotFoundException {
		assertTrue(f!=null);
		throw new ClassNotFoundException("bezahle du arsch");
	
	}

}
