package com.isa.jjdzr;

import users.CreateUser;
import users.User;
import users.UserBase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class AppEvents {
    public static void main(String[] args) {
        EventBase eventsBase = new EventBase();
        eventsBase.showEvents();
    }
}
