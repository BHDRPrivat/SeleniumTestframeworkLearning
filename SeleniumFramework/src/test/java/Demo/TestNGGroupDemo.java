package Demo;

import org.testng.annotations.Test;

@Test(groups = { "AlleTest" })
public class TestNGGroupDemo {

	@Test(groups = { "sanity" })
	public void test1() {
		System.out.println("Das ist Test 1");
	}

	@Test(groups = { "sanity", "smoke", "linux.smoke" })
	public void test2() {
		System.out.println("Das ist Test 2");
	}

	@Test(groups = { "sanity", "regression" })
	public void test3() {
		System.out.println("Das ist Test 3");
	}

	@Test
	public void test4() {
		System.out.println("Das ist Test 4");
	}

	@Test(groups = { "windows.regression" })
	public void test5() {
		System.out.println("Das ist Test 5");
	}

	@Test(groups = { "windows.smoke" })
	public void test6() {
		System.out.println("Das ist Test 6");
	}

}
