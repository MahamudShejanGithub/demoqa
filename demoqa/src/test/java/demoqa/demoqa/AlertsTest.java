package demoqa.demoqa;

import org.testng.Assert;
import org.testng.annotations.Test;

import BrowserAndUtility.AlertsClass;
import JSONFileReader.JSONFileReaderClass;
import BrowserAndUtility.LoggerClass;
import demoqa.PageObjectClasses.AlertsPageObject;

public class AlertsTest extends BaseTest {

	AlertsPageObject al=new AlertsPageObject();
	
	@Test(priority=1)
	public void alertsPageTest(){
	
		al.alertsFrameWindows();
		al.alerts();
		Assert.assertTrue(al.elementAppeared());
		
		al.clickToSeeAlert();
		AlertsClass.accept();
		
		al.clickToSeeConfirmBox();
		AlertsClass.accept();
		
		al.clickConfirmBoxText();
		LoggerClass.Info(al.clickConfirmBoxText());
		
		al.clickToSeePromptBox();
		AlertsClass.sendKeysAlert(JSONFileReaderClass.enterText());
		AlertsClass.accept();
		al.clickPromptBoxText();
		
		LoggerClass.Info(al.clickPromptBoxText());
	}
}
