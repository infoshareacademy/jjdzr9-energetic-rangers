package users;

import model.User;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;


public class CreateUser {

    public static List<User> addNewUser(User user) {
        boolean emailAlreadyExist = false;
        List<User> userList = UserBase.getUsersBase();
        for (User currentUser : userList) {
            if (currentUser.getEmail().equalsIgnoreCase(user.getEmail())) {
                emailAlreadyExist = true;
            }
        }
        if (!emailAlreadyExist) {
            addRowToCSVFile(user.getId(), user.getName(), user.getSurname(), user.getEmail(), user.getPassword());
            UserBase.getUsersBase().add(user);
            System.out.println("User is added to UserBase");
        } else {
            System.out.println("Account with this email already exist, try another email");
        }

        return UserBase.getUsersBase();
    }

    private static void addRowToCSVFile(String... args) {
        File file;
        FileWriter fileWriter;

        try {
            //final String resource = UserBase.class.getClassLoader().getResource("usersBase.csv").getPath();
            //file = new File(resource);
            //file = Paths.get("/home/kasia/IdeaProjects/projekt_konsolowy/jjdzr9-energetic-rangers/energetic_rangers_console/usersBase.csv").toFile();
            file = Paths.get("/home/kasia/IdeaProjects/projekt_energetic_rangers/projekt_konsolowy/jjdzr9-energetic-rangers/aplikacjaWebowa/src/main/resources/usersBase.csv").toFile();
            //file = Paths.get("/home/kasia/IdeaProjects/projekt_konsolowy/jjdzr9-energetic-rangers/energetic_rangers_console/src/main/resources/usersBase.csv").toFile();
            //file = Paths.get(pathToUserBase).toFile();

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

        for (int i = 0; i < args.length; i++) {
            line.append(args[i]);
            if (i != args.length - 1) {
                line.append(',');
            }
        }

        try {
            fileWriter.write(line.toString());
            fileWriter.close();
        } catch (IOException exception) {
            System.out.println("Not access to file");
        }

    }

}
