package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by 1 on 20.05.2017.
 */
public class MailPage extends BasePage {
    @FindBy(id = "PH_user-email")
    private WebElement userMail;


    public String getUserMail() {
        return driver.getWebElementWithWait(userMail, 10).getText();

    }

}
