package demoqa.demoqa; 
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import BrowserAndUtility.BrowserFactory;
import BrowserAndUtility.LoggerClass;
import JSONFileReader.JSONFileReaderClass;

public class BaseTest {

	@BeforeTest
	public void getWebsite() {
		BrowserFactory.getdriver().get(JSONFileReaderClass.url());
		BrowserFactory.getdriver().manage().deleteAllCookies();
		BrowserFactory.getdriver().manage().window().maximize();
		LoggerClass.Info("demoqa.com Home Page Appeared");
	}
	
	@AfterTest
	public void close() throws InterruptedException {
		BrowserFactory.getdriver().manage().deleteAllCookies();
		BrowserFactory.getdriver().close();
		Thread.sleep(5000);
	}
}
