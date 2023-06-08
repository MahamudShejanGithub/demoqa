package BrowserAndUtility;

public class FramesClass {

	public static void frame(int i) { 
		BrowserFactory.getdriver().switchTo().frame(i); // instead of element should send a id(string)
	}
	
	public static void frame(String element) { 
		BrowserFactory.getdriver().switchTo().frame(element); // instead of element should send a id(string)
	}
	
	public static void defaultContent() {
		BrowserFactory.getdriver().switchTo().defaultContent();
	}
}
