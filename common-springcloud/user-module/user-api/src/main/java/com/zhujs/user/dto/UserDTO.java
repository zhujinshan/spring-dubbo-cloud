package com.zhujs.user.dto;

import java.io.Serializable;

/**
 * @Description: TODO
 * @Author: jinshan.zhu
 * @Date: 2019/1/19 16:19
 */
public class UserDTO implements Serializable {

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
