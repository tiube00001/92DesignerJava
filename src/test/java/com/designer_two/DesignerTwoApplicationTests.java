package com.designer_two;

import com.designer_two.entity.AdminUsersEntity;
import com.designer_two.repository.AdminUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignerTwoApplicationTests {

    @Autowired
    protected AdminUserRepository adminUserRepository;
    @Test
    public void contextLoads() {
        AdminUsersEntity user = adminUserRepository.findByUsername("admin");
        System.out.println("test");
        System.out.println(user.getName());
    }

}

