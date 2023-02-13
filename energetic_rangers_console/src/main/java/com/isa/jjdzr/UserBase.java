package com.isa.jjdzr;

import com.opencsv.CSVReader;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class UserBase {
    private static List<User> usersBase = readUserBaseFromFile();

    private UserBase() {
    }

    public static List<User> getUsersBase() {
            return usersBase;
    }

    private static List<User> readUserBaseFromFile() {

        File file;

        try {
            //final String resource = UserBase.class.getClassLoader().getResource("usersBase.csv").getPath();
            //file = Paths.get("/home/kasia/IdeaProjects/projekt_konsolowy/jjdzr9-energetic-rangers/energetic_rangers_console/usersBase.csv").toFile();

            file = Path.of("src", "main", "resources", "usersBase.csv").toFile();
        //System.getProperty()???
            //file = new File(resource);
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
        for (int i = 1; i < records.size(); i++) { //pomijam pierwszy wiersz z nagłówkami
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
