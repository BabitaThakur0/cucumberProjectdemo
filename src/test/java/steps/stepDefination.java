package steps;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.AmazonHome;
import utilitis.SeleniumDriver;

public class stepDefination {
	
	AmazonHome Amazon = new AmazonHome();
	
	
	
	@Given("On Home page of Amazon {string}")
	public void on_home_page_of_amazon(String websiteURL) {
		SeleniumDriver.openPage(websiteURL);
	}

	@When("Validate the title")
	public void validate_the_title() {
		Amazon.ValidateTitle();
	}


}
