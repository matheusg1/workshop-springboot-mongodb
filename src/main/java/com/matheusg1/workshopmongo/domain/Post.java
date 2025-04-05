package com.matheusg1.workshopmongo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Post {
    private static final long serialVersionUID = 1L;
    
    @Id
    private String id;
    private Date date;
    private String title;
    private String body;    
    
}
