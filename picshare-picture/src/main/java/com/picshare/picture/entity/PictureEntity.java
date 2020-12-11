package com.picshare.picture.entity;

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
 * @date 2020-11-24 11:08:37
 */
@Data
@TableName("picms_picture")
public class PictureEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long pictureId;
	/**
	 * 图片标题
	 */
	private String pictureTitle;
	/**
	 * 
	 */
	private String pictureDescription;
	/**
	 * 图片路径
	 */
	private String pictureUrl;
	/**
	 * 图片上传时间
	 */
	private Date uploadTime;
	/**
	 * 上传图片用户id
	 */
	private Long uploadUid;

}
