package com.zx.account.system.common.service.account;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-28 09:06
 **/
public interface AccountService {
    /**
     * 增加金额
     * @param memberId
     * @param amount
     * @param orderId
     */
    void add(long memberId, long amount, long orderId);
}
