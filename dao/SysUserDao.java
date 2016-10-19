package cn.com.wito.auth.dao;

import cn.com.wito.auth.po.SysUser;

/**
 * 用户数据访问接口
 * 
 * @author wy<895791598@qq.com>
 * 
 */
public interface SysUserDao extends IDao<SysUser> {

	/**
	 * 查询用户中是某个角色的用户数
	 * 
	 * @param roleCode
	 * @return
	 */
	int isRoleCount(String roleCode);
}
