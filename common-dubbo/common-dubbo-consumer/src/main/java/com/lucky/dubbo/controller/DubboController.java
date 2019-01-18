package com.lucky.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lucky.dubbo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: jinshan.zhu
 * @Date: 2018/11/27 17:55
 */
@RestController
public class DubboController {

    @Reference(version = "1.0")
    private UserService userService;

    @RequestMapping(path = "/")
    public Object test(){
        return userService.getUser(1);
    }

}
