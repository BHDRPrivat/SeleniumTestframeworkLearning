package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

// @Listeners(listeners.TestNGListeners.class)
// wurde in die testng1.xml-Datei ausgelagert.
public class TestNGListenerDemo {

	@Test
	public void test1() {
		System.out.println("Test 1 wird ausgeführt");
	}

	@Test
	public void test2() throws InterruptedException {
		System.out.println("Test 2 wird ausgeführt");
		// Assert.assertTrue(false);

		String projectpath = System.getProperty("user.dir");

		// System.setProperty("webdriver.gecko.driver", projectpath +
		// "/Driver/Gecodriver/geckodriver.exe");

		// WebDriver driver = new FirefoxDriver();

		//// Legt den Pfad für den Chromedriver fest
		System.setProperty("webdriver.chrome.driver", projectpath + "/Driver/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.ie.driver", projectpath +
		// "/Driver/iedriver/IEDriverServer.exe");
		// WebDriver driver = new InternetExplorerDriver();

		driver.get("https://google.com");

		Thread.sleep(3000);
		// driver.findElement(By.xpath("//input[@id='search']")).clear();
		// driver.findElement(By.xpath("//input[@id='search']")).sendKeys("simfinity");
		// driver.findElement(By.xpath("//button[@id='search-icon-legacy']/yt-icon")).click();

		// driver.findElement(By.name("search_query")).clear();
		// driver.findElement(By.name("search_query")).sendKeys("simfinity");
		// driver.findElement(By.id("search-btn")).click();

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hallo");

		WebElement Textbox = driver.findElement(By.xpath("//input[@name='qss']"));

		Textbox.sendKeys("Weitere Eingabe");

		driver.close();

	}

	@Test
	public void test3() {
		System.out.println("Test 3 wird ausgeführt");
		throw new SkipException("Dieser Test wurde übersprungen");

	}

}
