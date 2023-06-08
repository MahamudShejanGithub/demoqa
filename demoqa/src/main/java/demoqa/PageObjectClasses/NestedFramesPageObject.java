package demoqa.PageObjectClasses;

import org.openqa.selenium.By;

import BaseClassAndClildClasses.BaseFormClass;
import BaseClassAndClildClasses.ButtonClass;
import BaseClassAndClildClasses.GetTextClass;
import BrowserAndUtility.BrowserUtilClass;

public class NestedFramesPageObject extends BaseFormClass{

	public NestedFramesPageObject() {
		super(By.xpath("//span[normalize-space()='Frames']"), "Frames Page Appeared");
	}
	private String Text1;
	private String Text2;
	
	private ButtonClass AlertsFrameWindows = new ButtonClass(By.xpath("//h5[normalize-space()='Alerts, Frame & Windows']"), "Alerts, Frame & Windows Click");
	private ButtonClass NestedFrames= new ButtonClass(By.xpath("//span[normalize-space()='Nested Frames']"), "Nested Frames Click");
	private ButtonClass Frames= new ButtonClass(By.xpath("//span[normalize-space()='Frames']"), "Frames Click");	

	private GetTextClass parentText= new GetTextClass(By.xpath("//body"),"Text Inside Parent Frame");
	private GetTextClass childText= new GetTextClass(By.xpath("//p[normalize-space()='Child Iframe']"),"Text Inside Child Frame");
	private GetTextClass upperText= new GetTextClass(By.id("sampleHeading"),"Text Inside UpperFrame");
	private GetTextClass lowerText= new GetTextClass(By.id("sampleHeading"),"Text Inside lowerFrame");

	public void AlertsFrameWindows() {
		AlertsFrameWindows.click();
	}
	public void NestedFrames() {
		NestedFrames.click();
	}
	public String NestedFramesText1() { 
	
	 BrowserUtilClass.Wait();
	 return	Text1=parentText.getText();	
	}
	public String NestedFramesText2() {
		
		BrowserUtilClass.Wait();
		return Text2=childText.getText();
	}
	
	public void Frames() {
		Frames.click();
	}
	public String insideIframe1() {
		
		BrowserUtilClass.Wait();
		String iframeText1=upperText.getText();
		return iframeText1;
	}
	
	public String insideIFrame2() {
		
		BrowserUtilClass.Wait();
		String iframeText2=lowerText.getText();
		return iframeText2;
	}
}
