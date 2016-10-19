package cn.com.wito.auth.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.dao.SysResourceDao;
import cn.com.wito.auth.exception.DaoException;
import cn.com.wito.auth.po.SysResource;
import cn.com.wito.auth.po.SysRole;

/**
 * 权限的数据访问实现
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
@Repository("sysResourceDao")
public class SysResourceDaoImpl extends BaseDao<SysResource> implements
		SysResourceDao {

	/**
	 * 根据角色code查询实体
	 */
	public static final String FIND_BY_ROLE_CODE = "findByRoleCode";

	public static final String DELETE_BY_RESOURCE_CODE = "deleteResourceRole";
	
	public static final String FIND_BY_USER_CODE = "findByUserCode";
	public static final String GET_RESIYCE_BY_ROLE_CODE = "getResouceByRoleCode";
	
	@Override
	public List<SysResource> findByRoleCode(String roleCode) {
		return this.getSqlSessionTemplate().selectList(
				this.getSqlId(FIND_BY_ROLE_CODE), roleCode);
	}

	@Override
	public boolean deleteResourceRole(String resourceCode) {
		int result = 0;
		try {
			result = this.getSqlSessionTemplate().delete(
					this.getSqlId(DELETE_BY_RESOURCE_CODE), resourceCode);
		} catch (RuntimeException e) {
			throw new DaoException(e.getCause());
		}
		return result > 0 ? true : false;
	}

	@Override
	public List<SysResource> getResouceByRoleCode(HashMap sm) {
		return this.getSqlSessionTemplate().selectList(
				this.getSqlId(GET_RESIYCE_BY_ROLE_CODE), sm);
	}
}
