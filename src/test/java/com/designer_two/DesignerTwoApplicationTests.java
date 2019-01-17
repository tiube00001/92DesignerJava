package com.designer_two;

import com.designer_two.compoent.SpringUtils;
import com.designer_two.embeddable.AdminRoleMenuPrimaryKey;
import com.designer_two.entity.AdminMenuEntity;
import com.designer_two.entity.AdminRoleMenuEntity;
import com.designer_two.entity.AdminUsersEntity;
import com.designer_two.repository.AdminRoleMenuRepository;
import com.designer_two.repository.AdminUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@Import(SpringUtils.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignerTwoApplicationTests {

    @Autowired
    protected AdminUserRepository adminUserRepository;
    @Autowired
    protected AdminRoleMenuRepository adminRoleMenuRepository;
    @Test
    public void contextLoads() {
        AdminUsersEntity user = adminUserRepository.findByUsername("admin");
        System.out.println("test");
        System.out.println(user.getName());
    }

    @Test
    public void primaryKeyTest() {
        adminRoleMenuRepository.findAll();
    }

}

