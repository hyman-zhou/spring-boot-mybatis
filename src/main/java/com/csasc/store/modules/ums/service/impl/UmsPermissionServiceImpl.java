package com.csasc.store.modules.ums.service.impl;

import com.csasc.store.modules.ums.model.UmsPermission;
import com.csasc.store.modules.ums.mapper.UmsPermissionMapper;
import com.csasc.store.modules.ums.service.UmsPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户权限表 服务实现类
 * </p>
 *
 * @author zhoupeng
 * @since 2021-01-07
 */
@Service
public class UmsPermissionServiceImpl extends ServiceImpl<UmsPermissionMapper, UmsPermission> implements UmsPermissionService {
}
