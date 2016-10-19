package cn.com.wito.auth.service.auth.impl;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.wito.auth.constants.ResourceType;
import cn.com.wito.auth.dao.SysResourceDao;
import cn.com.wito.auth.dao.SysUserDao;
import cn.com.wito.auth.dto.SysResourceDto;
import cn.com.wito.auth.po.SysUser;
import cn.com.wito.auth.service.auth.IMenuService;
import cn.com.wito.auth.service.mgr.SysRoleMgrService;

/**
 * 菜单处理
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
@Service("menuService")
public class MenuServiceImpl implements IMenuService {

	@Resource
	private SysUserDao sysUserDao;

	@Resource
	private SysRoleMgrService sysRoleMgrService;

	@Resource
	private SysResourceDao sysResourceDao;

	@Override
	public List<SysResourceDto> listByUser(String userCode) {
		SysUser sysUser = sysUserDao.find(userCode);
		List<SysResourceDto> resources = null;
		if (sysUser != null) {
			String roleCode = sysUser.getRoleCode();
			resources = sysRoleMgrService.findRoleResource(roleCode);
			// 移除不是菜单或者布局的权限信息
			Iterator<SysResourceDto> ite = resources.iterator();
			while (ite.hasNext()) {
				SysResourceDto dto = ite.next();
				if (!(dto.getType() == ResourceType.Accordion || dto.getType() == ResourceType.Menu)) {
					ite.remove();
				}
			}
			// menuDto = new TreeUtils<SysResourceDto, MenuDto>().createTree(
			// MenuDto.class, resources);
		}
		return resources;
	}

	// @Override
	// public MenuDto listByRole(String roleCode) {
	// List<SysResourceDto> roleResources = sysRoleMgrService
	// .findRoleResource(roleCode);
	// List<String> selectedCodes = new ArrayList<String>();
	// if (roleResources != null) {
	// for (SysResourceDto dto : roleResources) {
	// selectedCodes.add(dto.getCode());
	// }
	// }
	// List<SysResource> sysRes = sysResourceDao.find(null);
	// List<SysResourceDto> allResources = SysResourceTransform
	// .poLstToDtoLst(sysRes);
	// MenuDto menuDto = new TreeUtils<SysResourceDto, MenuDto>().createTree(
	// MenuDto.class, allResources, selectedCodes);
	// return menuDto;
	// }
	//
	// @Override
	// public MenuDto listAll() {
	// List<SysResource> sysRes = sysResourceDao.find(null);
	// List<SysResourceDto> allResources = SysResourceTransform
	// .poLstToDtoLst(sysRes);
	// MenuDto menuDto = new TreeUtils<SysResourceDto, MenuDto>().createTree(
	// MenuDto.class, allResources);
	// return menuDto;
	// }
}
