package com.shaoyu.mysite.service.serviceImpl;

import com.shaoyu.mysite.dao.UserMapper;
import com.shaoyu.mysite.domain.UserDO;
import com.shaoyu.mysite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Administrator
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 插入用户
     *
     * @param userDO
     * @return
     * @author leeshoayu
     */
    @Override
    public void insertUser(UserDO userDO) {
        userMapper.insertUser(userDO);
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public int updateUser(int id, String password) {
        return userMapper.updateUser(id, password);
    }


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

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<UserDO> selectAll() {

        List<UserDO> userDOList = userMapper.selectAll();

        return userDOList;
    }


}
