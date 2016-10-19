package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;
import cn.com.wito.auth.dto.ProductSupervisionDto;
import cn.com.wito.auth.po.ProductSupervision;
public class ProductSupervisionTransform {
	
	
	/**
	 * Dto转PO
	 * 
	 * @param 
	 * @return
	 */
	public static ProductSupervision dtoToPo(ProductSupervisionDto productSupervisionDto) {
		ProductSupervision productSupervision = null;
		if (productSupervisionDto != null) {
			
			productSupervision = new ProductSupervision(
					productSupervisionDto.getId(),
					productSupervisionDto.getSupervisionCode(),
					productSupervisionDto.getBatchcode(),
					productSupervisionDto.getCreateTime(), 
					productSupervisionDto.getSupervisionDel()
					);
		}

		return productSupervision;
	}

	/**
	 * PO对象转换成Dto对象
	 * 
	 * @param ProductSupervisionDto
	 * @return
	 */
	public static ProductSupervisionDto poToDto(ProductSupervision productSupervision) {
		ProductSupervisionDto dto = null;
		if (productSupervision != null) {
			
			dto = new ProductSupervisionDto(
					productSupervision.getId(),
					productSupervision.getSupervisionCode(),
					productSupervision.getBatchcode(),
					productSupervision.getCreateTime(), 
					productSupervision.getSupervisionDel()
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
	public static List<ProductSupervisionDto> poLstToDtoLst(List<ProductSupervision> productSupervisionLst) {
		List<ProductSupervisionDto> dtoLst = new ArrayList<ProductSupervisionDto>();
		for (ProductSupervision productSupervision : productSupervisionLst) {
			ProductSupervisionDto dto = poToDto(productSupervision);
			dtoLst.add(dto);
		}
		return dtoLst;
	}


}
