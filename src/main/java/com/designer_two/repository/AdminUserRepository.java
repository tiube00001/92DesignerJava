package com.designer_two.repository;

import com.designer_two.entity.AdminUsersEntity;
import org.springframework.data.repository.RepositoryDefinition;


@RepositoryDefinition(domainClass = AdminUsersEntity.class, idClass = Integer.class)
public interface AdminUserRepository {
    AdminUsersEntity findByUsername(String username);
}
