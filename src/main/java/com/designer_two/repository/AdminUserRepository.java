package com.designer_two.repository;

import com.designer_two.entity.AdminUser;
import org.springframework.data.repository.RepositoryDefinition;


@RepositoryDefinition(domainClass = AdminUser.class, idClass = Integer.class)
public interface AdminUserRepository {
    AdminUser findByUsername(String username);
}
