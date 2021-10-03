package com.zx.account.system.member.manager;

import com.zx.account.system.common.model.member.MemberModel;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-27 16:40
 **/
@Component
public class MemberManager {
    /**
     * 获取会员
     * @param id
     * @return
     */
    public MemberModel getMember(long id){
        return MemberModel.builder()
                .id(id)
                .name("小雷").build();
    }
}
