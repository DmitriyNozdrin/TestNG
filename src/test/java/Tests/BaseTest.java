package Tests;

import Utils.User;
import Utils.UserFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by 1 on 07.05.2017.
 */
public class BaseTest {

    MyApplication app = new MyApplication();
    User validUser;

    @BeforeSuite
    public void setSuite() throws Exception {
        validUser = UserFactory.getValidUser();
        app.common.appStart();

    }

    @AfterSuite
    public void tearSuite() throws Exception {
        app.common.appStop();

    }


    /*WebDriver driver;
String BASE_URL = "https://mail.ru";
    @BeforeSuite
    public void setSuite() throws Exception {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\1\\IdeaProjects\\TestNG\\src\\driver\\geckodriver.exe" );
        driver = new FirefoxDriver();

    }

    @AfterSuite
    public void tearSuite() throws Exception {

driver.quit();
    }*/


}
