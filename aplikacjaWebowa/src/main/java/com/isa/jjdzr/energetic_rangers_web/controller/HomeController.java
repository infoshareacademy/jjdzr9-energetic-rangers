package com.isa.jjdzr.energetic_rangers_web.controller;

import model.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage () {
        return "pages/home-page";
    }
}
