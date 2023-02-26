package com.isa.jjdzr.energetic_rangers_web;

import java.util.List;
import java.util.Scanner;

public class EventsFilterMenu {

    public static void filterMenuInvoke() {
        System.out.println("**************************************************");
        System.out.println("           Powiedz co chcesz zrobić?              ");
        System.out.println("**************************************************");
        System.out.println("\n");

        List<Option> filterList = OptionService.getFilterList();
        List<Event> events = EventsBase.getEventBase();

        for (Option x : filterList) {

            System.out.println(x.getIndex() + " " + x.getName());
        }
        System.out.print( "\n");
        System.out.print("Wybierz opcję wprowadzając numer opcji i zatwierdź ją enterem: ");

        Scanner scanner = new Scanner(System.in);
        String filterchoice = scanner.nextLine();



        try {
            int valueFilter = Integer.parseInt(filterchoice);

            switch (valueFilter) {

                case 1:

                    ClearConsole.clearConsole();
                    System.out.println("**************************************************");
                    System.out.println("     Oto Lista wszystkich wydarzeń kulturalnych   ");
                    System.out.println("**************************************************");
                    System.out.print( "\n");
                    System.out.print( " | " + "Liczba biletów" + " | " + "Tytuł wydarzenia");
                    System.out.print( "\n");
                    for (Event x : events) {


                        System.out.println(" |       " + x.numberOfTickets + "       | " + x.getNameOfEvent()  );
                    }

                    againSearch();

                    break;

                case 2:
                    ClearConsole.clearConsole();
                    System.out.println("**************************************************");
                    System.out.println("          Oto lista wydarzeń dla dzieci           ");
                    System.out.println("**************************************************");
                    System.out.print( "\n");
                    System.out.print( " | " + "Liczba biletów" + " | " + "Tytuł wydarzenia");
                    System.out.print( "\n");
                    for (Event x : events) {
                        if (x.getTypeOfEvent().equals("children")) {

                            System.out.println(" |       " + x.numberOfTickets + "       | " + x.getNameOfEvent()  );
                        }
                    }
                    againSearch();
                    break;


                case 3:

                    ClearConsole.clearConsole();
                    System.out.println("**************************************************");
                    System.out.println("          Oto lista wydarzeń dla dorosłych           ");
                    System.out.println("**************************************************");
                    System.out.print( "\n");
                    System.out.print( " | " + "Liczba biletów" + " | " + "Tytuł wydarzenia");
                    System.out.print( "\n");
                    for (Event x : events) {

                        if (x.getTypeOfEvent().equals("adults")) {

                            System.out.println(" |       " + x.numberOfTickets + "       | " + x.getNameOfEvent()  );
                        }
                    }
                    againSearch();
                    break;
                case 4:

                    ClearConsole.clearConsole();
                    System.out.println("**************************************************");
                    System.out.println("  Oto lista wydarzeń dla osób niepełnosprawnych   ");
                    System.out.println("**************************************************");
                    System.out.print( "\n");
                    System.out.print( " | " + "Liczba biletów" + " | " + "Tytuł wydarzenia");
                    System.out.print( "\n");
                    for (Event x : events) {
                        if (x.getTypeOfEvent().equals("disabled")) {
                         ;
                            System.out.println(" |       " + x.numberOfTickets + "       | " + x.getNameOfEvent()  );
                        }
                    }
                    againSearch();
                    break;

                case 5:
                    ClearConsole.clearConsole();
                    System.out.println("**************************************************");
                    System.out.println("        Oto lista wydarzeń dla osób seniorów      ");
                    System.out.println("**************************************************");
                    System.out.print( "\n");
                    System.out.print( " | " + "Liczba biletów" + " | " + "Tytuł wydarzenia");
                    System.out.print( "\n");
                    for (Event x : events) {
                        if (x.getTypeOfEvent().equals("senior")) {

                            System.out.println(" |       " + x.numberOfTickets + "       | " + x.getNameOfEvent()  );
                        }
                    }
                    againSearch();
                    break;

                case 6:
                    ClearConsole.clearConsole();
                    Menu.menuInvoke();
                    break;
            }


        } catch (NumberFormatException e) {
            ClearConsole.clearConsole();
            System.out.println("**************************************************");
            System.out.println("Opcja nie może być literą! Wybierz opcję podając cyfrę");
            System.out.println("**************************************************");
            filterMenuInvoke();
        }



    }

    public static void againSearch() {
        System.out.println("\n");
        System.out.println("**************************************************");
        System.out.println("            Czy chcesz ponownie wyszukać?         ");
        System.out.println("**************************************************");
        System.out.println("\n");
        System.out.println("1. Tak");
        System.out.println("2. Nie, powróć do głównego menu");
        System.out.println("\n");
        System.out.print("Wybierz opcję wprowadzając numer opcji i zatwierdź ją enterem: ");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();


        try {
            int choice = Integer.parseInt(value);

            switch (choice) {
                case 1:
                    ClearConsole.clearConsole();
                    filterMenuInvoke();

                case 2:
                    ClearConsole.clearConsole();
                    Menu.menuInvoke();
            }
        } catch (NumberFormatException e) {

            ClearConsole.clearConsole();
            System.out.println("**************************************************");
            System.out.println("Opcja nie może być literą! Wybierz opcję podając cyfrę");
            System.out.println("**************************************************");
            filterMenuInvoke();


        }
    }

}
