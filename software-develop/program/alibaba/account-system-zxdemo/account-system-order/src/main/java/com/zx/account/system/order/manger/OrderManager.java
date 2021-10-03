package com.zx.account.system.order.manger;

import com.zx.account.system.common.model.order.OrderModel;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-28 08:52
 **/
@Component
public class OrderManager {

    /**
     * 创建订单
     * @param orderModel
     */
    public void createOrder(OrderModel orderModel){
        orderModel.setCeateTime(LocalDateTime.now());

        //数据持久化

    }

}
