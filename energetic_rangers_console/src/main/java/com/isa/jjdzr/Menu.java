package com.isa.jjdzr;
import users.CreateUser;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public void menuInvoke() {
        List<Option> optionList = OptionService.getOptionList();
        List<Option> filterList = OptionService.getFilterList();
        Scanner scanner = new Scanner(System.in);
        int option = 0;


        System.out.println("=== Wyszukiwarka wydarzeń kulturalnych ===");
        for (Option x : optionList) {

            System.out.println(x.getIndex() + " " + x.getName());
        }

        System.out.print("Wybierz opcję wprowadzając numer opcji i zatwierdź ją enterem: ");
        option = scanner.nextInt();



        switch (option) {
            case 1:
                clearConsole();
                System.out.println("Podaj imię użytkownika");
                String name = scanner.next();
                System.out.println("Podaj nazwisko użytkownika");
                String surname = scanner.next();
                System.out.println("Podaj adres e-mail użytkownika");
                String email = scanner.next();
                System.out.println("Podaj hasło użytkownika");
                String password = scanner.next();
                CreateUser.addNewUser (name, surname, email, password);
                System.out.println("**************************************************");
                System.out.println("        Użytkownik utworzony poprawnie!" + "\n            Witaj " + name + " " + surname + "\n        Powiedz co chcesz zrobić?  ");
                System.out.println("**************************************************");
                menuInvoke();
                break;
            case 2:
                System.out.println("Wybrałeś opcję " + option);
                break;
            case 3:
                for (Option x : filterList) {

                    System.out.println(x.getIndex() + " " + x.getName());
                }
                String filterchoice = scanner.next();
                break;
            case 4:
                System.out.println("Program został zakończony...Do widzenia!");
                break;
            case 5:

                menuInvoke();
                break;
            default:
                clearConsole();
                System.out.println("**************************************************");
                System.out.println("Nieprawidłowy wybór opcji! Wybierz prawidłową opcję");
                System.out.println("**************************************************");
                menuInvoke();
                break;
        } }

        public final static void clearConsole()
        {
            try
            {
                final String os = System.getProperty("os.name");

                if (os.contains("Windows"))
                {
                    Runtime.getRuntime().exec("cls");
                }
                else
                {
                    Runtime.getRuntime().exec("clear");
                }
            }
            catch (final Exception e)
            {
                //  Handle any exceptions.
            }
        }

//scanner.close();

}


















