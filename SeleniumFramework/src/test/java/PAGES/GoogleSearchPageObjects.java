package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {

	WebDriver driver = null;

	By Textbox_search = By.xpath("//input[@name='q']");
	By Button_search = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");

	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public void SetTextInBox(String Text) {
		driver.findElement(Textbox_search).sendKeys(Text);
	}

	public void ClickButton() {
		driver.findElement(Button_search).sendKeys(Keys.RETURN);
	}

}
