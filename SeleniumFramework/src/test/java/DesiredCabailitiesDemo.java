import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCabailitiesDemo {

	public static void main(String[] args) throws InterruptedException {

		// Ermittelt den Pfad des aktuellen Projekts
		String projectpath = System.getProperty("user.dir");

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		System.setProperty("webdriver.ie.driver", projectpath + "/Driver/iedriver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(caps);

		driver.get("https://google.com");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("AB");

		// Enter-Taste klicken
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);

		driver.close();
		driver.quit();

	}

}
