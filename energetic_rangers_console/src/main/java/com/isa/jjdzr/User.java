package com.isa.jjdzr;

import java.util.List;

public class User {
    private String id;
    private String name;
    private String surname;
    private String email;
    private String password;

    public User (String name, String surname, String email, String password) { //do createuser
        this.id = generateID();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }
    public User (String id, String name, String surname, String email, String password) { //potrzebne do testowania kodu w UserBase dla ułatwienia, do usunięcia
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    private static String generateID () {
        List<User> userList = UserBase.getUsersBase();
        String id = Integer.toString(userList.size()+1);
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
