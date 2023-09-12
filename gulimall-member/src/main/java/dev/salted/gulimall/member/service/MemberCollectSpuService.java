package dev.salted.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import dev.salted.common.utils.PageUtils;
import dev.salted.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author salted
 * @email saltedf@qq.com
 * @date 2023-09-12 16:55:09
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

