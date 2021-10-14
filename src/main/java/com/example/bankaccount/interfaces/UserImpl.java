package com.example.bankaccount.interfaces;

import com.example.bankaccount.entity.user.User;

import java.util.UUID;

public interface UserImpl {
    public void insertUser();
    public User getUser(UUID id);
    public void updateUser(User u, UUID id);
    public void deleteUser(UUID id);
}
