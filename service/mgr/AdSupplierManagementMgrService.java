package cn.com.wito.auth.service.mgr;


import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.AdSupplierManagementDto;

public interface AdSupplierManagementMgrService {
	
	/**
	 * 增加供应商
	 * 
	 * @param 
	 * @return
	 */
	public boolean addAdSupplierManagement(AdSupplierManagementDto adSupplierManagementDto);
	
	/**
	 * 修改供应商
	 * 
	 * @param 
	 * @return
	 */
	public boolean modifyAdSupplierManagement(AdSupplierManagementDto adSupplierManagementDto);
	
	/**
	 * 删除供应商
	 * 
	 * @param
	 * @return
	 */
	public boolean deleteAdSupplierManagement(String adSupplierManagementCode);
	
	/**
	 * 分页显示供应商
	 * 
	 * @param
	 * @return
	 */
	
	public Page<AdSupplierManagementDto> findPage(Pageable<AdSupplierManagementDto> pageable);
}
