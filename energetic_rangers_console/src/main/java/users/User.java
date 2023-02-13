package users;

import java.util.List;

public class User {
    private String id;
    private String name;
    private String surname;
    private String email;
    private String password;

     User(String name, String surname, String email, String password) {
        this.id = generateID();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }
    User(String id, String name, String surname, String email, String password) {//do tworzenia usera z na podstawie danych z bazy
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    private static String generateID() { //do tworzenia nowego usera
        List<User> userList = UserBase.getUsersBase();
        String id = Integer.toString(userList.size() + 1);
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }
}
