package com.matheusg1.workshopmongo.resources;

import org.springframework.web.bind.annotation.RestController;

import com.matheusg1.workshopmongo.domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/users")
public class UserResource {
    
    @GetMapping()
    public ResponseEntity<List<User>> findAll() {
        List<User> list = new ArrayList<>();
        User maria = new User("1001", "Maria Brown", "maria@gmail.com"); 
        User alex = new User("1002", "Alex Green", "alex@gmail.com"); 
        list.addAll(Arrays.asList(maria, alex));
        return ResponseEntity.ok().body(list);
    }
}
