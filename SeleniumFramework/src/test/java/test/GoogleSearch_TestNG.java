package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.ProppertiesFile;

public class GoogleSearch_TestNG {

	static WebDriver driver = null;
	public static String BrowserName = null;

	@BeforeTest
	public void SetupTest() throws IOException {

		// Ermittelt den Pfad des aktuellen Projekts
		String projectpath = System.getProperty("user.dir");
		// Liest die config.properties-Datei aus und ordnet den ausgelesenen Browser der
		// public-Variablen BrowserName zu
		ProppertiesFile.getProperties();

		if (BrowserName.equalsIgnoreCase("chrome")) {
			// Legt den Pfad für den Chromedriver fest
			System.setProperty("webdriver.chrome.driver", projectpath + "/Driver/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectpath + "/Driver/Gecodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}

	@Test
	public void googleSearch() throws InterruptedException {

		// System.setProperty("webdriver.gecko.driver", projectpath +
		// "/Driver/Gecodriver/geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		driver.get("https://google.com");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");

		// Button Klicken
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);

	}

	@AfterTest
	public void TearDown() throws IOException {

		// Browser schließen
		driver.close();
		// driver.quit();

		System.out.println("Test Durchlaufen");
		ProppertiesFile.setProperties();
	}

}
