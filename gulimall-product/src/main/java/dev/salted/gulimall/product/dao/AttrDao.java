package dev.salted.gulimall.product.dao;

import dev.salted.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author salted
 * @email saltedf@qq.com
 * @date 2023-09-11 15:03:42
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
