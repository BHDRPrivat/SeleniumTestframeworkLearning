package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultipleBrowserDemo {

	WebDriver driver = null;
	String projectpath = System.getProperty("user.dir");

	@Parameters("browserName")

	@BeforeTest
	public void setup(String browserName) {

		System.out.println("Browser ist:" + browserName);
		System.out.println("Thread ist : " + Thread.currentThread().getId());

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectpath + "/Driver/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectpath + "/Driver/Gecodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", projectpath + "/Driver/iedriver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

	}

	@Test
	public void test() throws Exception {

		driver.get("https://google.com");
		Thread.sleep(3000);
		System.out.println("Test war erfolgreich");

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
