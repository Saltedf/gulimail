package dev.salted.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import dev.salted.common.utils.PageUtils;
import dev.salted.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author salted
 * @email saltedf@qq.com
 * @date 2023-09-12 16:47:35
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

