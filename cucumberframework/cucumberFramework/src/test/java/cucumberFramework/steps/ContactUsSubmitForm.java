//package cucumberFramework.steps;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.PendingException;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
//public class ContactUsSubmitForm {
//	
//	WebDriver driver;
//	
//	@Before
//	public void setup() throws IOException{
//		System.setProperty("webdriver.chrome.driver", "src\\test\\java\\cucumberFramework\\resources\\chromedriver.exe");
//		this.driver = new ChromeDriver();
//		this.driver.manage().window().maximize();
//		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
//	}
//	
//	@Given("^I access webdriver university$")
//	public void i_access_webdriver_university() throws Throwable {
//	    driver.get("http://www.webdriveruniversity.com/");
//	}
//
//	@When("^I click on the contact us button$")
//	public void i_click_on_the_contact_us_button() throws Throwable {
//	    driver.findElement(By.className("section-title")).click();
//	}
//
//	@When("^I enter valid firstname$")
//	public void i_enter_valid_firstname() throws Throwable {
//		//Store the current window handle
//		@SuppressWarnings("unused")
//		String winHandlerBString = driver.getWindowHandle();
//		//Perform the click operation that opens the new window
//		//Switch to new window method
//		for (String windowHandler : driver.getWindowHandles()) {
//			driver.switchTo().window(windowHandler);
//		}
//	    driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("igrata1");
//	}
//
//	@When("^I enter valid lastname$")
//	public void i_enter_valid_lastname() throws Throwable {
//		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("igrata1LastN");
//	}
//
//	@When("^I enter valid email address$")
//	public void i_enter_valid_email_address() throws Throwable {
//	    driver.findElement(By.cssSelector("input[name='email']")).sendKeys("mm@abv.bg");
//	}
//
//	@And("^I enter comments$")
//	public void i_enter_comments(DataTable comments) throws Throwable {
//		System.out.println("Test1");
//		List<List<String>> date = comments.raw();
//	    driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys(date.get(0).get(0) + "\n");
//	    driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys(date.get(0).get(1) + "\n");
//
//	}
//
//	@When("^I click on submit button$")
//	public void i_click_on_submit_button() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the information should be submitter successfully$")
//	public void the_information_should_be_submitter_successfully() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}	
//	
//}
