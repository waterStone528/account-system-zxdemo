package com.zx.account.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-28 08:34
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootOrder {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootOrder.class, args);
    }
}
