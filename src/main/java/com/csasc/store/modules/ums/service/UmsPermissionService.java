package com.csasc.store.modules.ums.service;

import com.csasc.store.modules.ums.model.UmsPermission;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 * 后台用户权限表 服务类
 * </p>
 *
 * @author zhoupeng
 * @since 2021-01-07
 */
public interface UmsPermissionService extends IService<UmsPermission> {
    List<UmsPermission> getPermissionList(Long adminId);
}
