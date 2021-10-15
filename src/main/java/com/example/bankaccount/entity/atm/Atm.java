package com.example.bankaccount.entity.atm;

import com.example.bankaccount.interfaces.AtmImpl;
import lombok.Data;

import java.util.UUID;

@Data
public class Atm  {
    private UUID id;
    private String type;

}
