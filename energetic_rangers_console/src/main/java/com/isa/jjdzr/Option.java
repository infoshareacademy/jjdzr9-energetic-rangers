package com.isa.jjdzr;

import java.util.ArrayList;
import java.util.List;

public class Option {

    private int index;
    private String name;



    public Option(int index, String name ) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }
}
