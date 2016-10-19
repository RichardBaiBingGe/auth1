package cn.com.wito.auth.dao;

import java.util.HashMap;
import java.util.List;

import cn.com.wito.auth.po.SysResource;
import cn.com.wito.auth.po.SysRole;

/**
 * 权限数据访问接口
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
public interface SysResourceDao extends IDao<SysResource> {

	/**
	 * 根据角色code查询权限
	 * 
	 * @param roleCode
	 *            角色code
	 * @return
	 */
	List<SysResource> findByRoleCode(String roleCode);

	/**
	 * 根据资源code删除角色-资源表中的关联记录
	 * 
	 * @param resourceCode
	 * @return
	 */
	boolean deleteResourceRole(String resourceCode);
	//页面按钮权限公用方法
	List<SysResource> getResouceByRoleCode(HashMap sm);
}
