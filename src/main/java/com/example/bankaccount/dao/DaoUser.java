package com.example.bankaccount.dao;

import com.example.bankaccount.entity.user.User;
import com.example.bankaccount.interfaces.UserImpl;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface DaoUser extends MongoRepository<User, String> {


}
