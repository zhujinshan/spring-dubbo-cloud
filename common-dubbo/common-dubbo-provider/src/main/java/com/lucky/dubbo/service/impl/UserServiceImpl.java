package com.lucky.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lucky.dubbo.dto.UserDTO;
import com.lucky.dubbo.mapper.UserMapper;
import com.lucky.dubbo.model.User;
import com.lucky.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Author: jinshan.zhu
 * @Date: 2018/11/27 17:07
 */
@Service(version = "1.0", interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO getUser(Integer id) {
        User user = userMapper.selectById(id);

        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        return userDTO;
    }
}
