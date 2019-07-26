package com.designer_two.mp.mapper;

import com.designer_two.mp.entity.AdminUsers;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yhl
 * @since 2019-07-25
 */
public interface AdminUsersMapper extends BaseMapper<AdminUsers> {
    AdminUsers oneUser(int id);
}
