package com.cucumber.StepDefinition;
import java.net.MalformedURLException;
import com.cucumber.Selenium.SeleniumFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class dzoneLoginSD {
	SeleniumFunctions sf = new SeleniumFunctions();
	@Given("^user is on dzone homepage$")
    public void user_is_on_github_homepage() throws MalformedURLException,
            InterruptedException {
        sf.createDriver();
        sf.ishomepageDisplayed();
    }

    @When("^user clicks on Sign in button$")
    public void user_clicks_on_Sign_in_button() throws InterruptedException {
        sf.clickSigninLink();
    }

    @Then("^user is displayed login screen$")
    public void user_is_displayed_login_screen() throws InterruptedException {
        sf.isloginsectionDisplayed();
    }
    
    @When("^user clicks on login button$")
    public void user_clicks_on_login_button() throws InterruptedException {
        sf.clickSigninLink();
        sf.teardown();
    }
}
