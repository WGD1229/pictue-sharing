package com.picshare.member.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.picshare.member.entity.UserRoleEntity;
import com.picshare.member.service.UserRoleService;
import com.picshare.common.utils.PageUtils;
import com.picshare.common.utils.R;



/**
 * 
 *
 * @author WGD
 * @email WGD4776@163.com
 * @date 2020-11-24 08:56:09
 */
@RestController
@RequestMapping("member/userrole")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userRoleService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
    public R info(@PathVariable("userId") Long userId){
		UserRoleEntity userRole = userRoleService.getById(userId);

        return R.ok().put("userRole", userRole);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UserRoleEntity userRole){
		userRoleService.save(userRole);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UserRoleEntity userRole){
		userRoleService.updateById(userRole);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] userIds){
		userRoleService.removeByIds(Arrays.asList(userIds));

        return R.ok();
    }

}
