package Utils;


import java.util.ResourceBundle;

/**
 * Created by 1 on 20.05.2017.
 */
public class UserFactory {

    public static User getValidUser() {

        ResourceBundle user = ResourceBundle.getBundle("User");
        return new User(user.getString("mail"), user.getString("password"), user.getString("name"));
    }

 /*   public static User getInvalidUser() {
        return new User("multik813@bk.ru", "J3qq4H7h2v", "test");

    }*/
}