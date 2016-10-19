package cn.com.wito.auth.service.auth;

import java.util.List;

import cn.com.wito.auth.dto.SysResourceDto;

/**
 * 菜单生成业务
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
public interface IMenuService {

	/**
	 * 根据用户code生成相应的菜单
	 * 
	 * @param userCode
	 * @return
	 */
	public List<SysResourceDto> listByUser(String userCode);
	
	// /**
	// * 根据角色生成相应的权限菜单树
	// *
	// * @param roleCode
	// * @return
	// */
	// public MenuDto listByRole(String roleCode);
	//
	// /**
	// * 所有的权限菜单树
	// *
	// * @return
	// */
	// public MenuDto listAll();
}
