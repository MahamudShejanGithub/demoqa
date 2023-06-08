package BaseClassAndClildClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BrowserAndUtility.BrowserFactory;
import BrowserAndUtility.LoggerClass;

public abstract class BaseElementClass {

	private By uniquelocator;
	private String msg;
	private WebElement element;
	
	public BaseElementClass(By locator, String msg) {
		this.uniquelocator = locator;
		this.msg = msg;
	}

	public WebElement getElement() {
		return this.element = BrowserFactory.getdriver().findElement(uniquelocator);
	}
	
	public void click() {
		LoggerClass.Info(msg);
		getElement().click();
	}

	public void sendKeys(String value) {
		LoggerClass.Warn(msg);
		getElement().sendKeys(value);
	}

	public String getText() {
		LoggerClass.Info(msg);
		return getElement().getText();
	}

}
