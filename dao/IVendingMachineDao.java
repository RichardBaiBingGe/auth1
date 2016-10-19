package cn.com.wito.auth.dao;

import java.util.List;

import cn.com.wito.auth.po.SysRole;
import cn.com.wito.auth.po.VendingMachine;

/**
 * 售货机数据访问接口
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
public interface IVendingMachineDao extends IDao<VendingMachine> {
	
	List<VendingMachine> findRoleVM(String roleCode);
	
	boolean addRoleStore(String roleCode, String storeCode) ;
	
	boolean deleteDataRoleVmByRoleCode(String roleCode) ;
}
