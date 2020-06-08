package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import endtoend.pageobject.HomePage;
import endtoend.pageobject.LoginPage;
import endtoend.resources.Browser;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class StepDefination extends Browser {

	 @Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
		 driver = initializeDriver();
	    }

	    @When("^User login into site with (.+) and (.+)$")
	    public void user_login_into_site_with_and(String username, String password) throws Throwable {
	    	LoginPage lp = new LoginPage(driver);
			lp.getUsername().sendKeys(username);
			lp.getPassword().sendKeys(password);
			lp.submit().click();
	    }

	    @Then("^Validate login$")
	    public void validate_login() throws Throwable {
	    	LoginPage lp = new LoginPage(driver);
	    	//System.out.println(lp.getProfile().isDisplayed());	//Provide valid details and uncomment this line
	    	System.out.println("Provide valid info");
	    }

	    @And("^Navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	    }

	    @And("^Click on Sign In button$")
	    public void click_on_sign_in_button() throws Throwable {
	    	HomePage hp = new HomePage(driver);
			hp.signIn().click();
	    }

	    @And("^Close browser$")
	    public void close_browser() throws Throwable {
	    	driver.close();
	    }
}