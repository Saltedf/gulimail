package dev.salted.gulimall.member.dao;

import dev.salted.gulimall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author salted
 * @email saltedf@qq.com
 * @date 2023-09-12 16:55:09
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}
