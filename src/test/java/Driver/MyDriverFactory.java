package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by 1 on 27.05.2017.
 */
public class MyDriverFactory {

    static public WebDriver driver = null;

   public static WebDriver getDriver() {


        final String driverName = System.getProperty("driver");
       if ("firefox".equals(driverName)) {
           System.setProperty("webdriver.gecko.driver", "C:\\Users\\1\\IdeaProjects\\TestNG\\src\\driver\\geckodriver.exe");
           driver = new FirefoxDriver();

       } else if ("chrome".equals(driverName)) {
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\IdeaProjects\\TestNG\\src\\driver\\chromedriver.exe");
           driver = new ChromeDriver();
       } else {
           System.setProperty("webdriver.gecko.driver", "C:\\Users\\1\\IdeaProjects\\TestNG\\src\\driver\\geckodriver.exe");
           driver = new FirefoxDriver();
       }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }


}
