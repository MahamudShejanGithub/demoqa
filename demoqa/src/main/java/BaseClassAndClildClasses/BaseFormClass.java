package BaseClassAndClildClasses;

import org.openqa.selenium.By;
import BrowserAndUtility.BrowserFactory;
import BrowserAndUtility.LoggerClass;

public class BaseFormClass {

	By uniqueformlocator;
	String msg;

	public BaseFormClass(By uniqueformlocator, String msg) {

		this.uniqueformlocator = uniqueformlocator;
		this.msg = msg;
		LoggerClass.Info(msg);
	}

	public boolean elementAppeared() {

		return BrowserFactory.getdriver().findElement(uniqueformlocator).isDisplayed();
	}
}
