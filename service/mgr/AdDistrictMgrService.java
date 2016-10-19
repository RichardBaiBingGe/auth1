package cn.com.wito.auth.service.mgr;


import java.util.List;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.AdDistrictDto;


public interface AdDistrictMgrService {
	
	/**
	 * 增加商圈
	 * 
	 * @param 
	 * @return
	 */
	public boolean addAdDistrictMgr(AdDistrictDto adDistrictDto);
	
	/**
	 * 修改商圈
	 * 
	 * @param 
	 * @return
	 */
	public boolean modifyAdDistrict(AdDistrictDto adDistrictDto);
	
	/**
	 * 删除商圈
	 * 
	 * @param
	 * @return
	 */
	public boolean deleteAdDistrict(String id);
	/**
	 * 显示所有商圈
	 * 
	 * @param
	 * @return
	 */
	public List<AdDistrictDto> findAllAdDistrict() ;
	/**
	 * 分页显示商圈
	 * 
	 * @param
	 * @return
	 */
	
	public Page<AdDistrictDto> findPage(Pageable<AdDistrictDto> pageable);
}
