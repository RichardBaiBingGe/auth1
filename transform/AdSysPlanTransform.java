package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.dto.AdSysPlanDto;
import cn.com.wito.auth.po.AdSysPlan;

public class AdSysPlanTransform {
	/**
	 * Dto转PO
	 * 
	 * @param adSysPlanDto
	 * @return
	 */
	public static AdSysPlan dtoToPo(AdSysPlanDto adSysPlanDto) {
		AdSysPlan adSysPlan = new AdSysPlan();
		if (adSysPlanDto != null) {
			EnableFlagType flag = adSysPlanDto.getEnableFlag();
			Integer flagCode = flag == null ? null : flag.getCode();
			adSysPlan = new AdSysPlan(adSysPlanDto.getCode(),
					adSysPlanDto.getCurDate(), adSysPlanDto.getResourceCode(),
					adSysPlanDto.getResourceName(),
					adSysPlanDto.getLockStatus(), flagCode,
					adSysPlanDto.getCreateBy(), adSysPlanDto.getCreateDate(),
					adSysPlanDto.getUpdateBy(), adSysPlanDto.getUpdateDate());
		}
		return adSysPlan;
	}

	/**
	 * PO对象转换成Dto对象
	 * 
	 * @param adSysPlan
	 * @return
	 */
	public static AdSysPlanDto poToDto(AdSysPlan adSysPlan) {
		AdSysPlanDto dto = null;
		if (adSysPlan != null) {
			Integer flagCode = adSysPlan.getEnableFlag();
			EnableFlagType type = flagCode == null ? null : EnableFlagType
					.fromCode(flagCode);
			dto = new AdSysPlanDto(adSysPlan.getCode(), adSysPlan.getCurDate(),
					adSysPlan.getResourceCode(), adSysPlan.getResourceName(),
					adSysPlan.getLockStatus(), type, adSysPlan.getCreateBy(),
					adSysPlan.getCreateDate(), adSysPlan.getUpdateBy(),
					adSysPlan.getUpdateDate());
		}
		return dto;
	}

	/**
	 * PO对象集合转换成Dto对象集合
	 * 
	 * @param adSysPlanLst
	 * @return
	 */
	public static List<AdSysPlanDto> poLstToDtoLst(List<AdSysPlan> adSysPlanLst) {
		List<AdSysPlanDto> dtoLst = new ArrayList<AdSysPlanDto>();
		for (AdSysPlan adSysPlan : adSysPlanLst) {
			AdSysPlanDto dto = poToDto(adSysPlan);
			dtoLst.add(dto);
		}
		return dtoLst;
	}
}
