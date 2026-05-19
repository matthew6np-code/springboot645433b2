package com.entity.vo;

import com.entity.JiaoshuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 饲养环境
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public class JiaoshuiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 生猪图片
	 */
	
	private String guoshutupian;
		
	/**
	 * 养殖环境
	 */
	
	private Integer guangaijiaoshui;
		
	/**
	 * 灌溉时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date guangaishijian;
				
	
	/**
	 * 设置：生猪图片
	 */
	 
	public void setGuoshutupian(String guoshutupian) {
		this.guoshutupian = guoshutupian;
	}
	
	/**
	 * 获取：生猪图片
	 */
	public String getGuoshutupian() {
		return guoshutupian;
	}
				
	
	/**
	 * 设置：养殖环境
	 */
	 
	public void setGuangaijiaoshui(Integer guangaijiaoshui) {
		this.guangaijiaoshui = guangaijiaoshui;
	}
	
	/**
	 * 获取：养殖环境
	 */
	public Integer getGuangaijiaoshui() {
		return guangaijiaoshui;
	}
				
	
	/**
	 * 设置：灌溉时间
	 */
	 
	public void setGuangaishijian(Date guangaishijian) {
		this.guangaishijian = guangaishijian;
	}
	
	/**
	 * 获取：灌溉时间
	 */
	public Date getGuangaishijian() {
		return guangaishijian;
	}
			
}
