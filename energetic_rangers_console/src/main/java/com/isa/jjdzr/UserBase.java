package com.isa.jjdzr;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class UserBase {
    private List<User> UsersBase; //ta metoda readUserBaseFromFile będzie wrzucać userów do listy

    public List<User> getUsersBase() {
        return UsersBase;
    }

    public static void readUserBaseFromFile () {
        Path path = Paths.get("usersBase.csv");
        File file = new File(path.toString());
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
