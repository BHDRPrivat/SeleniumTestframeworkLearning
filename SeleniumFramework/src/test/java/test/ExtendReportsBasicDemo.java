package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsBasicDemo {

	static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReportGoogleSearch.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it
		ExtentTest test1 = extent.createTest("Google Search Test One", "Test fpr Validate Google Search Functionality");

		// Ermittelt den Pfad des aktuellen Projekts
		String projectpath = System.getProperty("user.dir");
		// Legt den Pfad für den Chromedriver fest
		System.setProperty("webdriver.chrome.driver", projectpath + "/Driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

		// log(Status, details)
		test1.log(Status.INFO, "Starting Test Case");
		// Webseite aufrufen
		driver.get("https://google.com");
		test1.pass("Navigated to google.com");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");
		test1.pass("Entered Text in Box");

		// Enter-Taste klicken
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		test1.pass("Pressed Enter");

		// Browser schließen
		driver.close();
		driver.quit();

		test1.pass("Closed the Browser");

		test1.info("Test completed");

		System.setProperty("webdriver.chrome.driver", projectpath + "/Driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

		// creates a toggle for the given test, adds all log events under it
		ExtentTest test2 = extent.createTest("Google Search Test two", "Test for Validate Google Search Functionality");

		// log(Status, details)
		test2.log(Status.INFO, "Starting Test Case");
		// Webseite aufrufen
		driver.get("https://google.com");
		test2.pass("Navigated to google.com");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("A B C D");
		test2.fail("Entered Text in Box");

		// Enter-Taste klicken
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		test2.pass("Pressed Enter");

		// Browser schließen
		driver.close();
		driver.quit();

		test2.pass("Closed the Browser");

		test2.info("Test completed");

		// calling flush writes everything to the log file
		extent.flush();
	}

}
