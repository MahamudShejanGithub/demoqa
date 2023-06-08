package demoqa.demoqa;

import org.testng.Assert;
import org.testng.annotations.Test;
import BrowserAndUtility.FramesClass;
import BrowserAndUtility.LoggerClass;
import demoqa.PageObjectClasses.NestedFramesPageObject;

public class NestedFramesTest extends BaseTest {
	
	NestedFramesPageObject nft=new NestedFramesPageObject();
	
	@Test(priority=4)
	public void framesTest() {

		nft.AlertsFrameWindows();
        nft.Frames();
        Assert.assertTrue(nft.elementAppeared());
		
		FramesClass.frame("frame1");
		nft.insideIframe1();
		LoggerClass.Info(nft.insideIframe1());
		
		FramesClass.defaultContent();
		
		FramesClass.frame("frame2");
		nft.insideIFrame2();
		LoggerClass.Info(nft.insideIFrame2());
		
		if(nft.insideIframe1()==nft.insideIFrame2()) {
			LoggerClass.Info("Upper Frame Text is equal to Lower Frame Text");
		}
		
		FramesClass.defaultContent();
		
		nft.NestedFrames();
		
		FramesClass.frame("frame1");
		nft.NestedFramesText1();
		LoggerClass.Info(nft.NestedFramesText1());
		
		FramesClass.frame(0);
		nft.NestedFramesText2();
		LoggerClass.Info(nft.NestedFramesText2());
	}
}
