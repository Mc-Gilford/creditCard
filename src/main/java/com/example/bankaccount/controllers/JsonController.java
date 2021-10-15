package com.example.bankaccount.controllers;

import com.example.bankaccount.entity.JsonGetter;
import com.google.gson.JsonObject;
import lombok.NonNull;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
@Slf4j
@RestController
@RequestMapping(value = "json")

public class JsonController {
    @GetMapping
    public JsonObject userInformation(@NonNull @RequestBody JsonGetter getterJson) throws IOException {
        //http://localhost:8080/user?id=1&age=22&salary=2&preferences=1,2
        JsonObject json = getterJson.getJson();
        log.info(getterJson.getUrl());
        return json;
    }
}
