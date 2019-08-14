package com.shaoyu.mysite.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户类
 */

@Data
public class UserDO implements Serializable {

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
