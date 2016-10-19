package cn.com.wito.auth.service.mgr.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wito.auth.constants.UserType;
import cn.com.wito.auth.dao.SysResourceDao;
import cn.com.wito.auth.dao.SysSubjectDao;
import cn.com.wito.auth.dao.SysUserDao;
import cn.com.wito.auth.dto.SysResourceDto;
import cn.com.wito.auth.exception.BussinessException;
import cn.com.wito.auth.exception.DaoException;
import cn.com.wito.auth.po.SysResource;
import cn.com.wito.auth.po.SysUser;
import cn.com.wito.auth.service.gencode.CodeConstructor;
import cn.com.wito.auth.service.mgr.SysResMgrService;
import cn.com.wito.auth.service.mgr.SysRoleMgrService;
import cn.com.wito.auth.transform.SysResourceTransform;

/**
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
@Service("sysResMgrService")
public class SysResMgrServiceImpl implements SysResMgrService {

	@Resource
	private SysResourceDao sysResourceDao;

	@Resource
	private SysUserDao sysUserDao;

	@Resource
	private SysSubjectDao sysSubjectDao;

	@Resource
	private SysRoleMgrService sysRoleMgrService;

	@Override
	public SysResourceDto findResource(String code) {
		SysResource sysRes = sysResourceDao.find(code);
		SysResourceDto dto = SysResourceTransform.poToDto(sysRes);
		return dto;
	}

	@Override
	public List<SysResourceDto> findResourcesAll() {
		List<SysResource> resources = sysResourceDao.find(null);
		List<SysResourceDto> resourceDtos = SysResourceTransform
				.poLstToDtoLst(resources);
		return resourceDtos;
	}

	@Override
	public List<SysResourceDto> findResources(String operatorUserCode)
			throws BussinessException {
		SysUser operatorUser = sysUserDao.find(operatorUserCode);
		if (operatorUser == null || operatorUser.getCode() == null) {
			throw new BussinessException("非法操作");
		}
		String roleCode = operatorUser.getRoleCode();
		List<SysResourceDto> sysResourceDtos = sysRoleMgrService
				.findRoleResource(roleCode);
		return sysResourceDtos;
	}

	@Override
	public List<SysResourceDto> findResourceByParentCode(String parentCode) {
		SysResource sysResource = new SysResource();
		sysResource.setParentCode(parentCode);
		List<SysResource> sysResourceLst = sysResourceDao.find(sysResource);
		List<SysResourceDto> dtoLst = SysResourceTransform
				.poLstToDtoLst(sysResourceLst);
		return dtoLst;
	}

	@Override
	public boolean addResource(SysResourceDto sysResourceDto) {
		SysResource sysResource = SysResourceTransform.dtoToPo(sysResourceDto);
		if (sysResource != null) {
			sysResource.setCode(CodeConstructor.getResourceCode());
		}
		return sysResourceDao.add(sysResource);
	}

	@Override
	public boolean modifyResource(SysResourceDto sysResourceDto) {
		SysResource sysResource = SysResourceTransform.dtoToPo(sysResourceDto);
		return sysResourceDao.update(sysResource);
	}

	/**
	 * 删除权限
	 * <P>
	 * 删除角色拥有的该权限关联关系
	 * 
	 */
	@Transactional(rollbackFor = DaoException.class)
	@Override
	public boolean deleteResource(String resourceCode) {
		boolean deleteRes = sysResourceDao.delete(resourceCode);
		if (deleteRes) {
			sysResourceDao.deleteResourceRole(resourceCode);
		}
		return deleteRes;
	}

//	@Override
//	public List<SysResourceDto> findResWithSubjectAdminUser(
//			String operatorUserCode) {
//		SysUser operatorUser = sysUserDao.find(operatorUserCode);
//		String subjectCode = operatorUser.getSubjectCode();
//		SysSubject sysSubject = sysSubjectDao.find(subjectCode);
//		SysUser sysUser = new SysUser();
//		sysUser.setSubjectCode(sysSubject.getCode());
//		List<SysUser> sysUserLst = sysUserDao.find(sysUser);
//		List<SysResourceDto> resDtoLst = null;
//		for (SysUser user : sysUserLst) {
//			if (user.getType() == UserType.SYSTEM.getCode()) {
//				resDtoLst = findResourcesAll();
//				break;
//			} else if (user.getType() == UserType.USER_SYSTEM.getCode()) {
//				// 属于系统管理员
//				String roleCode = user.getRoleCode();
//				resDtoLst = sysRoleMgrService.findRoleResource(roleCode);
//				break;
//			}
//		}
//		return resDtoLst;
//	}
//根据用户id获取用户权列表
	@Override
	public List<SysResourceDto> findResWithSubjectAdminUser(
			String operatorUserCode) {
		SysUser operatorUser = sysUserDao.find(operatorUserCode);
		List<SysResourceDto> resDtoLst = null;
			if (operatorUser.getType() == UserType.SYSTEM.getCode()) {
				resDtoLst = findResourcesAll();
			} else if (operatorUser.getType() == UserType.USER_SYSTEM.getCode()) {
				// 属于系统管理员
				String roleCode = operatorUser.getRoleCode();
				resDtoLst = sysRoleMgrService.findRoleResource(roleCode);
			}
		return resDtoLst;
	}
}
