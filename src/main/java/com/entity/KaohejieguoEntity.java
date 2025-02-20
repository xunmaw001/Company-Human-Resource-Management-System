package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 考核结果
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
@TableName("kaohejieguo")
public class KaohejieguoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KaohejieguoEntity() {
		
	}
	
	public KaohejieguoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 员工工号
	 */
					
	private String yuangonggonghao;
	
	/**
	 * 员工姓名
	 */
					
	private String yuangongxingming;
	
	/**
	 * 部门
	 */
					
	private String bumen;
	
	/**
	 * 职位
	 */
					
	private String zhiwei;
	
	/**
	 * 考核封面
	 */
					
	private String kaohefengmian;
	
	/**
	 * 考核日期
	 */
					
	private String kaoheriqi;
	
	/**
	 * 考核内容
	 */
					
	private String kaoheneirong;
	
	/**
	 * 考核评分
	 */
					
	private String kaohepingfen;
	
	/**
	 * 绩效
	 */
					
	private Integer jixiao;
	
	/**
	 * 考核评价
	 */
					
	private String kaohepingjia;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：员工工号
	 */
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
	/**
	 * 设置：员工姓名
	 */
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
	/**
	 * 设置：部门
	 */
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
	/**
	 * 设置：职位
	 */
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
	}
	/**
	 * 设置：考核封面
	 */
	public void setKaohefengmian(String kaohefengmian) {
		this.kaohefengmian = kaohefengmian;
	}
	/**
	 * 获取：考核封面
	 */
	public String getKaohefengmian() {
		return kaohefengmian;
	}
	/**
	 * 设置：考核日期
	 */
	public void setKaoheriqi(String kaoheriqi) {
		this.kaoheriqi = kaoheriqi;
	}
	/**
	 * 获取：考核日期
	 */
	public String getKaoheriqi() {
		return kaoheriqi;
	}
	/**
	 * 设置：考核内容
	 */
	public void setKaoheneirong(String kaoheneirong) {
		this.kaoheneirong = kaoheneirong;
	}
	/**
	 * 获取：考核内容
	 */
	public String getKaoheneirong() {
		return kaoheneirong;
	}
	/**
	 * 设置：考核评分
	 */
	public void setKaohepingfen(String kaohepingfen) {
		this.kaohepingfen = kaohepingfen;
	}
	/**
	 * 获取：考核评分
	 */
	public String getKaohepingfen() {
		return kaohepingfen;
	}
	/**
	 * 设置：绩效
	 */
	public void setJixiao(Integer jixiao) {
		this.jixiao = jixiao;
	}
	/**
	 * 获取：绩效
	 */
	public Integer getJixiao() {
		return jixiao;
	}
	/**
	 * 设置：考核评价
	 */
	public void setKaohepingjia(String kaohepingjia) {
		this.kaohepingjia = kaohepingjia;
	}
	/**
	 * 获取：考核评价
	 */
	public String getKaohepingjia() {
		return kaohepingjia;
	}

}
