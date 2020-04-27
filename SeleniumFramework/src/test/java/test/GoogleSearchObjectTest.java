package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PAGES.GoogleSearchPageObjects;

public class GoogleSearchObjectTest {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoogleSearch();
	}

	public static void GoogleSearch() {

		// Ermittelt den Pfad des aktuellen Projekts
		String projectpath = System.getProperty("user.dir");
		// Legt den Pfad für den Chromedriver fest
		System.setProperty("webdriver.chrome.driver", projectpath + "/Driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://google.com");

		GoogleSearchPageObjects SearchObj = new GoogleSearchPageObjects(driver);

		SearchObj.SetTextInBox("A B C D");

		SearchObj.ClickButton();

		// Browser schließen
		driver.close();

	}

}
