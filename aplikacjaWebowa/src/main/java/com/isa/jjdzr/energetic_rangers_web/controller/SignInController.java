package com.isa.jjdzr.energetic_rangers_web.controller;

import model.LoginForm;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import users.CreateUser;

@Controller
@RequestMapping("/signin")
public class SignInController {
    @GetMapping
    public String signInPage(Model model) {
        model.addAttribute("user", new User());
        return "/pages/signin-page";
    }
    @PostMapping
    public String addUser (@ModelAttribute("user") User user) {
        CreateUser.addNewUser(user);
        return "redirect:/signin";
    }
}
