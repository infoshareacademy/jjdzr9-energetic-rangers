package com.isa.jjdzr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class UserBase {
    private List<User> UsersBase; //ta metoda readUserBaseFromFile będzie wrzucać userów do listy

    public List<User> getUsersBase() {
        return UsersBase;
    }

    public static void readUserBaseFromFile () {
        File file = new File("jjdzr9-energetic-rangers/usersBase.csv");
        try {
            Scanner sc = new Scanner(file);
            sc.useDelimiter(",");
            while (sc.hasNext()) {
                String id = sc.next();
                String name = sc.next();
                String surname = sc.next();
                String email = sc.next();
                String password = sc.next();
                System.out.println(id + name +surname +email + password);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Base of users isn't avaiable. Try later");
        }
    }
}
