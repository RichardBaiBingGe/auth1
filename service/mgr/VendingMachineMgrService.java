package cn.com.wito.auth.service.mgr;

import java.util.List;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.StoreDto;
import cn.com.wito.auth.dto.SysRoleDto;
import cn.com.wito.auth.dto.VendingMachineDto;
import cn.com.wito.auth.exception.BussinessException;

/**
 * 售货机管理业务接口
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
public interface VendingMachineMgrService {

	/**
	 * 判断某个机器编码是否存在
	 * 
	 * @param code
	 * @param machineNo
	 * @return
	 */
	public boolean existMachineNo(String code, String machineNo);

	/**
	 * 分页查询
	 * 
	 * @param pageable
	 * @return
	 */
	public Page<VendingMachineDto> findPage(Pageable<VendingMachineDto> pageable);

	/**
	 * 根据code查询单个售货机
	 * 
	 * @param code
	 * @return
	 */
	public VendingMachineDto find(String code);

	/**
	 * 增加售货机
	 * 
	 * @param vendingMachineDto
	 * @return
	 */
	public boolean add(VendingMachineDto vendingMachineDto)
			throws BussinessException;

	/**
	 * 修改售货机
	 * 
	 * @param vendingMachineDto
	 * @return
	 */
	public boolean modify(VendingMachineDto vendingMachineDto)
			throws BussinessException;

	/**
	 * 删除售货机
	 * 
	 * @param code
	 * @return
	 */
	public boolean delete(String code);
	
	/**
	 * 根据用户code查询主体
	 * 
	 * @param userCode
	 * @return
	 */
	public List<VendingMachineDto> findVendingMachineByUserCode(String userCode);
	
	/**
	 * 查询角色下的售货机信息
	 * @param roleCode
	 * @return
	 */
	public List<VendingMachineDto> findRoleVendingMachine(String roleCode);
	
	public boolean addRoleVM(String roleCode,List<String> machineCode) throws BussinessException;
	//机器监控状态
	/**
	 * 分页查询
	 * 
	 * @param pageable
	 * @return
	 * @throws Exception 
	 */
	public Page<VendingMachineDto> findPage1(Pageable<VendingMachineDto> pageable) throws Exception;
}
