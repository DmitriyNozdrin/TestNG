package Utils;

/**
 * Created by 1 on 20.05.2017.
 */
public class User {
    public String mail;
    public String password;
    public String name;

    @Override
    public String toString() {
        return "User{" +
                "mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public User(String mail, String password, String name) {
        this.mail = mail;
        this.password = password;
        this.name = name;
    }
}
