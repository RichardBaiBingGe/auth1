package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;
import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.dto.AdSupplierManagementDto;
import cn.com.wito.auth.po.AdSupplierManagement;

public class AdSupplierManagementTransform {
	/**
	 * Dto转PO
	 * 
	 * @param adSupplierManagementDto
	 * @return
	 */
	public static AdSupplierManagement dtoToPo(AdSupplierManagementDto adSupplierManagementDto) {
		AdSupplierManagement adSupplierManagement = null;
		if (adSupplierManagementDto != null) {
			EnableFlagType enableFlagType = adSupplierManagementDto.getsStatus();
			Integer enableFlagCode = enableFlagType == null ? null
					: enableFlagType.getCode();
			adSupplierManagement = new AdSupplierManagement(
					
					adSupplierManagementDto.getsId(),
					adSupplierManagementDto.getsName(),
					adSupplierManagementDto.getsLinkman(),
					adSupplierManagementDto.getsLinkmanphone(),
					adSupplierManagementDto.getsAddress(),
					adSupplierManagementDto.getsEmail(),
					adSupplierManagementDto.getsTel(),
					adSupplierManagementDto.getsFax(),
					adSupplierManagementDto.getsPostcode(),
					adSupplierManagementDto.getsFoodcirculationpermit(),
					adSupplierManagementDto.getsProductionlicense(),
					adSupplierManagementDto.getsBusinesslicensenumber(),
					adSupplierManagementDto.getsTaxregistrationnumber(),
					adSupplierManagementDto.getsBankaccount(),
					adSupplierManagementDto.getsAccountnumber(),
					adSupplierManagementDto.getsRemarks(),
					enableFlagCode,
					adSupplierManagementDto.getAttributeValue0(),
					adSupplierManagementDto.getAttributeValue1(),
					adSupplierManagementDto.getAttributeValue2(),
					adSupplierManagementDto.getAttributeValue3()
					

			);
		}

		return adSupplierManagement;
	}

	/**
	 * PO对象转换成Dto对象
	 * 
	 * @param adSupplierManagement
	 * @return
	 */
	public static AdSupplierManagementDto poToDto(AdSupplierManagement adSupplierManagement) {
		AdSupplierManagementDto dto = null;
		if (adSupplierManagement != null) {
			
			EnableFlagType enableFlag = EnableFlagType.fromCode(adSupplierManagement.getSStatus());
			dto = new AdSupplierManagementDto(
					adSupplierManagement.getSId(),
					adSupplierManagement.getSName(),
					adSupplierManagement.getSLinkman(),
					adSupplierManagement.getSLinkmanphone(),
					adSupplierManagement.getSAddress(),
					adSupplierManagement.getSEmail(),
					adSupplierManagement.getSTel(),
					adSupplierManagement.getSFax(),
					adSupplierManagement.getSPostcode(),
					adSupplierManagement.getSFoodcirculationpermit(),
					adSupplierManagement.getSProductionlicense(),
					adSupplierManagement.getSBusinesslicensenumber(),
					adSupplierManagement.getSTaxregistrationnumber(),
					adSupplierManagement.getSBankaccount(),
					adSupplierManagement.getSAccountnumber(),
					adSupplierManagement.getSRemarks(),
					enableFlag,
					adSupplierManagement.getAttributeValue0(),
					adSupplierManagement.getAttributeValue1(),
					adSupplierManagement.getAttributeValue2(),
					adSupplierManagement.getAttributeValue3());
		

		}
		return dto;
	}

	/**
	 * PO对象集合转换成Dto对象集合
	 * 
	 * @param adSupplierManagementLst
	 * @return
	 */
	public static List<AdSupplierManagementDto> poLstToDtoLst(List<AdSupplierManagement> adSupplierManagementLst) {
		List<AdSupplierManagementDto> dtoLst = new ArrayList<AdSupplierManagementDto>();
		for (AdSupplierManagement adSupplierManagement : adSupplierManagementLst) {
			AdSupplierManagementDto dto = poToDto(adSupplierManagement);
			dtoLst.add(dto);
		}
		return dtoLst;
	}
}
