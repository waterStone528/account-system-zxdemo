package com.zx.account.system.service.impl;

import com.zx.account.system.common.service.account.AccountService;
import com.zx.account.system.service.manager.AccountManager;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-28 09:11
 **/
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountManager accountManager;

    public void add(long memberId, long amount, long orderId) {
        accountManager.add(memberId, amount, orderId);
    }
}
