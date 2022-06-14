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
    private final By popup=By.xpath("//button[text()='NO THANKS']");

    public WebElement loginButton(){
        return driver.findElement(login);
    }
    public WebElement popupButton(){
        return driver.findElement(popup);
    }
}
