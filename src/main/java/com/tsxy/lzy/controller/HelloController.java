package com.tsxy.lzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("hello")
    public String hello(Model model) {
        model.addAttribute("name", "thymeleaf");
        return "hello";
    }

    @RequestMapping("login")
    public String login(Model index) {
        return "admin/login";
    }

    @RequestMapping("index")
    public String index(Model index) {
        return "admin/index";
    }

    @RequestMapping("add")
    public String add(Model index) {
        return "admin/student/admin-add";
    }

    @RequestMapping("welcome")
    public String welcome(Model model) {
        return "admin/welcome";
    }
}
