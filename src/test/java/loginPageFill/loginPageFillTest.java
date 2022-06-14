package loginPageFill;

import loginPage.FillLoginFields;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class loginPageFillTest {

    public WebDriver driver;

    @Test
    public void fillLogin(){
        FillLoginFields fillLoginFields = new FillLoginFields(driver);
        fillLoginFields.userName().sendKeys("Carlos");
        fillLoginFields.password().sendKeys("1234");
    }
}

