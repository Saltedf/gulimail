package dev.salted.gulimall.coupon.dao;

import dev.salted.gulimall.coupon.entity.SkuFullReductionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品满减信息
 * 
 * @author salted
 * @email saltedf@qq.com
 * @date 2023-09-12 16:47:35
 */
@Mapper
public interface SkuFullReductionDao extends BaseMapper<SkuFullReductionEntity> {
	
}
