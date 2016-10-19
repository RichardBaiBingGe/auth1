package cn.com.wito.auth.service.mgr;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.AdSysPlanDto;

/**
 * 系统计划管理
 * 
 * @author wy<895791598@qq.com>
 * 
 */
public interface AdSysPlanMgrService {
	/**
	 * 根据计划code查询权限
	 * 
	 * @param code
	 * @return
	 */
	public AdSysPlanDto findAdSysPlan(String code);
	
	/**
	 * 根据分页查询子集
	 * 
	 * @param parentCode
	 * @return
	 */
	public Page<AdSysPlanDto> findPage(Pageable<AdSysPlanDto> pageable) ;
	
	/**
	 * 增加计划
	 * 
	 * @param adSysPlanDto
	 * @return
	 */
	public boolean addAdSysPlan(AdSysPlanDto adSysPlanDto);
	
	/**
	 * 修改计划
	 * 
	 * @param adSysPlanDto
	 * @return
	 */
	public boolean modifyAdSysPlan(AdSysPlanDto adSysPlanDto);
	
	/**
	 * 删除计划
	 * 
	 * @param SysPlanCode
	 * @return
	 */
	public boolean deleteAdSysPlan(String SysPlanCode);
}
