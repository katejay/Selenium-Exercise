package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class StepDefination {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        //Write logic here :
    	System.out.println("Navigate to landing page");
    }

    @When("^User login into site with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_site_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	//Write logic here :
    	System.out.println("Login with username " + strArg1 + " and passsword " + strArg2 );
    }

    @Then("^Successfully Login$")
    public void successfully_login() throws Throwable {
    	//Write logic here :
    	System.out.println("User successfully login");
    }

    @And("^Activity displayed are \"([^\"]*)\"$")
    public void activity_displayed_are_something(String strArg1) throws Throwable {
    	//Write logic here :
    	System.out.println(strArg1);
    }

}