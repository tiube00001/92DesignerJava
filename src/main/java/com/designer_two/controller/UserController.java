package com.designer_two.controller;

import com.designer_two.entity.AdminUsersEntity;
import com.designer_two.repository.AdminUserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping(value = "/auth/users")
public class UserController {
    private AdminUserRepository adminUserRepository;
    public UserController(AdminUserRepository adminUser) {
        this.adminUserRepository = adminUser;
    }
    @GetMapping(value = "")
    public String users(Model model) {
        Page<AdminUsersEntity> all = adminUserRepository.findAll(PageRequest.of(0, 3));
        model.addAttribute("page", all);
        return "user/list";
    }

    @RequestMapping(value = "/create")
    public String create() {
        return "user/create";
    }
}
