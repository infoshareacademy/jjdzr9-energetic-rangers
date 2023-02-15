package com.isa.jjdzr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public void menuInvoke() {
        List<Option> optionList = OptionService.getOptionList();
        Scanner scanner = new Scanner(System.in);
        int option = 0;


        System.out.println("=== Wyszukiwarka wydzarzeń kulturalnych ===");
        for (Option x : optionList) {

            System.out.println(x.getIndex() + " " + x.getName());
        }

        System.out.print("Wybierz opcję wprowadzając numer opcji i zatwierdź ją enterem: ");
        option = scanner.nextInt();

        switch (option) {
            case 1:
                clearConsole();
                System.out.println("Wybrałeś opcję " + option);
                break;
            case 2:
                System.out.println("Wybrałeś opcję " + option);
                break;
            case 3:
                System.out.println("Wybrałeś opcję " + option);
                break;
            case 4:
                System.out.println("Program został zakończony...Do widzenia!");
                break;
            case 5:
                menuInvoke();
                break;
            default:
                System.out.println("nieprawidłowy wybór opcji. Wybierz prawidłową opcję");
                scanner.close();
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



}


















