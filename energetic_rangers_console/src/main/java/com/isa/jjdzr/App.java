package com.isa.jjdzr;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        //kod w ramach testu

        System.out.println( "Hello World!" );

        List<User> usersBase = UserBase.getUsersBase();
        for (User user:usersBase) {
            System.out.println(user.getId());
        }
        System.out.println("size: " + usersBase.size());

        CreateUser.addNewUser("Rafał", "Dziedzic", "dziedzic@test.pl", "hasłorafała");
        usersBase = UserBase.getUsersBase();
        for (User user:usersBase) {
            System.out.println(user.getId());
        }
        System.out.println("size: " + usersBase.size());
    }
}
