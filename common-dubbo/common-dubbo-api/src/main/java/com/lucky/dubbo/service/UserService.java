package com.lucky.dubbo.service;

import com.lucky.dubbo.dto.UserDTO;

/**
 * @Description: TODO
 * @Author: jinshan.zhu
 * @Date: 2018/11/27 17:07
 */
public interface UserService {

    UserDTO getUser(Integer id);
}
