package com.isa.jjdzr.energetic_rangers_web.controller;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import users.CreateUser;

@Controller
@RequestMapping("/signin")
public class SignInController {
    @GetMapping
    private String signInPage() {

        return "/components/signin-form";
    }
    @PostMapping
    private String addUser (User user) {
        CreateUser.addNewUser(user);
    return "User addres";
    }
}
