package com.example.bankaccount.entity.atm;

import com.example.bankaccount.interfaces.AtmImpl;
import lombok.Data;

import java.util.UUID;

@Data
public class Atm  {
    private String id;
    private String type;

}
