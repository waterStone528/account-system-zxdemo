package com.zx.account.system.common.model.member;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-27 16:25
 **/
@Getter
@Setter
@Builder
@ToString
public class MemberModel {
    long id;
    String name;
}
