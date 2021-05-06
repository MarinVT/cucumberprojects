package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Products1 {
	
	@Given("^User navigates to \"([^\"]*)\" website$")
	public void user_navigates_to_website(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User click on \"([^\"]*)\"laptop(\\d+)\"([^\"]*)\"$")
	public void user_click_on_laptop(String arg1, int arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User is informed with promo alert$")
	public void user_is_informed_with_promo_alert() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
