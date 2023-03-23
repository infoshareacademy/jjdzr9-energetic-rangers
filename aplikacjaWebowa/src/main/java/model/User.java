package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import users.UserBase;

import java.util.List;

@AllArgsConstructor //do tworzenia listy userów z bazy
@Getter
@Setter

public class User {
    private String id;
    private String name;
    private String surname;
    private String email;
    private String password;

    User (String name, String surname, String email, String password) {
        this.id = generateID();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }
    private static String generateID() { //do tworzenia nowego usera
        List<users.User> userList = UserBase.getUsersBase();
        String id = Integer.toString(userList.size() + 1);
        return id;
    }

}

