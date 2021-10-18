package com.example.bankaccount.controllers;

import com.example.bankaccount.dao.DaoUser;
import com.example.bankaccount.dao.userService;
import com.example.bankaccount.entity.JsonGetter;
import com.example.bankaccount.entity.creditcard.CreditCard;
import com.example.bankaccount.entity.user.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
@Slf4j
@RestController
@RequestMapping(value = "user")

public class UserController {
    //@Autowired Field repository in com.example.bankaccount.controllers.UserController required a bean of type 'com.example.bankaccount.dao.DaoUser' that could not be found.
    //
    //The injection point has the following annotations:
    //	- @org.springframework.beans.factory.annotation.Autowired(required=true)
    private DaoUser repository;
    @GetMapping
    public User userInformation(@RequestParam(value="id") String ID) throws IOException {
        JsonGetter getterJson = new JsonGetter();
        getterJson.setUrl("https://raw.githubusercontent.com/McGilfordJose/creditCard/main/users.json");
        return new userService().getUser(ID,getterJson);
    }

    @GetMapping(value = "creditCard", produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public String userAssignCreditCard(@RequestParam(value="age") Integer age,
                                                 @RequestParam(value="salary") Double salary,
                                                 @RequestParam(value="preferences")List<String> preferences) throws IOException {
        JsonGetter getterJson = new JsonGetter();
        getterJson.setUrl("https://raw.githubusercontent.com/McGilfordJose/creditCard/main/creditCard.json");
        return new userService().getCardsByUser(age,salary,preferences,getterJson);
    }

    @PostMapping
    public User userCreate(@Validated @RequestBody User user){
        log.info(user.toString());
        user.setId(UUID.randomUUID().toString());
        return user;
        //return Mongo repository.insert(user) hacia el insert;
    }

    @PutMapping
    public User userUpdate(@Validated @RequestBody User user){
        log.info(user.toString());
        return repository.save(user);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> userDelete(@PathVariable String id){
        repository.deleteById(id);
        return null; //new ResponseEntity<>(
                //"Elemento eliminado :"+id ,
                //HttpStatus.OK);
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
