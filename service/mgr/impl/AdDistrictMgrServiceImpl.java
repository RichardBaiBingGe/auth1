package cn.com.wito.auth.service.mgr.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dao.AdDistrictDao;
import cn.com.wito.auth.dto.AdDistrictDto;
import cn.com.wito.auth.po.AdDistrict;
import cn.com.wito.auth.service.mgr.AdDistrictMgrService;
import cn.com.wito.auth.transform.AdDistrictTransform;


@Service("adDistrictMgrService")
public class AdDistrictMgrServiceImpl implements AdDistrictMgrService {
	
	
	@Resource
	private AdDistrictDao adDistrictDao;

	@Override
	public boolean addAdDistrictMgr(AdDistrictDto adDistrictDto) {
		AdDistrict adDistrict = AdDistrictTransform.dtoToPo(adDistrictDto);
		return adDistrictDao.add(adDistrict);
	}

	@Override
	public boolean modifyAdDistrict(AdDistrictDto adDistrictDto) {
		AdDistrict subject = AdDistrictTransform.dtoToPo(adDistrictDto);
		return adDistrictDao.update(subject);
	}

	@Override
	public boolean deleteAdDistrict(String id) {
		return adDistrictDao.delete(id);
	}

	@Override
	public List<AdDistrictDto> findAllAdDistrict() {
		 List<AdDistrict> lsan= adDistrictDao.find(null);
		 List<AdDistrictDto> adDistrictAll =AdDistrictTransform.poLstToDtoLst(lsan);
		return  adDistrictAll;
	}

	@Override
	public Page<AdDistrictDto> findPage(Pageable<AdDistrictDto> pageable) {
		
		Pageable<AdDistrict> adDistrictPageable = null;
		if (pageable != null) {
			
			adDistrictPageable = new Pageable<AdDistrict>();
			adDistrictPageable.setEntity(AdDistrictTransform.dtoToPo(pageable.getEntity()));
			adDistrictPageable.setOrderDirection(pageable.getOrderDirection());
			adDistrictPageable.setPageNumber(pageable.getPageNumber());
			adDistrictPageable.setPageSize(pageable.getPageSize());
		}

		Page<AdDistrict> adDistrictPage = adDistrictDao.findPage(adDistrictPageable);
		Page<AdDistrictDto> page = null;
		if (adDistrictPage != null) {
			List<AdDistrict> content = adDistrictPage.getContent();
			page = new Page<AdDistrictDto>(AdDistrictTransform.poLstToDtoLst(content),
					adDistrictPage.getTotal(), pageable);
		}
		return page;
	}

	


}
