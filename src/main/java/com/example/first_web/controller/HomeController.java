package com.example.first_web.controller;

import com.example.first_web.exception.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {
    @GetMapping("/{id}/{name}")
    public String index(@PathVariable Integer id, @PathVariable String name) {
//        String blog = null;
//        if (blog == null) {
//            throw new NotFoundException("blog not found");
//        }

        return "index";
    }

}
