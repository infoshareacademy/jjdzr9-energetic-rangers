package com.isa.jjdzr.energetic_rangers_web.controller;

import model.LoginForm;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import users.CreateUser;
import users.LogINManagment;

@Controller
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
            return "redirect:/";
        } else {
            return "redirect:/signin";
        }
    }
}

