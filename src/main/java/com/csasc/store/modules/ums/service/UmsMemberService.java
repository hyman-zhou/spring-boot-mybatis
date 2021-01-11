package com.csasc.store.modules.ums.service;

import com.csasc.store.common.api.CommonResult;
import com.csasc.store.modules.ums.model.UmsMember;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author zhoupeng
 * @since 2021-01-07
 */
public interface UmsMemberService extends IService<UmsMember> {
    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone,String authCode);

}
