package com.designer_two.repository;

import com.designer_two.embeddable.AdminRoleMenuPrimaryKey;
import com.designer_two.entity.AdminRoleMenuEntity;
import org.springframework.data.repository.CrudRepository;

public interface AdminRoleMenuRepository extends CrudRepository<AdminRoleMenuEntity, AdminRoleMenuPrimaryKey> {

}
