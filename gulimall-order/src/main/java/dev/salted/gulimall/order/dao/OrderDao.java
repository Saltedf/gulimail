package dev.salted.gulimall.order.dao;

import dev.salted.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author salted
 * @email saltedf@qq.com
 * @date 2023-09-12 17:00:51
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
