package com.example.bankaccount.interfaces;

import com.example.bankaccount.entity.account.Account;
import com.example.bankaccount.entity.location.Location;

import java.util.List;
import java.util.UUID;

public interface AccountImpl {
    public Account getAccount(UUID id);
    public void updateAccount(Account account, UUID id);
    public void insertAccount(Account account);
    public void deleteAccount(UUID id);
    public List<Account> getAccounts();
}
