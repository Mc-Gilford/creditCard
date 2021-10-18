package com.example.bankaccount.dao;

import com.example.bankaccount.entity.JsonGetter;
import com.example.bankaccount.entity.creditcard.CreditCard;
import com.example.bankaccount.interfaces.CreditCardImpl;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.UUID;
@Slf4j

public class DaoCreditCard implements CreditCardImpl {
    @Override
    public CreditCard createCreditCard(CreditCard creditCard) {
        String encodedAccounNumber = Base64.getUrlEncoder().
                encodeToString(creditCard.getAccount().
                        getAccountNumber().getBytes());
        creditCard.getAccount().setAccountNumber(encodedAccounNumber);
        //mongo.insert()
        return creditCard;
    }

    @Override
    public List<CreditCard> getCreditCards(JsonGetter getterJson) throws IOException {
        JsonArray json = getterJson.getJsonArray();
        List<CreditCard> creditCards = new ArrayList<CreditCard>();
        for (Object myObject : json) {
            Gson gson = new Gson();
            CreditCard creditCard= gson.fromJson((JsonElement) myObject,CreditCard.class);
            creditCards.add(creditCard);
            log.info("Credit Card info "+creditCard.toString());
        }
        return creditCards;
    }

    @Override
    public CreditCard getCreditCard(Integer id,JsonGetter getterJson) throws IOException {
        JsonArray json = getterJson.getJsonArray();
        CreditCard creditCard = new CreditCard();
        for (Object myObject : json) {
            Gson gson = new Gson();
            creditCard= gson.fromJson((JsonElement) myObject,CreditCard.class);
            log.warn("Id "+id+ " creditId" + creditCard.getId());
            if(id==creditCard.getId()){
            log.info("Credit Card info By Id"+creditCard.toString());
            return creditCard;
            }
        }
        return creditCard;
    }

    @Override
    public CreditCard updateCreditCard(CreditCard creditCard) {
        String encodedAccounNumber = Base64.getUrlEncoder().
                encodeToString(creditCard.getAccount().
                        getAccountNumber().getBytes());
        creditCard.getAccount().setAccountNumber(encodedAccounNumber);
        //mongo.update()
        return creditCard;
    }

    @Override
    public void deleteCreditCard(UUID id) {

    }
}
