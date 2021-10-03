package com.zx.account.system.api.manager;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: zx
 * @create: 2021-10-01 19:03
 **/
@Service
public class SentinelManager {

    @SentinelResource(value = "sentinelHelloWorld", blockHandler = "sentinelHelloWorldBlockHandler")
    public String sentinelHelloWorld(String name){
        return String.format("sentinel hello world, %s", name);
    }

    public String sentinelHelloWorldBlockHandler(String name, BlockException e){
        return String.format("i blocked");
    }
}
