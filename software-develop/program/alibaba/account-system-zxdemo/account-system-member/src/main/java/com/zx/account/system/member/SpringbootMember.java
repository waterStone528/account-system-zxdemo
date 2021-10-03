package com.zx.account.system.member;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-27 16:20
 **/
@SpringBootApplication
@EnableDubbo
public class SpringbootMember {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMember.class, args);
    }

}
