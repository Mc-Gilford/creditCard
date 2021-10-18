package com.example.bankaccount.entity.user;

import com.example.bankaccount.entity.creditcard.CreditCard;
import com.example.bankaccount.interfaces.UserImpl;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

@Getter @Setter @ToString @NoArgsConstructor @RequiredArgsConstructor
@Document(collection="users")
public class User {
    @Id
    @NonNull
    private String id;
    @NonNull
    private String name;
    private String lastname;
    @NonNull
    private Integer age;
    private List<CreditCard> creditCards;
    @NonNull
    private Double salary;
    @NonNull
    private List<String> preferences;
}
