package com.isa.jjdzr;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateUser {

    public void addNewUser (String name, String surname, String email, String password){
        List<User> userList = UserBase.getUsersBase();
        for (User currentUser: userList) {
            if (!currentUser.getEmail().equalsIgnoreCase(email)){
                User user = new User(name, surname, email, password);
                //dodać do pliku csv
                CSVWriter writer = new CSVWriter(new FileWriter(usersBase.csv, true));
                UserBase.getUsersBase().add(user);
                //uwaga, na razie brak id!
            } else {
                System.out.println("Konto na taki e-mail zostało już utworzone!");
                //return null;
            }
        }

    }
    public String generateID () {
        List<User> userList = UserBase.getUsersBase();
        String id = userList.size().toString;
     return id;
    }

}
