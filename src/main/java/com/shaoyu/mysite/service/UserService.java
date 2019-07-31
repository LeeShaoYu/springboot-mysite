package com.shaoyu.mysite.service;

import com.shaoyu.mysite.domain.UserDO;

/**
 * @author Administrator
 */
public interface UserService {

    /**
     * 使用用户名和密码查询用户
     * @return
     */
    UserDO selectUser(String username, String password);
}
