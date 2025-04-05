package com.matheusg1.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusg1.workshopmongo.domain.User;
import com.matheusg1.workshopmongo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        List<User> users = repo.findAll();
        return users;
    }
}
