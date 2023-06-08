package BrowserAndUtility;

public class AlertsClass {

	public static void accept() {
		BrowserFactory.getdriver().switchTo().alert().accept();
		LoggerClass.Info("Clicked Ok on Alert");
	}
	
	public static void sendKeysAlert(String value) { 
		BrowserFactory.getdriver().switchTo().alert().sendKeys(value);
		LoggerClass.Warn("Sending Values in Alert Text Box");
	}
}
