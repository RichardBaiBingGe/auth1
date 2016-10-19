package cn.com.wito.auth.transform;

import cn.com.wito.auth.dto.AdMachineDto;
import cn.com.wito.auth.po.AdMachine;

public class AdMachineTransform {
	/**
	 * Dto转PO
	 * 
	 * @param adResourceDto
	 * @return
	 */
	public static AdMachine dtoToPo(AdMachineDto adMachineDto) {
		AdMachine adMachine = null;
		if (adMachineDto != null) {
			adMachine = new AdMachine(adMachineDto.getMachineCode(), adMachineDto.getResourceCode(), adMachineDto
					.getCreateDate(), adMachineDto.getModifyDate(), adMachineDto.getRemark());
		}
		
		return adMachine;
	}

	/**
	 * PO对象转换成Dto对象
	 * 
	 * @param adResource
	 * @return
	 */
	public static AdMachineDto poToDto(AdMachine adMachine) {
		AdMachineDto dto = null;
		if (adMachine != null) {
			dto = new AdMachineDto(adMachine.getMachineCode(), adMachine.getResourceCode(), adMachine
					.getCreateDate(), adMachine.getModifyDate(), adMachine.getRemark());
		}
		
		return dto;
	}
}
