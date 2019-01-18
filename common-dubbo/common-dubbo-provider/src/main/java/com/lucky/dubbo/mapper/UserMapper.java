package com.lucky.dubbo.mapper;

import com.github.pagehelper.Page;
import com.lucky.dubbo.model.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {

    User selectById(Integer id);

    Page<User> findAll();

}