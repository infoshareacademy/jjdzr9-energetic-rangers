package com.isa.jjdzr;

import java.util.ArrayList;
import java.util.List;

public class EventsBase {

   public static List<Event> eventBase = new ArrayList<>();

    private static  List<Event>  createEvents(){
        Event event1 = new Event("1","Jaś i małgosia",10, "children", "Gdansk", "12.01.23");
        Event event2 = new Event("2","Duma i uprzedzenie",12, "adults", "Sopot", "12.02.23");
        Event event3 = new Event("3","Dom pod gruszą",12, "senior", "Gdynia", "12.01.23");
        Event event4 = new Event("4","Wilk i zając",12, "children", "Gdansk", "12.01.23");
        Event event5 = new Event("5","Kolacja w ciemności",12, "disabled", "Gdynia", "23.01.23");
        Event event6 = new Event("6","Upiór w operze",12, "adults", "Sopot", "11.01.23");
        eventBase.add(event1);
        eventBase.add(event2);
        eventBase.add(event3);
        eventBase.add(event4);
        eventBase.add(event5);
        eventBase.add(event6);

        return eventBase;
    }

    public  static List<Event> getEventBase() {
        if (eventBase.isEmpty()){
            eventBase=createEvents();
            return eventBase;
        } else
        return List.copyOf(eventBase);
    }
}

