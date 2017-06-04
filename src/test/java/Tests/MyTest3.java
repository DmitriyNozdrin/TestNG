package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by 1 on 07.05.2017.
 */
public class MyTest3 extends BaseTest {



   /* @DataProvider(name = "Name")
    public static Object[][] Name() {
return new Object[][]{{"https://mail.ru/"}};
    }*/


    @Test
    public void testName() throws InterruptedException {

        app.login.loginValidUser();

        Assert.assertEquals(app.mail.getUserMail(), validUser.mail);










       /* driver.get(BASE_URL);
        WebElement login = driver.findElement(By.id("mailbox__login"));
        login.sendKeys("multik83@bk.ru");
        WebElement password = driver.findElement(By.id("mailbox__password"));
        password.sendKeys("J3qq4H7h2v");
        WebElement logikKey = driver.findElement(By.id("mailbox__auth__button"));
        logikKey.click();
        Thread.sleep(8000);
        WebElement mail = driver.findElement(By.id("PH_user-email"));
        String mailText = mail.getText();

        Assert.assertEquals(mailText, "multik83@bk.ru" );*/

    }
}
