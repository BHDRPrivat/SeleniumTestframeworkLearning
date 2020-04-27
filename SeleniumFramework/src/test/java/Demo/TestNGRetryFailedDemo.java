package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {

	@Test()
	public void test1() {
		System.out.println("Test 1 wird ausgeführt");
	}

	@Test()
	public void test2() {
		System.out.println("Test 2 wird ausgeführt");
		int i = 1 / 0;
	}

	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void test3() {
		System.out.println("Test 3 wird ausgeführt");
		Assert.assertTrue(false);

	}
}
