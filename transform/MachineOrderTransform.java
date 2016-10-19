package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.dto.MachineOrderDto;
import cn.com.wito.auth.dto.SysRoleDto;
import cn.com.wito.auth.po.MachineOrder;
import cn.com.wito.auth.po.SysRole;

public final class MachineOrderTransform {

	/**
	 * PO对象转DTO对象
	 * 
	 * @param sysRole
	 * @return
	 */
	public static MachineOrderDto poToDto(MachineOrder machineorder) {
		MachineOrderDto machineorderdto = null;
		if (machineorder != null) {
			machineorderdto = new MachineOrderDto(machineorder.getSerNum(),machineorder.getCode(),
					machineorder.getName(),machineorder.getTemp(),
					machineorder.getAddress(),machineorder.getOffsetAmount(),
					machineorder.getWeixinPrice(),machineorder.getWeixinNum(),
					machineorder.getEPayPrice(),machineorder.getEPayNum(),
					machineorder.getZhiFuBaoPrice(),machineorder.getZhiFuBaoNum(),
					machineorder.getChangAnTongPrice(),machineorder.getChangAnTongNum(),
					machineorder.getIdCardPrice(),machineorder.getIdCardNum(),machineorder.getQuantity());
		}
		return machineorderdto;
	}

	/**
	 * DTO转PO
	 * 
	 * @param sysRoleDto
	 * @return
	 */
	public static MachineOrder dtoToPo(MachineOrderDto machineorderdto) {
		MachineOrder machineorder = null;
		if (machineorderdto != null) {
			
			machineorder = new MachineOrder(machineorderdto.getSerNum(),machineorderdto.getCode(),
					machineorderdto.getName(),machineorderdto.getTemp(),
					machineorderdto.getAddress(),machineorderdto.getOffsetAmount(),
					machineorderdto.getWeixinPrice(),machineorderdto.getWeixinNum(),
					machineorderdto.getEPayPrice(),machineorderdto.getEPayNum(),
					machineorderdto.getZhiFuBaoPrice(),machineorderdto.getZhiFuBaoNum(),
					machineorderdto.getChangAnTongPrice(),machineorderdto.getChangAnTongNum(),
					machineorderdto.getIdCardPrice(),machineorderdto.getIdCardNum(),machineorderdto.getQuantity());
		}
		return machineorder;
	}

	/**
	 * PO对象集合转DTO对象集合
	 * 
	 * @param sysRoleLst
	 * @return
	 */
	public static List<MachineOrderDto> poLstToDtoLst(List<MachineOrder> machineorderList) {
		List<MachineOrderDto> dtoLst = new ArrayList<MachineOrderDto>();
		if (machineorderList != null) {
			for (MachineOrder machineorder : machineorderList) {
				MachineOrderDto machineorderdto = poToDto(machineorder);
				dtoLst.add(machineorderdto);
			}
		}
		return dtoLst;
	}
}
