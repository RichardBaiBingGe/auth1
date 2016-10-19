package cn.com.wito.auth.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.dao.IStoreDao;
import cn.com.wito.auth.po.Store;

/**
 * 门店数据访问实现类
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
@Repository("storeDao")
public class StoreDaoImpl extends BaseDao<Store> implements IStoreDao {

	public static final String FIND_ROLE_STORE = "findRoleStore";

	public static final String INSERT_ROLE_STORE = "insertRoleStore";
	public static final String DELETE_ROLE_STORE = "deleteRoleStore";

	@Override
	public List<Store> findRoleStore(String roleCode) {
		return this.getSqlSessionTemplate().selectList(
				this.getSqlId(FIND_ROLE_STORE), roleCode);
	}

	public boolean addRoleStore(String roleCode, String storeCode) {

		Map<String, String> maps = new HashMap<String, String>();
		maps.put("roleCode", roleCode);
		maps.put("storeCode", storeCode);
		int result = this.getSqlSessionTemplate().insert(INSERT_ROLE_STORE,
				maps);
		return result > 0 ? true : false;
	}

	@Override
	public boolean deleteDataRoleResByRoleCode(String roleCode) {
		int result = this.getSqlSessionTemplate().delete(DELETE_ROLE_STORE,
				roleCode);
		return result > 0 ? true : false;
	}
}
