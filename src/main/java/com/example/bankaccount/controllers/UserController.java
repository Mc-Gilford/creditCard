package com.example.bankaccount.controllers;

import com.example.bankaccount.entity.user.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "user")

public class UserController {

    @GetMapping
    public User userInformation(@RequestParam(value="id") String name, @RequestParam(value="age") Integer age,
                                @RequestParam(value="salary") Double salary,
                                @RequestParam(value="preferences")List<String> preferences){
        //http://localhost:8080/user?id=1&age=22&salary=2&preferences=1,2
        return new User(UUID.randomUUID().toString(), name, age,salary,preferences);
    }

    @RequestMapping(value = "/testUser", method = RequestMethod.POST)
    public String testUser(@RequestBody User user){
        System.out.print(user.getAge());
        return "success";
    }
}
