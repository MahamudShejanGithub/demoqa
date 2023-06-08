package BrowserAndUtility;

import org.openqa.selenium.WebDriver;

import JSONFileReader.JSONFileReaderClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	private static WebDriver driver = null;
	public static WebDriver getdriver() {

		if (driver == null) {
			switch (JSONFileReaderClass.configBrowser()) {

			case "chrome":
				driver = WebDriverManager.chromedriver().capabilities(Utilities.UpdatedChrome()).create();
				break;

			case "firefox":
				driver = WebDriverManager.firefoxdriver().create();
				break;

			default:
				new RuntimeException("Invalid Browser Name");
				break;
			}
		}
		return driver;
	}
}
