package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.dto.VendingMachineDto;
import cn.com.wito.auth.dto.VendingMachineProertiesDto;
import cn.com.wito.auth.po.VendingMachine;
import cn.com.wito.auth.po.VendingMachineProerties;

public class VendingMachineProertiesform {
	public static VendingMachineProertiesDto poToDto(VendingMachineProerties vendingMachine) {
		VendingMachineProertiesDto vendingmachineproertiesdto = null;
		if (vendingMachine != null) {
			Integer amount = vendingMachine.getAmount();
			EnableFlagType enableType = amount == null ? null : EnableFlagType
					.fromCode(amount);
			vendingmachineproertiesdto = new VendingMachineProertiesDto(vendingMachine.getId(),vendingMachine.getCreateDate(),
					vendingMachine.getModifyDate(), vendingMachine.getMachineCode(),
					vendingMachine.getAisleCode(),
					vendingMachine.getProductCode(), vendingMachine.getProductName(),
					vendingMachine.getPrice(),
					amount,
					vendingMachine.getPicUrl(),vendingMachine.getMachineCode1());
		}
		return vendingmachineproertiesdto;
	}

	public static List<VendingMachineProertiesDto> poLstToDtoLst(
			List<VendingMachineProerties> vendingMachines) {
		List<VendingMachineProertiesDto> vendingmachineproertiesdtoLst = new ArrayList<VendingMachineProertiesDto>();
		if (vendingMachines != null) {
			for (VendingMachineProerties VendingMachineProerties : vendingMachines) {
				VendingMachineProertiesDto vendingMachineDto = poToDto(VendingMachineProerties);
				vendingmachineproertiesdtoLst.add((vendingMachineDto));
			}
		}
		return vendingmachineproertiesdtoLst;
	}

	public static VendingMachineProerties dtoToPo(VendingMachineProertiesDto vendingMachineDto) {
		VendingMachineProerties vendingmachineproerties = null;
		if (vendingMachineDto != null) {
			Integer amount = vendingMachineDto.getAmount();
			EnableFlagType enableType = amount == null ? null : EnableFlagType
					.fromCode(amount);
			vendingmachineproerties = new VendingMachineProerties(vendingMachineDto.getId(),vendingMachineDto.getCreateDate(),
					vendingMachineDto.getModifyDate(), vendingMachineDto.getMachineCode(),
					vendingMachineDto.getAisleCode(),
					vendingMachineDto.getProductCode(), vendingMachineDto.getProductName(),
					vendingMachineDto.getPrice(),
					amount,
					vendingMachineDto.getPicUrl(),vendingMachineDto.getMachineCode1());

		}
		return vendingmachineproerties;
	}

	public static List<VendingMachineProerties> dtoLstTopoLst(
			List<VendingMachineProertiesDto> vendingMachineDtoLst) {
		List<VendingMachineProerties> VendingMachineLst = new ArrayList<VendingMachineProerties>();
		if (vendingMachineDtoLst != null) {
			for (VendingMachineProertiesDto vendingMachineDto : vendingMachineDtoLst) {
				VendingMachineProerties vendingMachine = dtoToPo(vendingMachineDto);
				VendingMachineLst.add(vendingMachine);
			}
		}
		return VendingMachineLst;
	}

}
