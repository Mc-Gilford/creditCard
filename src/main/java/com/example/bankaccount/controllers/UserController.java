package com.example.bankaccount.controllers;

import com.example.bankaccount.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value = "user")

public class UserController {
    public User userInformation(@RequestParam(value="id") String name){
        return new User(UUID.randomUUID(), name);
    }
}
