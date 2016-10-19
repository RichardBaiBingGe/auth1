package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;
import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.dto.AdDistrictDto;
import cn.com.wito.auth.po.AdDistrict;

public class AdDistrictTransform {
	/**
	 * Dto转PO
	 * 
	 * @param adDistrictDto
	 * @return
	 */
	public static AdDistrict dtoToPo(AdDistrictDto adDistrictDto) {
		AdDistrict adDistrict = null;
		if (adDistrictDto != null) {
			EnableFlagType enableFlagType = adDistrictDto.getDStatus();
			Integer enableFlagCode = enableFlagType == null ? null
					: enableFlagType.getCode();
			adDistrict = new AdDistrict(
					adDistrictDto.getId(),
					adDistrictDto.getDCode(),
					adDistrictDto.getDName(),
					enableFlagCode,
					adDistrictDto.getAttributeValue0(),
					adDistrictDto.getAttributeValue1()

			);
		}

		return adDistrict;
	}

	/**
	 * PO对象转换成Dto对象
	 * 
	 * @param adDistrictDto
	 * @return
	 */
	public static AdDistrictDto poToDto(AdDistrict adDistrict) {
		AdDistrictDto dto = null;
		if (adDistrict != null) {
			
			EnableFlagType enableFlag = EnableFlagType.fromCode(adDistrict.getDStatus());
			dto = new AdDistrictDto(
					adDistrict.getId(),
					adDistrict.getDCode(),
					adDistrict.getDName(),
					enableFlag,
					adDistrict.getAttributeValue0(),
					adDistrict.getAttributeValue1());


		}
		return dto;
	}

	/**
	 * PO对象集合转换成Dto对象集合
	 * 
	 * @param adDistrictLst
	 * @return
	 */
	public static List<AdDistrictDto> poLstToDtoLst(List<AdDistrict> adDistrictLst) {
		List<AdDistrictDto> dtoLst = new ArrayList<AdDistrictDto>();
		for (AdDistrict adDistrict : adDistrictLst) {
			AdDistrictDto dto = poToDto(adDistrict);
			dtoLst.add(dto);
		}
		return dtoLst;
	}
}
