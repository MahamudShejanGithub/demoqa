package demoqa.PageObjectClasses;

import org.openqa.selenium.By;

import BaseClassAndClildClasses.BaseFormClass;
import BaseClassAndClildClasses.ButtonClass;
import BaseClassAndClildClasses.GetTextClass;
import BaseClassAndClildClasses.TextClass;

public class ElementsPageObject extends BaseFormClass {

	public ElementsPageObject() {
		super(By.xpath("//h5[normalize-space()='Elements']"),"Elements Page Appeared");
	}
	
	private String[] firstnamedata = new String[2];
	private String[] lastnamedata= new String[2];
	private String[] emaildata= new String[2];
	private String[] agedata= new String[2];
	private String[] salarydata= new String[2];
	private String[] departmentdata= new String[2];
	
	
	private ButtonClass elements = new ButtonClass(By.xpath("//h5[normalize-space()='Elements']"), "Elements Click");
	private ButtonClass webtables = new ButtonClass(By.xpath("//span[normalize-space()='Web Tables']"),
			"WebTables Click");
	private ButtonClass add = new ButtonClass(By.id("addNewRecordButton"), "Add Click");
	private ButtonClass form = new ButtonClass(By.xpath("//div[@class='modal-content']"), "form Click");
	private ButtonClass submit = new ButtonClass(By.id("submit"), "Submit Click");
	private ButtonClass delete = new ButtonClass(
			By.xpath("//span[@id='delete-record-4']//*[name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]"),
			"Delete Click");

	private TextClass firstname1 = new TextClass(By.id("firstName"),"First Name");
	private TextClass lastname1 = new TextClass(By.id("lastName"),"Last Name");
	private TextClass email1 = new TextClass(By.id("userEmail"),"Email");
	private TextClass age1 = new TextClass(By.id("age"),"Age");
	private TextClass salary1 = new TextClass(By.id("salary"),"Salary");
	private TextClass department1 = new TextClass(By.id("department"),"Department");
	
	private GetTextClass firstnamedata1 = new GetTextClass(By.xpath("//div[normalize-space()='Jon']"),"Test Data 1 : First Name");
	private GetTextClass lastnamedata1 = new GetTextClass(By.xpath("//div[normalize-space()='Snow']"),"Test Data 1 : Last Name");
	private GetTextClass emaildata1 = new GetTextClass(By.xpath("//div[normalize-space()='knownothing@gmail.com']"),"Test Data 1 : Email");
	private GetTextClass agedata1 = new GetTextClass(By.xpath("//div[normalize-space()='30']"),"Test Data 1 : Age");
	private GetTextClass salarydata1 = new GetTextClass(By.xpath("//div[normalize-space()='3000']"),"Test Data 1 : Salary");
	private GetTextClass  departmentdata1 = new GetTextClass(By.xpath("//div[normalize-space()='alpha']"),"Test Data 1 : Department");

	private GetTextClass firstnamedata2 = new GetTextClass(By.xpath("//div[normalize-space()='Buttercup']"),"Test Data 2 : First Name");
	private GetTextClass lastnamedata2 = new GetTextClass(By.xpath("//div[normalize-space()='Cumbersnatch']"),"Test Data 2 : Last Name");
	private GetTextClass emaildata2 = new GetTextClass(By.xpath("//div[normalize-space()='BudapestCandygram@mail.io']"),"Test Data 2 : Email");
	private GetTextClass agedata2 = new GetTextClass(By.xpath("//div[normalize-space()='41']"),"Test Data 2 : Age");
	private GetTextClass salarydata2 = new GetTextClass(By.xpath("//div[normalize-space()='2000']"),"Test Data 2 : Salary");
	private GetTextClass departmentdata2 = new GetTextClass(By.xpath("//div[normalize-space()='beta']"),"Test Data 2 : Department");
	
	public void clickElements() {
		elements.click();
	}

	public void clickWebTabls() {
		webtables.click();
	}

	public void clickAdd() {
		add.click();
	}

	public void clickForm() {
		form.click();
	}

	public void setFirstName(String firstname) {
		firstname1.sendKeys(firstname);

	}

	public void setLastName(String lastname) {
		lastname1.sendKeys(lastname);
	}

	public void setEmail(String email) {
		email1.sendKeys(email);
	}

	public void setAge(String age) {
		age1.sendKeys(age);
	}

	public void setSalary(String salary) {
		salary1.sendKeys(salary);
	}

	public void setDepartment(String department) {
		department1.sendKeys(department);
	}
	
	public String getFirstNameTestData1() {
		this.firstnamedata[0] = firstnamedata1.getText();
		return firstnamedata[0];		
	}

	public String getLastNameTestData1() {
		this.lastnamedata[0] = lastnamedata1.getText();
		return lastnamedata[0];		
	}
	
	public String getEmailTestData1() {
		this.emaildata[0] = emaildata1.getText();
		return emaildata[0];		
	}
	
	public String getAgeTestData1() {
		this.agedata[0] = agedata1.getText();
		return agedata[0];		
	}
	
	public String getSalaryTestData1() {
		this.salarydata[0] = salarydata1.getText();
		return salarydata[0];		
	}
	
	public String getDepartmentTestData1() {
		this.departmentdata[0] = departmentdata1.getText();
		return departmentdata[0];		
	}
	
	public String getFirstNameTestData2() {
		this.firstnamedata[1] = firstnamedata2.getText();
		return firstnamedata[1];		
	}

	public String getLastNameTestData2() {
		this.lastnamedata[1] = lastnamedata2.getText();
		return lastnamedata[1];		
	}
	
	public String getEmailTestData2() {
		this.emaildata[1]= emaildata2.getText();
		return emaildata[1];		
	}
	
	public String getAgeTestData2() {
		this.agedata[1] = agedata2.getText();
		return agedata[1];		
	}
	
	public String getSalaryTestData2() {
		this.salarydata[1] = salarydata2.getText();
		return salarydata[1];		
	}
	
	public String getDepartmentTestData2() {
		this.departmentdata[1] = departmentdata2.getText();
		return departmentdata[1];		
	}
	
	public void clickSubmit() {
		submit.click();
	}

	public void clickDelete() {
		delete.click();
	}
}
