package com.zhujs.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@EnableEurekaClient
@SpringBootApplication
@MapperScan(basePackages = "com.zhujs.user.mapper")
public class UserApplication02 {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication02.class, args);
    }
}
