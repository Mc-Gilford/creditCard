package com.example.bankaccount.controllers;

import com.example.bankaccount.entity.JsonGetter;
import com.example.bankaccount.entity.Services;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.NonNull;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
@Slf4j
@RestController
@RequestMapping(value = "json")

public class JsonController {
    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public String userInformation(@NonNull @RequestBody JsonGetter getterJson) throws IOException {
        //http://localhost:8080/user?id=1&age=22&salary=2&preferences=1,2
        JsonObject json = getterJson.getJson();
        log.info(getterJson.getUrl());
        return json.toString();
    }
    /* Esta implementacion se pensaba regresar un json como respuesta, pero dado al json que tenemos no es posible
    * mapearlo, aunque se creo lo mejor posible para que se entienda un poco la logica de este*/
   /* public Services userInformation(@NonNull @RequestBody JsonGetter getterJson) throws IOException {
        //http://localhost:8080/user?id=1&age=22&salary=2&preferences=1,2
        JsonObject json = getterJson.getJson();
        log.info(getterJson.getUrl());
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Services s = gson.fromJson(json,Services.class);
        return s;
    }*/
}
