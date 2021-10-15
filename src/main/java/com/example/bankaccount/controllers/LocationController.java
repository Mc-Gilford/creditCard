package com.example.bankaccount.controllers;

import com.example.bankaccount.dao.DaoLocation;
import com.example.bankaccount.entity.JsonGetter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Slf4j
@RestController
@RequestMapping(value = "location")
public class LocationController {
    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public String getLocation(@RequestParam(value="state")  String state, @RequestParam(value = "cp") String cp,
                              @RequestParam(value = "gps") String gps, @RequestBody JsonGetter getterJson) throws IOException {
        return new DaoLocation().getLocation(state,cp,gps,getterJson);
    }
}
