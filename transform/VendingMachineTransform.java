package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import cn.com.wito.auth.dto.VendingMachineDto;
import cn.com.wito.auth.po.VendingMachine;
import cn.com.wito.auth.constants.EnableFlagType;

public class VendingMachineTransform {

	public static VendingMachineDto poToDto(VendingMachine vendingMachine) {
		VendingMachineDto vendingMachineDto = null;
		if (vendingMachine != null) {
			Integer flag = vendingMachine.getEnableFlag();
			EnableFlagType enableType = flag == null ? null : EnableFlagType
					.fromCode(flag);
			vendingMachineDto = new VendingMachineDto(vendingMachine.getCode(),vendingMachine.getStatas(),
					vendingMachine.getSerNum(), vendingMachine.getName(),
					vendingMachine.getLatitude(),
					vendingMachine.getLongitude(), vendingMachine.getAddress(),
					vendingMachine.getStoreCode(),
					vendingMachine.getStoreName(),
					vendingMachine.getDeliverySubjectCode(),
					vendingMachine.getDeliverySubjectName(),
					vendingMachine.getOperateSubjectCode(),
					vendingMachine.getOperateSubjectName(),
					vendingMachine.getRemark(), enableType,
					vendingMachine.getCreateBy(),
					vendingMachine.getCreateDate(),
					vendingMachine.getUpdateBy(),
					vendingMachine.getUpdateDate(),
					
					StringUtils.isEmpty(vendingMachine.getStoreCode()) ? 0 : 1);
		}
		return vendingMachineDto;
	}

	public static List<VendingMachineDto> poLstToDtoLst(
			List<VendingMachine> vendingMachines) {
		List<VendingMachineDto> vendingMachineLst = new ArrayList<VendingMachineDto>();
		if (vendingMachines != null) {
			for (VendingMachine vendingMachine : vendingMachines) {
				VendingMachineDto vendingMachineDto = poToDto(vendingMachine);
				vendingMachineLst.add(vendingMachineDto);
			}
		}
		return vendingMachineLst;
	}

	public static VendingMachine dtoToPo(VendingMachineDto vendingMachineDto) {
		VendingMachine vendingMachine = null;
		if (vendingMachineDto != null) {
			EnableFlagType type = vendingMachineDto.getEnableFlag();
			Integer flag = type == null ? null : type.getCode();
			
			vendingMachine = new VendingMachine(flag,
					vendingMachineDto.getStatas(),
					vendingMachineDto.getCreateBy(),
					vendingMachineDto.getCreateDate(),
					vendingMachineDto.getUpdateBy(),
					vendingMachineDto.getUpdateDate(),
					vendingMachineDto.getRemark(), vendingMachineDto.getCode(),
					vendingMachineDto.getSerNum(), vendingMachineDto.getName(),
					vendingMachineDto.getLatitude(),
					vendingMachineDto.getLongitude(),
					vendingMachineDto.getAddress(),
					vendingMachineDto.getStoreCode(),
					vendingMachineDto.getStoreName(),
					vendingMachineDto.getDeliverySubjectCode(),
					vendingMachineDto.getDeliverySubjectName(),
					vendingMachineDto.getOperateSubjectCode(),
					vendingMachineDto.getOperateSubjectName());

		}
		return vendingMachine;
	}

	public static List<VendingMachine> dtoLstTopoLst(
			List<VendingMachineDto> vendingMachineDtoLst) {
		List<VendingMachine> VendingMachineLst = new ArrayList<VendingMachine>();
		if (vendingMachineDtoLst != null) {
			for (VendingMachineDto vendingMachineDto : vendingMachineDtoLst) {
				VendingMachine vendingMachine = dtoToPo(vendingMachineDto);
				VendingMachineLst.add(vendingMachine);
			}
		}
		return VendingMachineLst;
	}

}
