package listeners;

import org.testng.SkipException;
import org.testng.annotations.Test;

// @Listeners(listeners.TestNGListeners.class)
// wurde in die testng1.xml-Datei ausgelagert.
public class TestNGListenerDemo2 {

	@Test
	public void test4() {
		System.out.println("Test 4 wird ausgef�hrt");
	}

	@Test
	public void test5() {
		System.out.println("Test 5 wird ausgef�hrt");
		// Assert.assertTrue(false);
	}

	@Test
	public void test6() {
		System.out.println("Test 6 wird ausgef�hrt");
		throw new SkipException("Dieser Test wurde �bersprungen");

	}

}
