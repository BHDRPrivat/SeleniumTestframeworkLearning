import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Ermittelt den Pfad des aktuellen Projekts
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

		WebElement Textbox = driver.findElement(By.xpath("//input[@name='q']"));

		Textbox.sendKeys("Zweiter Eintrag");

		List<WebElement> webelements = driver.findElements(By.xpath("//input"));

		System.out.println("Count of Elements:" + webelements.size());

		driver.findElements(By.xpath("//input"));

		Thread.sleep(3000);

		// Schließen des Browsers
		driver.close();

	}

}
