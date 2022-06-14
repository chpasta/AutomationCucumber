package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By login = By.xpath("//span[contains(text(),'Login')]");

    public WebElement loginButton(){
        return driver.findElement(login);
    }
}
