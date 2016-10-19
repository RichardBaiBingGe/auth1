package cn.com.wito.auth.service.mgr.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.constants.UserType;
import cn.com.wito.auth.dao.SysUserDao;
import cn.com.wito.auth.dto.SysUserDto;
import cn.com.wito.auth.exception.BussinessException;
import cn.com.wito.auth.po.SysUser;
import cn.com.wito.auth.security.PasswordSecurity;
import cn.com.wito.auth.service.gencode.CodeConstructor;
import cn.com.wito.auth.service.gencode.PasswordGen;
import cn.com.wito.auth.service.mgr.SysUserMgrService;
import cn.com.wito.auth.transform.SysUserTransform;

/**
 * 用户管理的
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
@Service("sysUserMgrService")
public class SysUserMgrServiceImpl implements SysUserMgrService {

	@Resource
	private SysUserDao sysUserDao;

	@Override
	public SysUserDto findUser(String userCode) {
		SysUser sysUser = sysUserDao.find(userCode);
		SysUserDto userDto = SysUserTransform.poToDto(sysUser);
		return userDto;
	}

	/**
	 * 
	 */
	@Override
	public Page<SysUserDto> findPage(Pageable<SysUserDto> pageable,
			String operatorCode) throws BussinessException {
		SysUser operatorUser = sysUserDao.find(operatorCode);
		if (operatorUser == null || operatorUser.getCode() == null) {
			throw new BussinessException("非法操作");
		}
		Integer type = operatorUser.getType();
		UserType userType = UserType.fromCode(type);
		Page<SysUserDto> pages = null;
		if (userType == UserType.SYSTEM) {
			// 系统管理员，全局权限
			pages = findPage(pageable);
		} else {
			// 用户，只能操作该subject下的用户
			String subjectCode = operatorUser.getSubjectCode();
			if (pageable.getEntity() == null) {
				SysUserDto sysUserDto = new SysUserDto();
				pageable.setEntity(sysUserDto);
			}
			pageable.getEntity().setSubjectCode(subjectCode);
			pages = findPage(pageable);
		}
		// else if (userType == UserType.USER) {
		// // 用户，只能操作该subject下的用户
		// String subjectCode = operatorUser.getSubjectCode();
		// pageable.getEntity().setSubjectCode(subjectCode);
		// pages = findPage(pageable);
		// }
		return pages;
	}

	/**
	 * 分页查询
	 * 
	 * @param pageable
	 * @return
	 */
	private Page<SysUserDto> findPage(Pageable<SysUserDto> pageable) {
		Pageable<SysUser> sysUserpageable = null;
		if (pageable != null) {
			sysUserpageable = new Pageable<SysUser>(pageable.getPageNumber(),
					pageable.getPageSize());
			SysUser sysUser = SysUserTransform.dtoToPo(pageable.getEntity());
			sysUserpageable.setOrderDirection(pageable.getOrderDirection());
			sysUserpageable.setOrderProperty(pageable.getOrderProperty());
			sysUserpageable.setSearchProperty(pageable.getSearchProperty());
			sysUserpageable.setSearchValue(pageable.getSearchValue());
			sysUserpageable.setEntity(sysUser);
		}
		Page<SysUser> sysUserPages = sysUserDao.findPage(sysUserpageable);
		Page<SysUserDto> pages = null;
		if (sysUserPages != null) {
			List<SysUser> sysUserLst = sysUserPages.getContent();
			List<SysUserDto> sysUserDtoLst = SysUserTransform
					.poLstToDtoLst(sysUserLst);
			pages = new Page<SysUserDto>(sysUserDtoLst,
					sysUserPages.getTotal(), pageable);
		}
		return pages;
	}

	@Override
	public boolean test(String loginName) {
		SysUser sysUser = new SysUser();
		sysUser.setLoginName(loginName);
		List<SysUser> userLst = sysUserDao.find(sysUser);
		boolean result = true;
		if (userLst == null || userLst.isEmpty()) {
			result = false;
		}
		return result;
	}

	@Override
	public boolean addUser(SysUserDto sysUserDto, String createUserCode)
			throws BussinessException {
		// 检查用户名是否被占用
		if (test(sysUserDto.getLoginName())) {
			throw new BussinessException("登录名称已经被占用.");
		}
		SysUser sysUser = SysUserTransform.dtoToPo(sysUserDto);
		sysUser.setCode(CodeConstructor.getUserCode());
		String password = sysUserDto.getPassword();
		if (StringUtils.isEmpty(password)) {
			password = PasswordGen.getCode();
		}
		password = PasswordSecurity.encode(password);
		sysUser.setPassword(password);
		SysUser createUser = sysUserDao.find(createUserCode);
		if (createUser.getType() == UserType.SYSTEM.getCode()) {
			sysUser.setType(UserType.USER_SYSTEM.getCode());
		} else {
			sysUser.setType(UserType.USER_NORMAL.getCode());
		}
		return sysUserDao.add(sysUser);
	}

	@Override
	public boolean modifyUser(SysUserDto sysUserDto) {
		SysUser sysUser = SysUserTransform.dtoToPo(sysUserDto);
		return sysUserDao.update(sysUser);
	}

	@Override
	public boolean deleteUser(String userCode) {
		return sysUserDao.delete(userCode);
	}

	@Override
	public List<SysUser> find(SysUserDto sysUserDto) {
		SysUser sysUser = SysUserTransform.dtoToPo(sysUserDto);
		return sysUserDao.find(sysUser);
	}

}
