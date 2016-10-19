package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.constants.UserType;
import cn.com.wito.auth.dto.SysUserDto;
import cn.com.wito.auth.po.SysUser;

public final class SysUserTransform {

	/**
	 * PO对象转DTO
	 * 
	 * @param sysUser
	 * @return
	 */
	public static SysUserDto poToDto(SysUser sysUser) {
		SysUserDto userDto = null;
		if (sysUser != null) {
			userDto = new SysUserDto(sysUser.getCode(), sysUser.getName(),
					sysUser.getLoginName(), sysUser.getPassword(),
					sysUser.getAvatarImg(), sysUser.getMobilePhone(),
					sysUser.getSubjectCode(), sysUser.getSubjectName(),
					sysUser.getRoleCode(), sysUser.getRoleName(),
					EnableFlagType.fromCode(sysUser.getEnableFlag()),
					UserType.fromCode(sysUser.getType()), sysUser.getRemark(),
					sysUser.getCreateBy(), sysUser.getUpdateBy());

		}
		return userDto;
	}

	/**
	 * PO List 转 DTO List
	 * 
	 * @param sysUserLst
	 * @return
	 */
	public static List<SysUserDto> poLstToDtoLst(List<SysUser> sysUserLst) {
		List<SysUserDto> userDtoLst = new ArrayList<SysUserDto>();
		if (sysUserLst != null) {
			SysUserDto sysUserDto = null;
			for (SysUser sysUser : sysUserLst) {
				sysUserDto = poToDto(sysUser);
				userDtoLst.add(sysUserDto);
			}
		}
		return userDtoLst;
	}

	public static SysUser dtoToPo(SysUserDto sysUserDto) {
		SysUser sysUser = null;
		if (sysUserDto != null) {
			UserType userType = sysUserDto.getUserType();
			EnableFlagType enableFlagType = sysUserDto.getEnableFlag();
			sysUser = new SysUser(sysUserDto.getCode(), sysUserDto.getName(),
					sysUserDto.getLoginName(), sysUserDto.getPassword(),
					sysUserDto.getAvatarImg(), sysUserDto.getMobilePhone(),
					sysUserDto.getSubjectCode(), sysUserDto.getSubjectName(),
					sysUserDto.getRoleCode(), sysUserDto.getRoleName(),
					userType == null ? null : userType.getCode(),
					sysUserDto.getRemark(), enableFlagType == null ? null
							: enableFlagType.getCode(),
					sysUserDto.getCreateBy(), sysUserDto.getUpdateBy());
		}
		return sysUser;
	}

	public static List<SysUser> dtoLstToPoLst(List<SysUserDto> userDtoLst) {
		List<SysUser> userLst = new ArrayList<SysUser>();
		if (userDtoLst != null) {
			SysUser sysUser = null;
			for (SysUserDto sysUserDto : userDtoLst) {
				sysUser = dtoToPo(sysUserDto);
				userLst.add(sysUser);
			}
		}
		return userLst;
	}

}
