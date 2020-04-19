package com.example.first_web;

import javafx.application.Application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstWebApplication {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FirstWebApplication.class, args);
        String[] beanNames = ctx.getBeanDefinitionNames();
        logger.info("bean总数:{}", ctx.getBeanDefinitionCount());
        int i = 0;
        for (String str : beanNames) {
            logger.info("{},beanName:{}", ++i, str);
        }
    }


}
