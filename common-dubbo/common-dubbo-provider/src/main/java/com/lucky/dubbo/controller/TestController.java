package com.lucky.dubbo.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lucky.dubbo.mapper.UserMapper;
import com.lucky.dubbo.model.User;
import com.lucky.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: jinshan.zhu
 * @Date: 2018/11/27 17:29
 */
@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(path = "/")
    public Object test(){
        PageHelper.startPage(2, 3);
        Page<User> page = userMapper.findAll();
        return page;
    }
}
