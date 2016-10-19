package cn.com.wito.auth.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.dao.SysRoleDao;
import cn.com.wito.auth.po.SysRole;

/**
 * 系统角色数据访问
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
@Repository("sysRoleDao")
public class SysRoleDaoImpl extends BaseDao<SysRole> implements SysRoleDao {

	/**
	 * 根据用户code查询实体
	 */
	public static final String FIND_BY_USER_CODE = "findByUserCode";

	public static final String FIND_BY_ROLE = "findByRole";

	public static final String DELETE_BY_ROLE_CODE = "deleteResourceRole";

	public static final String ADD_WITH_ROLE_CODE = "addResourceRole";

	public static final String FIND_BY_SUBJECT_CODE = "findBySubjectCode";

	

	@Override
	public List<SysRole> findBySubjectCode(String subjectCode) {
		return this.getSqlSessionTemplate().selectList(
				this.getSqlId(FIND_BY_SUBJECT_CODE), subjectCode);
	}

	@Override
	public List<SysRole> findByUserCode(String userCode) {
		return this.getSqlSessionTemplate().selectList(
				this.getSqlId(FIND_BY_USER_CODE), userCode);
	}

	@Override
	public boolean deleteRoleResource(String roleCode) {
		int count = this.getSqlSessionTemplate().delete(
				this.getSqlId(DELETE_BY_ROLE_CODE), roleCode);
		return count > 0 ? true : false;
	}

	@Override
	public boolean addRoleResouce(String roleCode, String resourceCode) {
		Map<String, String> maps = new HashMap<String, String>();
		maps.put("roleCode", roleCode);
		maps.put("resourceCode", resourceCode);
		int result = this.getSqlSessionTemplate().insert(
				this.getSqlId(ADD_WITH_ROLE_CODE), maps);
		return result > 0 ? true : false;
	}

}
