package com.example.first_web.service;


import com.example.first_web.model.User;

/**
 * Created by limi on 2017/10/15.
 */
public interface UserService {

    User checkUser(String username, String password);
}
