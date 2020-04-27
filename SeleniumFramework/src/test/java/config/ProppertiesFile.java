package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.GoogleSearch_TestNG;

public class ProppertiesFile {

	static Properties proper = new Properties();
	static String ProjectPath = System.getProperty("user.dir");

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();
		getProperties();
	}

	public static void getProperties() throws IOException {

		try {

			InputStream input = new FileInputStream(ProjectPath + "/src/test/java/config/config.properties");
			proper.load(input);
			String browser = proper.getProperty("Browser");
			System.out.println(browser);
			GoogleSearch_TestNG.BrowserName = browser;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}

	}

	public static void setProperties() throws IOException {

		try {
			OutputStream output = new FileOutputStream(ProjectPath + "/src/test/java/config/config.properties");
			proper.setProperty("Result", "Pass");
			proper.store(output, null);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

}
