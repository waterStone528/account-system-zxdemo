package com.zx.account.system.member.service.impl;

import com.zx.account.system.common.model.member.MemberModel;
import com.zx.account.system.common.service.member.MemberService;
import com.zx.account.system.member.manager.MemberManager;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-27 16:30
 **/
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberManager memberManager;

    public MemberModel getMember(long id) {
        return memberManager.getMember(id);
    }
}
