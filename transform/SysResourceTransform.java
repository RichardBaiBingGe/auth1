package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.constants.ResourceType;
import cn.com.wito.auth.dto.SysResourceDto;
import cn.com.wito.auth.po.SysResource;

public final class SysResourceTransform {

	/**
	 * Dto转PO
	 * 
	 * @param sysResourceDto
	 * @return
	 */
	public static SysResource dtoToPo(SysResourceDto sysResourceDto) {
		SysResource sysResource = null;
		if (sysResourceDto != null) {
			ResourceType resType = sysResourceDto.getType();
			String resTypeCode = resType == null ? null : resType.getCode();
			EnableFlagType enableFlagType = sysResourceDto.getEnableFlag();
			Integer enableFlagCode = enableFlagType == null ? null
					: enableFlagType.getCode();
			sysResource = new SysResource(sysResourceDto.getCode(),
					sysResourceDto.getName(), sysResourceDto.getUrl(),
					sysResourceDto.getPermission(), resTypeCode,
					sysResourceDto.getRemark(), sysResourceDto.getParentCode(),
					sysResourceDto.getParentLevel(), enableFlagCode,
					sysResourceDto.getCreateBy(), sysResourceDto.getOrderBy());
		}
		return sysResource;
	}

	/**
	 * PO对象转换成Dto对象
	 * 
	 * @param sysResource
	 * @return
	 */
	public static SysResourceDto poToDto(SysResource sysResource) {
		SysResourceDto dto = null;
		if (sysResource != null) {
			ResourceType resourceType = ResourceType.fromCode(sysResource
					.getType());
			EnableFlagType enableFlag = EnableFlagType.fromCode(sysResource
					.getEnableFlag());
			dto = new SysResourceDto(sysResource.getCode(),
					sysResource.getName(), sysResource.getUrl(), resourceType,
					enableFlag);
			dto.setLevel(sysResource.getLevel());
			dto.setParentCode(sysResource.getParentCode());
			dto.setRemark(sysResource.getRemark());
			dto.setPermission(sysResource.getPermission());
			dto.setOrderBy(sysResource.getOrderBy());
		}
		return dto;
	}

	/**
	 * PO对象集合转换成Dto对象集合
	 * 
	 * @param sysResourceLst
	 * @return
	 */
	public static List<SysResourceDto> poLstToDtoLst(
			List<SysResource> sysResourceLst) {
		List<SysResourceDto> dtoLst = new ArrayList<SysResourceDto>();
		for (SysResource sysResource : sysResourceLst) {
			SysResourceDto dto = poToDto(sysResource);
			dtoLst.add(dto);
		}
		return dtoLst;
	}

}
