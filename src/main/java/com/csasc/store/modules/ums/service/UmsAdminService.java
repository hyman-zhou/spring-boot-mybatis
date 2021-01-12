package com.csasc.store.modules.ums.service;

import com.csasc.store.modules.ums.model.UmsAdmin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.csasc.store.modules.ums.model.UmsPermission;

import java.util.List;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author zhoupeng
 * @since 2021-01-07
 */
public interface UmsAdminService extends IService<UmsAdmin> {
    public UmsAdmin register(UmsAdmin umsAdminParam);
    public String login(String username,String password);
    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);
}
