package com.isa.jjdzr.energetic_rangers_web.controller;

import com.isa.jjdzr.energetic_rangers_web.model.eventsItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class HomeController {

    private List<eventsItem> eventItemsList = List.of(
            new eventsItem("1232", "Kopciuszek", 122, new BigDecimal(155), "https://fwcdn.pl/fph/96/66/589666/537692_1.1.jpg", "Dla dzieci", "Gdańsk", "22-05-2023r", "Przepiękna historia o ubogiej dziewczynce której macocha nienawidziła"),
            new eventsItem("1232", "Śpiąca Królewna", 122, new BigDecimal(155), "https://cdn1.naekranie.pl/media/cache/article-cover/2016/03/%C5%9Bpi%C4%85ca-kr%C3%B3lewna.jpg", "Dla dzieci", "Gdańsk", "22-05-2023r", "Przepiękna historia o ubogiej dziewczynce której macocha nienawidziła"),
            new eventsItem("1232", "Zła macocha", 122, new BigDecimal(155), "https://static.prsa.pl/images/37897055-3107-4c3b-bb60-eb3a1ef30df3.file?format=700", "Dla dzieci", "Gdańsk", "22-05-2023r", "Przepiękna historia o ubogiej dziewczynce której macocha nienawidziła"),
            new eventsItem("1232", "Kopciuszek", 122, new BigDecimal(155), "https://fwcdn.pl/fph/96/66/589666/537692_1.1.jpg", "Dla dzieci", "Gdańsk", "22-05-2023r", "Przepiękna historia o ubogiej dziewczynce której macocha nienawidziła"),
            new eventsItem("1232", "Śpiąca Królewna", 122, new BigDecimal(155), "https://cdn1.naekranie.pl/media/cache/article-cover/2016/03/%C5%9Bpi%C4%85ca-kr%C3%B3lewna.jpg", "Dla dzieci", "Gdańsk", "22-05-2023r", "Przepiękna historia o ubogiej dziewczynce której macocha nienawidziła"),
            new eventsItem("1232", "Zła macocha", 122, new BigDecimal(155), "https://static.prsa.pl/images/37897055-3107-4c3b-bb60-eb3a1ef30df3.file?format=700", "Dla dzieci", "Gdańsk", "22-05-2023r", "Przepiękna historia o ubogiej dziewczynce której macocha nienawidziła")



            );
    @GetMapping("/")
   public String home(Model model){
        model.addAttribute("eventsItem",eventItemsList);

    return "pages/homePage";

    }




}
