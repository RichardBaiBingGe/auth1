package cn.com.wito.auth.service.mgr;

import java.util.List;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.SysUserDto;
import cn.com.wito.auth.exception.BussinessException;
import cn.com.wito.auth.po.SysUser;

/**
 * 修改用户基本信息的业务接口
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
public interface SysUserMgrService {

	/**
	 * 检测用户名是否可用
	 * 
	 * @param loginName
	 * @return
	 */
	public boolean test(String loginName);

	/**
	 * 根据字段查询用户信息
	 * 
	 * @param userCode
	 * @return
	 */
	public List<SysUser> find(SysUserDto sysUserDto);

	/**
	 * 根据用户code查询用户信息
	 * 
	 * @param userCode
	 * @return
	 */
	public SysUserDto findUser(String userCode);

	/**
	 * 分页查询用户信息
	 * 
	 * @param pageable
	 * @return
	 * @throws BussinessException
	 */
	public Page<SysUserDto> findPage(Pageable<SysUserDto> pageable,
			String operatorCode) throws BussinessException;

	/**
	 * 增加用户
	 * <P>
	 * 创建人若是全局管理员，创建的均是USER_SYSTEM
	 * <P>
	 * 创建人若是USER_SYSTEM，创建的则是USER_NORMAL
	 * 
	 * @param sysUserDto
	 *            待增加的用户信息
	 * @param createUserCode
	 *            创建人code
	 * @return
	 */
	public boolean addUser(SysUserDto sysUserDto, String createUserCode)
			throws BussinessException;

	/**
	 * 修改用户信息
	 * 
	 * @param sysUserDto
	 * @return
	 */
	public boolean modifyUser(SysUserDto sysUserDto);

	/**
	 * 删除用户
	 * 
	 * @param userCode
	 * @return
	 */
	public boolean deleteUser(String userCode);
}
