package com.wang.controller;

import com.wang.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private IUserService iUserService;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/login")
    public String login(String username, String passwd) {
        boolean login = iUserService.login(username, passwd);
        if (login) {
            return "登陆成功";
        }
        else {
            return "登陆失败";
        }
    }

    @RequestMapping("/register")
    public String register(String username, String passwd) {
        boolean login = iUserService.register(username, passwd);
        if (login) {
            return "注册成功";
        }
        else {
            return "注册失败";
        }
    }

}
