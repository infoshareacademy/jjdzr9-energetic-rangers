package com.isa.jjdzr;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Menu menu =new Menu();
        menu.menuInvoke();

        OptionService optionService =new OptionService();
        optionService.createOptionList();

        System.out.println(optionService.getOptionList());


    }
}
