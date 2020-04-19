package com.example.first_web;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.Random;

@SpringBootTest
@Sql("/init-schema.sql")
class InitDatabaseTests {

//    @Autowired
//    UserDAO userDAO;
//
//    @Autowired
//    QuestionDAO questionDAO;

    @Test
    void initDatabase() {
        Random random = new Random();
//        for (int i = 0; i < 11; ++i) {
//            User user = new User();
//            user.setId(i);
//            user.setHeadUrl(String.format("http://images.nowcoder.com/head/%dt.png", random.nextInt(1000)));
//            user.setName(String.format("USER%d", i));
//            user.setPassword("");
//            user.setSalt("");
//            userDAO.addUser(user);
//            user.setPassword("newpassword");
//            userDAO.updatePassword(user);
//
//            Question question = new Question();
//            question.setCommentCount(i);
//            Date date = new Date();
//            date.setTime(date.getTime() + 1000 * 3600 * 5 * i);
//            question.setCreatedDate(date);
//            question.setUserId(i + 1);
//            question.setTitle(String.format("TITLE{%d}", i));
//            question.setContent(String.format("Balaababalalalal Content %d", i));
//            questionDAO.addQuestion(question);
//        }
//        userDAO.deleteById(1);
//        System.out.println(questionDAO.selectLatestQuestions(0,0,10));
    }

}
