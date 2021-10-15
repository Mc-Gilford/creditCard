package com.example.bankaccount.interfaces;

import com.example.bankaccount.entity.atm.Atm;

import java.util.UUID;

public interface AtmImpl {
    public Atm getAtm(UUID id);
    public void createAtm(Atm atm);
}
