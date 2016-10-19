package cn.com.wito.auth.service.mgr.impl;


import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dao.AdNodeDao;
import cn.com.wito.auth.dto.AdNodeDto;
import cn.com.wito.auth.po.AdNode;
import cn.com.wito.auth.service.mgr.AdNodeMgrService;
import cn.com.wito.auth.transform.AdNodeTransform;
@Service("adNodeMgrService")
public class AdNodeMgrServiceImpl implements AdNodeMgrService {
	
	
	@Resource
	private AdNodeDao adNodeDao;

	@Override
	public Page<AdNodeDto> findPage(Pageable<AdNodeDto> pageable) {
		Pageable<AdNode> adNodePageable = null;
		if (pageable != null) {
			
			adNodePageable = new Pageable<AdNode>();
		    adNodePageable.setEntity(AdNodeTransform.dtoToPo(pageable.getEntity()));
			adNodePageable.setOrderDirection(pageable.getOrderDirection());
			adNodePageable.setPageNumber(pageable.getPageNumber());
			adNodePageable.setPageSize(pageable.getPageSize());
		}

		Page<AdNode> adNodePage = adNodeDao.findPage(adNodePageable);
		Page<AdNodeDto> page = null;
		if (adNodePage != null) {
			List<AdNode> content = adNodePage.getContent();
			page = new Page<AdNodeDto>(AdNodeTransform.poLstToDtoLst(content),
					adNodePage.getTotal(), pageable);
		}
		return page;
	}

	@Override
	public boolean addAdNode(AdNodeDto adNodeDto) {
		AdNode adNode = AdNodeTransform.dtoToPo(adNodeDto);
		return adNodeDao.add(adNode);
	}

	@Override
	public List<AdNodeDto> findAllAdNode() {
		 List<AdNode> lsan= adNodeDao.find(null);
		 List<AdNodeDto> adNodeAll =AdNodeTransform.poLstToDtoLst(lsan);
		return  adNodeAll;
	}

	@Override
	public boolean modifyAdNode(AdNodeDto adNodeDto) {
		AdNode subject = AdNodeTransform.dtoToPo(adNodeDto);
		return adNodeDao.update(subject);
	}

	@Override
	public boolean deleteAdNode(String nodeId1) {
		
		return adNodeDao.delete(nodeId1);
	}




}
