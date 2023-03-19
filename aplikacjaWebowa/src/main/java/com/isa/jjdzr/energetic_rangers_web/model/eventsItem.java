package com.isa.jjdzr.energetic_rangers_web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class eventsItem {

    private String IDevents;
    private String nameOfEvent;
    private int numberOfTickets;
    private BigDecimal price;
    private String imgUrl;
    private String typeOfEvent;
    private String city;
    private String date;
    private String description;







}
