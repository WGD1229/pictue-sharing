package com.picshare.picture.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.picshare.common.utils.PageUtils;
import com.picshare.picture.entity.PictureEntity;

import java.util.Map;

/**
 * 
 *
 * @author WGD
 * @email WGD4776@163.com
 * @date 2020-11-24 11:08:37
 */
public interface PictureService extends IService<PictureEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

