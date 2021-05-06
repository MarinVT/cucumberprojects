package bddcucumber.steps;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginOutlineTest {

	WebDriver driver;

	@Before
	public void setUp() throws IOException {
//		System.setProperty(
//				"webdriver.chrome.driver",
//				"C:\\Users\\acer\\Desktop\\bddframework\\bddcucumber\\src\\test\\java\\bddcucumber\\resources\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", Paths.get(System.getProperty("user.dir")).toRealPath() + 
				"\\src\\test\\java\\bddcucumber\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
//	@After
//	public void tearDown() {
//		driver.close();
//		driver.quit();
//	}

	@Given("^User navigates to \"([^\"]*)\"$")
	public void user_navigates_to(String url) throws Throwable {
		driver.get(url);
	}

	@When("^User click on login portal button$")
	public void user_click_on_login_portal_button() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h1[contains(text(), 'LOGIN PORTAL')]"))
				.click();
//		driver.findElement(By.xpath("//*[contains(text(), 'Вход')]")).click();
	}

	@And("^User enters valid \"([^\"]*)\" username$")
	public void user_enters_valid_username(String username) throws Throwable {
		@SuppressWarnings("unused")
		String windowHandler = driver.getWindowHandle();
		// Switch to the new window
		for (String winHandler : driver.getWindowHandles()) {
			driver.switchTo().window(winHandler);
		}

		driver.findElement(By.id("text")).sendKeys(username);
	}

	@And("^User enters correct \"([^\"]*)\" password$")
	public void user_enters_correct_password(String password) throws Throwable {
		driver.findElement(By.id("password")).sendKeys(password);
//		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
		driver.findElement(By.id("login-button")).click();
//		driver.findElement(By.xpath("//input[contains(@type, 'submit')]")).click();
	}

	@Then("^User is successfully logged in with pop up \"([^\"]*)\"$")
	public void user_is_successfully_logged_in_with_pop_up(String messagePopUp)throws Throwable {
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Assert.assertEquals(alert.getText().toString().toLowerCase().replaceAll("\\s", ""), 
				messagePopUp.toLowerCase().replaceAll("\\s", ""));
		Thread.sleep(2000);
		alert.accept();
		

//		try {
//			WebElement login = driver.findElement(By.xpath("//*contains[text(), 'Невалидно потребителско име или парола']"));
//			Assert.assertEquals(true, login.isDisplayed());
//		} catch (Exception e) {
//			System.out.println("Профил");
//			e.printStackTrace();
//		}
	}

}
