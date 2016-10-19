package cn.com.wito.auth.service.mgr;

import java.util.List;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.AdResourceDto;
import cn.com.wito.auth.exception.BussinessException;

/**
 * 广告资源管理
 * 
 * @author wy<895791598@qq.com>
 * @author wujia<1438019595@qq.com>
 */
public interface AdResourceMgrService {
	/**
	 * 根据系统资源code查询权限
	 * 
	 * @param code
	 * @return
	 */
	public AdResourceDto findAdResource(String code);

	/**
	 * 根据分页查询子集
	 * 
	 * @param pageable
	 * @param operatorUserCode
	 * @return
	 */
	public Page<AdResourceDto> findPage(Pageable<AdResourceDto> pageable,String operatorUserCode) throws BussinessException;
	
//	public Page<AdResourceDto> findPage(Pageable<AdResourceDto> pageable);

	/**
	 * 增加广告资源
	 * 
	 * @param adResourceDto
	 * @param operatorUserCode
	 * @author 伍佳
	 * @return
	 */
	public boolean addAdResource(AdResourceDto adResourceDto,
			String operatorUserCode) throws BussinessException;

	/**
	 * 修改广告资源
	 * 
	 * @param adResourceDto
	 * @param operatorUserCode
	 * @author 伍佳
	 * @return
	 */
	public boolean modifyAdResource(AdResourceDto adResourceDto,
			String operatorUserCode) throws BussinessException;

	/**
	 * 删除广告资源
	 * 
	 * @param ResourceCode
	 * @return
	 */
	public boolean deleteAdResource(String ResourceCode);
	
	public List<AdResourceDto> findAllAdResource(String operatorUserCode)throws BussinessException ;
	
	/**
	 * 发布广告
	 * @param adCode
	 * @param SerNumList
	 * @return
	 */
	public boolean releaseAdResource(String adCode,List<String> SerNumList);
	/**
	 * 查找
	 * @param adCode
	 * @return
	 */
	public List<String> findAdMachine(String adCode);
	/**
	 * 发布给所有机器
	 * @param adCode
	 * @return
	 */
	public boolean releaseAllMachine(String adCode,String userCode);
}
