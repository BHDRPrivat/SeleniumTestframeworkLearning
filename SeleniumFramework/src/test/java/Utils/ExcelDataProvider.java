package Utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

	static WebDriver driver = null;
	public static String BrowserName = null;

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		testData(projectPath + "/Excel/Data.xlsx", "Tabelle1");

	}

	@BeforeTest
	public void SetupTest() throws IOException {

		// Ermittelt den Pfad des aktuellen Projekts
		String projectpath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectpath + "/Driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test(dataProvider = "testData1")
	// Die Spaltenwerte der Exceldatei können als Variable der Routine eingetragen
	// werden.
	// TestNG sorgt dafür, dass Sie mit den Exceldaten befüllt werden.
	// Die Klasse wird so oft durchlaufen, wie es Zeilen in Excel gibt
	public static void test1(String username, String password) throws InterruptedException {
		System.out.println(username + "  | " + password);

		driver.get("https://opensouce-demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
	}

	@DataProvider(name = "testData1")
	public static Object[][] getData() {
		String excelPath = "D:\\BHDR-Daten\\workspace\\SeleniumFramework\\Excel\\Data.xlsx";
		Object testData[][] = testData(excelPath, "Tabelle1");
		return testData;
	}

	public static Object[][] testData(String excelPath, String sheetName) {
		// Aufruf des Constructors von ExcelUtils
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);

		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();

		// 2 Dimensionales Object-Array erzeugen
		Object data[][] = new Object[rowCount - 1][colCount];

		// Über alle Zeilen laufen (i=1, da i=0 die Headerzeile)
		for (int i = 1; i < rowCount; i++) {
			// Über alle Spalten laufen
			for (int j = 0; j < colCount; j++) {

				String cellData = excel.getExcelDataString(i, j);
				data[i - 1][j] = cellData;
				// Werte in einer Zeile anzeigen
				// System.out.print(cellData + " | ");
			}
		}
		return data;
	}

}
