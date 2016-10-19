package cn.com.wito.auth.service.mgr;


import java.util.List;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.AdNodeDto;

public interface AdNodeMgrService {
	
	/**
	 * 增加网点
	 * 
	 * @param 
	 * @return
	 */
	public boolean addAdNode(AdNodeDto adNodeDto);
	
	/**
	 * 修改网点
	 * 
	 * @param 
	 * @return
	 */
	public boolean modifyAdNode(AdNodeDto adNodeDto);
	
	/**
	 * 删除网点
	 * 
	 * @param
	 * @return
	 */
	public boolean deleteAdNode(String nodeId1);
	/**
	 * 显示所有网点
	 * 
	 * @param
	 * @return
	 */
	public List<AdNodeDto> findAllAdNode() ;
	/**
	 * 分页显示网点
	 * 
	 * @param
	 * @return
	 */
	
	public Page<AdNodeDto> findPage(Pageable<AdNodeDto> pageable);
}
