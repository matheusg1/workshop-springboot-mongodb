package com.matheusg1.workshopmongo.dto;

import java.io.Serializable;

import com.matheusg1.workshopmongo.domain.User;

public class UserDTO  implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private String name;
    private String email;

    public UserDTO() {
    }

    public UserDTO(User obj) {
        name = obj.getName();        
        email = obj.getEmail();        
    }
    

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
