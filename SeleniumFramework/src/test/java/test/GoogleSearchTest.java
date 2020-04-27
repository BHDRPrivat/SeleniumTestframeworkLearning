package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PAGES.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}

	public static void googleSearch() throws InterruptedException {

		// Ermittelt den Pfad des aktuellen Projekts
		String projectpath = System.getProperty("user.dir");

		// Legt den Pfad für den Chromedriver fest
		System.setProperty("webdriver.chrome.driver", projectpath + "/Driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

		// System.setProperty("webdriver.gecko.driver", projectpath +
		// "/Driver/Gecodriver/geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		driver.get("https://google.com");

		GoogleSearchPage.TextBox_Search(driver).sendKeys("Automation step by step");

		// driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation
		// step by step");
		// driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.TAB);

		// Button Klicken

		// driver.findElement(By.name("btnK")).click();
		// driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		// driver.findElement(By.xpath("//div[@class='FPdoLc
		// tfB0Bf']//input[@name='btnK']")).click();

		GoogleSearchPage.Button_Search(driver).sendKeys(Keys.RETURN);
		// driver.findElement(By.xpath("//div[@class='FPdoLc
		// tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);

		// Browser schließen
		driver.close();

		System.out.println("Test Durchlaufen");

	}

}
