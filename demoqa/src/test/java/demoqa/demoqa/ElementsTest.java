package demoqa.demoqa;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import BrowserAndUtility.BrowserUtilClass;
import JSONFileReader.JSONFileReaderClass;
import demoqa.PageObjectClasses.ElementsPageObject;
import junit.framework.Assert;

public class ElementsTest extends BaseTest {

	ElementsPageObject el = new ElementsPageObject();
	private int j=0;
	BaseTest bt=new BaseTest();
	@Test(priority=2,dataProvider ="userData")
	public void registrationFormTest(String firstname, String lastname, String email, String age, String salary,
			String department) {
		bt.getWebsite();
		el.clickElements();	
		BrowserUtilClass.Wait();
		el.clickWebTabls();
		el.clickAdd();
		el.clickForm();
		el.setFirstName(firstname);
		el.setLastName(lastname);
		el.setEmail(email);
		el.setAge(age);
		el.setSalary(salary);
		el.setDepartment(department);
		el.clickSubmit();
		BrowserUtilClass.Wait();

	if(j==0) {	
		Assert.assertEquals(el.getFirstNameTestData1(), firstname);
		Assert.assertEquals(el.getLastNameTestData1(), lastname);
		Assert.assertEquals(el.getEmailTestData1(), email);
		Assert.assertEquals(el.getAgeTestData1(), age);
		Assert.assertEquals(el.getSalaryTestData1(), salary);
		Assert.assertEquals(el.getDepartmentTestData1(), department);
	}
	else {
		Assert.assertEquals(el.getFirstNameTestData2(), firstname);
		Assert.assertEquals(el.getLastNameTestData2(), lastname);
		Assert.assertEquals(el.getEmailTestData2(), email);
		Assert.assertEquals(el.getAgeTestData2(), age);
		Assert.assertEquals(el.getSalaryTestData2(), salary);
		Assert.assertEquals(el.getDepartmentTestData2(), department);
	}
		el.clickDelete();
		j++;
}
	
	@DataProvider
	public Object[][] userData() {

		int size = JSONFileReaderClass.userArray().size();
		Object[][] data = new Object[2][6];
		for (int i = 0; i < size; i++) {

			JSONObject Users = (JSONObject) JSONFileReaderClass.userArray().get(i);

			data[i][0] = (String) Users.get("FirstName");
			data[i][1] = (String) Users.get("LastName");
			data[i][2] = (String) Users.get("Email");
			data[i][3] = (String) Users.get("Age");
			data[i][4] = (String) Users.get("Salary");
			data[i][5] = (String) Users.get("Department");

		}
		return data;
	}
}
