package cn.com.wito.auth.service.mgr.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dao.ProductSupervisionDao;
import cn.com.wito.auth.dto.ProductSupervisionDto;
import cn.com.wito.auth.po.ProductSupervision;
import cn.com.wito.auth.service.mgr.ProductSupervisionMgrService;
import cn.com.wito.auth.transform.ProductSupervisionTransform;



@Service("ProductSupervisionMgrService")
public class ProductSupervisionMgrServiceImpl implements ProductSupervisionMgrService {

	@Resource
	private ProductSupervisionDao productSupervisionDao;
	
	@Override
	public boolean addProductSupervisionMgr(ProductSupervisionDto productSupervisionDto) {

		ProductSupervision ps = ProductSupervisionTransform.dtoToPo(productSupervisionDto);
		
		return productSupervisionDao.add(ps);
	}

	@Override
	public boolean modifyProductSupervision(ProductSupervisionDto productSupervisionDto) {
		
		ProductSupervision ps = ProductSupervisionTransform.dtoToPo(productSupervisionDto);
		
		return productSupervisionDao.update(ps);
	}

	@Override
	public boolean deleteProductSupervision(String id) {
		
		return productSupervisionDao.delete(id);
	}

	@Override
	public List<ProductSupervisionDto> findAllProductSupervision() {
		List<ProductSupervision> lsan = productSupervisionDao.find(null);

		List<ProductSupervisionDto> productSupervisionAll = ProductSupervisionTransform.poLstToDtoLst(lsan);
		return productSupervisionAll;
	}

	@Override
	public Page<ProductSupervisionDto> findPage(Pageable<ProductSupervisionDto> pageable) {
		Pageable<ProductSupervision> productSupervisionPageable = null;
		if (pageable != null) {

			productSupervisionPageable = new Pageable<ProductSupervision>();
			productSupervisionPageable.setEntity(ProductSupervisionTransform.dtoToPo(pageable.getEntity()));
			productSupervisionPageable.setOrderDirection(pageable.getOrderDirection());
			productSupervisionPageable.setPageNumber(pageable.getPageNumber());
			productSupervisionPageable.setPageSize(pageable.getPageSize());
			productSupervisionPageable.setSearchValue(pageable.getSearchValue());;
		}

		Page<ProductSupervision> productSupervisionPage = productSupervisionDao.findPage(productSupervisionPageable);
		Page<ProductSupervisionDto> page = null;
		if (productSupervisionPage != null) {
			List<ProductSupervision> content = productSupervisionPage.getContent();
			page = new Page<ProductSupervisionDto>(
					ProductSupervisionTransform.poLstToDtoLst(content),
					productSupervisionPage.getTotal(), pageable);
		}
		return page;
	}

}
