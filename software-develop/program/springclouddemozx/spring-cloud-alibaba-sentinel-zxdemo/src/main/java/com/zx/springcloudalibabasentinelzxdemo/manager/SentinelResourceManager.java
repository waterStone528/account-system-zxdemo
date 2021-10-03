package com.zx.springcloudalibabasentinelzxdemo.manager;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-18 17:33
 **/
@Service
public class SentinelResourceManager {

    @SentinelResource(value = "sayHello")
    public String sayHello(String name){
        return "Hello," + name;
    }
}
