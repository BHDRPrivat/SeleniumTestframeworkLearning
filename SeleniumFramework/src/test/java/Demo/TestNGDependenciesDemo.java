package Demo;

import org.testng.annotations.Test;

public class TestNGDependenciesDemo {

	@Test(dependsOnMethods = { "test2", "test3" })
	public void test1() {
		System.out.println("Test 1 wird ausgef�hrt");
	}

	@Test(dependsOnGroups = { "smoke" })
	public void test2() {
		System.out.println("Test 2 wird ausgef�hrt");
	}

	@Test(groups = { "smoke" })
	public void test3() {
		System.out.println("Test 3 wird ausgef�hrt");
	}
}
