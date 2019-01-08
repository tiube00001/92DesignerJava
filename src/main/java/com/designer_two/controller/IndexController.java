package com.designer_two.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @GetMapping(value = "index")
    public String index() {
        System.out.println("test");
        return "index";
    }
    @GetMapping(value = "starter")
    public String start() {
        return "starter";
    }
}
