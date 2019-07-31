package com.shaoyu.mysite.service.serviceImpl;

import com.shaoyu.mysite.dao.UserMapper;
import com.shaoyu.mysite.domain.UserDO;
import com.shaoyu.mysite.service.UserService;

/**
 * @author Administrator
 */
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    /**
     *  使用用户名和密码查询用户
     * @author leeshoayu
     * @date
     * @param
     * @return
     */
    @Override
    public UserDO selectUser(String username, String password) {

        UserDO user = userMapper.selectUser(username, password);

        return user;
    }
}
