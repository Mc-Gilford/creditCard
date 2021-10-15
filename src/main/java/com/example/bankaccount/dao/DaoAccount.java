package com.example.bankaccount.dao;

import com.example.bankaccount.entity.account.Account;
import com.example.bankaccount.interfaces.AccountImpl;

import java.util.List;
import java.util.UUID;

public class DaoAccount implements AccountImpl {
    @Override
    public Account getAccount(UUID id) {
        return null;
    }

    @Override
    public void updateAccount(Account account, UUID id) {

    }

    @Override
    public void insertAccount(Account account) {

    }

    @Override
    public void deleteAccount(UUID id) {

    }

    @Override
    public List<Account> getAccounts() {
        return null;
    }
}
