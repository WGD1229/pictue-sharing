package com.picshare.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author WGD
 * @email WGD4776@163.com
 * @date 2020-11-24 08:56:09
 */
@Data
@TableName("userms_user_role")
public class UserRoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Long userId;
	/**
	 * 
	 */
	private Long roleId;

}
