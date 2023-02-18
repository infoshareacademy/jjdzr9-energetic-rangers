package com.isa.jjdzr;

import users.CreateUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {


    public static void menuInvoke() {
        Scanner scanner = new Scanner(System.in);
        List<Option> optionList = OptionService.getOptionList();


        System.out.println("**************************************************");
        System.out.println("       Wyszukiwarka wydarzeń kulturalnych         ");
        System.out.println("**************************************************");
        System.out.println("\n");

        for (Option x : optionList) {

            System.out.println(x.getIndex() + " " + x.getName());
        }
        System.out.println("\n");
        System.out.print("Wybierz opcję wprowadzając numer opcji i zatwierdź ją enterem: ");
        String option = scanner.nextLine();

        try {
            int value = Integer.parseInt(option);

            switch (value) {
                case 1:
                    ClearConsole.clearConsole();
                    System.out.println("Podaj imię użytkownika");
                    String name = scanner.next();
                    System.out.println("Podaj nazwisko użytkownika");
                    String surname = scanner.next();
                    System.out.println("Podaj adres e-mail użytkownika");
                    String email = scanner.next();
                    System.out.println("Podaj hasło użytkownika");
                    String password = scanner.next();
                    CreateUser.addNewUser(name, surname, email, password);
                    ClearConsole.clearConsole();
                    System.out.println("**************************************************");
                    System.out.println("        Użytkownik utworzony poprawnie!" + "\n            Witaj " + name + " " + surname + "\n        Powiedz co chcesz zrobić?  ");
                    System.out.println("**************************************************");
                    menuInvoke();
                    break;

                case 2:
                    ClearConsole.clearConsole();
                    EventsFilterMenu.filterMenuInvoke();
                    break;


                case 3:
                    ClearConsole.clearConsole();
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("**************************************************");
                    System.out.println("     Program został zakończony...Do widzenia!     ");
                    System.out.println("**************************************************");
                    System.out.println("\n");
                    System.out.println("\n");
                    break;
                default:
                    ClearConsole.clearConsole();
                    System.out.println("**************************************************");
                    System.out.println("Nieprawidłowy wybór opcji! Wybierz prawidłową opcję");
                    System.out.println("**************************************************");
                    menuInvoke();
                    break;
            }
        } catch (NumberFormatException e) {

            ClearConsole.clearConsole();
            System.out.println("**************************************************");
            System.out.println("Opcja nie może być literą! Wybierz opcję podając cyfrę");
            System.out.println("**************************************************");
            menuInvoke();

        }
    }


}






















