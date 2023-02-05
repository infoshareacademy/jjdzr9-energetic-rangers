package com.isa.jjdzr;

public class User {
    private String id; //dopisać metodę na towrzenie się id
    private String name;
    private String surname;
    private String email;
    private String password;

    public User (String name, String surname, String email, String password) { //do createuser
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

    public String getEmail() {
        return email;
    }
}
