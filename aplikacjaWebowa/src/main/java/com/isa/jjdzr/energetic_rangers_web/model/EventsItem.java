package com.isa.jjdzr.energetic_rangers_web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class EventsItem {
    private String IDevents;
    private String nameOfEvent;
    private int numberOfTickets;
    private Double price;
    private String imgUrl;
    private String typeOfEvent;
    private String city;
    private String date;
    private String description;

    private String dayOfEvent;

    private String monthOfEvent;

    private String yearOfEvent;


}



