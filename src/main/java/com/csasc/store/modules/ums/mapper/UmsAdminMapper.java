package com.csasc.store.modules.ums.mapper;

import com.csasc.store.modules.ums.model.UmsAdmin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 * @author zhoupeng
 * @since 2021-01-07
 */
public interface UmsAdminMapper extends BaseMapper<UmsAdmin> {
    List<UmsAdmin> selectByName(@Param("name") String name);
}
