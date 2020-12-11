package com.picshare.picture.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.picshare.picture.entity.PictureEntity;
import com.picshare.picture.service.PictureService;
import com.picshare.common.utils.PageUtils;
import com.picshare.common.utils.R;



/**
 * 
 *
 * @author WGD
 * @email WGD4776@163.com
 * @date 2020-11-24 11:08:37
 */
@RestController
@RequestMapping("picture/picture")
public class PictureController {
    @Autowired
    private PictureService pictureService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pictureService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{pictureId}")
    public R info(@PathVariable("pictureId") Long pictureId){
		PictureEntity picture = pictureService.getById(pictureId);

        return R.ok().put("picture", picture);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PictureEntity picture){
		pictureService.save(picture);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PictureEntity picture){
		pictureService.updateById(picture);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] pictureIds){
		pictureService.removeByIds(Arrays.asList(pictureIds));

        return R.ok();
    }

}
