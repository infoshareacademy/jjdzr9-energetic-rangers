package com.isa.jjdzr;
import users.CreateUser;
import users.User;
import users.UserBase;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //kod w ramach testu, można usunąć

       /* List<User> usersBase = UserBase.getUsersBase();
        for (User user : usersBase) {
            System.out.println(user.getId() + usersBase.size());
        }
        System.out.println("size: " + usersBase.size());

        CreateUser.addNewUser("Rafał", "Dziedzic", "rafal6@test.pl", "hasłorafała");
        usersBase = UserBase.getUsersBase();
        for (User user : usersBase) {
            System.out.println(user.getId());
        }
        System.out.println("size: " + usersBase.size());*/

        Menu menu =new Menu();
        menu.menuInvoke();

        OptionService optionService =new OptionService();
        optionService.createOptionList();

        System.out.println(optionService.getOptionList());
    }
}
