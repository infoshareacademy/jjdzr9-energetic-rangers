package users;

import model.LoginForm;
import model.User;

import java.util.List;


public final class LogINManagment {

    private LogINManagment() {
    }

    public static boolean logInUser (LoginForm loginForm) {
        List<User> userList = UserBase.getUsersBase();
        boolean userIsLogin = false;
        for (User user : userList) {
            if (user.getEmail().equals(loginForm.getEmail())) {
                if (user.getPassword().equals(loginForm.getPassword())) {
                    userIsLogin = true;
                }
            }
        }
        return userIsLogin;

    }
}
