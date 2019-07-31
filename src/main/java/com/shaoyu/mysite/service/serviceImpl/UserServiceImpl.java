package com.shaoyu.mysite.service.serviceImpl;

import com.shaoyu.mysite.dao.UserMapper;
import com.shaoyu.mysite.domain.UserDO;
import com.shaoyu.mysite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Administrator
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
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
