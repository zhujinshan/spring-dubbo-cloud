package com.zhujs.user.controller;

import com.zhujs.user.dto.UserDTO;
import com.zhujs.user.model.User;
import com.zhujs.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: jinshan.zhu
 * @Date: 2019/1/19 16:18
 */
@RestController
@RequestMapping(path = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public UserDTO getUser(Integer id){
        User user = userService.getUser(id);
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        return userDTO;
    }
}
