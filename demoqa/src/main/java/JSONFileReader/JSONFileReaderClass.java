package JSONFileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONFileReaderClass {

	public static JSONArray userArray() {

		JSONParser jsonparser = new JSONParser();
		FileReader reader = null;
		try {
			reader = new FileReader(".\\TestData\\UsersTestData.json");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Object obj = null;
		try {
			obj = jsonparser.parse(reader);
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		JSONObject usersjson = (JSONObject) obj;
		JSONArray array = (JSONArray) usersjson.get("Users");

		return array;
	}
	
	public static JSONObject fileReaderJSONObj() {
		
		JSONParser jsonparser = new JSONParser();
		FileReader reader = null;
		try {
			reader = new FileReader(".\\TestData\\Configurations.json");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Object obj = null;
		try {
			obj = jsonparser.parse(reader);
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		JSONObject Obj = (JSONObject) obj;
		
		return Obj;
	}
	
	public static String configBrowser() {

		String browser = (String) fileReaderJSONObj().get("browser1");	
		return browser;
	}

	public static String url() {

		String url = (String) fileReaderJSONObj().get("Url");
		return url;
	}
	
	public static String enterText() {
		String text= (String) fileReaderJSONObj().get("EnterText");
		return text;
	}
}
