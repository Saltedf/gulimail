package dev.salted.gulimall.member.dao;

import dev.salted.gulimall.member.entity.MemberCollectSpuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收藏的商品
 * 
 * @author salted
 * @email saltedf@qq.com
 * @date 2023-09-12 16:55:09
 */
@Mapper
public interface MemberCollectSpuDao extends BaseMapper<MemberCollectSpuEntity> {
	
}
