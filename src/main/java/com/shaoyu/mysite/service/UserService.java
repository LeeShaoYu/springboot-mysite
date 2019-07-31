package com.shaoyu.mysite.service;

import com.shaoyu.mysite.domain.UserDO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Administrator
 */
public interface UserService {

    /**
     *  插入用户
     * @author leeshoayu
     * @param
     * @return
     */
    public void insertUser(UserDO userDO);

    /**
     *  删除用户
     * @param id
     * @return
     */
    public int deleteUser(Integer id);

    public int updateUser(int id, String password);

    /**
     * 使用用户名和密码查询用户
     * @return
     */
    UserDO selectUser(String username, String password);

    /**
     * 查询所有
     */
    public List<UserDO> selectAll();


}
