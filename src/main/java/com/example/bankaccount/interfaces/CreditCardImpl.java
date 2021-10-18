package com.example.bankaccount.interfaces;

import com.example.bankaccount.entity.JsonGetter;
import com.example.bankaccount.entity.creditcard.CreditCard;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public interface CreditCardImpl {
    public CreditCard createCreditCard(CreditCard creditCard);
    public List<CreditCard> getCreditCards(JsonGetter getterJson) throws IOException;
    public CreditCard getCreditCard(Integer id, JsonGetter getteJson) throws IOException;
    public CreditCard updateCreditCard(CreditCard creditCard);
    public void deleteCreditCard(UUID id);
}
