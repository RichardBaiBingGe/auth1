package cn.com.wito.auth.service.auth.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.wito.auth.dto.SysResourceDto;
import cn.com.wito.auth.dto.SysUserDto;
import cn.com.wito.auth.service.auth.IUserService;
import cn.com.wito.auth.service.mgr.SysResMgrService;
import cn.com.wito.auth.service.mgr.SysRoleMgrService;
import cn.com.wito.auth.service.mgr.SysUserMgrService;

/**
 * 用户权限相关服务
 * @author wujia<1438019595@qq.com>
 *
 */
@Service("userService")
public class UserService implements IUserService {

	@Resource
	private SysUserMgrService sysUserMgrService;

	@Resource
	private SysRoleMgrService sysRoleMgrService;

	@Resource
	private SysResMgrService sysResMgrService;

	@Override
	public SysUserDto findUser(String userCode) {
		SysUserDto sysUserDto = sysUserMgrService.findUser(userCode);
		return sysUserDto;
	}

	@Override
	public Set<String> findRoles(String userCode) {
		SysUserDto sysUserDto = sysUserMgrService.findUser(userCode);
		Set<String> roleCodes = new HashSet<String>();
		if (sysUserDto != null) {
			String roleCode = sysUserDto.getRoleCode();
			// sysRoleMgrService.findRole(roleCode);
			roleCodes.add(roleCode);
		}
		return roleCodes;
	}

	@Override
	public Set<String> findPermissions(String userCode) {
		SysUserDto sysUserDto = sysUserMgrService.findUser(userCode);
		Set<String> permissions = new HashSet<String>();
		if (sysUserDto != null) {
			String roleCode = sysUserDto.getRoleCode();
			List<SysResourceDto> dtos = sysRoleMgrService
					.findRoleResource(roleCode);
			if (dtos != null) {
				for (SysResourceDto sysResourceDto : dtos) {
					permissions.add(sysResourceDto.getCode());
				}
			}
		}
		return permissions;
	}

}
