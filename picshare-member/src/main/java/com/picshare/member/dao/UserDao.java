package com.picshare.member.dao;

import com.picshare.member.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author WGD
 * @email WGD4776@163.com
 * @date 2020-11-24 08:56:08
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
