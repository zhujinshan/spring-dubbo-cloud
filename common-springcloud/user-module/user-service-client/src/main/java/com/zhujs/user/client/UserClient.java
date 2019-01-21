package com.zhujs.user.client;


import com.zhujs.user.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: TODO
 * @Author: jinshan.zhu
 * @Date: 2019/1/21 14:17
 */
@FeignClient(name = "user-service")
public interface UserClient {

    @GetMapping(name = "获取用户", path = "user/get")
    UserDTO get(@RequestParam("id") Integer id);
}
