package com.shaoyu.mysite.dao;

import com.shaoyu.mysite.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Administrator
 */
@Mapper
public interface UserMapper {

    UserDO selectUser(@Param("username") String username, @Param("password") String password);
}
