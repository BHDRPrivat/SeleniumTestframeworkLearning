package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearch_TestNG2 {

	static WebDriver driver = null;

	@BeforeTest
	public void SetupTest() {
		// Ermittelt den Pfad des aktuellen Projekts
		String projectpath = System.getProperty("user.dir");
		// Legt den Pfad für den Chromedriver fest
		System.setProperty("webdriver.chrome.driver", projectpath + "/Driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void googleSearch2() throws InterruptedException {

		// System.setProperty("webdriver.gecko.driver", projectpath +
		// "/Driver/Gecodriver/geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		driver.get("https://google.com");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ABCD");

		// Button Klicken
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);

	}

	@Test
	public void googleSearch3() throws InterruptedException {

		// System.setProperty("webdriver.gecko.driver", projectpath +
		// "/Driver/Gecodriver/geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		driver.get("https://google.com");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ABCD");

		// Button Klicken
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);

	}

	@AfterTest
	public void TearDown() {

		// Browser schließen
		driver.close();
		driver.quit();

		System.out.println("Test Durchlaufen");
	}

}
