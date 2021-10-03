package com.zx.springcloudalibabanacoszxdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-18 10:06
 **/
@RestController
@RequestMapping("/config")
@RefreshScope
public class NacosConfigController {
    @Value("${nacos.config.value:bb}")
    private String value;

    @RequestMapping("/get")
    public String get(){
        return value;
    }
}
