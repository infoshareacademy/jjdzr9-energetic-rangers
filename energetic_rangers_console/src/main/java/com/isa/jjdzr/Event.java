package com.isa.jjdzr;

public class Event {
    String IDevents;
    String nameOfEvent;
    int numberOfTickets;
    String typeOfEvent;
    String city;
    String date;

    public String getDate() {
        return date;
    }

    public String getCity() {
        return city;
    }

    public String getIDevents() {
        return IDevents;
    }

    public void setIDevents(String IDevents) {
        this.IDevents = IDevents;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public String getTypeOfEvent() {
        return typeOfEvent;
    }

    public void setTypeOfEvent(String typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }

    public Event(String IDevents, String nameOfEvent, int numberOfTickets, String typeOfEvent, String city, String date) {
        this.IDevents = IDevents;
        this.nameOfEvent = nameOfEvent;
        this.numberOfTickets = numberOfTickets;
        this.typeOfEvent = typeOfEvent;
        this.city = city;
        this.date = date;
    }



}
