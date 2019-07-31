package com.shaoyu.mysite.controller;

import com.shaoyu.mysite.domain.UserDO;
import com.shaoyu.mysite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

//    @Autowired
//    private UserService userService;
//
//    @RequestMapping("/login")
//    @ResponseBody
//    public String login(String username, String password){
//        UserDO user = userService.selectUser(username, password);
//        System.out.println(user.toString());
//
//        return "success";
//    }
//
//    @RequestMapping("/{page}")
//    public String showPage(@PathVariable String page){
//        return page;
//    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World !!!";
    }
}
