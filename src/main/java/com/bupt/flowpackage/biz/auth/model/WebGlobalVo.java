package com.bupt.flowpackage.biz.auth.model;

import java.util.List;

import com.bupt.flowpackage.common.domain.BaseBean;
import com.bupt.flowpackage.common.domain.SessionVo;
import com.bupt.flowpackage.mybatis.account.application.model.Application;
import com.bupt.flowpackage.mybatis.account.menu.model.Menu;

/**
 * @Description: 用户登录成功，进入主页返回的信息，包括菜单列表，用户权限组信息等全局信息
 * @author wangdaojian
 * @company 摩尔科技有限公司版权所有
 * @date 2017年6月20日 下午2:10:33
 */
public class WebGlobalVo extends BaseBean {

	private static final long serialVersionUID = 1L;
	/** 管理员角色信息 */
	private SessionVo adminInfo;
	/**模块列表*/
	private List<Application> applicationList;
	/** 菜单列表 */
	private List<Menu> menuList;
	/**当前url*/
	private String currentUrl;
	/**当前一级菜单url*/
	private String currentParentUrl;

	public String getCurrentParentUrl() {
		return currentParentUrl;
	}
	public void setCurrentParentUrl(String currentParentUrl) {
		this.currentParentUrl = currentParentUrl;
	}
	public String getCurrentUrl() {
		return currentUrl;
	}
	public void setCurrentUrl(String currentUrl) {
		this.currentUrl = currentUrl;
	}
	public List<Menu> getMenuList() {
		return menuList;
	}
	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}
	public SessionVo getAdminInfo() {
		return adminInfo;
	}
	public void setAdminInfo(SessionVo adminInfo) {
		this.adminInfo = adminInfo;
	}
	public List<Application> getApplicationList() {
		return applicationList;
	}
	public void setApplicationList(List<Application> applicationList) {
		this.applicationList = applicationList;
	}
}
