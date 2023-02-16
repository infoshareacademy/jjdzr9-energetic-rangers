package com.isa.jjdzr;
import java.util.ArrayList;
import java.util.List;

public class OptionService {


    public static List <Option> optionList = createOptionList();

    public static List <Option> filterList = createFilterList();

    public static List <Option> createOptionList() {

        List <Option> optionList = new ArrayList<Option>();

        Option optionLogin = new Option(1,"Utwórz użytkownika");
        optionList.add(optionLogin);

        Option optionLogOut = new Option(2,"Wyloguj");
        optionList.add(optionLogOut);

        Option optionFilter = new Option(3,"Filtruj");
        optionList.add(optionFilter);

        return optionList;

    }

    public static List <Option> createFilterList() {

        List <Option> filterList = new ArrayList<Option>();

        Option optionFilter1 = new Option(1,"Filter1");
        filterList.add(optionFilter1);

        Option optionFilter2 = new Option(2,"Filter2");
        filterList.add(optionFilter2);

        Option optionFilter3 = new Option(3,"Filter3");
        filterList.add(optionFilter3);

        return filterList;

    }

    public static List<Option> getOptionList() {
        return optionList;
    }
    public static List<Option> getFilterList() {
        return filterList;
    }
}

