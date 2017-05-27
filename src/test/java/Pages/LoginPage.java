package Pages;

import Utils.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by 1 on 20.05.2017.
 */


public class LoginPage extends BasePage {

    @FindBy(id = "mailbox__login")

    private WebElement inputLogin;

    @FindBy(id = "mailbox__password")
    private WebElement inputPassword;

    @FindBy(id = "mailbox__auth__button")
    private WebElement loginButton;


    public void login(User user) throws InterruptedException {
        inputLogin.sendKeys(user.mail);
        inputPassword.sendKeys(user.password);
        loginButton.click();
        Thread.sleep(10000);

    }

}
