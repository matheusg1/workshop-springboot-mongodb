package com.matheusg1.workshopmongo.resources;

import org.springframework.web.bind.annotation.RestController;

import com.matheusg1.workshopmongo.domain.User;
import com.matheusg1.workshopmongo.dto.UserDTO;
import com.matheusg1.workshopmongo.services.UserService;

import java.util.List;
import java.util.stream.Collectors;

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
    public ResponseEntity<List<UserDTO>> findAll() {
        List<User> list = service.findAll();                

        List<UserDTO> listDto = list.stream()
            .map(x -> new UserDTO(x))
            .collect(Collectors.toList());
            
        return ResponseEntity.ok().body(listDto);
    }
}
