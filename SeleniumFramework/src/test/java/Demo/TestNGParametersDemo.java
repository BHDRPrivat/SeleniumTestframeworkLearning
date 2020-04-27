package Demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {

	// Beachte nur die Reihenfolge bestimmt welcher Pararmeter in der Klasse
	// verwendet wird: MeinVorname für Vorname und MeinNachname für Nachname
	@Parameters({ "MeinVorname", "MeinNachname" })
	@Test
	public void test1(@Optional String Vorname, String Nachnanme) {
		System.out.println("Name ist :" + Vorname + " " + Nachnanme);
	}

}
