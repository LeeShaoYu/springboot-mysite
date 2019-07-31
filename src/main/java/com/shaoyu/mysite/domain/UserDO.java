package com.shaoyu.mysite.domain;

import lombok.Data;

/**
 * 用户类
 */

@Data
public class UserDO {

    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;


}
