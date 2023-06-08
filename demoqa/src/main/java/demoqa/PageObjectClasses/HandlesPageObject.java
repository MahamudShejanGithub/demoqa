package demoqa.PageObjectClasses;

import org.openqa.selenium.By;

import BaseClassAndClildClasses.BaseFormClass;
import BaseClassAndClildClasses.ButtonClass;
import BaseClassAndClildClasses.GetTextClass;

public class HandlesPageObject extends BaseFormClass {
	
	public HandlesPageObject() {
		super(By.xpath("//span[normalize-space()='Browser Windows']"),"Hadles Page Appeared");
	}
	
	private ButtonClass AlertsFrameWindows = new ButtonClass(
			By.xpath("//h5[normalize-space()='Alerts, Frame & Windows']"), "Alerts, Frame & Windows Click");
	private ButtonClass BrowserWindow = new ButtonClass(By.xpath("//span[normalize-space()='Browser Windows']"),
			"Browser Window Click");
	private ButtonClass NewTabBtn = new ButtonClass(By.id("tabButton"), "New Tab Click");
	private ButtonClass Elements = new ButtonClass(By.xpath("//div[@class='header-text'][normalize-space()='Elements']"),
			"Elements Click");
	private ButtonClass Links = new ButtonClass(By.xpath("//span[normalize-space()='Links']"), "Links Click");
	private ButtonClass HomeBtn = new ButtonClass(By.xpath("//a[@id='simpleLink']"), "Home Click");

	private GetTextClass SamplePage = new GetTextClass(By.id("sampleHeading"),
			"New Tab with text Sample Page");

	public void AlertsFrameWindows() {
		AlertsFrameWindows.click();
	}

	public void browserWindow() {
		BrowserWindow.click();
	}

	public void newTab() {
		NewTabBtn.click();
	}

	public String samplePageText() {
		return SamplePage.getText();	
	}

	public void elements() {
		Elements.click();
	}

	public void links() {
		Links.click();
	}

	public void home() {
		HomeBtn.click();
	}
}
