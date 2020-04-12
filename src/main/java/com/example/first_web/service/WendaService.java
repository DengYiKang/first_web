package com.example.first_web.service;

import org.springframework.stereotype.Service;

@Service
public class WendaService {
    public String getMessage(int userId){
        return "Hello "+String.valueOf(userId);
    }
}
