package com.designer_two.controller;

import com.designer_two.entity.AdminPermissionsEntity;
import com.designer_two.repository.AdminPermissionsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Controller
@RequestMapping(value = "/auth")
public class PermissionController {
    private AdminPermissionsRepository adminPermissionsRepository;

    public PermissionController(AdminPermissionsRepository adminPermissionsRepository) {
        this.adminPermissionsRepository = adminPermissionsRepository;
    }

    @GetMapping(value = "permissions")
    public String index() {
        return "permission/list";
    }

    @GetMapping(value = "permissions/create")
    public String create(Model model) {
        model.addAttribute("permission", new AdminPermissionsEntity());
        return "permission/create";
    }

    @PostMapping(value = "permissions/store")
    public String store(@ModelAttribute AdminPermissionsEntity permissions, RedirectAttributes attr) {

//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Timestamp timestamp = Timestamp.valueOf(format.format(new Date()));
//        permissions.setUpdatedAt(timestamp);
//        permissions.setCreatedAt(timestamp);
//        adminPermissionsRepository.save(permissions);
        attr.addFlashAttribute("status", 1);
        return "redirect:/auth/permissions";
    }
}
