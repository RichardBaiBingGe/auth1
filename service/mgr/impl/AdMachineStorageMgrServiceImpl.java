package cn.com.wito.auth.service.mgr.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dao.AdMachineStorageDao;
import cn.com.wito.auth.dto.AdMachineStorageDto;
import cn.com.wito.auth.po.AdMachineStorage;
import cn.com.wito.auth.service.mgr.AdMachineStorageMgrService;
import cn.com.wito.auth.transform.AdMachineStorageTransform;


@Service("adMachineStorageMgrService")
public class AdMachineStorageMgrServiceImpl implements AdMachineStorageMgrService {
	
	
	@Resource
	private AdMachineStorageDao adMachineStorageDao;

	@Override
	public boolean modifyAdMachineStorage(AdMachineStorageDto adMachineStorageDto) {
		
		AdMachineStorage subject = AdMachineStorageTransform.dtoToPo(adMachineStorageDto);
		return adMachineStorageDao.update(subject);
	}

	@Override
	public Page<AdMachineStorageDto> findPage(Pageable<AdMachineStorageDto> pageable) {
		
		Pageable<AdMachineStorage> adMachineStoragePageable = new Pageable<AdMachineStorage>();
		if (pageable != null) {
			adMachineStoragePageable.setEntity(AdMachineStorageTransform.dtoToPo(pageable.getEntity()));
			adMachineStoragePageable.setOrderDirection(pageable.getOrderDirection());
			adMachineStoragePageable.setPageNumber(pageable.getPageNumber());
			adMachineStoragePageable.setPageSize(pageable.getPageSize());
			adMachineStoragePageable.setSearchProperty(pageable.getSearchProperty());
			adMachineStoragePageable.setSearchValue(pageable.getSearchValue());
		}

		Page<AdMachineStorage> adMachineStoragePage = adMachineStorageDao.findPage(adMachineStoragePageable);
		Page<AdMachineStorageDto> page = null;
		if (adMachineStoragePage != null) {
			List<AdMachineStorage> content = adMachineStoragePage.getContent();
			page = new Page<AdMachineStorageDto>(AdMachineStorageTransform.poLstToDtoLst(content),
					adMachineStoragePage.getTotal(), pageable);
		}
		return page;

	}

	@Override
	public AdMachineStorageDto findAdMachineStorage(String storageCode) {
		AdMachineStorage adMachineStorage = adMachineStorageDao.find(storageCode);
		AdMachineStorageDto adMachineStorageDto = AdMachineStorageTransform.poToDto(adMachineStorage);
		return adMachineStorageDto;
	}



}
