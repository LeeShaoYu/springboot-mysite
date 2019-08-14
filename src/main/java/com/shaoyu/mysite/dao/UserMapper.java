package com.shaoyu.mysite.dao;

import com.shaoyu.mysite.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * @author Administrator
 */
@Mapper
public interface UserMapper {

    void insertUser(UserDO userDO);

    int deleteUser(@Param("id") Integer id);

    int updateUser(@Param("id") Integer id, @Param("password") String password);

    List<UserDO> selectAll();

    UserDO selectUser(@Param("username") String username, @Param("password") String password);

    UserDO selectById(@Param("id") Integer id);
}
