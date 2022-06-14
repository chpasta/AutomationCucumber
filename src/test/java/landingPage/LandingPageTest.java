package landingPage;

import base.Base;
import loginPage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LandingPageTest extends Base {

    public WebDriver driver;

    @BeforeTest
    public void init(){
        driver = initializer();
        driver.get("http://qaclickacademy.com/");
    }

    @Test
    public void login(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginButton().click();
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
