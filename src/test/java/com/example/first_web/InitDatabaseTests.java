package com.example.first_web;

import com.example.first_web.dao.UserDAO;
import com.example.first_web.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.Date;
import java.util.Random;

@SpringBootTest
@Sql("/init-schema.sql")
class InitDatabaseTests {

    @Autowired
    UserDAO userDAO;

    @Test
    void initDatabase() {
        Random random = new Random();
        for (int i = 0; i < 11; ++i) {
            User user = new User();
            user.setId(i);
            user.setHeadUrl(String.format("http://images.nowcoder.com/head/%dt.png", random.nextInt(1000)));
            user.setName(String.format("USER%d", i));
            user.setPassword("");
            user.setSalt("");
            userDAO.addUser(user);
            user.setPassword("newpassword");
            userDAO.updatePassword(user);
        }
        userDAO.deleteById(1);
    }

}
