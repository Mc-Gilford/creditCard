package com.example.bankaccount.dao;

import com.example.bankaccount.entity.creditcard.CreditCard;
import com.example.bankaccount.interfaces.CreditCardImpl;

import java.util.List;
import java.util.UUID;

public class DaoCreditCard implements CreditCardImpl {
    @Override
    public void createCreditCard(CreditCard creditCard) {

    }

    @Override
    public List<CreditCard> getCreditCards() {
        return null;
    }

    @Override
    public CreditCard getCreditCard(UUID id) {
        return null;
    }

    @Override
    public void updateCreditCard(CreditCard creditCard) {

    }

    @Override
    public void deleteCreditCard(UUID id) {

    }
}
