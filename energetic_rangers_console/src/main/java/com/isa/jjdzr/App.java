package com.isa.jjdzr;

import users.CreateUser;
import users.User;
import users.UserBase;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //kod w ramach testu, można usunąć

        System.out.println("Hello World!");

        List<User> usersBase = UserBase.getUsersBase();
        for (User user : usersBase) {
            System.out.println(user.getId());
        }
        System.out.println("size: " + usersBase.size());

        CreateUser.addNewUser("Rafał", "Dziedzic", "rafal6@test.pl", "hasłorafała");
        usersBase = UserBase.getUsersBase();
        for (User user : usersBase) {
            System.out.println(user.getId());
        }
        System.out.println("size: " + usersBase.size());
    }
}
