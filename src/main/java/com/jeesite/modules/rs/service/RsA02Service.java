/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.rs.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.rs.entity.RsA02;
import com.jeesite.modules.rs.dao.RsA02Dao;

/**
 * 职务信息集Service
 * @author qjh
 * @version 2019-03-12
 */
@Service
@Transactional(readOnly=true)
public class RsA02Service extends CrudService<RsA02Dao, RsA02> {
	
	/**
	 * 获取单条数据
	 * @param rsA02
	 * @return
	 */
	@Override
	public RsA02 get(RsA02 rsA02) {
		return super.get(rsA02);
	}
	
	/**
	 * 查询分页数据
	 * @param rsA02 查询条件
	 * @param rsA02.page 分页对象
	 * @return
	 */
	@Override
	public Page<RsA02> findPage(RsA02 rsA02) {
		return super.findPage(rsA02);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param rsA02
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(RsA02 rsA02) {
		super.save(rsA02);
	}
	
	/**
	 * 更新状态
	 * @param rsA02
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(RsA02 rsA02) {
		super.updateStatus(rsA02);
	}
	
	/**
	 * 删除数据
	 * @param rsA02
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(RsA02 rsA02) {
		super.delete(rsA02);
	}
	
}