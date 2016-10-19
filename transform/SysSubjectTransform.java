package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.dto.SysSubjectDto;
import cn.com.wito.auth.po.SysSubject;

public final class SysSubjectTransform {
	/**
	 * Dto转PO
	 * 
	 * @param sysSubjectDto
	 * @return
	 */
	public static SysSubject dtoToPo(SysSubjectDto sysSubjectDto) {
		EnableFlagType enable = sysSubjectDto.getEnableFlag();
		Integer enableFlag = enable == null ? null : enable.getCode();
		SysSubject sysSubject = new SysSubject(sysSubjectDto.getCode(),
				sysSubjectDto.getName(), sysSubjectDto.getAddress(),
				sysSubjectDto.getLinkmanName(), sysSubjectDto.getLinkmanTel(),
				sysSubjectDto.getLinkmanQq(), sysSubjectDto.getBusiness(),
				sysSubjectDto.getRemark(),enableFlag,
				sysSubjectDto.getCreateBy(), sysSubjectDto.getCreateDate(),
				sysSubjectDto.getUpdateBy(), sysSubjectDto.getUpdateDate());
		return sysSubject;
	}

	/**
	 * PO对象转换成Dto对象
	 * 
	 * @param sysSubject
	 * @return
	 */
	public static SysSubjectDto poToDto(SysSubject sysSubject) {
		SysSubjectDto dto = null;
		if (sysSubject != null) {
			Integer enable = sysSubject.getEnableFlag();
			EnableFlagType enableFlag = enable == null ? null : EnableFlagType
					.fromCode(enable);
			dto = new SysSubjectDto(sysSubject.getCode(), sysSubject.getName(),
					sysSubject.getAddress(), sysSubject.getLinkmanName(),
					sysSubject.getLinkmanTel(), sysSubject.getLinkmanQq(),
					sysSubject.getBusiness(), sysSubject.getRemark(),
					enableFlag, sysSubject.getCreateBy(),
					sysSubject.getCreateDate(), sysSubject.getUpdateBy(),
					sysSubject.getUpdateDate());
		}
		return dto;
	}

	/**
	 * PO对象集合转换成Dto对象集合
	 * 
	 * @param sysSubjectLst
	 * @return
	 */
	public static List<SysSubjectDto> poLstToDtoLst(
			List<SysSubject> sysSubjectLst) {
		List<SysSubjectDto> dtoLst = new ArrayList<SysSubjectDto>();
		for (SysSubject sysSubject : sysSubjectLst) {
			SysSubjectDto dto = poToDto(sysSubject);
			dtoLst.add(dto);
		}
		return dtoLst;
	}
}
