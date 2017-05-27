package Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by 1 on 07.05.2017.
 */
public class MyTest1 extends BaseTest {
    @DataProvider(name = "My")
    public static Object[][] MyDataProvider() {
      return  new Object [][]{{2,2,4},{3,3,6},{6,6,12}};

    }

    @Test (dataProvider = "My")
    public void testA(int x, int y, int z) throws Exception {
        Assert.assertEquals(x+y,z,"z");
    }
@Parameters ("myParametr")
    @Test //(dependsOnMethods = {"testC", "testD"}, alwaysRun = true)
    public void testB(String value) throws Exception {
        System.out.println(value);
    }

    @Test (invocationCount = 1000, threadPoolSize = 2, timeOut = 10000)
    public void testC() throws Exception {
        System.out.println("Test C");
    }

    @Test (priority = 1)
    public void testD() throws Exception {
        System.out.println("Test D");
      //  Assert.assertTrue(false);

    }
    @Test (priority = 3)
    public void testE() throws Exception {
        System.out.println("Test E");
    }
}
