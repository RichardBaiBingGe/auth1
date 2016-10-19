package cn.com.wito.auth.service.mgr.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dao.MachineOperateDao;
import cn.com.wito.auth.dto.AisleProductDto;
import cn.com.wito.auth.dto.MachineOrderDto;
import cn.com.wito.auth.dto.VendingMachineProertiesDto;
import cn.com.wito.auth.po.AisleProduct;
import cn.com.wito.auth.po.MachineOrder;
import cn.com.wito.auth.po.VendingMachineProerties;
import cn.com.wito.auth.service.mgr.MachineOperateService;
import cn.com.wito.auth.transform.AisleProductform;
import cn.com.wito.auth.transform.MachineOrderTransform;
import cn.com.wito.auth.transform.VendingMachineProertiesform;

/**
 * 售货机货道list
 * @author 张小东
 *
 */
@Service("machineOperateService")
public class MachineOperateServiceImpl implements MachineOperateService{

	@Resource
	private MachineOperateDao machineoperatedao;
	public List<VendingMachineProertiesDto> findMachineProertiesList(String serNum) {
		List<VendingMachineProerties> rolelist = machineoperatedao.findMachineProertiesList(serNum);
		List<VendingMachineProertiesDto> result = VendingMachineProertiesform.poLstToDtoLst(rolelist);
		return result;
	}
	
	public List<AisleProductDto> datagridgoodsDetail(AisleProduct sm){
		List<AisleProduct> rolelist = machineoperatedao.datagridgoodsDetail(sm);
		List<AisleProductDto> result = AisleProductform.poLstToDtoLst(rolelist);
		return result;
	}
	@Override
	public boolean addmachineoperate(VendingMachineProertiesDto vendingmachineproertiesdto) {
		VendingMachineProerties vendingmachineproerties = VendingMachineProertiesform.dtoToPo(vendingmachineproertiesdto);
		return machineoperatedao.add(vendingmachineproerties);
	}
	@Override
	public VendingMachineProertiesDto findMachineoperateByid(String MachineoperateId) {
		VendingMachineProerties vendingmachineproerties = machineoperatedao.find(MachineoperateId);
		VendingMachineProertiesDto vendingmachineproertiesdto = VendingMachineProertiesform.poToDto(vendingmachineproerties);
		return vendingmachineproertiesdto;
	}
	@Override
	public boolean updateMachineoperate(VendingMachineProertiesDto vendingmachineproertiesdto) {
		VendingMachineProerties vendingmachineproerties = VendingMachineProertiesform.dtoToPo(vendingmachineproertiesdto);
		return machineoperatedao.update(vendingmachineproerties);
	}

	public boolean deleteMachineoperate(String MachineoperateId) {
		boolean deleteRole = machineoperatedao.delete(MachineoperateId);
		return deleteRole;
	}

	public List<VendingMachineProertiesDto> findMachineProertiesListByCode(String serNum) {
		List<VendingMachineProerties> rolelist = machineoperatedao.findMachineProertiesList(serNum);
		List<VendingMachineProertiesDto> result = VendingMachineProertiesform.poLstToDtoLst(rolelist);
		return result;
	}
	@Override
	public List<VendingMachineProertiesDto> findMachineProertiesProduct() {
		// TODO Auto-generated method stub
		List<VendingMachineProerties> rolelist = machineoperatedao.findMachineProertiesProduct();
		List<VendingMachineProertiesDto> result = VendingMachineProertiesform.poLstToDtoLst(rolelist);
		return result;
	}
	@Override
	public VendingMachineProertiesDto findProductByid(String productId) {
		VendingMachineProerties vendingmachineproerties = machineoperatedao.findProductByid(productId);
		VendingMachineProertiesDto vendingmachineproertiesdto = VendingMachineProertiesform.poToDto(vendingmachineproerties);
		return vendingmachineproertiesdto;
	}
	@Override
	public Page<MachineOrderDto> findMachineorder(Pageable<MachineOrderDto> pageable) {
		Pageable<MachineOrder> subjectPageable = null;
		if (pageable != null) {
			MachineOrderDto machineorderdto = pageable.getEntity();
			MachineOrder machineorder = MachineOrderTransform.dtoToPo(machineorderdto);
			subjectPageable = new Pageable<MachineOrder>(pageable.getPageNumber(),
					pageable.getPageSize());
			subjectPageable.setOrderDirection(pageable.getOrderDirection());
			subjectPageable.setOrderProperty(pageable.getOrderProperty());
			subjectPageable.setSearchProperty(pageable.getSearchProperty());
			subjectPageable.setSearchValue(pageable.getSearchValue());
			subjectPageable.setEntity(machineorder);
		}
		Page<MachineOrder> subjectPages = machineoperatedao.findMachineorder(subjectPageable);
		Page<MachineOrderDto> pages = null;
		if (subjectPages != null) {
			List<MachineOrder> sysSubject = subjectPages.getContent();
			List<MachineOrderDto> sysSubjectDtoLst = MachineOrderTransform
					.poLstToDtoLst(sysSubject);
			pages = new Page<MachineOrderDto>(sysSubjectDtoLst, subjectPages.getTotal(),
					pageable);
		}
		return pages;
	}
}
