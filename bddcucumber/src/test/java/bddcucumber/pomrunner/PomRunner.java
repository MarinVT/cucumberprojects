package bddcucumber.pomrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
		features = {"src/test/java/bddcucumber/featureFiles4"},
		glue = {"bddcucumber.steps4"},
		monochrome = true,
		dryRun = false,
		tags = {"@live, @staging"},
		plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", 
				"com.cucumber.listener.ExtentCucumberFormatter:target/reporter.html"}
		)

public class PomRunner {
	
}
