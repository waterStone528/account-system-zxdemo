package com.zx.account.system.common.service.member;

import com.zx.account.system.common.model.member.MemberModel;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-27 16:24
 **/
public interface MemberService {
    /**
     * θ·εδΌε
     * @param id
     * @return
     */
    MemberModel getMember(long id);


}
