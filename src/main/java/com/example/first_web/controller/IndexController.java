package com.example.first_web.controller;

import com.example.first_web.model.User;
import com.example.first_web.service.WendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    WendaService wendaService;

    @RequestMapping(path = {"/", "/index"})
    @ResponseBody
    public String index(HttpSession httpSession) {
        return "hello " + httpSession.getAttribute("msg")
                + wendaService.getMessage(1);
    }

    @RequestMapping(path = {"/profile/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("userId") int userId,
                          @RequestParam(value = "type", defaultValue = "1") String value) {
        return String.format("userId:%d; type:%s", userId, value);
    }

    @RequestMapping(path = {"/a"}, method = {RequestMethod.GET})
    public String template(Model model) {
        List<String> color = Arrays.asList(new String[]{"red", "green", "yellow"});
        model.addAttribute("value1", "aaaa");
        model.addAttribute("list1", color);
        model.addAttribute("user", new User("yikang"));
        return "home";
    }

    @RequestMapping(path = {"/redirect/{code}"})
    public RedirectView redirect(@PathVariable("code") int code,
                                 HttpSession httpSession) {
        httpSession.setAttribute("msg", "jump from redirect");
        RedirectView red = new RedirectView("/", true);
        if (code == 301) {
            red.setStatusCode(HttpStatus.PERMANENT_REDIRECT);
        }
        return red;
    }

    @RequestMapping(path = {"/header"})
    public String header(){
        return "header";
    }

    @RequestMapping(path = {"/admin"})
    @ResponseBody
    public String admin(@RequestParam("key") String key) {
        if ("admin".equals(key)) {
            return "hello admin!";
        }
        throw new IllegalArgumentException("illegal argument");
    }

    @ExceptionHandler()
    @ResponseBody
    public String error(Exception e) {
        return "error: " + e.getMessage();
    }
}
