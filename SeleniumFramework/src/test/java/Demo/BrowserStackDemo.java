package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackDemo {

	public static final String USERNAME = "bahadirdikmen1";
	public static final String AUTOMATE_KEY = "KZsxppKpuxp93PsTa7sE";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os_version", "8.0");
		caps.setCapability("device", "Samsung Galaxy S9 Plus");
		caps.setCapability("real_mobile", "true");
		caps.setCapability("project", "Android-Test-BHDR-1");
		caps.setCapability("build", "Version 1.0");
		caps.setCapability("name", "Google-Ablauftest");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.debug", "true");
		caps.setCapability("browserstack.networkLogs", "true");

		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));

		element.sendKeys("BrowserStack");
		element.submit();

		System.out.println(driver.getTitle());
		driver.quit();

	}
}
