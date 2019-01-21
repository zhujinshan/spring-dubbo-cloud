package com.zhujs.user.service.impl;

import com.netflix.discovery.EurekaClientConfig;
import com.zhujs.user.mapper.UserMapper;
import com.zhujs.user.model.User;
import com.zhujs.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Author: jinshan.zhu
 * @Date: 2018/11/27 17:07
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Integer id) {
        EurekaClientConfig config;
        return userMapper.selectById(id);
    }
}
