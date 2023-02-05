package com.isa.jjdzr;

import com.opencsv.CSVReader;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserBase {
    private static List<User> UsersBase = readUserBaseFromFile();

    public static List<User> getUsersBase() {
        return UsersBase;
    }

    public static List<User> readUserBaseFromFile() {

        File file;

        try {
            final String resource = UserBase.class.getClassLoader().getResource("usersBase.csv").getPath();
            file = new File(resource);
        } catch (NullPointerException e) {
            System.err.println("Not found path to base of users");
            return null;
        }
        List<User> UserBase = new ArrayList<User>();
        List<List<String>> records = new ArrayList<List<String>>();
        try {
            CSVReader csvReader = new CSVReader(new FileReader(file));
            String[] values = null;
            try {
                while ((values = csvReader.readNext()) != null) {
                    records.add(Arrays.asList(values));
                }
            } catch (IOException exception) {
                System.out.println("Base of users isn't ready to read.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Base of users isn't available. Try later");
        }
        for (int i = 0; i < records.size(); i++) {
            for (int j = 0; j < records.get(i).size(); j += 5) {
                String currentId = records.get(i).get(j);
                String currentName = records.get(i).get(j + 1);
                String currentSurname = records.get(i).get(j + 2);
                String currentEmail = records.get(i).get(j + 3);
                String currentPassword = records.get(i).get(j + 4);
                User currentUser = new User(currentId, currentName, currentSurname,
                        currentEmail, currentPassword);
                UserBase.add(currentUser);

            }
        }
        return UserBase;
    }

}
