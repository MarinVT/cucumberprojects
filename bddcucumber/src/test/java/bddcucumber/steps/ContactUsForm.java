//package bddcucumber.steps;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import junit.framework.Assert;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class ContactUsForm {
//	
//	WebDriver driver;
//	
//	@Before
//	public void setUp() {
//		System.setProperty(
//				"webdriver.chrome.driver",
//				"C:\\Users\\acer\\Desktop\\bddframework\\bddcucumber\\src\\test\\java\\bddcucumber\\resources\\chromedriver.exe");
//		this.driver = new ChromeDriver();
//		this.driver.manage().window().maximize();
//		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//	}
//	
//	@Given("^I access webdriveruniversity$")
//	public void i_access_webdriveruniversity() throws Throwable {
//	    driver.get("http://www.webdriveruniversity.com/");
//	}
//
//	@When("^I click on contactus button$")
//	public void i_click_on_contactus_button() throws Throwable {
//	    driver.findElement(By.xpath("//h1[contains(text(), 'CONTACT US')]")).click();
//	}
//
//	@When("^I entee first name$")
//	public void i_entee_first_name() throws Throwable {
//	    @SuppressWarnings("unused")
//	    String windowHandler = driver.getWindowHandle();
//	    //Switch to new window
//	    for (String winHandler : driver.getWindowHandles()) {
//			driver.switchTo().window(winHandler);
//		}
//	    
//	    driver.findElement(By.xpath("//input[contains(@name, 'first_name')]")).sendKeys("marin1");
//	}
//
//	@When("^I enter last name$")
//	public void i_enter_last_name(DataTable firstLastNameTable) throws Throwable {
//		List<List<String>> tableData = firstLastNameTable.raw();
//		
//		driver.findElement(By.xpath("//input[contains(@name, 'last_name')]")).sendKeys(tableData.get(0).get(1));
//	}
//
//	@When("^I enter an email$")
//	public void i_enter_an_email() throws Throwable {
//		driver.findElement(By.xpath("//input[contains(@name, 'email')]")).sendKeys("marin@abv.bg");
//	}
//
//	@When("^I enter comments$")
//	public void i_enter_comments(DataTable comments) throws Throwable {
//	    List<List<String>> dataList = comments.raw();
//	    driver.findElement(By.xpath("//*[contains(@placeholder, 'Comments')]")).sendKeys(dataList.get(0).get(0) + "\n");
//	    driver.findElement(By.xpath("//*[contains(@placeholder, 'Comments')]")).sendKeys(dataList.get(0).get(1));
//	}
//
//	@When("^I click on submit button$")
//	public void i_click_on_submit_button() throws Throwable {
//	    driver.findElement(By.cssSelector("input[value='SUBMIT']")).click();
//	}
//
//	@Then("^The information is successfully submitted$")
//	public void the_information_is_successfully_submitted() throws Throwable {
//		WebElement isLogInProfileName = driver.findElement(By.xpath("//*[contains(@id, 'contact_reply')]"));
//		Assert.assertEquals(true, isLogInProfileName.isDisplayed());
//	}
//}
