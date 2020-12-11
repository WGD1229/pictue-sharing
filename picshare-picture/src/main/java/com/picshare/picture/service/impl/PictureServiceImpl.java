package com.picshare.picture.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.picshare.common.utils.PageUtils;
import com.picshare.common.utils.Query;

import com.picshare.picture.dao.PictureDao;
import com.picshare.picture.entity.PictureEntity;
import com.picshare.picture.service.PictureService;


@Service("pictureService")
public class PictureServiceImpl extends ServiceImpl<PictureDao, PictureEntity> implements PictureService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PictureEntity> page = this.page(
                new Query<PictureEntity>().getPage(params),
                new QueryWrapper<PictureEntity>()
        );

        return new PageUtils(page);
    }

}