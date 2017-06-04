package Pages;

import Steps.LoginSteps;
import Utils.User;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by 1 on 20.05.2017.
 */


public class LoginPage extends BasePage {

    Logger log = Logger.getLogger(LoginPage.class);


    @FindBy(id = "mailbox__login")

    private WebElement inputLogin;

    @FindBy(id = "mailbox__password")
    private WebElement inputPassword;

    @FindBy(id = "mailbox__auth__button")
    private WebElement loginButton;


    public void login(User user) {
        driver.scrollDown();
        driver.scrollUp();
        log.info("User name " + user.name + " mail - "+user.mail);
        inputLogin.sendKeys(user.mail);
        inputPassword.sendKeys(user.password);
        loginButton.click();
        //   Thread.sleep(10000);

    }

}
