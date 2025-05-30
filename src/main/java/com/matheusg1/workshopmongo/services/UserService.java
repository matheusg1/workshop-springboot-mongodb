package com.matheusg1.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusg1.workshopmongo.domain.User;
import com.matheusg1.workshopmongo.repository.UserRepository;
import com.matheusg1.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User findById(String id){
            Optional<User> obj = repo.findById(id);            
            return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));            
        
    }

    public List<User> findAll(){
        List<User> users = repo.findAll();
        return users;
    }
}
