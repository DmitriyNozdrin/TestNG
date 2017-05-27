package Steps;

import Pages.LoginPage;
import Utils.UserFactory;

/**
 * Created by 1 on 20.05.2017.
 */
public class LoginSteps extends LoginPage {
    public void loginValidUser() throws InterruptedException {
        login(UserFactory.getValidUser());
    }

  /*  public void loginInvalidUser() throws InterruptedException {
        login(UserFactory.getInvalidUser());
    }*/
}
