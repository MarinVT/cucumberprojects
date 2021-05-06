package bddtest.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import bddtest.pageObjects.BasePage;
import bddtest.pageObjects.ContactUs_Page;
import bddtest.pageObjects.Products_Page;

public class DriverFactory {

	public static WebDriver driver;
	public static BasePage basePage;
	public static ContactUs_Page contactUs_Page;
	public static Products_Page products_Page;

	public static WebDriver getDriver() {

		try {
			// Read config file
			ReadConfigFile file = new ReadConfigFile();
			String browserName = file.getBrowser();

			switch (browserName) {

			case "firefox":
				if (driver == null) {
					System.setProperty("webdriver.gecko.driver",
							Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities
							.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
				}
				break;

			case "chrome":
				if (driver == null) {
					System.setProperty("webdriver.chrome.driver",
							Constant.CHROME_DRIVER_DIRECTORY);
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;
			}

		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
			e.printStackTrace();
		} finally {

			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			contactUs_Page = PageFactory.initElements(driver, ContactUs_Page.class);
			products_Page = PageFactory.initElements(driver, Products_Page.class);
			basePage = PageFactory.initElements(driver, BasePage.class);
		}
		return driver;
	}
}
