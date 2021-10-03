package com.zx.springcloudalibabasentinelzxdemo.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.zx.springcloudalibabasentinelzxdemo.manager.SentinelResourceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-18 17:35
 **/
@RestController
public class TestController {
    @Autowired
    private SentinelResourceManager sentinelResourceManager;

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable String name){
        return sentinelResourceManager.sayHello(name);
    }

    @GetMapping(value = "/dynamic/rule/hello/{name}")
    @SentinelResource("dynamicRuleHello")
    public String dynamicRuleHello(@PathVariable String name){
        return "dynamic rule hello" + name;
    }

    @RequestMapping("/aa")
    public String aa(){
        return "aa";
    }

}
