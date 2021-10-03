package com.zx.account.system.order.service;

import com.zx.account.system.common.model.order.OrderModel;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-28 08:44
 **/
public interface OrderService {
    /**
     * 创建订单
     * @param orderModel
     */
    void createOrder(OrderModel orderModel);
}
