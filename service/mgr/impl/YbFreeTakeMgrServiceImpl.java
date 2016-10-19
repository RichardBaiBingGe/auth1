package cn.com.wito.auth.service.mgr.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dao.IVendingMachineDao;
import cn.com.wito.auth.dao.YbFreeTakeDao;
import cn.com.wito.auth.dto.YbFreeTakeDto;
import cn.com.wito.auth.po.YbFreeTake;
import cn.com.wito.auth.service.mgr.YbFreeTakeMgrService;
import cn.com.wito.auth.transform.YbFreeTakeTransform;

/**
 * 
 * @author zhangdi
 *
 */
@Service("YbFreeTakeMgrServiceImpl")
public class YbFreeTakeMgrServiceImpl implements YbFreeTakeMgrService {
	
	@Resource
	private YbFreeTakeDao ybFreeTakeDao;
	@Resource
	private IVendingMachineDao vendingMachineDao;

	@Override
	public boolean addYbFreeTake(YbFreeTakeDto ybFreeTakeDto) {
		
		ybFreeTakeDto.setCreateDate(new Date());
		YbFreeTake ybFreeTake = YbFreeTakeTransform.dtoToPo(ybFreeTakeDto);
		return ybFreeTakeDao.add(ybFreeTake);
	}

	@Override
	public boolean modifyYbFreeTake(YbFreeTakeDto ybFreeTakeDto) {
		ybFreeTakeDto.setUpdateDate(new Date());
		YbFreeTake ybFreeTake = YbFreeTakeTransform.dtoToPo(ybFreeTakeDto);
		return ybFreeTakeDao.update(ybFreeTake);
	}

	@Override
	public boolean deleteYbFreeTake(Long id) {
		return ybFreeTakeDao.delete(id);
	}

	@Override
	public Page<YbFreeTakeDto> findPage(Pageable<YbFreeTakeDto> pageable) {
		Pageable<YbFreeTake> ybPageable = null;
		if (pageable != null) {
			
			ybPageable = new Pageable<YbFreeTake>();
			ybPageable.setEntity(YbFreeTakeTransform.dtoToPo(pageable.getEntity()));
			ybPageable.setOrderDirection(pageable.getOrderDirection());
			ybPageable.setPageNumber(pageable.getPageNumber());
			ybPageable.setPageSize(pageable.getPageSize());
			ybPageable.setSearchProperty(pageable.getSearchProperty());
		}

		Page<YbFreeTake> ybFreeTakePage = ybFreeTakeDao.findPage(ybPageable);
		Page<YbFreeTakeDto> page = null;
		if (ybPageable != null) {
			List<YbFreeTake> content = ybFreeTakePage.getContent();
			page = new Page<YbFreeTakeDto>(YbFreeTakeTransform.PoLstToDtoLst(content),
					ybFreeTakePage.getTotal(), pageable);
		}
		return page;
	}

	@Override
	public YbFreeTakeDto find(Long id) {
		YbFreeTake ybFreeTake = ybFreeTakeDao.find(id);
		return YbFreeTakeTransform.PoToDto(ybFreeTake);
	}

}
