package com.designer_two.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/auth")
public class UserController {

    @GetMapping(value = "users")
    public String users() {
        return "user/list";
    }
}
