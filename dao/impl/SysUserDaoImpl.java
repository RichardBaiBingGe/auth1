package cn.com.wito.auth.dao.impl;

/**
 * 系统用户数据访问
 * @author wy<895791598@qq.com>
 */
import org.springframework.stereotype.Repository;

import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.dao.SysUserDao;
import cn.com.wito.auth.po.SysUser;

@Repository("sysUserDao")
public class SysUserDaoImpl extends BaseDao<SysUser> implements SysUserDao {
	
	/**
	 * 查询用户拥有某个角色的用户数的SQLID
	 */
	private static final String ROLE_COUNT = "roleCount";

	@Override
	public int isRoleCount(String roleCode) {
		int count = this.getSqlSessionTemplate().selectOne(
				this.getSqlId(ROLE_COUNT), roleCode);
		return count;
	}
}
