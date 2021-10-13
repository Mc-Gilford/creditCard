package com.example.bankaccount.creditcard;

import com.example.bankaccount.account.Account;
import lombok.Data;

import java.util.UUID;
@Data
public class CreditCard {
    private UUID id;
    private Account account;
    private String type;
    private String institution;
}
