package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;

public class ApplitoolsDemo {

	public static void main(String[] args) {

		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath + "\\Driver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		Eyes eyes = new Eyes();
		eyes.setApiKey("1epbTsh91uyej6yur9x0FzJb3WUit5naoVB8SYMRZUE110");

		try {

			eyes.open(driver, "Hello World", "1 Durchlauf", new RectangleSize(800, 600));

			driver.get("https://applitools.com/helloworld/?diff2");

			eyes.checkWindow("Startfenster");

			driver.findElement(By.tagName("button")).click();

			eyes.checkWindow("Click Button");

			eyes.close();

		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}

	}

}

// Testeintrag
// 2 Eintrag