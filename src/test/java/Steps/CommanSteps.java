package Steps;

import Pages.BasePage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

/**
 * Created by 1 on 20.05.2017.
 */
public class CommanSteps extends BasePage {
    public void appStart() {
        driver.get(BASE_URL);

    }

    public void appStop() {
        driver.quit();
    }

}
