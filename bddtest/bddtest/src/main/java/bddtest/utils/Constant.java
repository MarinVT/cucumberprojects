package bddtest.utils;

public class Constant {

	// Config properties file

	public final static String CONFIG_PROPERTIES_DIRECTORY = "bddtest/properties/config.properties";

	public final static String CHROME_DRIVER_DIRECTORY = System
			.getProperty("user.dir")
			+ "\\src\\test\\java\\resources\\others\\chromedriver.exe";

	public final static String GECKO_DRIVER_DIRECTORY = System
			.getProperty("user.dir")
			+ "\\src\\test\\java\\resources\\others\\geckodriver.exe";
}