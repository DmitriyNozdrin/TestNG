package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by 1 on 20.05.2017.
 */
public class MailPage extends BasePage {
    @FindBy(id = "PH_user-email")
    private WebElement userMail;


    public String getUserMail() {
        return userMail.getText();

    }

}
