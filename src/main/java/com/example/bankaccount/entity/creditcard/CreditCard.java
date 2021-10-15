package com.example.bankaccount.entity.creditcard;

import com.example.bankaccount.entity.account.Account;
import com.example.bankaccount.interfaces.CreditCardImpl;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.util.List;
import java.util.UUID;
@Data
public class CreditCard {
    @Id
    private Integer id;
    private Account account;
    private String type;
    private String institution;

}
