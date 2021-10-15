package com.example.bankaccount.dao;

import com.example.bankaccount.entity.user.User;
import com.example.bankaccount.interfaces.UserImpl;

import java.util.List;
import java.util.UUID;

public class DaoUser implements UserImpl {
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

    @Override
    public List<User> getUsers() {
        return null;
    }
}
