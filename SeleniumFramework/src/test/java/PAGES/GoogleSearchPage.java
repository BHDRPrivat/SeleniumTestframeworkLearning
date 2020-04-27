package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

	private static WebElement Element = null;

	public static WebElement TextBox_Search(WebDriver driver) {

		Element = driver.findElement(By.xpath("//input[@name='q']"));
		return Element;

	}

	public static WebElement Button_Search(WebDriver driver) {

		Element = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		return Element;

	}

}
