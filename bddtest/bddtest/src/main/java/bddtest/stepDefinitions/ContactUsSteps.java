package bddtest.stepDefinitions;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bddtest.pageObjects.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsSteps extends BasePage{
	public @FindBy(xpath = "//input[@name='first_name']") WebElement textfield_FirstName;
	public @FindBy(xpath = "//input[@name='last_name']") WebElement textfield_LastName;
	public @FindBy(xpath = "//input[@name='email']") WebElement textfield_EmailAddress;
	public @FindBy(xpath = "//input[@name='message']") WebElement textfield_Message;
	public @FindBy(xpath = "//input[@name='SUBMIT']") WebElement button_SUBMIT;
	
	
	public ContactUsSteps () throws IOException {
		super();
	}
	
	@Given("^I access webdriveruniversity contact us form$")
	public void i_access_webdriveruniversity_contact_us_form() throws IOException {
		contactUs_Page.getContactUsPage();
	}

	@When("^I enter a valid firstname$")
	public void i_enter_a_valid_firstname() throws Exception {
		contactUs_Page.enterFirstName();
	}

	@When("^I enter a valid last name$")
	public void i_enter_a_valid_last_name(DataTable dataTable) throws Exception{
		contactUs_Page.enterLastName(dataTable, 0, 1);
	}

	@And("^i enter a valid email address$")
	public void i_enter_a_valid_email_address() throws Exception  {
		contactUs_Page.enterEmail("marin@abv.bg");
	}

	@And("^i enter comments$")
	public void i_enter_comments(DataTable dataTable) throws Exception {
		contactUs_Page.enterComments(dataTable, 0, 1);
	}

	@When("^i click on the submit button$")
	public void i_click_on_the_submit_button() throws Exception {
		contactUs_Page.clickOnSubmitButton();
	}

	@Then("^the information should successfully be submitted via the contact us form$")
	public void the_information_should_successfully_be_submitted_via_the_contact_us_form() throws InterruptedException, IOException  {
		contactUs_Page.confirmContactUsMessage();
	}
}
