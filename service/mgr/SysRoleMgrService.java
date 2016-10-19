package cn.com.wito.auth.service.mgr;

import java.util.List;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.StoreDto;
import cn.com.wito.auth.dto.SysResourceDto;
import cn.com.wito.auth.dto.SysRoleDto;
import cn.com.wito.auth.dto.VendingMachineDto;
import cn.com.wito.auth.exception.BussinessException;
import cn.com.wito.auth.po.Store;

/**
 * 角色管理
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
public interface SysRoleMgrService {

	/**
	 * 根据角色code查询角色信息
	 * 
	 * @param roleCode
	 * @return
	 */
	public SysRoleDto findRole(String roleCode);
	
	/**
	 * 根据公司code查询角色信息
	 * 
	 * @param subjectCode
	 * @return
	 */
	public List<SysRoleDto> findRoleListBySubject(String subjectCode);

	/**
	 * 模糊查询角色信息
	 * 
	 * @param operatorUserCode
	 *            操作人的code
	 * @return
	 * @throws BussinessException
	 */
	public List<SysRoleDto> findRoleAll(String operatorUserCode)
			throws BussinessException;

	/**
	 * 分页查询
	 * 
	 * @param pageable
	 * @param operatorUserCode
	 *            操作人的code
	 * @return
	 */
	public Page<SysRoleDto> findPage(Pageable<SysRoleDto> pageable,
			String operatorUserCode) throws BussinessException;

	/**
	 * 根据角色code查询角色拥有的权限
	 * 
	 * @param roleCode
	 * @return
	 */
	public List<SysResourceDto> findRoleResource(String roleCode);
	
	
	/**
	 * 增加角色
	 * 
	 * @param sysRoleDto
	 * @return
	 */
	public boolean addRole(SysRoleDto sysRoleDto);

	/**
	 * 修改角色
	 * 
	 * @param sysRoleDto
	 * @return
	 */
	public boolean modifyRole(SysRoleDto sysRoleDto);

	/**
	 * 修改角色权限信息
	 * 
	 * @param roleCode
	 * @param sysResourceCodes
	 * @return
	 * @throws BussinessException
	 */
	public boolean modifyResource(String roleCode, List<String> sysResourceCodes)
			throws BussinessException;

	/**
	 * 删除角色信息
	 * 
	 * @param roleCode
	 * @return
	 * @throws BussinessException
	 */
	public boolean deleteRole(String roleCode) throws BussinessException;
	/**
	 * 查找角色列表
	 * 
	 * @param sysResourceDto
	 * @param operatorUserCode
	 * @return
	 */
	public List<SysRoleDto> getRuleSource();
	public List<SysRoleDto> getRuleSource1(String parentCode);
	//获取门店信息
	public Page<StoreDto> findRoleStore1(Pageable<StoreDto> pageable,String operatorUserCode);
	//查询所有门店信息
	public Page<Store> findStoreAll();
	//获取售货机信息
	public List<VendingMachineDto> findRoleVendingMachine1(String operatorUserCode);
	//查询所有售货机信息
	public List<VendingMachineDto> findVendingMachineAll();
	//根据登录角色查询售货机信息
	public List<VendingMachineDto> findRoleVendingMachine(String operatorUserCode);
//	/**
//	 * 根据角色修改门店和售货机
//	 * 
//	 * @param roleCode
//	 * @return
//	 * @throws BussinessException
//	 */
//	public boolean modifyStoreVendingMachine(String roleCode, List<String> storeCode,
//			List<String> machine_Code);

}
