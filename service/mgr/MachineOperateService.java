package cn.com.wito.auth.service.mgr;

import java.util.List;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.AisleProductDto;
import cn.com.wito.auth.dto.MachineOrderDto;
import cn.com.wito.auth.dto.VendingMachineProertiesDto;
import cn.com.wito.auth.exception.BussinessException;
import cn.com.wito.auth.po.AisleProduct;

public interface MachineOperateService {

	/*
	 * 查询货道信息列表
	 */
	public List<VendingMachineProertiesDto> findMachineProertiesList(String serNum);
	/*
	 * 货道商品明细
	 */
	public List<AisleProductDto> datagridgoodsDetail(AisleProduct sm);
	/*
	 * 新增货道信息
	 */
	public boolean addmachineoperate(VendingMachineProertiesDto vendingmachineproertiesdto);
	/**
	 * 根据货道code查询货道信息
	 * 
	 * @param roleCode
	 * @return
	 */
	public VendingMachineProertiesDto findMachineoperateByid(String MachineoperateId);
	/**
	 * 修改货道信息
	 * 
	 * @param sysRoleDto
	 * @return
	 */
	public boolean updateMachineoperate(VendingMachineProertiesDto vendingmachineproertiesdto);
	/*
	 * 
	 *删除货道
	 */
	/**
	 * 删除角色信息
	 * 
	 * @param roleCode
	 * @return
	 * @throws BussinessException
	 */
	public boolean deleteMachineoperate(String MachineoperateId) ;
	/*
	 * 根据机器编号查询货道信息list
	 */

	public List<VendingMachineProertiesDto> findMachineProertiesListByCode(String serNum);
	/*
	 * 查询货道商品列表
	 */
	public List<VendingMachineProertiesDto> findMachineProertiesProduct();
/*
 * 
 * 根据商品id查询商品
 */
	public VendingMachineProertiesDto findProductByid(String productId);
	/**
	 * 分页查询销售监控信息
	 */
	public Page<MachineOrderDto> findMachineorder(Pageable<MachineOrderDto> pageable);
	
}
