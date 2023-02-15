package com.isa.jjdzr;
import java.util.ArrayList;
import java.util.List;

public class OptionService {


    public static List <Option> optionList = createOptionList();

    public static List <Option> createOptionList() {

        List <Option> optionList = new ArrayList<Option>();

        Option optionLogin = new Option(1,"Zaloguj");
        optionList.add(optionLogin);

        Option optionLogOut = new Option(2,"Wyloguj");
        optionList.add(optionLogOut);

        Option optionFilter = new Option(3,"Filtruj");
        optionList.add(optionFilter);



        return optionList;

    }

    public static List<Option> getOptionList() {
        return optionList;
    }
}

