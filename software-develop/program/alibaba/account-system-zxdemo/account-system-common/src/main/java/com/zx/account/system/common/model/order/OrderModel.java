package com.zx.account.system.common.model.order;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-28 08:37
 **/
@Getter
@Setter
@Builder
@ToString
public class OrderModel implements Serializable {
    long id;
    String name;
    long memberId;
    long amount;
    LocalDateTime ceateTime;
    LocalDateTime completeTime;
    String desc;
}
