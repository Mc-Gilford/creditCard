package com.example.bankaccount.user;

import com.example.bankaccount.account.Account;
import com.example.bankaccount.creditcard.CreditCard;
import lombok.*;

import java.util.List;
import java.util.UUID;
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @NonNull
    private UUID id;
    @NonNull
    private String name;
    private String lastname;
    private Integer age;
    private List<CreditCard> creditCards;
}
