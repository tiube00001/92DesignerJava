package com.designer_two;

import com.designer_two.compoent.SpringUtils;
//import com.designer_two.embeddable.AdminRoleMenuPrimaryKey;
//import com.designer_two.entity.AdminMenuEntity;
//import com.designer_two.entity.AdminRoleMenuEntity;
//import com.designer_two.entity.AdminUsersEntity;
import com.designer_two.mp.entity.AdminUsers;
import com.designer_two.mp.mapper.AdminUsersMapper;
import com.designer_two.mp.mapper.UsersMapper;
//import com.designer_two.repository.AdminRoleMenuRepository;
//import com.designer_two.repository.AdminUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@Import(SpringUtils.class)
@RunWith(SpringRunner.class)
@SpringBootTest
//@MapperScan("com.designer_two.mp.mapper")
public class DesignerTwoApplicationTests {

    @Autowired
    private AdminUsersMapper adminUsersMapper;

    @Test
    public void testMpOneUser() {
        System.out.println(adminUsersMapper.selectById(1));
    }

    @Test
    public void testXmlMap() {
        AdminUsers users = adminUsersMapper.oneUser(1);
        System.out.println(users);
    }

}

