/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.rs.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.rs.entity.RsA02;
import com.jeesite.modules.rs.service.RsA02Service;

/**
 * 职务信息集Controller
 * @author qjh
 * @version 2019-03-12
 */
@Controller
@RequestMapping(value = "${adminPath}/rs/rsA02")
public class RsA02Controller extends BaseController {

	@Autowired
	private RsA02Service rsA02Service;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public RsA02 get(String id, boolean isNewRecord) {
		return rsA02Service.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("rs:rsA02:view")
	@RequestMapping(value = {"list", ""})
	public String list(RsA02 rsA02, Model model) {
		model.addAttribute("rsA02", rsA02);
		return "modules/rs/rsA02List";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("rs:rsA02:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<RsA02> listData(RsA02 rsA02, HttpServletRequest request, HttpServletResponse response) {
		rsA02.setPage(new Page<>(request, response));
		Page<RsA02> page = rsA02Service.findPage(rsA02);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("rs:rsA02:view")
	@RequestMapping(value = "form")
	public String form(RsA02 rsA02, Model model) {
		model.addAttribute("rsA02", rsA02);
		return "modules/rs/rsA02Form";
	}

	/**
	 * 保存职务信息集
	 */
	@RequiresPermissions("rs:rsA02:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated RsA02 rsA02) {
		rsA02Service.save(rsA02);
		return renderResult(Global.TRUE, text("保存职务信息集成功！"));
	}
	
	/**
	 * 停用职务信息集
	 */
	@RequiresPermissions("rs:rsA02:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(RsA02 rsA02) {
		rsA02.setStatus(RsA02.STATUS_DISABLE);
		rsA02Service.updateStatus(rsA02);
		return renderResult(Global.TRUE, text("停用职务信息集成功"));
	}
	
	/**
	 * 启用职务信息集
	 */
	@RequiresPermissions("rs:rsA02:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(RsA02 rsA02) {
		rsA02.setStatus(RsA02.STATUS_NORMAL);
		rsA02Service.updateStatus(rsA02);
		return renderResult(Global.TRUE, text("启用职务信息集成功"));
	}
	
	/**
	 * 删除职务信息集
	 */
	@RequiresPermissions("rs:rsA02:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(RsA02 rsA02) {
		rsA02Service.delete(rsA02);
		return renderResult(Global.TRUE, text("删除职务信息集成功！"));
	}
	
}