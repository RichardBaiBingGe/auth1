package cn.com.wito.auth.service.auth.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.dao.SysUserDao;
import cn.com.wito.auth.dto.LoginInfo;
import cn.com.wito.auth.dto.SysUserDto;
import cn.com.wito.auth.exception.BussinessException;
import cn.com.wito.auth.po.SysUser;
import cn.com.wito.auth.security.PasswordSecurity;
import cn.com.wito.auth.service.auth.ILoginService;

/**
 * 登录处理
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
@Service("loginService")
public class LoginServiceImpl implements ILoginService {

	@Resource
	private SysUserDao sysUserDao;

	@Override
	public SysUserDto login(LoginInfo loginInfo) throws BussinessException {
		SysUserDto sysUserDto = null;
		if (loginInfo == null) {
			throw new BussinessException("登录信息不能为空");
		}
		String loginName = loginInfo.getLoginName();
		String password = loginInfo.getPassword();
		if (loginName == null || password == null) {
			throw new BussinessException("用户名或者密码不能为空！");
		}
		password = PasswordSecurity.encode(password);
		SysUser sysUser = new SysUser();
		sysUser.setLoginName(loginName);
		sysUser.setPassword(password);
		// sysUser.setEnableFlag(EnableFlagType.Enable.getCode());// 用户必须是启用状态
		List<SysUser> sysUserLst = sysUserDao.find(sysUser);
		if (sysUserLst == null || sysUserLst.isEmpty()) {
			// 验证失败
			// loginUserDto.setSuccess(false);
			// loginUserDto.setMessage("用户名或者密码错误.");
			throw new BussinessException("用户名或者密码错误.");
		} else {
			sysUser = sysUserLst.get(0);
			if (sysUser.getEnableFlag() == EnableFlagType.NotEnable.getCode()) {
				// loginUserDto.setSuccess(false);
				// loginUserDto.setMessage("账号被禁用.");
				throw new BussinessException("账号被禁用.");
			} else {
				sysUserDto = new SysUserDto(sysUser.getCode(),
						sysUser.getName(), sysUser.getLoginName(),
						loginInfo.getPassword(), sysUser.getAvatarImg(),
						sysUser.getMobilePhone(), null,
						sysUser.getSubjectName(), null, sysUser.getRoleName(),
						null, null, null, null, null);
			}
		}
		return sysUserDto;
	}

}
