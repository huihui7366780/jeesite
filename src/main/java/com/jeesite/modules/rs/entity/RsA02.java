/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.rs.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 职务信息集Entity
 * @author qjh
 * @version 2019-03-12
 */
@Table(name="rs_a02", alias="a", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="sid", attrName="sid", label="父键", isQuery=false),
		@Column(name="sys001", attrName="sys001", label="状态"),
		@Column(name="sys002", attrName="sys002", label="序号", isQuery=false),
		@Column(name="a0201b", attrName="a0201b", label="任职机构"),
		@Column(name="a0201d", attrName="a0201d", label="是否领导成员"),
		@Column(name="a0201e", attrName="a0201e", label="成员类别"),
		@Column(name="a0215a", attrName="a0215a", label="职务名称", queryType=QueryType.LIKE),
		@Column(name="a0222", attrName="a0222", label="岗位类别"),
		@Column(name="a0223", attrName="a0223", label="职务排序"),
		@Column(name="a0243", attrName="a0243", label="任职时间"),
		@Column(name="a02b1", attrName="a02b1", label="选拔任用方式"),
		@Column(name="a0251", attrName="a0251", label="任职变动类别"),
		@Column(name="a0225", attrName="a0225", label="集体内排序", isQuery=false),
		@Column(name="a0265", attrName="a0265", label="免职时间"),
		@Column(name="a0247", attrName="a0247", label="选拔任用方式"),
		@Column(name="a0271", attrName="a0271", label="免职原因类别"),
		@Column(name="a0221", attrName="a0221", label="职务层次"),
		@Column(name="a0504", attrName="a0504", label="职级批准日期"),
		@Column(name="a0219", attrName="a0219", label="是否领导职务"),
		@Column(name="a02b2", attrName="a02b2", label="暂无使用"),
		@Column(name="a0229", attrName="a0229", label="分管", comment="分管（从事）工作"),
		@Column(name="a0245", attrName="a0245", label="任职文号"),
		@Column(name="a0255", attrName="a0255", label="任职状态"),
		@Column(name="a0267", attrName="a0267", label="免职文号"),
		@Column(name="a0288", attrName="a0288", label="任现职务层次时间"),
		@Column(name="a0281", attrName="a0281", label="职务输出标识"),
		@Column(name="ischecked", attrName="ischecked", label="是否选中该记录"),
		@Column(name="ordernum", attrName="ordernum", label="职务排序序号"),
		@Column(name="a0284", attrName="a0284", label="交流标识"),
		@Column(name="a4901", attrName="a4901", label="交流方式"),
		@Column(name="a4904", attrName="a4904", label="交流原因"),
		@Column(name="a4907", attrName="a4907", label="交流去向"),
		@Column(name="a0215b", attrName="a0215b", label="职务名称"),
		@Column(name="a0202", attrName="a0202", label="是否兼任下级领导职务"),
		@Column(name="a0251b", attrName="a0251b", label="是否破格提拔"),
		@Column(name="a0221a", attrName="a0221a", label="职务等级"),
		@Column(name="a0291", attrName="a0291", label="是否公开遴选"),
		@Column(name="a0292", attrName="a0292", label="是否公开选调"),
		@Column(name="a0201a", attrName="a0201a", label="任职机构名称"),
		@Column(name="unid", attrName="unid", label="暂无使用"),
		@Column(name="a0272", attrName="a0272", label="职务变动原因综述"),
		@Column(name="a0279", attrName="a0279", label="主职务"),
		@Column(name="newa0201b", attrName="newa0201b", label="newa0201b"),
	}, orderBy="a.id DESC"
)
public class RsA02 extends DataEntity<RsA02> {
	
	private static final long serialVersionUID = 1L;
	private String sid;		// 父键
	private String sys001;		// 状态
	private Integer sys002;		// 序号
	private String a0201b;		// 任职机构
	private String a0201d;		// 是否领导成员
	private String a0201e;		// 成员类别
	private String a0215a;		// 职务名称
	private String a0222;		// 岗位类别
	private String a0223;		// 职务排序
	private String a0243;		// 任职时间
	private String a02b1;		// 选拔任用方式
	private String a0251;		// 任职变动类别
	private Integer a0225;		// 集体内排序
	private String a0265;		// 免职时间
	private String a0247;		// 选拔任用方式
	private String a0271;		// 免职原因类别
	private String a0221;		// 职务层次
	private String a0504;		// 职级批准日期
	private String a0219;		// 是否领导职务
	private String a02b2;		// 暂无使用
	private String a0229;		// 分管（从事）工作
	private String a0245;		// 任职文号
	private String a0255;		// 任职状态
	private String a0267;		// 免职文号
	private String a0288;		// 任现职务层次时间
	private String a0281;		// 职务输出标识
	private String ischecked;		// 是否选中该记录
	private Integer ordernum;		// 职务排序序号
	private String a0284;		// 交流标识
	private String a4901;		// 交流方式
	private String a4904;		// 交流原因
	private String a4907;		// 交流去向
	private String a0215b;		// 职务名称
	private String a0202;		// 是否兼任下级领导职务
	private String a0251b;		// 是否破格提拔
	private String a0221a;		// 职务等级
	private String a0291;		// 是否公开遴选
	private String a0292;		// 是否公开选调
	private String a0201a;		// 任职机构名称
	private String unid;		// 暂无使用
	private String a0272;		// 职务变动原因综述
	private String a0279;		// 主职务
	private String newa0201b;		// newa0201b
	
	public RsA02() {
		this(null);
	}

	public RsA02(String id){
		super(id);
	}
	
	@Length(min=0, max=182, message="父键长度不能超过 182 个字符")
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}
	
	@Length(min=0, max=2, message="状态长度不能超过 2 个字符")
	public String getSys001() {
		return sys001;
	}

	public void setSys001(String sys001) {
		this.sys001 = sys001;
	}
	
	public Integer getSys002() {
		return sys002;
	}

	public void setSys002(Integer sys002) {
		this.sys002 = sys002;
	}
	
	@Length(min=0, max=200, message="任职机构长度不能超过 200 个字符")
	public String getA0201b() {
		return a0201b;
	}

	public void setA0201b(String a0201b) {
		this.a0201b = a0201b;
	}
	
	@Length(min=0, max=1, message="是否领导成员长度不能超过 1 个字符")
	public String getA0201d() {
		return a0201d;
	}

	public void setA0201d(String a0201d) {
		this.a0201d = a0201d;
	}
	
	@Length(min=0, max=100, message="成员类别长度不能超过 100 个字符")
	public String getA0201e() {
		return a0201e;
	}

	public void setA0201e(String a0201e) {
		this.a0201e = a0201e;
	}
	
	public String getA0215a() {
		return a0215a;
	}

	public void setA0215a(String a0215a) {
		this.a0215a = a0215a;
	}
	
	@Length(min=0, max=20, message="岗位类别长度不能超过 20 个字符")
	public String getA0222() {
		return a0222;
	}

	public void setA0222(String a0222) {
		this.a0222 = a0222;
	}
	
	@Length(min=0, max=8, message="职务排序长度不能超过 8 个字符")
	public String getA0223() {
		return a0223;
	}

	public void setA0223(String a0223) {
		this.a0223 = a0223;
	}
	
	@Length(min=0, max=8, message="任职时间长度不能超过 8 个字符")
	public String getA0243() {
		return a0243;
	}

	public void setA0243(String a0243) {
		this.a0243 = a0243;
	}
	
	@Length(min=0, max=100, message="选拔任用方式长度不能超过 100 个字符")
	public String getA02b1() {
		return a02b1;
	}

	public void setA02b1(String a02b1) {
		this.a02b1 = a02b1;
	}
	
	@Length(min=0, max=50, message="任职变动类别长度不能超过 50 个字符")
	public String getA0251() {
		return a0251;
	}

	public void setA0251(String a0251) {
		this.a0251 = a0251;
	}
	
	public Integer getA0225() {
		return a0225;
	}

	public void setA0225(Integer a0225) {
		this.a0225 = a0225;
	}
	
	@Length(min=0, max=8, message="免职时间长度不能超过 8 个字符")
	public String getA0265() {
		return a0265;
	}

	public void setA0265(String a0265) {
		this.a0265 = a0265;
	}
	
	@Length(min=0, max=100, message="选拔任用方式长度不能超过 100 个字符")
	public String getA0247() {
		return a0247;
	}

	public void setA0247(String a0247) {
		this.a0247 = a0247;
	}
	
	public String getA0271() {
		return a0271;
	}

	public void setA0271(String a0271) {
		this.a0271 = a0271;
	}
	
	@Length(min=0, max=20, message="职务层次长度不能超过 20 个字符")
	public String getA0221() {
		return a0221;
	}

	public void setA0221(String a0221) {
		this.a0221 = a0221;
	}
	
	@Length(min=0, max=8, message="职级批准日期长度不能超过 8 个字符")
	public String getA0504() {
		return a0504;
	}

	public void setA0504(String a0504) {
		this.a0504 = a0504;
	}
	
	@Length(min=0, max=8, message="是否领导职务长度不能超过 8 个字符")
	public String getA0219() {
		return a0219;
	}

	public void setA0219(String a0219) {
		this.a0219 = a0219;
	}
	
	@Length(min=0, max=1, message="暂无使用长度不能超过 1 个字符")
	public String getA02b2() {
		return a02b2;
	}

	public void setA02b2(String a02b2) {
		this.a02b2 = a02b2;
	}
	
	public String getA0229() {
		return a0229;
	}

	public void setA0229(String a0229) {
		this.a0229 = a0229;
	}
	
	public String getA0245() {
		return a0245;
	}

	public void setA0245(String a0245) {
		this.a0245 = a0245;
	}
	
	@Length(min=0, max=100, message="任职状态长度不能超过 100 个字符")
	public String getA0255() {
		return a0255;
	}

	public void setA0255(String a0255) {
		this.a0255 = a0255;
	}
	
	public String getA0267() {
		return a0267;
	}

	public void setA0267(String a0267) {
		this.a0267 = a0267;
	}
	
	@Length(min=0, max=8, message="任现职务层次时间长度不能超过 8 个字符")
	public String getA0288() {
		return a0288;
	}

	public void setA0288(String a0288) {
		this.a0288 = a0288;
	}
	
	@Length(min=0, max=8, message="职务输出标识长度不能超过 8 个字符")
	public String getA0281() {
		return a0281;
	}

	public void setA0281(String a0281) {
		this.a0281 = a0281;
	}
	
	@Length(min=0, max=1, message="是否选中该记录长度不能超过 1 个字符")
	public String getIschecked() {
		return ischecked;
	}

	public void setIschecked(String ischecked) {
		this.ischecked = ischecked;
	}
	
	public Integer getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(Integer ordernum) {
		this.ordernum = ordernum;
	}
	
	@Length(min=0, max=8, message="交流标识长度不能超过 8 个字符")
	public String getA0284() {
		return a0284;
	}

	public void setA0284(String a0284) {
		this.a0284 = a0284;
	}
	
	@Length(min=0, max=50, message="交流方式长度不能超过 50 个字符")
	public String getA4901() {
		return a4901;
	}

	public void setA4901(String a4901) {
		this.a4901 = a4901;
	}
	
	@Length(min=0, max=8, message="交流原因长度不能超过 8 个字符")
	public String getA4904() {
		return a4904;
	}

	public void setA4904(String a4904) {
		this.a4904 = a4904;
	}
	
	@Length(min=0, max=8, message="交流去向长度不能超过 8 个字符")
	public String getA4907() {
		return a4907;
	}

	public void setA4907(String a4907) {
		this.a4907 = a4907;
	}
	
	public String getA0215b() {
		return a0215b;
	}

	public void setA0215b(String a0215b) {
		this.a0215b = a0215b;
	}
	
	@Length(min=0, max=1, message="是否兼任下级领导职务长度不能超过 1 个字符")
	public String getA0202() {
		return a0202;
	}

	public void setA0202(String a0202) {
		this.a0202 = a0202;
	}
	
	@Length(min=0, max=1, message="是否破格提拔长度不能超过 1 个字符")
	public String getA0251b() {
		return a0251b;
	}

	public void setA0251b(String a0251b) {
		this.a0251b = a0251b;
	}
	
	@Length(min=0, max=20, message="职务等级长度不能超过 20 个字符")
	public String getA0221a() {
		return a0221a;
	}

	public void setA0221a(String a0221a) {
		this.a0221a = a0221a;
	}
	
	@Length(min=0, max=2, message="是否公开遴选长度不能超过 2 个字符")
	public String getA0291() {
		return a0291;
	}

	public void setA0291(String a0291) {
		this.a0291 = a0291;
	}
	
	@Length(min=0, max=2, message="是否公开选调长度不能超过 2 个字符")
	public String getA0292() {
		return a0292;
	}

	public void setA0292(String a0292) {
		this.a0292 = a0292;
	}
	
	public String getA0201a() {
		return a0201a;
	}

	public void setA0201a(String a0201a) {
		this.a0201a = a0201a;
	}
	
	@Length(min=0, max=6, message="暂无使用长度不能超过 6 个字符")
	public String getUnid() {
		return unid;
	}

	public void setUnid(String unid) {
		this.unid = unid;
	}
	
	@Length(min=0, max=200, message="职务变动原因综述长度不能超过 200 个字符")
	public String getA0272() {
		return a0272;
	}

	public void setA0272(String a0272) {
		this.a0272 = a0272;
	}
	
	@Length(min=0, max=1, message="主职务长度不能超过 1 个字符")
	public String getA0279() {
		return a0279;
	}

	public void setA0279(String a0279) {
		this.a0279 = a0279;
	}
	
	@Length(min=0, max=200, message="newa0201b长度不能超过 200 个字符")
	public String getNewa0201b() {
		return newa0201b;
	}

	public void setNewa0201b(String newa0201b) {
		this.newa0201b = newa0201b;
	}
	
}