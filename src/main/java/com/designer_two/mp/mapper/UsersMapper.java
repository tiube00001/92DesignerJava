package com.designer_two.mp.mapper;

import com.designer_two.mp.entity.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yhl
 * @since 2019-07-25
 */
public interface UsersMapper extends BaseMapper<Users> {
}
