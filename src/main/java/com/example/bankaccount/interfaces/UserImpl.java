package com.example.bankaccount.interfaces;

import com.example.bankaccount.entity.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface UserImpl extends MongoRepository<User,String> {
    public User insertUser();
    public User getUser(UUID id);
    public void updateUser(User u, UUID id);
    public void deleteUser(UUID id);
    public List<User> getUsers();
}
