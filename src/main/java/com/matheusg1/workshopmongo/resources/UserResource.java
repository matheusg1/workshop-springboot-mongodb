package com.matheusg1.workshopmongo.resources;

import org.springframework.web.bind.annotation.RestController;

import com.matheusg1.workshopmongo.domain.User;
import com.matheusg1.workshopmongo.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserService service;
    
    @GetMapping()
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();                
        return ResponseEntity.ok().body(list);
    }
}
