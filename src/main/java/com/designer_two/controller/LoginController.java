package com.designer_two.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@Controller
public class LoginController {

    @GetMapping(value = "login")
    public String login(HttpSession session, Map<String, Object> map, HttpServletResponse response) throws IOException {
        Object token = session.getAttribute("token");
        if (token != null) {
            response.sendRedirect("/");
        }
        Object loginErr = session.getAttribute("loginErr");
        if (loginErr != null) {
            map.put("err", loginErr);
            session.removeAttribute("loginErr");
        }
        return "login";
    }
    @PostMapping(value = "sign")
    public String sign(@RequestParam("username") String username,
                         @RequestParam("pass") String pass,
                         HttpSession session) {
        if (!StringUtils.isEmpty(username) && "123456".equals(pass)) {
            session.setAttribute("token", username);
            return "redirect:/index";
        }
        session.setAttribute("loginErr", "账号或者密码错误");
        return "redirect:/login";
    }
    @GetMapping(value = "logout")
    public String logout(HttpSession session) {
        session.removeAttribute("token");
        return "redirect:/login";
    }
}
