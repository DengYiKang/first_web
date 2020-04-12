package com.example.first_web;

import com.example.first_web.dao.UserDAO;
import com.example.first_web.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstWebApplicationTests {

    @Autowired
    UserDAO userDAO;

    @Test
    void contextLoads() {
        User user=new User();
        user.setPassword("aaa");
        user.setId(2);
        userDAO.updatePassword(user);
    }

}
