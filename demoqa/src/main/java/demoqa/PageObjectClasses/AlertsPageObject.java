package demoqa.PageObjectClasses;

import org.openqa.selenium.By;

import BaseClassAndClildClasses.BaseFormClass;
import BaseClassAndClildClasses.ButtonClass;
import BaseClassAndClildClasses.GetTextClass;
import JSONFileReader.JSONFileReaderClass;

public class AlertsPageObject extends BaseFormClass {

	public AlertsPageObject() {
		super(By.xpath("(//li[@id='item-1'])[2]"),"Alerts Page Has Appeared ");
	}
	
	private ButtonClass AlertsFrameWindows = new ButtonClass(By.xpath("//h5[normalize-space()='Alerts, Frame & Windows']"), "Alerts, Frame & Windows Click");
	private ButtonClass Alerts = new ButtonClass(By.xpath("(//li[@id='item-1'])[2]"), "Alerts Click");
	private ButtonClass ClickToSeeAlert = new ButtonClass(By.id("alertButton"), "Click Button to see alert");
	private ButtonClass confirmbox = new ButtonClass(By.id("confirmButton"), "On click,Confirm box appears");
	private ButtonClass promptbox = new ButtonClass(By.id("promtButton"), "On click,Prompt box appears");
	
	private GetTextClass confirmresult = new GetTextClass(By.id("confirmResult"),
			"Fetched the text--> You selected ok");
	private GetTextClass promptresult = new GetTextClass(By.id("promptResult"),
			"Fetched the text--> You entered "+JSONFileReaderClass.enterText());

	public void alertsFrameWindows() {
		AlertsFrameWindows.click();
	}

	public void alerts() {
		Alerts.click();
	}

	public void clickToSeeAlert() {
		ClickToSeeAlert.click();
	}
	
	public void clickToSeeConfirmBox() {
		confirmbox.click();
	}
	
	public String clickConfirmBoxText() {
		String text=confirmresult.getText();
		return text;
	}

	public void clickToSeePromptBox() {
		promptbox.click();
	}
	public String clickPromptBoxText() {
		String text=promptresult.getText();
		return text;
	}
}
