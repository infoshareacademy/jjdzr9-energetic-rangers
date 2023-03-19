package com.isa.jjdzr.energetic_rangers_web.controller;

import model.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login (Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "components/login-form";
    }
}

