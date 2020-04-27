package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}

	public static void googleSearch() throws InterruptedException {

		// System.setProperty("webdriver.gecko.driver", projectpath +
		// "/Driver/Gecodriver/geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		// Ermittelt den Pfad des aktuellen Projekts
		String projectpath = System.getProperty("user.dir");
		// Legt den Pfad für den Chromedriver fest
		System.setProperty("webdriver.chrome.driver", projectpath + "/Driver/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Webseite aufrufen
		driver.get("https://google.com");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");

		// Enter-Taste klicken
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);

		// Browser schließen
		driver.close();

		System.out.println("Test Durchlaufen");

	}

}
