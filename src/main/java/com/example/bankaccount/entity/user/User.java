package com.example.bankaccount.entity.user;

import com.example.bankaccount.entity.creditcard.CreditCard;
import com.example.bankaccount.interfaces.UserImpl;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Getter @Setter @ToString @NoArgsConstructor @RequiredArgsConstructor @Entity @Table(name = "users")

public class User implements UserImpl {
    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String name;
    private String lastname;
    @NonNull
    private Integer age;
    @OneToMany(mappedBy = "user")
    private List<CreditCard> creditCards;
    @NonNull
    private Double salary;
    @NonNull
    @ElementCollection(targetClass=String.class)
    private List<String> preferences;

    @Override
    public void insertUser() {

    }

    @Override
    public User getUser(UUID id) {
        return null;
    }

    @Override
    public void updateUser(User u, UUID id) {

    }

    @Override
    public void deleteUser(UUID id) {

    }
}
