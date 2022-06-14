package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    public WebDriver initializer(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
