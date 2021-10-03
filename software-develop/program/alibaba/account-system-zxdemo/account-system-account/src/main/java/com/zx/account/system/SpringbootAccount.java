package com.zx.account.system;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-28 09:04
 **/
@SpringBootApplication
@EnableDubbo
public class SpringbootAccount {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootAccount.class, args);
    }
}
