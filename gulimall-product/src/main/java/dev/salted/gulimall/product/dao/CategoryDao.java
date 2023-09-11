package dev.salted.gulimall.product.dao;

import dev.salted.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author salted
 * @email saltedf@qq.com
 * @date 2023-09-11 15:03:43
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
