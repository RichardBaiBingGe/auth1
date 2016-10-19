package cn.com.wito.auth.service.mgr;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.AdMachineStorageDto;

public interface AdMachineStorageMgrService {
	
	
	/**
	 * 修改机器布放设置
	 * 
	 * @param 
	 * @return
	 */
	public boolean modifyAdMachineStorage(AdMachineStorageDto adMachineStorageDto);
	
	/**
	 * 分页显示机器布放设置
	 * 
	 * @param
	 * @return
	 */
	
	public Page<AdMachineStorageDto> findPage(Pageable<AdMachineStorageDto> pageable);
	

	/**
	 * 根据code查询下拉框信息信息
	 * 
	 * @param 
	 * @return
	 */
	public AdMachineStorageDto findAdMachineStorage(String storageCode);
}
