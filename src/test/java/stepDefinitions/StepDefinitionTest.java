package stepDefinitions;

//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.And;
//import cucumber.api.junit.Cucumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinitionTest {

    @Given("^Initialize the browser with Chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
    }

    @Then("^Verify that user is succesfully  logged in$")
    public void verify_that_user_is_succesfully_logged_in() throws Throwable {
    }

    @And("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    }

    @And("^Click on Login in home page to land on Secure Sign Page$")
    public void click_on_login_in_home_page_to_land_on_secure_sign_page() throws Throwable {
    }

}