package com.designer_two.controller;

import com.designer_two.entity.AdminMenuEntity;
import com.designer_two.mp.mapper.UsersMapper;
import com.designer_two.repository.AdminMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.ContextLoader;

import javax.servlet.http.HttpServletRequest;


@Controller
public class IndexController {

    private AdminMenuRepository adminMenuRepository;

    public IndexController(AdminMenuRepository adminMenuRepository) {
        this.adminMenuRepository = adminMenuRepository;
    }
    @GetMapping(value = "/index")
    public String index(HttpServletRequest request) {
        Iterable<AdminMenuEntity> all = adminMenuRepository.findAll();

        return "index";
    }
}
