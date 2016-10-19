package cn.com.wito.auth.service.auth;

import java.util.Set;

import cn.com.wito.auth.dto.SysUserDto;

public interface IUserService {

	public SysUserDto findUser(String userCode);

	public Set<String> findRoles(String userCode);

	public Set<String> findPermissions(String userCode);
	
}
