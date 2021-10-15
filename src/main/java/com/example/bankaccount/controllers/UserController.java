package com.example.bankaccount.controllers;

import com.example.bankaccount.dao.DaoUser;
import com.example.bankaccount.entity.user.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@Slf4j
@RestController
@RequestMapping(value = "user")

public class UserController {

    @Autowired
    private DaoUser repository;
    @GetMapping
    public User userInformation(@RequestParam(value="id") String name, @RequestParam(value="age") Integer age,
                                @RequestParam(value="salary") Double salary,

                                @RequestParam(value="preferences")List<String> preferences){
        //http://localhost:8080/user?id=1&age=22&salary=2&preferences=1,2
        return new User(UUID.randomUUID().toString(), name, age,salary,preferences);
    }

    @PostMapping
    public User userCreate(@Validated @RequestBody User user){
        log.info(user.toString());
        return repository.insert(user);
    }

    @GetMapping
    @RequestMapping(value = "/users")
    public List<User> getAllUser(){
        log.info("Getting users");
        return repository.findAll();
    }

    @RequestMapping(value = "/testUser", method = RequestMethod.POST)
    public String testUser(@RequestBody User user){
        System.out.print(user.getAge());
        return "success";
    }
}
