package com.zx.account.system.order.service;

import com.zx.account.system.common.model.order.OrderModel;
import com.zx.account.system.order.manger.OrderManager;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-28 08:55
 **/
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderManager orderManager;

    @Override
    public void createOrder(OrderModel orderModel) {
        orderManager.createOrder(orderModel);
    }
}
