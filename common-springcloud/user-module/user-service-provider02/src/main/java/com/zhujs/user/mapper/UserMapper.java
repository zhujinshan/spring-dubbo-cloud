package com.zhujs.user.mapper;

import com.github.pagehelper.Page;
import com.zhujs.user.model.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {

    User selectById(Integer id);

    Page<User> findAll();
}