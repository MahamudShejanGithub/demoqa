package demoqa.demoqa;
import org.testng.Assert;
import org.testng.annotations.Test;
import BrowserAndUtility.BrowserUtilClass;
import demoqa.PageObjectClasses.HandlesPageObject;

public class HandlesTest extends BaseTest {

	HandlesPageObject hp= new HandlesPageObject();
	
	@Test(priority=3)
	public void HandlesPageTest() {
		
		hp.AlertsFrameWindows();
		hp.browserWindow();
		Assert.assertTrue(hp.elementAppeared());
		hp.newTab();
		BrowserUtilClass.switchWindow(BrowserUtilClass.currentTab());
		hp.samplePageText();
		Assert.assertEquals("This is a sample page",hp.samplePageText());
		BrowserUtilClass.switchToCurrentWindow();
		hp.elements();
		hp.links();
		hp.home();	
		BrowserUtilClass.switchWindow(BrowserUtilClass.previousTab());		
	}
}
