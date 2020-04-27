package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		test();
	}

	public static void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\BHDR-Daten\\workspace\\SeleniumFramework\\Driver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);

		// driver.findElement(By.linkText("ABCD Band 0711 Booking - 0711
		// Talents")).click();

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				// hier das zu suchende Element eintragen
				WebElement linkElement = driver
						.findElement(By.xpath("//h3[contains(text(),'ABCD Band 0711 Booking - 0711 Talents')]"));

				if (linkElement.isEnabled()) {
					System.out.println("Element wurde gefunden");
				}
				return linkElement;

			}
		});

		// Element wird übergeben und kann bearbeitet werden
		element.click();

		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}
