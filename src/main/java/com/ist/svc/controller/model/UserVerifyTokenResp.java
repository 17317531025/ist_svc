package com.ist.svc.controller.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @Author: sunhaitao
 */
@Setter
@Getter
public class UserVerifyTokenResp extends BaseResp{
    private String loginName;
    private String userId;
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
