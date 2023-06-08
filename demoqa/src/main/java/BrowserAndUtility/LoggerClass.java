package BrowserAndUtility;

import org.apache.logging.log4j.LogManager;

public class LoggerClass { 
	
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger("log4j2.xml");
	
	public static void Info(String msg) {
		log.info(msg);
	}
	public static void Warn(String msg) {
		log.warn(msg);
	}
}
