package cn.com.wito.auth.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.dao.IVendingMachineDao;
import cn.com.wito.auth.po.SysRole;
import cn.com.wito.auth.po.VendingMachine;

/**
 * 售货机机器管理的数据访问接口
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
@Repository("vendingMachineDao")
public class VendingMachineDaoImpl extends BaseDao<VendingMachine> implements
		IVendingMachineDao {
	public static final String FIND_ROLE_VM = "findRoleVM";

	public static final String INSERT_ROLE_VM = "insertRoleVM";
	
	public static final String DELETE_ROLE_VM = "deleteRoleVM";
	@Override
	public List<VendingMachine> findRoleVM(String roleCode) {
		return this.getSqlSessionTemplate().selectList(
				this.getSqlId(FIND_ROLE_VM), roleCode);
	}
	
	public boolean addRoleStore(String roleCode, String machineCode) {

		Map<String, String> maps = new HashMap<String, String>();
		maps.put("roleCode", roleCode);
		maps.put("machineCode", machineCode);
		int result = this.getSqlSessionTemplate().insert(INSERT_ROLE_VM,
				maps);
		return result > 0 ? true : false;
	}
	
	public boolean deleteDataRoleVmByRoleCode(String roleCode) {
		int result = this.getSqlSessionTemplate().delete(DELETE_ROLE_VM,
				roleCode);
		return result > 0 ? true : false;
	}
	// List<VendingMachine> findBySubjectCode() {
	// return null;
	// }

}
