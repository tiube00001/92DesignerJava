package com.designer_two.controller;

import com.designer_two.repository.AdminPermissionsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/auth/permissions")
public class PermissionController {
    private AdminPermissionsRepository adminPermissionsRepository;

    public PermissionController(AdminPermissionsRepository adminPermissionsRepository) {
        this.adminPermissionsRepository = adminPermissionsRepository;
    }

    @GetMapping(value = "")
    public String index() {
        return "permission/list";
    }

    @GetMapping(value = "/create")
    public String create() {
        return "permission/create";
    }
}
