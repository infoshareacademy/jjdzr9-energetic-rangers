package com.isa.jjdzr;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public void menuInvoke()

    {
        List<Option> optionList = OptionService.getOptionList();

        for ( Option option:optionList) {

            System.out.println( option.getIndex() + " " + option.getName());

        }



    }




}
