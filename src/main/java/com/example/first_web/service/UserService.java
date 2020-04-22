package com.example.first_web.service;


import com.example.first_web.model.User;

public interface UserService {

    User checkUser(String username, String password);
}
