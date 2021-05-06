package cucumberFramework.steps;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsForm {
	
	WebDriver driver;
	
	@Before
	public void setup() throws IOException{
		System.setProperty("webdriver.chrome.driver", "src\\test\\java\\cucumberFramework\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}
	
	@Given("^I access webdriveruniversity website$")
	public void i_access_webdriveruniversity_website() throws Throwable {
		driver.get("http://www.webdriveruniversity.com/");
	}

	@When("^I click on contact us form$")
	public void i_click_on_contact_us_form() throws Throwable {
		driver.findElement(By.className("section-title")).click();
	}

	@When("^I enter user first name$")
	public void i_enter_user_first_name(DataTable table1) throws Throwable {
		@SuppressWarnings("unused")
		String winHandlerBString = driver.getWindowHandle();
		//Perform the click operation that opens the new window
		//Switch to new window method
		for (String windowHandler : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandler);
		}

	    List<List<String>> data = table1.raw();
	    driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys(data.get(0).get(2));
	}

	@When("^I enter user last name$")
	public void i_enter_user_last_name() throws Throwable {
		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("igrata1LastN");
	}

	@When("^I enter valid email address$")
	public void i_enter_valid_email_address() throws Throwable {
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("mm@abv.bg");
	}

	@When("^I enter comments$")
	public void i_enter_comments(DataTable comments) throws Throwable {
		List<List<String>> date = comments.raw();
	    driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys(date.get(0).get(0) + "\n");
	    driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys(date.get(0).get(1));
	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
	    System.out.println("Test1");
	}

	@Then("^The information should be successfully submitted$")
	public void the_information_should_be_successfully_submitted() throws Throwable {
	   System.out.println("Test2");
	}
}
