package com.designer_two.controller;

import com.designer_two.entity.AdminUser;
import com.designer_two.repository.AdminUserRepository;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ContextLoader;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    protected AdminUserRepository userRepository;

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
        if (!StringUtils.isEmptyOrWhitespace(username)) {
            AdminUser user = this.userRepository.findByUsername(username);
            if (user != null) {
                String passEncode = user.getPassword().replaceFirst("y", "a");
                if (BCrypt.checkpw(pass, passEncode)) {
                    session.setAttribute("token", username);
                    return "redirect:/index";
                }
            }
        }
        System.out.println("this is pass error");

        session.setAttribute("loginErr", "账号或者密码错误");
        return "redirect:/login";
    }
    @GetMapping(value = "logout")
    public String logout(HttpSession session) {
        session.removeAttribute("token");
        return "redirect:/login";
    }
}
