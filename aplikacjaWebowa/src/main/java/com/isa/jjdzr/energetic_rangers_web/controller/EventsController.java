package com.isa.jjdzr.energetic_rangers_web.controller;

import com.isa.jjdzr.energetic_rangers_web.EventsBase;
import com.isa.jjdzr.energetic_rangers_web.Filters;
import com.isa.jjdzr.energetic_rangers_web.model.EventsItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EventsController {

    private List<EventsItem> eventItemsList = EventsBase.getEventBase2();
    private List<EventsItem> eventsForChildren = Filters.filterByChildren2();

    @GetMapping("/wydarzenia/wszystkie")
   public String home(Model model){
        model.addAttribute("eventsItem",eventItemsList);

    return "pages/loginPage";

    }

    @GetMapping("/wydarzenia/dladzieci")
    public String forChildren(Model model){
        model.addAttribute("eventsItem",eventsForChildren);

        return "pages/listingPage";

    }




}
