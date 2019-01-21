package com.zhujs.consumer.controller;

import com.zhujs.user.client.UserClient;
import com.zhujs.user.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: jinshan.zhu
 * @Date: 2019/1/21 15:14
 */
@RestController
@RequestMapping(path = "user")
public class UserController {

    @Autowired
    private UserClient userClient;

    @RequestMapping(path = "/{id}")
    public UserDTO getUser(@PathVariable Integer id){
        return userClient.get(id);
    }

}
