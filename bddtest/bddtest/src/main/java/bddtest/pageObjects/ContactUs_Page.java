package bddtest.pageObjects;

import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import cucumber.api.DataTable;

public class ContactUs_Page extends BasePage {
	
	public @FindBy(xpath = "//input[@name= 'first_name']") WebElement textField_FirstName;
	public @FindBy(xpath = "//input[@name= 'last_name']") WebElement textField_LasttName;
	public @FindBy(xpath = "//input[@name= 'email']") WebElement textField_Email;
	public @FindBy(xpath = "//textarea[@name= 'message']") WebElement textField_Message;
	public @FindBy(xpath = "//input[@value= 'SUBMIT']") WebElement button_Submit;
	
	public ContactUs_Page() throws IOException {
		super();
	}
	
	public ContactUs_Page getContactUsPage() throws IOException {
		getDriver().get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		return new ContactUs_Page();
	}
	
	public ContactUs_Page enterFirstName() throws Exception {
		sendKeysToWebElement(textField_FirstName, "Marin");	
		return new ContactUs_Page();
	}
	
	public ContactUs_Page enterLastName(DataTable dataTable, int row, int col) throws Exception {
		List<List<String>> data = dataTable.raw();
		sendKeysToWebElement(textField_LasttName, data.get(row).get(col));
		return new ContactUs_Page();
	}
	
	public ContactUs_Page enterEmail(String email) throws Exception {
		sendKeysToWebElement(textField_Email, email);	
		return new ContactUs_Page();
	}
	
	
	public ContactUs_Page enterComments(DataTable dataTable, int row, int col) throws Exception {
		List<List<String>> data = dataTable.raw();
		sendKeysToWebElement(textField_Message, data.get(row).get(col));	
		return new ContactUs_Page();
	}
	
	public ContactUs_Page clickOnSubmitButton() throws Exception {
		waitAndClickElement(button_Submit);	
		return new ContactUs_Page();
	}
	
	public ContactUs_Page confirmContactUsMessage() throws IOException {
		WebElement confirmMessage = getDriver().findElement(By.xpath(".//*[@id='contact_reply']/h1"));
		WaitUntilWebElementIsVisible(confirmMessage);
		Assert.assertEquals("thankyouforyourmessage!", confirmMessage.getText().toLowerCase().replaceAll("[ ()0-9]", ""));
		return new ContactUs_Page();
	}
}





