package com.isa.jjdzr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CreateUser {

    public static List<User> addNewUser (String name, String surname, String email, String password){
        boolean emailAlreadyExist = false;
        List<User> userList = UserBase.getUsersBase();
        for (User currentUser: userList) {
            if (currentUser.getEmail().equalsIgnoreCase(email)) {
                emailAlreadyExist = true;
            }
        }
        if (!emailAlreadyExist) {
                User user = new User(name, surname, email, password);
                addRowToCSVFile(user.getId(), user.getName(), user.getSurname(), user.getEmail(), user.getPassword());
                UserBase.getUsersBase().add(user);
                System.out.println("User is added to UserBase");
            } else {
                System.out.println("Account with this email already exist, try another email");
            }

        return UserBase.getUsersBase();
    }
    public static void addRowToCSVFile (String ...args) {
        File file;
        //CSVWriter writer;
        FileWriter fileWriter;

        try {
            final String resource = UserBase.class.getClassLoader().getResource("usersBase.csv").getPath();
            file = new File(resource);
        } catch (NullPointerException e) {
            System.err.println("Not found path to base of users");
            return;
        }
        try {
           //writer = new CSVWriter(new FileWriter(file, true));
            fileWriter = new FileWriter(file, true);
        } catch (IOException exception) {
            System.out.println("Not access to file");
            return;
        }
        StringBuilder line = new StringBuilder();
        line.append("\n");
        for (int i =0; i< args.length; i++) {
            line.append(args[i]);
            if (i != args.length-1) {
                line.append(',');
            }
        }
        line.append("\n");
        //writer.writeNext(args)

        try {
            //writer.close();
            fileWriter.write(line.toString());
            fileWriter.close();
        } catch (IOException exception) {
            System.out.println("Not access to file");
        }

    }
    public static void removeLastRow () {
    //metoda do testów - usunięcie dodanego użytkownika
    }


}
