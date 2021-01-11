package com.csasc.store.modules.ums.dao;

import com.csasc.store.modules.ums.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsAdminRoleRelationDao {
    /**
     * 获取用户所有权限(包括+-权限)
     */
    public List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
    public List<UmsPermission> listAllPermission();

}
