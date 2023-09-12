package dev.salted.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import dev.salted.common.utils.PageUtils;
import dev.salted.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author salted
 * @email saltedf@qq.com
 * @date 2023-09-12 17:00:51
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

