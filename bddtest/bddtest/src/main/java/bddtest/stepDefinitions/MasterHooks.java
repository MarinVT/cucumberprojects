package bddtest.stepDefinitions;

import bddtest.utils.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MasterHooks extends DriverFactory{

	@Before
	public void setup() {
		driver = getDriver();
	}
	
	@After
	public void tearDown() {
		
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
			driver = null;
		}
	}
	
}
