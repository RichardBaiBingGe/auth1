package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;
import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.dto.AdNodeDto;
import cn.com.wito.auth.po.AdNode;

public class AdNodeTransform {
	/**
	 * Dto转PO
	 * 
	 * @param adNodeDto
	 * @return
	 */
	public static AdNode dtoToPo(AdNodeDto adNodeDto) {
		AdNode adNode = null;
		if (adNodeDto != null) {
			EnableFlagType enableFlagType = adNodeDto.getNodeStatus();
			Integer enableFlagCode = enableFlagType == null ? null
					: enableFlagType.getCode();
			adNode = new AdNode(
					adNodeDto.getId(),
					adNodeDto.getNodeCode(),
					adNodeDto.getNodeName1(), 
					enableFlagCode,
					adNodeDto.getAttributeValue0(),
					adNodeDto.getAttributeValue1(),
					adNodeDto.getAttributeValue2(),
					adNodeDto.getAttributeValue3()

			);
		}

		return adNode;
	}

	/**
	 * PO对象转换成Dto对象
	 * 
	 * @param adNode
	 * @return
	 */
	public static AdNodeDto poToDto(AdNode adNode) {
		AdNodeDto dto = null;
		if (adNode != null) {
			
			EnableFlagType enableFlag = EnableFlagType.fromCode(adNode.getNodeStatus());
			dto = new AdNodeDto(
					adNode.getId(),
					adNode.getNodeCode(),
					adNode.getNodeName1(),
					enableFlag,
					adNode.getAttributeValue0(),
					adNode.getAttributeValue1(), 
					adNode.getAttributeValue2(),
					adNode.getAttributeValue3());

		}
		return dto;
	}

	/**
	 * PO对象集合转换成Dto对象集合
	 * 
	 * @param adNodeLst
	 * @return
	 */
	public static List<AdNodeDto> poLstToDtoLst(List<AdNode> adNodeLst) {
		List<AdNodeDto> dtoLst = new ArrayList<AdNodeDto>();
		for (AdNode adNode : adNodeLst) {
			AdNodeDto dto = poToDto(adNode);
			dtoLst.add(dto);
		}
		return dtoLst;
	}
}
