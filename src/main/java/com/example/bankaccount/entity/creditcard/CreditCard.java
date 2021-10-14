package com.example.bankaccount.entity.creditcard;

import com.example.bankaccount.entity.account.Account;
import com.example.bankaccount.entity.user.User;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.UUID;
@Data
@Entity
@Table (name = "creditcards")
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Account account;
    private String type;
    private String institution;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
