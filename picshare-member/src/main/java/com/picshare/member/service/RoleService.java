package com.picshare.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.picshare.common.utils.PageUtils;
import com.picshare.member.entity.RoleEntity;

import java.util.Map;

/**
 * 
 *
 * @author WGD
 * @email WGD4776@163.com
 * @date 2020-11-24 08:56:09
 */
public interface RoleService extends IService<RoleEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

