package BrowserAndUtility;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeOptions;

public class Utilities {
	
	public static ChromeOptions Chrome() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		return options;
	}
	
	public static ChromeOptions UpdatedChrome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		return options;
	}
}

