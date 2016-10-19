package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import cn.com.wito.auth.constants.FreeTakeSectionType;
import cn.com.wito.auth.dto.YbFreeTakeDto;
import cn.com.wito.auth.po.YbFreeTake;
public class YbFreeTakeTransform {
	/**
	 * DTO对象转PO
	 * 
	 * @param YbFreeTake
	 * @return
	 */
	public static YbFreeTake dtoToPo(YbFreeTakeDto freeTakeDto) {
		YbFreeTake freeTake = null;
		FreeTakeSectionType adSectionType=freeTakeDto.getSectionType();
		Integer typecode= adSectionType ==null?null : adSectionType.getCode();
		if (freeTakeDto != null) {
			freeTake=new YbFreeTake(freeTakeDto.getId(), freeTakeDto.getSerNum(), freeTakeDto.getMachineSn(), 
				freeTakeDto.getSn(), freeTakeDto.getProductSn(), freeTakeDto.getFrequency(),freeTakeDto.getCreateDate(),
				freeTakeDto.getUpdateDate(), freeTakeDto.getSectionNum(), typecode);
		}
		return freeTake;
	}
	/**
	 * DTO List 转 PO List
	 * 
	 * @param YbFreeTake
	 * @return
	 */
	public static List<YbFreeTake> DtoLstToPoLst(List<YbFreeTakeDto> freeTakeDtoLst){
		List<YbFreeTake> freeTakeLst = new ArrayList<YbFreeTake>();
		if (freeTakeDtoLst != null) {
			YbFreeTake freeTake = null;
			for (YbFreeTakeDto freeTakeDto : freeTakeDtoLst) {
				freeTake = dtoToPo(freeTakeDto);
				freeTakeLst.add(freeTake);
			}
		}
		return freeTakeLst;
	}
	/**
	 * PO对象转DTO
	 * 
	 * @param FreeTake
	 * @return
	 */
	public static YbFreeTakeDto PoToDto(YbFreeTake freeTake) {
		YbFreeTakeDto freeTakeDto = null;
		FreeTakeSectionType adSectionType=FreeTakeSectionType.fromCode(freeTake.getSectionType());
		if (freeTake != null) {
			freeTakeDto=new YbFreeTakeDto(freeTake.getId(), freeTake.getSerNum(), freeTake.getMachineSn(), 
					freeTake.getSn(), freeTake.getProductSn(), freeTake.getFrequency(),freeTake.getCreateDate(),
					freeTake.getUpdateDate(), freeTake.getSectionNum(), adSectionType);
		}
		return freeTakeDto;
	}
	/**
	 * PO List 转 DTO List
	 * 
	 * @param YbFreeTake
	 * @return
	 */
	public static List<YbFreeTakeDto> PoLstToDtoLst(List<YbFreeTake> freeTakeLst){
		List<YbFreeTakeDto> freeTakeDtoLst = new ArrayList<YbFreeTakeDto>();
		if (freeTakeLst != null) {
			YbFreeTakeDto freeTakeDto = null;
			for (YbFreeTake freeTake : freeTakeLst) {
				freeTakeDto = PoToDto(freeTake);
				freeTakeDtoLst.add(freeTakeDto);
			}
		}
		return freeTakeDtoLst;
	}
}
