package com.example.bankaccount.entity.account;

import com.example.bankaccount.interfaces.AccountImpl;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
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
