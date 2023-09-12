package dev.salted.gulimall.ware.dao;

import dev.salted.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author salted
 * @email saltedf@qq.com
 * @date 2023-09-12 17:04:01
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
