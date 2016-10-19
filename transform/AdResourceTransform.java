package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import cn.com.wito.auth.constants.AdResourceType;
import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.constants.ResourceTypeEnum;
import cn.com.wito.auth.dto.AdResourceDto;
import cn.com.wito.auth.po.AdResource;

public class AdResourceTransform {
	/**
	 * Dto转PO
	 * 
	 * @param adResourceDto
	 * @return
	 */
	public static AdResource dtoToPo(AdResourceDto adResourceDto) {
		AdResource adResource = new AdResource();
		if (adResourceDto != null) {
			EnableFlagType enableFlagType = adResourceDto.getEnableFlag();
			Integer enableFlagCode = enableFlagType == null ? null
					: enableFlagType.getCode();
			AdResourceType type = adResourceDto.getType();
			Integer typeCpde = type == null ? null : type.getCode();
			//广告类型
			ResourceTypeEnum resourceTypeEnum=adResourceDto.getResourceType();
			Integer typecode= resourceTypeEnum ==null?null : resourceTypeEnum.getCode();
			adResource = new AdResource(adResourceDto.getCode(),
					adResourceDto.getName(), typeCpde,
					adResourceDto.getResourceUrl(),
					adResourceDto.getClickUrl(), adResourceDto.getRemark(),
					adResourceDto.getSubjectCode(),
					adResourceDto.getSubjectName(), enableFlagCode,
					adResourceDto.getCreateBy(), adResourceDto.getCreateDate(),
					adResourceDto.getUpdateBy(), adResourceDto.getUpdateDate(), 
					adResourceDto.getFileType(),typecode,adResourceDto.getStartTime(),adResourceDto.getEndTime());
		}
		return adResource;
	}

	/**
	 * PO对象转换成Dto对象
	 * 
	 * @param adResource
	 * @return
	 */
	public static AdResourceDto poToDto(AdResource adResource) {
		AdResourceDto dto = null;
		if (adResource != null) {
			EnableFlagType enableFlag = EnableFlagType.fromCode(adResource
					.getEnableFlag());
			AdResourceType resType = AdResourceType.fromCode(adResource
					.getType());
			//广告类型
			ResourceTypeEnum resourceTypeEnum=ResourceTypeEnum.fromCode(adResource.getResourceType());		
			dto = new AdResourceDto(adResource.getCode(), adResource.getName(),
					resType, adResource.getResourceUrl(),
					adResource.getClickUrl(), adResource.getRemark(),
					adResource.getSubjectCode(), adResource.getSubjectName(),
					enableFlag, adResource.getCreateBy(),
					adResource.getCreateDate(), adResource.getUpdateBy(),
					adResource.getUpdateDate(), adResource.getFileType(),
					resourceTypeEnum,adResource.getStartTime(),adResource.getEndTime());
		}
		return dto;
	}

	/**
	 * PO对象集合转换成Dto对象集合
	 * 
	 * @param adResourceLst
	 * @return
	 */
	public static List<AdResourceDto> poLstToDtoLst(
			List<AdResource> adResourceLst) {
		List<AdResourceDto> dtoLst = new ArrayList<AdResourceDto>();
		for (AdResource adResource : adResourceLst) {
			AdResourceDto dto = poToDto(adResource);
			dtoLst.add(dto);
		}
		return dtoLst;
	}
}
