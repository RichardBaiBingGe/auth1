package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import cn.com.wito.auth.dto.AisleProductDto;
import cn.com.wito.auth.po.AisleProduct;
public class AisleProductform {
	
	
	/**
	 * Dto转PO
	 * 
	 * @param 
	 * @return
	 */
	public static AisleProduct dtoToPo(AisleProductDto aisleproductdto) {
		AisleProduct aisleproduct = null;
		if (aisleproductdto != null) {
			
			aisleproduct = new AisleProduct(
					aisleproductdto.getId(),
					aisleproductdto.getMachineCode(),
					aisleproductdto.getAisleCode(),
					aisleproductdto.getProductCode(),
					aisleproductdto.getBatchCode(),
					aisleproductdto.getEtcMonitorCode(),
					aisleproductdto.getCreateDate(),
					aisleproductdto.getModifyDate()
					);
		}

		return aisleproduct;
	}

	/**
	 * PO对象转换成Dto对象
	 * 
	 * @param ProductSupervisionDto
	 * @return
	 */
	public static AisleProductDto poToDto(AisleProduct aisleproduct) {
		AisleProductDto dto = null;
		if (aisleproduct != null) {
			
			dto = new AisleProductDto(
					aisleproduct.getId(),
					aisleproduct.getMachineCode(),
					aisleproduct.getAisleCode(),
					aisleproduct.getProductCode(),
					aisleproduct.getBatchCode(),
					aisleproduct.getEtcMonitorCode(),
					aisleproduct.getCreateDate(),
					aisleproduct.getModifyDate()
					);


		}
		return dto;
	}

	/**
	 * PO对象集合转换成Dto对象集合
	 * 
	 * @param ProductSupervisionLst
	 * @return
	 */
	public static List<AisleProductDto> poLstToDtoLst(List<AisleProduct> aisleProductLst) {
		List<AisleProductDto> dtoLst = new ArrayList<AisleProductDto>();
		for (AisleProduct aisleproduct : aisleProductLst) {
			AisleProductDto dto = poToDto(aisleproduct);
			dtoLst.add(dto);
		}
		return dtoLst;
	}


}
