package bddcucumber.steps4;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestScenOut {

	WebDriver driver;

	@Before("@live")
	public void setupChrome() {
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\acer\\Desktop\\bddframework\\bddcucumber\\src\\test\\java\\bddcucumber\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	@Before("@staging")
	public void setupFirefox() {
		System.setProperty(
				"webdriver.gecko.driver",
				"C:\\Users\\acer\\Desktop\\bddframework\\bddcucumber\\src\\test\\java\\bddcucumber\\resources\\geckodriver.exe");
		this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	 @After
	 public void tearDown(){
	 driver.manage().deleteAllCookies();
	 driver.close();
	 driver.quit();
	 }

	@Given("^User navigates to \"([^\"]*)\" website$")
	public void user_navigates_to_website(String url) throws Throwable {
		driver.get(url);
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//*[contains(text(), 'LOGIN PORTAL')]")).click();
	}

	@When("^User enters  \"([^\"]*)\" username$")
	public void user_enters_username(String usernameStr) throws Throwable {
		// tab code
		for (String windowHandler : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandler);
		}
		// find username ID
		driver.findElement(By.id("text")).sendKeys(usernameStr);
	}

	@When("^User enters \"([^\"]*)\" password$")
	public void user_enters_password(String passwordStr) throws Throwable {
		driver.findElement(By.id("password")).sendKeys(passwordStr);
	}

	@When("^User click on loggin button$")
	public void user_click_on_loggin_button() throws Throwable {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("^User is getting login \"([^\"]*)\" message$")
	public void user_is_getting_login_message(String messageStr)
			throws Throwable {
		// Create instance of alert
		Alert alert = driver.switchTo().alert();
		junit.framework.Assert.assertEquals(alert.getText().toString().toLowerCase().replaceAll("\\s", ""), 
											messageStr.toLowerCase().replaceAll("\\s", ""));
		alert.accept();
	}
}




