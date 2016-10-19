package cn.com.wito.auth.service.mgr.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dao.AdSupplierManagementDao;
import cn.com.wito.auth.dto.AdSupplierManagementDto;
import cn.com.wito.auth.po.AdSupplierManagement;
import cn.com.wito.auth.service.mgr.AdSupplierManagementMgrService;
import cn.com.wito.auth.transform.AdSupplierManagementTransform;
@Service("adSuppplierManagementService")
public class AdSupplierManagementMgrServiceImpl implements AdSupplierManagementMgrService {

	
	@Resource
	private AdSupplierManagementDao adSupplierManagementDao;
	@Override
	public boolean addAdSupplierManagement(AdSupplierManagementDto adSupplierManagementDto) {
		AdSupplierManagement adSupplierManagement = AdSupplierManagementTransform.dtoToPo(adSupplierManagementDto);
		return adSupplierManagementDao.add(adSupplierManagement);
	}

	@Override
	public boolean modifyAdSupplierManagement(
			AdSupplierManagementDto adSupplierManagementDto) {
		
		AdSupplierManagement subject = AdSupplierManagementTransform.dtoToPo(adSupplierManagementDto);
		return adSupplierManagementDao.update(subject);
	}

	@Override
	public boolean deleteAdSupplierManagement(String adSupplierManagementCode) {
		
		return adSupplierManagementDao.delete(adSupplierManagementCode);
	}


	@Override
	public Page<AdSupplierManagementDto> findPage(Pageable<AdSupplierManagementDto> pageable) {

		Pageable<AdSupplierManagement> subjectPageable = null;
		if (pageable != null) {
			AdSupplierManagementDto adSupplierManagementdto = pageable.getEntity();
			AdSupplierManagement adSupplierManagement = AdSupplierManagementTransform.dtoToPo(adSupplierManagementdto);
			subjectPageable = new Pageable<AdSupplierManagement>(pageable.getPageNumber(),
					pageable.getPageSize());
			subjectPageable.setOrderDirection(pageable.getOrderDirection());
			subjectPageable.setOrderProperty(pageable.getOrderProperty());
			subjectPageable.setSearchProperty(pageable.getSearchProperty());
			subjectPageable.setSearchValue(pageable.getSearchValue());
			subjectPageable.setEntity(adSupplierManagement);
		}
		Page<AdSupplierManagement> subjectPages = adSupplierManagementDao.findPage(subjectPageable);
		Page<AdSupplierManagementDto> pages = null;
		if (subjectPages != null) {
			List<AdSupplierManagement> sysSubject = subjectPages.getContent();
			List<AdSupplierManagementDto> sysSubjectDtoLst = AdSupplierManagementTransform
					.poLstToDtoLst(sysSubject);
			pages = new Page<AdSupplierManagementDto>(sysSubjectDtoLst, subjectPages.getTotal(),
					pageable);
		}
		return pages;
	}

}
