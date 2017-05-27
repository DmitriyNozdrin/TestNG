package Pages;

import Driver.MyDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by 1 on 20.05.2017.
 */
public abstract class BasePage {
     static public WebDriver driver = MyDriverFactory.getDriver();
    public static String BASE_URL = "http://mail.ru";

    public BasePage() {
        PageFactory.initElements(driver, this);

    }

}