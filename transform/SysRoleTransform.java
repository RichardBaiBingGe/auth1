package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.dto.SysRoleDto;
import cn.com.wito.auth.po.SysRole;

public final class SysRoleTransform {

	/**
	 * PO对象转DTO对象
	 * 
	 * @param sysRole
	 * @return
	 */
	public static SysRoleDto poToDto(SysRole sysRole) {
		SysRoleDto sysRoleDto = null;
		if (sysRole != null) {
			Integer flag = sysRole.getEnableFlag();
			EnableFlagType type = flag == null ? null : EnableFlagType
					.fromCode(flag);
			sysRoleDto = new SysRoleDto(sysRole.getCode(), sysRole.getName(),
					sysRole.getRemark(), sysRole.getCreateBy(),
					sysRole.getUpdateBy(), type, sysRole.getSubjectCode(),
					sysRole.getSubjectName(),sysRole.getParentCode());
			sysRoleDto.setSubjectCode(sysRole.getSubjectCode());
		}
		return sysRoleDto;
	}

	/**
	 * DTO转PO
	 * 
	 * @param sysRoleDto
	 * @return
	 */
	public static SysRole dtoToPo(SysRoleDto sysRoleDto) {
		SysRole sysRole = null;
		if (sysRoleDto != null) {
			EnableFlagType type = sysRoleDto.getEnableFlag();
			sysRole = new SysRole(sysRoleDto.getCode(), sysRoleDto.getName(),
					sysRoleDto.getRemark(), type == null ? null
							: type.getCode(), sysRoleDto.getCreateBy(),
					sysRoleDto.getUpdateBy(), sysRoleDto.getSubjectCode(),
					sysRoleDto.getSubjectName(),sysRoleDto.getParentCode());
			sysRole.setSubjectCode(sysRoleDto.getSubjectCode());
		}
		return sysRole;
	}

	/**
	 * PO对象集合转DTO对象集合
	 * 
	 * @param sysRoleLst
	 * @return
	 */
	public static List<SysRoleDto> poLstToDtoLst(List<SysRole> sysRoleLst) {
		List<SysRoleDto> dtoLst = new ArrayList<SysRoleDto>();
		if (sysRoleLst != null) {
			for (SysRole sysRole : sysRoleLst) {
				SysRoleDto sysRoleDto = poToDto(sysRole);
				dtoLst.add(sysRoleDto);
			}
		}
		return dtoLst;
	}
}
