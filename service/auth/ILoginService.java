package cn.com.wito.auth.service.auth;

import cn.com.wito.auth.dto.LoginInfo;
import cn.com.wito.auth.dto.SysUserDto;
import cn.com.wito.auth.exception.BussinessException;

/**
 * 登录验证接口
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
public interface ILoginService {

	/**
	 * 用户登录调用方法
	 * 
	 * @param loginInfo
	 * @return
	 */
	public SysUserDto login(LoginInfo loginInfo) throws BussinessException;

}
