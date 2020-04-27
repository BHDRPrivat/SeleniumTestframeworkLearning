package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutoITDemo {
	// Hinweis, da Exception die Parent-Klasse aller Exceptions ist, reicht ein
	// throws aus,
	// um verschiedene Arten von Exceptions zu verarbeiten.
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		test();
	}

	@Test()
	public static void test() throws Exception {

		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath + "\\Driver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://smallpdf.com/pdf-to-word");

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.xpath("//button[@class='l3tlg0-0 xTa-DS']")).isDisplayed());

		driver.findElement(By.xpath("//button[@class='l3tlg0-0 xTa-DS']")).click();

		// AutoIT-Programm aufrufen
		// Die Datei als Veriable übergeben (in AutoIt mittels CmdLine[1] eingelesen)
		String dateipfad = null;
		dateipfad = "D:\\zwischen\\AutoIT-Test.docx";

		// Alternative mit Runtime, Dateipfad integriert in den String
		Runtime.getRuntime().exec("D:/BHDR-Daten/Daten/AutoIT/FiletoPDF.exe " + dateipfad);

		// ProcessBuilder pb = new
		// ProcessBuilder("D:/BHDR-Daten/Daten/AutoIT/FiletoPDF.exe", dateipfad);
		// pb.start();
		Thread.sleep(10000);

		try {
			boolean buttonVorhanden = driver.findElement(By.className("l3tlg0-4 iAVkpa")).isDisplayed();
			System.out.println(buttonVorhanden);
			Assert.assertTrue(buttonVorhanden, "Button wurde nicht angezeigt");
			driver.findElement(By.className("l3tlg0-4 iAVkpa")).click();

		} catch (Exception e) {
			// System.out.println(e.);
		}

		System.out.println("Ausgeführt");
		// driver.close();

	}

}
