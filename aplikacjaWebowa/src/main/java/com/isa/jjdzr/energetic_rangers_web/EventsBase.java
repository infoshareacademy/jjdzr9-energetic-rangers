package com.isa.jjdzr.energetic_rangers_web;

import com.isa.jjdzr.energetic_rangers_web.model.EventsItem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EventsBase {

   public static List<EventsItem> eventBase = new ArrayList<>();
    public static List<Event> eventBase2 = new ArrayList<>();

   //uploadEvents - metoda do zwracania eventów
    private static  List<Event>  createEvents2(){
        Event event1 = new Event("1","Jaś i małgosia",10, "children", "Gdansk", "12.01.23");
        Event event2 = new Event("2","Duma i uprzedzenie",12, "adults", "Sopot", "12.02.23");
        Event event3 = new Event("3","Dom pod gruszą",12, "senior", "Gdynia", "12.01.23");
        Event event4 = new Event("4","Wilk i zając",12, "children", "Gdansk", "12.01.23");
        Event event5 = new Event("5","Kolacja w ciemności",12, "disabled", "Gdynia", "23.01.23");
        Event event6 = new Event("6","Upiór w operze",12, "adults", "Sopot", "11.01.23");
        eventBase2.add(event1);
        eventBase2.add(event2);
        eventBase2.add(event3);
        eventBase2.add(event4);
        eventBase2.add(event5);
        eventBase2.add(event6);

        return eventBase2;
    }
    private static List<EventsItem> createEvents () {
        EventsItem event1 = new EventsItem("1232", "Kopciuszek", 122, new BigDecimal(155), "https://fwcdn.pl/fph/96/66/589666/537692_1.1.jpg", "Dla dzieci", "Gdańsk", "22-05-2023r", "Przepiękna historia o ubogiej dziewczynce której macocha nienawidziła");
        EventsItem event2 = new EventsItem("1232", "Śpiąca Królewna", 122, new BigDecimal(155), "https://cdn1.naekranie.pl/media/cache/article-cover/2016/03/%C5%9Bpi%C4%85ca-kr%C3%B3lewna.jpg", "Dla dzieci", "Gdańsk", "22-05-2023r", "Przepiękna historia o ubogiej dziewczynce której macocha nienawidziła");
        EventsItem event3 = new EventsItem("1232", "Zła macocha", 122, new BigDecimal(155), "https://static.prsa.pl/images/37897055-3107-4c3b-bb60-eb3a1ef30df3.file?format=700", "Dla dzieci", "Gdańsk", "22-05-2023r", "Przepiękna historia o ubogiej dziewczynce której macocha nienawidziła");
        EventsItem event4 = new EventsItem("1232", "Kopciuszek", 122, new BigDecimal(155), "https://fwcdn.pl/fph/96/66/589666/537692_1.1.jpg", "Dla dzieci", "Gdańsk", "22-05-2023r", "Przepiękna historia o ubogiej dziewczynce której macocha nienawidziła");
        EventsItem event5 = new EventsItem("1232", "Śpiąca Królewna", 122, new BigDecimal(155), "https://cdn1.naekranie.pl/media/cache/article-cover/2016/03/%C5%9Bpi%C4%85ca-kr%C3%B3lewna.jpg", "Dla dzieci", "Gdańsk", "22-05-2023r", "Przepiękna historia o ubogiej dziewczynce której macocha nienawidziła");
        EventsItem event6 = new EventsItem("1232", "Zła macocha", 122, new BigDecimal(155), "https://static.prsa.pl/images/37897055-3107-4c3b-bb60-eb3a1ef30df3.file?format=700", "Dla dzieci", "Gdańsk", "22-05-2023r", "Przepiękna historia o ubogiej dziewczynce której macocha nienawidziła");

        eventBase.add(event1);
        eventBase.add(event2);
        eventBase.add(event3);
        eventBase.add(event4);
        eventBase.add(event5);
        eventBase.add(event6);

        return eventBase;


    }


    public  static List<Event> getEventBase() {
        if (eventBase2.isEmpty()){
            eventBase2 = createEvents2();
            return eventBase2;
        } else
        return List.copyOf(eventBase2);
    }

    public  static List<EventsItem> getEventBase2() {
        if (eventBase.isEmpty()){
            eventBase = createEvents();
            return eventBase;
        } else
            return List.copyOf(eventBase);
    }
}

