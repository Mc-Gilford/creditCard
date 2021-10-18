package com.example.bankaccount.dao;

import com.example.bankaccount.entity.JsonGetter;
import com.example.bankaccount.entity.creditcard.CreditCard;
import com.example.bankaccount.entity.location.Location;
import com.example.bankaccount.entity.user.User;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import springfox.documentation.spring.web.json.Json;

import java.io.IOException;
import java.util.List;

@Slf4j
@Service
public class userService {
    private String url;
    public  User getUser(@NonNull  String id,
                          @NonNull JsonGetter getterJson) throws IOException {
        JsonArray json = getterJson.getJsonArray();
        for (Object myObject : json) {
            Gson gson = new Gson();
            User user= gson.fromJson((JsonElement) myObject,User.class);
            if(user.getId().compareTo(id)==0 ){
                log.info("User to string "+user.toString());
                return user;
            }
        }
        return null;
    }

    public String getCardsByUser(@NonNull Integer age,
                                           @NonNull Double salary,
                                           @NonNull List<String> preferences,
                                           @NonNull JsonGetter getterJson) throws IOException {
        JsonArray json = getterJson.getJsonArray();
        JsonArray jsonFinalLocation = new JsonArray();
        for (Object myObject : json) {
            Gson gson = new Gson();
            CreditCard creditCard= gson.fromJson((JsonElement) myObject,CreditCard.class);
            if((creditCard.getAccount().getAmount()*.10)<=salary || creditCard.getAccount().getType().
                    contains(preferences.toString())){
                jsonFinalLocation.add((JsonElement) myObject);
                log.info("Contains preference "+creditCard.getAccount().getType());
            }
        }
        return jsonFinalLocation.toString();
    }
}
