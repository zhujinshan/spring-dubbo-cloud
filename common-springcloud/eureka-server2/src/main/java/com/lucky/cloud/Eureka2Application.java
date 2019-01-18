package com.lucky.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: TODO
 * @Author: jinshan.zhu
 * @Date: 2018/12/10 15:00
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka2Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Eureka2Application.class, args);
    }
}
