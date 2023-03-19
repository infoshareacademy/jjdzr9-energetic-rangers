package com.isa.jjdzr.energetic_rangers_web.controller;

import model.LoginForm;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String login (Model model) {
        model.addAttribute("homePage", new LoginForm());
        return "/home-page";
    }
}
