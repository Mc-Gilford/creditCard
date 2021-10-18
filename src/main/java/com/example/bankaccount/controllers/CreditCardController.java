package com.example.bankaccount.controllers;

import com.example.bankaccount.dao.DaoCreditCard;
import com.example.bankaccount.dao.userService;
import com.example.bankaccount.entity.JsonGetter;
import com.example.bankaccount.entity.creditcard.CreditCard;
import com.example.bankaccount.entity.user.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "creditCard")
public class CreditCardController {
    @GetMapping
    public List<CreditCard> creditCards() throws IOException {
        JsonGetter getterJson = new JsonGetter();
        getterJson.setUrl("https://raw.githubusercontent.com/McGilfordJose/creditCard/main/creditCard.json");
        return new DaoCreditCard().getCreditCards(getterJson);
    }
    @GetMapping(value = "{id}")
    public CreditCard getCreditCard(@PathVariable(value = "id") Integer id) throws IOException {
        JsonGetter getterJson = new JsonGetter();
        getterJson.setUrl("https://raw.githubusercontent.com/McGilfordJose/creditCard/main/creditCard.json");
        return new DaoCreditCard().getCreditCard(id,getterJson);
    }
    @PostMapping
    public CreditCard createCreditCard(@RequestBody CreditCard creditCard)
    {
        return new DaoCreditCard().createCreditCard(creditCard);
    }
    @PutMapping
    public CreditCard updateCreditCard(@RequestBody CreditCard creditCard)
    {
        return new DaoCreditCard().createCreditCard(creditCard);
    }
}
