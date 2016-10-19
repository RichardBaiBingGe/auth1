package cn.com.wito.auth.service.mgr;

import java.util.List;

import cn.com.wito.auth.dto.SysResourceDto;
import cn.com.wito.auth.exception.BussinessException;

/**
 * 权限管理
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
public interface SysResMgrService {

	/**
	 * 根据权限code查询权限
	 * 
	 * @param code
	 * @return
	 */
	public SysResourceDto findResource(String code);

	/**
	 * 查询所有权限
	 * 
	 * @param sysResourceDto
	 * @param operatorUserCode
	 * @return
	 */
	public List<SysResourceDto> findResourcesAll();

	/**
	 * 查询与主体管理员绑定的所有权限
	 * 
	 * @param subjectCode
	 * @return
	 */
	public List<SysResourceDto> findResWithSubjectAdminUser(
			String operatorUserCode);

	/**
	 * 查询操作员所拥有的角色
	 * 
	 * @param operatorUserCode
	 * @return
	 */
	public List<SysResourceDto> findResources(String operatorUserCode)
			throws BussinessException;

	/**
	 * 根据权限父级code查询子集
	 * 
	 * @param parentCode
	 * @return
	 */
	public List<SysResourceDto> findResourceByParentCode(String parentCode);

	/**
	 * 增加权限
	 * 
	 * @param sysResourceDto
	 * @return
	 */
	public boolean addResource(SysResourceDto sysResourceDto);

	/**
	 * 修改权限
	 * 
	 * @param sysResourceDto
	 * @return
	 */
	public boolean modifyResource(SysResourceDto sysResourceDto);

	/**
	 * 删除权限
	 * 
	 * @param resourceCode
	 * @return
	 */
	public boolean deleteResource(String resourceCode);
}
