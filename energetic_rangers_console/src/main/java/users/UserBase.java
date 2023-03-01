package users;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import users.User;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class UserBase {
    private static List<User> usersBase = readUserBaseFromFile();
    static final String pathToUserBase = System.getenv("PATH_TO_USER_BASE");

    private UserBase() {
    }

    public static List<User> getUsersBase() {
        return usersBase;
    } //do usunięcia public, zostawiam, zeby mozna było testować w mainie na razie

    private static List<User> readUserBaseFromFile() {

        File file;

        try {
            // pierwotne rozwiązanie tylko  do odczytywania: final String resource = UserBase.class.getClassLoader().getResource("usersBase.csv").getPath();
            //najlepsze rozwiązanie: file = Path.of(pathToUserBase).toFile();
            //file = Paths.get("/home/kasia/IdeaProjects/projekt_konsolowy/jjdzr9-energetic-rangers/energetic_rangers_console/src/main/resources/usersBase.csv").toFile();
            //file = Paths.get(pathToUserBase).toFile();
            //file = Paths.get("/home/kasia/IdeaProjects/projekt_konsolowy/jjdzr9-energetic-rangers/energetic_rangers_console/src/main/resources/usersBase.csv").toFile();
            //jeśli Ci nie działa to wyrażenie poniżej
            // file = Path.of("src", "main", "resources", "usersBase.csv").toFile();
            // , to spróbuj zrobić tak:
            //file = Paths.get("/home/kasia/IdeaProjects/projekt_konsolowy/jjdzr9-energetic-rangers/energetic_rangers_console/src/main/resources/usersBase.csv").toFile();
            //tylko wklej swoją ścieżkę absolutną
            //TAK SAMO MUSI BYĆ W KLASIE CreateUser!
            file = Paths.get("/Users/java/pracaDomowaGit/jjdzr9-energetic-rangers/energetic_rangers_console/src/main/resources/usersBase.csv").toFile();

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
            } catch (CsvValidationException e) {
                throw new RuntimeException(e);
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
