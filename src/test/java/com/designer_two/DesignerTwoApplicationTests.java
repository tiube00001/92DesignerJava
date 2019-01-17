package com.designer_two;

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
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

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
        Optional<AdminRoleMenuEntity> id = adminRoleMenuRepository.findById(new AdminRoleMenuPrimaryKey(1, 8));
        id.map(AdminRoleMenuEntity::getId).ifPresent(System.out::println);
    }

}

