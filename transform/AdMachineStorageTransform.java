package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;
import cn.com.wito.auth.dto.AdMachineStorageDto;
import cn.com.wito.auth.po.AdMachineStorage;
import cn.com.wito.auth.constants.EnableFlagType;

public class AdMachineStorageTransform {

	/**
	 * Dto转PO
	 * 
	 * @param AdMachineStorageDto
	 * @return
	 */
	public static AdMachineStorage dtoToPo(AdMachineStorageDto adMachineStorageDto) {
		AdMachineStorage adMachineStorage = null;
		
		if (adMachineStorageDto != null) {
			
			EnableFlagType enableFlagType = adMachineStorageDto.getStorageStates();
			Integer enableFlagCode = enableFlagType == null ? null : enableFlagType.getCode();
			adMachineStorage = new AdMachineStorage(
					adMachineStorageDto.getCode(),
					adMachineStorageDto.getSerNum(),
					adMachineStorageDto.getName(),
					adMachineStorageDto.getAddress(), 
					adMachineStorageDto.getNodeTypes(),
					adMachineStorageDto.getDistrict(),
					adMachineStorageDto.getStorageDate(), 
					enableFlagCode,
					adMachineStorageDto.getNodeId(),
					adMachineStorageDto.getDistrictId()

			);
		}

		return adMachineStorage;
	}

	/**
	 * PO对象转换成Dto对象
	 * 
	 * @param adNode
	 * @return
	 */
	public static AdMachineStorageDto poToDto(AdMachineStorage adMachineStorage) {
		AdMachineStorageDto dto = null;
		if (adMachineStorage != null) {
			
			
			EnableFlagType enableFlag = EnableFlagType.fromCode(adMachineStorage.getStorageStates());
			dto = new AdMachineStorageDto(
					adMachineStorage.getCode(),
					adMachineStorage.getSerNum(),
					adMachineStorage.getName(),
					adMachineStorage.getAddress(), 
					adMachineStorage.getNodeTypes(),
					adMachineStorage.getDistrict(),
					adMachineStorage.getStorageDate(), 
					enableFlag,
					adMachineStorage.getNodeId(),
					adMachineStorage.getDistrictId()
					);
		}
		return dto;
	}

	/**
	 * PO对象集合转换成Dto对象集合
	 * 
	 * @param adNodeLst
	 * @return
	 */
	public static List<AdMachineStorageDto> poLstToDtoLst(List<AdMachineStorage> adMachineStorageLst) {
		List<AdMachineStorageDto> dtoLst = new ArrayList<AdMachineStorageDto>();
		for (AdMachineStorage adMachineStorage : adMachineStorageLst) {
			AdMachineStorageDto dto = poToDto(adMachineStorage);
			dtoLst.add(dto);
		}
		return dtoLst;
	}
}
