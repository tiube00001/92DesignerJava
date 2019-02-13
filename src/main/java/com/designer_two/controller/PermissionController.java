package com.designer_two.controller;

import com.designer_two.entity.AdminPermissionsEntity;
import com.designer_two.repository.AdminPermissionsRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.Timestamp;
import java.util.Date;


@Controller
@RequestMapping(value = "/auth")
public class PermissionController {
    private AdminPermissionsRepository adminPermissionsRepository;

    public PermissionController(AdminPermissionsRepository repository) {
        this.adminPermissionsRepository = repository;
    }

    @GetMapping(value = "permissions")
    public String index(Model model) {
        Page<AdminPermissionsEntity> all = adminPermissionsRepository.findAll(PageRequest.of(0, 3));
        model.addAttribute("page", all);
        return "permission/list";
    }

    @GetMapping(value = "permissions/create")
    public String create(Model model) {
        model.addAttribute("permission", new AdminPermissionsEntity());
        return "permission/create";
    }

    @PostMapping(value = "permissions/store")
    public String store(@ModelAttribute AdminPermissionsEntity permissions, RedirectAttributes attr) {

        Timestamp timestamp = new Timestamp((new Date()).getTime());
        permissions.setUpdatedAt(timestamp);
        permissions.setCreatedAt(timestamp);
        adminPermissionsRepository.save(permissions);
        attr.addFlashAttribute("status", 1);
        return "redirect:/auth/permissions";
    }
}
