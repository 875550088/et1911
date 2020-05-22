package com.etoak.bean;

import lombok.Data;

@Data
public class Car {
	
	private Integer id;
	private String brand;//品牌
	private String series;//车系
	private Integer price;//价格
	private String licensingTime;//上牌时间
	private String level;//级别
	private String gearbox;//变速箱
	private String outputVolume;//排量
	private Integer mileage;//里程
	private String location;//归属地
	private String pic;//图片地址
	private String summary;//概述
	private String createTime;//创建时间
	
	
}
