package com.shaoyu.mysite.controller;

import com.shaoyu.mysite.domain.UserDO;
import com.shaoyu.mysite.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/check")
    public String login(@Param("username") String username, @Param("password") String password){
        UserDO user = userService.selectUser(username, password);

        return user.toString();
    }
//
//    @RequestMapping("/{page}")
//    public String showPage(@PathVariable String page){
//        return page;
//    }

    @RequestMapping("/index")
    public String hello() {
        return "/login";
    }
}
