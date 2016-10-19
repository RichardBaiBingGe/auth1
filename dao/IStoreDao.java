package cn.com.wito.auth.dao;

import java.util.List;

import cn.com.wito.auth.po.Store;

/**
 * 门店数据访问接口
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
public interface IStoreDao extends IDao<Store> {

	List<Store> findRoleStore(String roleCode);

	boolean addRoleStore(String roleCode, String storeCode);
	
	boolean deleteDataRoleResByRoleCode(String roleCode);
}
