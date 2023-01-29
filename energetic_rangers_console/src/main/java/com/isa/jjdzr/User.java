package com.isa.jjdzr;

public class User {
    private String id;
    private String name;
    private String surname;
    private String email;
    private String password;

    public User (String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

}
