package com.shaoyu.mysite.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shaoyu.mysite.domain.UserDO;
import com.shaoyu.mysite.service.UserService;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 首页
     * @return
     */
    @RequestMapping("/index")
    public String hello() {
        return "/login";
    }


    /**
     * 添加
     * @param userDO
     * @return
     */
    @RequestMapping("/addUser")
    public String addUser(UserDO userDO){
        userService.insertUser(userDO);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/deleteUser")
    public String deleteUser(int id){
        int index = userService.deleteUser(id);
        if (index != 0){
            return "success";
        }else {
            return "fail";
        }
    }

    @ResponseBody
    @RequestMapping("/updateUser")
    public String updateUser(int id, String password){
        int index = userService.updateUser(id, password);
        if (index != 0){
            return "success";
        }else {
            return "fail";
        }
    }

    /**
     * 查询
     * @param username
     * @param password
     * @return
     */
    @ResponseBody
    @RequestMapping("/check")
    public String login(@Param("username") String username, @Param("password") String password){
        UserDO user = userService.selectUser(username, password);

        return user.toString();
    }

    /**
     * 查询所有
     */
    @ResponseBody
    @RequestMapping("/selectAllUsers")
    public JSONObject selectAllUsers(Model model){
        List<UserDO> userDOList =  userService.selectAll();
        JSONObject json = new JSONObject();
        for (UserDO userDO : userDOList){
            json.put(""+userDOList.indexOf(userDO), userDO.toString());
        }
        return json;
    }
}
