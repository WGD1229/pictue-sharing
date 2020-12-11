package com.picshare.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.picshare.common.utils.PageUtils;
import com.picshare.member.entity.UserEntity;

import java.util.Map;

/**
 * 
 *
 * @author WGD
 * @email WGD4776@163.com
 * @date 2020-11-24 08:56:08
 */
public interface UserService extends IService<UserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

