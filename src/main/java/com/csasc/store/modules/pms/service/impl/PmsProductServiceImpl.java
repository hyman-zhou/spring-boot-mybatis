package com.csasc.store.modules.pms.service.impl;

import com.csasc.store.modules.pms.model.PmsProduct;
import com.csasc.store.modules.pms.mapper.PmsProductMapper;
import com.csasc.store.modules.pms.service.PmsProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author zhoupeng
 * @since 2021-01-07
 */
@Service
public class PmsProductServiceImpl extends ServiceImpl<PmsProductMapper, PmsProduct> implements PmsProductService {

}
