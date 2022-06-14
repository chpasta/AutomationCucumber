package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FillLoginFields {

    public WebDriver driver;

    public FillLoginFields(WebDriver driver) {
        this.driver = driver;
    }

    private final By username = By.xpath("//input[@id='user_email']");
    private final By pw = By.xpath("//input[@id='user_password']");
    private final By submit = By.cssSelector("input[type='submit']");

    public WebElement userName(){
        return driver.findElement(username);
    }
    public WebElement password(){
        return driver.findElement(pw);
    }
    public WebElement submitButton(){
        return driver.findElement(submit);
    }
}
