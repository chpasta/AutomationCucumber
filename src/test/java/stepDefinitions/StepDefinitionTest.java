package stepDefinitions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import loginPage.FillLoginFields;
import loginPage.LoginPage;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinitionTest extends Base {

    @Given("^Initialize the browser with Chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
        driver = initializer();
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {

        FillLoginFields fillLoginFields = new FillLoginFields(driver);
        fillLoginFields.userName().sendKeys(strArg1);
        fillLoginFields.password().sendKeys(strArg2);
    }

    @Then("^Verify that user is successfully  logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
    }

    @And("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
        driver.get(strArg1);

    }

    @And("^Click on Login in home page to land on Secure Sign Page$")
    public void click_on_login_in_home_page_to_land_on_secure_sign_page() throws Throwable {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.popupButton().click();
        loginPage.loginButton().click();
    }

}