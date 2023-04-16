package com.isa.jjdzr.energetic_rangers_web.controller;

import model.LoginForm;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import users.CreateUser;
import users.LogINManagment;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/login")
    public String login (Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "pages/login-page";
    }
    @PostMapping
    public String logInUser (@ModelAttribute("loginForm") LoginForm loginForm) {
        boolean ifUserIsLogged = LogINManagment.logInUser(loginForm);

        if (ifUserIsLogged) {
            return "pages/home-page";
        } else {
            return "pages/login-page";
        }

    }
}

