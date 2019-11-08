package com.servyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 冯立军
 * @version 1.0
 * @Date 2019/10/31
 */
@SpringBootApplication
@EnableDiscoveryClient    //Consul注册注解
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }



}
