package com.example.bankaccount.account;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;
@Getter
@Setter
@ToString
public class Account {
    private UUID id;
    private String accountNumber;
    private String type;
    private Double amount;

}
