package com.isa.jjdzr;
import java.util.*;

//kopia defensywna i wielowatkowsc i mozliwosc zmiany danych
// eventsBase.getEventBase().stream().filter(event -> event.getTypeOfEvent().equals("children")).collect(Collectors.toList());
//idevents	nameofevents	date	city	price	quantityoftickets	typeofevent
public class Filters {

    public List<Event> filterByChildren() {
        List<Event> eventsBase = EventsBase.getEventBase();
        List<Event> eventsForChildren = new ArrayList<>();
        for (Event currentEvent : eventsBase) {

            if (currentEvent.getTypeOfEvent().equals("children")) {
                eventsForChildren.add(currentEvent);
            }
        }
        for (Event eventsForChild : eventsForChildren) {
            System.out.println(eventsForChild.getNameOfEvent());

        }
            return eventsForChildren;

        }



    public List<Event> filterByAdults() {
        List<Event> eventsBase = EventsBase.getEventBase();
        List<Event> eventsForAdults = new ArrayList<>();
        for (Event currentEvent : eventsBase) {

            if (currentEvent.getTypeOfEvent().equals("adults")) {
                eventsForAdults.add(currentEvent);
            }
        }
        for (Event eventsForAdult : eventsForAdults) {
            System.out.println(eventsForAdult.getNameOfEvent());

        }
        return eventsForAdults;

    }

    public List<Event> filterByDisabled() {
        List<Event> eventsBase = EventsBase.getEventBase();
        List<Event> eventsForDisabled = new ArrayList<>();
        for (Event currentEvent : eventsBase) {

            if (currentEvent.getTypeOfEvent().equals("disabled")) {
                eventsForDisabled.add(currentEvent);
            }
        }
        for (Event event : eventsForDisabled) {
            System.out.println(event.getNameOfEvent());

        }
        return eventsForDisabled;

    }

    public List<Event> filterBySenior() {
        List<Event> eventsBase = EventsBase.getEventBase();
        List<Event> eventsForSenior = new ArrayList<>();
        for (Event currentEvent : eventsBase) {

            if (currentEvent.getTypeOfEvent().equals("senior")) {
                eventsForSenior.add(currentEvent);
            }
        }
        for (Event event : eventsForSenior) {
            System.out.println(event.getNameOfEvent());

        }
        return eventsForSenior;

    }
    public List<Event> filterByGdansk() {
        List<Event> eventsBase = EventsBase.getEventBase();
        List<Event> eventsForGdansk = new ArrayList<>();
        for (Event currentEvent : eventsBase) {

            if (currentEvent.getCity().equals("Gdansk")) {
                eventsForGdansk.add(currentEvent);
            }
        }
        for (Event event : eventsForGdansk) {
            System.out.println(event.getNameOfEvent());

        }
        return eventsForGdansk;

    }

    public List<Event> filterByGdynia() {
        List<Event> eventsBase = EventsBase.getEventBase();
        List<Event> eventsForGdynia = new ArrayList<>();
        for (Event currentEvent : eventsBase) {

            if (currentEvent.getCity().equals("Gdynia")) {
                eventsForGdynia.add(currentEvent);
            }
        }
        for (Event event : eventsForGdynia) {
            System.out.println(event.getNameOfEvent());

        }
        return eventsForGdynia;

    }

    public List<Event> filterBySopot() {
        List<Event> eventsBase = EventsBase.getEventBase();
        List<Event> eventsForSopot = new ArrayList<>();
        for (Event currentEvent : eventsBase) {

            if (currentEvent.getCity().equals("Sopot")) {
                eventsForSopot.add(currentEvent);
            }
        }
        for (Event event : eventsForSopot) {
            System.out.println(event.getNameOfEvent());

        }
        return eventsForSopot;

    }

    public List<Event> filterByDate() {
        List<Event> eventsBase = EventsBase.getEventBase();
        List<Event> eventsByDate = new ArrayList<>();

            Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj date ktora Cie interesuje w formacie DD.MM.RR: ");
        String userDate = scanner.nextLine();

        for (Event currentEvent : eventsBase) {
            if (currentEvent.getDate().equals(userDate)) {
                eventsByDate.add(currentEvent);
            }
        }
        for (Event event : eventsByDate) {
            System.out.println(event.getNameOfEvent());

        }
        return eventsByDate;
    }

}





