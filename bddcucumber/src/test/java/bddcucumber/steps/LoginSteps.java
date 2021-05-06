//package bddcucumber.steps;
//
//import java.util.concurrent.TimeUnit;
//
//import junit.framework.Assert;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginSteps {
//
//	WebDriver driver;
//
//	@Before()
//	public void setup() {
//		System.setProperty(
//				"webdriver.chrome.driver",
//				"C:\\Users\\acer\\Desktop\\bddframework\\bddcucumber\\src\\test\\java\\bddcucumber\\resources\\chromedriver.exe");
//		this.driver = new ChromeDriver();
//		this.driver.manage().window().maximize();
//		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//	}
//
//	@Given("^User navigates to softuni website$")
//	public void user_navigates_to_softuni_website() throws Throwable {
//		driver.get("https://softuni.bg/");
//	}
//
//	@Given("^User clicks on the login button$")
//	public void user_clicks_on_the_login_button() throws Throwable {
//		driver.findElement(By.xpath("//*[contains(text(), '¬ход')]")).click();
//	}
//
//	@Given("^User enters valid username$")
//	public void user_enters_valid_username() throws Throwable {
//		driver.findElement(By.xpath(".//input[contains(@name, 'username')]")).sendKeys("marintenzherski");;
//	}
//
//	@Given("^User enters valid password$")
//	public void user_enters_valid_password() throws Throwable {
//		driver.findElement(By.xpath(".//input[contains(@name, 'password')]")).sendKeys("Marinigrata13");;
//	}
//
//	@When("^User clicks on submit button$")
//	public void user_clicks_on_submit_button() throws Throwable {
//		driver.findElement(By.xpath("//input[contains(@type, 'submit')]")).click();
//
//	}
//
//	@Then("^User is logged in successfully$")
//	public void user_is_logged_in_successfully() throws Throwable {
//		WebElement isLogInProfileName = driver.findElement(By.xpath("//*[contains(@class, 'user-avatar')]"));
//		Assert.assertEquals(true, isLogInProfileName.isDisplayed());
//	}
//}
