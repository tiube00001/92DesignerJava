package com.designer_two.service;

import com.designer_two.entity.AdminMenuEntity;
import com.designer_two.repository.AdminMenuRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminMenuService {
    private AdminMenuRepository adminMenuRepository;

    public AdminMenuService (AdminMenuRepository adminMenu) {
        this.adminMenuRepository = adminMenu;
    }

    public Iterable<AdminMenuEntity> allMenu() {
        return this.adminMenuRepository.findAll();
    }

}
