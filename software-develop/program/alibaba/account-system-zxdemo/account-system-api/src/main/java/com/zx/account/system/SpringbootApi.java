package com.zx.account.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-27 17:15
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootApi {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApi.class, args);
    }
}
