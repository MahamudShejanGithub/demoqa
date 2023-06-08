package BrowserAndUtility;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtilClass {

	public static void Wait() {
		BrowserFactory.getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public static void switchWindow(String value) {
		BrowserFactory.getdriver().switchTo().window(value);
	}
	
	public static List<String> getOpneWindowsIDs() {
		Set<String> windowIDs = BrowserFactory.getdriver().getWindowHandles();
		List<String> windowsIDList = new ArrayList<String>(windowIDs);
		return windowsIDList;
	}

	public static void switchToCurrentWindow() {
		for (String winHandle : BrowserFactory.getdriver().getWindowHandles()) {
			BrowserFactory.getdriver().switchTo().window(winHandle);
		}
	}

	public static String previousTab() {
		String preWinId = getOpneWindowsIDs().get(0);
		return preWinId;
	}

	public static String currentTab() {
		String currWinId = getOpneWindowsIDs().get(1);
		return currWinId;
	}
	
	public static void pageLoad() {
		BrowserFactory.getdriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}

}
