package com.designer_two.repository;

import com.designer_two.entity.AdminUsersEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AdminUserRepository extends PagingAndSortingRepository<AdminUsersEntity, Integer> {
    AdminUsersEntity findByUsername(String username);
}
