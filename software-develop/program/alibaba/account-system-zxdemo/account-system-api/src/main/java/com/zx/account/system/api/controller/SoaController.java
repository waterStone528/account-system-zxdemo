package com.zx.account.system.api.controller;

import com.zx.account.system.api.manager.SentinelManager;
import com.zx.account.system.common.model.order.OrderModel;
import com.zx.account.system.order.service.OrderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-27 17:17
 **/
@RestController
@RefreshScope
public class SoaController {
    @Value("${nacos.config.demo.value}")
    private String nacosConfigDemoValue;

    @Autowired
    SentinelManager sentinelManager;

    @Reference(check = false)
    OrderService orderService;

    @GetMapping("/V1/nacoscofigdemovalue")
    public String getNacosConfigDemoValue(){
        return nacosConfigDemoValue;
    }

    @PostMapping("/V1/payment")
    public String applyPaymemt(HttpServletRequest request){
        Long memberId = Long.valueOf(request.getParameter("memberId"));
        Long amount = Long.valueOf(request.getParameter("amount"));

        OrderModel orderModel = OrderModel.builder()
                .memberId(memberId)
                .amount(amount)
                .id(Instant.now().getEpochSecond()).build();
        orderService.createOrder(orderModel);

        return String.format("支付申请成功，memberId=%s, amount=%s", memberId, amount);
    }

    @GetMapping("/V1/sentinel/{name}")
    public String sentinelHello(@PathVariable("name") String name){
        return sentinelManager.sentinelHelloWorld(name);
    }
}
