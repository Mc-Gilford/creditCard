package com.example.bankaccount.interfaces;

import com.example.bankaccount.entity.creditcard.CreditCard;

import java.util.List;
import java.util.UUID;

public interface CreditCardImpl {
    public void createCreditCard(CreditCard creditCard);
    public List<CreditCard> getCreditCards();
    public CreditCard getCreditCard(UUID id);
    public void updateCreditCard(CreditCard creditCard);
    public void deleteCreditCard(UUID id);
}
