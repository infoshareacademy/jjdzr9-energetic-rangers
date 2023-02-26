package com.isa.jjdzr.energetic_rangers_web;
import java.util.ArrayList;
import java.util.List;

public class OptionService {


    public static List <Option> optionList = createOptionList();

    public static List <Option> filterList = createFilterList();

    public static List <Option> createOptionList() {

        List <Option> optionList = new ArrayList<Option>();

        Option optionLogin = new Option(1,"Utwórz użytkownika");
        optionList.add(optionLogin);

        Option optionLogOut = new Option(2,"Pokaż wydarzenia kulturalne");
        optionList.add(optionLogOut);

        Option optionFilter = new Option(3,"Zakończ program");
        optionList.add(optionFilter);

        return optionList;

    }

    public static List <Option> createFilterList() {

        List <Option> filterList = new ArrayList<Option>();

        Option optionFilterAllEvents = new Option(1,"Pokaż wszystkie wydarzenia");
        filterList.add(optionFilterAllEvents);

        Option optionFilterChildren = new Option(2,"Pokaż tylko wydarzenia dla dzieci");
        filterList.add(optionFilterChildren);

        Option optionFilterAdults = new Option(3,"Pokaż wydarzenia tylko dla dorosłych");
        filterList.add(optionFilterAdults);

        Option optionFilterDisable = new Option(4,"Pokaż wydarzenia tylko dla niepełnosprawnych");
        filterList.add(optionFilterDisable);

        Option optionFilterSenior = new Option(5,"Pokaż wydarzenia dla seniorów");
        filterList.add(optionFilterSenior);

        Option optionFilterReturMenu = new Option(6,"Wróć do menu głównego");
        filterList.add(optionFilterReturMenu);



        return filterList;

    }

    public static List<Option> getOptionList() {
        return optionList;
    }
    public static List<Option> getFilterList() {
        return filterList;
    }
}

