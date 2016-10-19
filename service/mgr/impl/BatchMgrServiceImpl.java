package cn.com.wito.auth.service.mgr.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dao.BatchDao;
import cn.com.wito.auth.dto.BatchDto;
import cn.com.wito.auth.po.Batch;
import cn.com.wito.auth.service.mgr.BatchMgrService;
import cn.com.wito.auth.transform.BatchTransform;


@Service("BatchMgrService")
public class BatchMgrServiceImpl implements BatchMgrService {

	@Resource
	private BatchDao batchDao;

	@Override
	public boolean addBatchMgr(BatchDto batchDto) {
		Batch batch = BatchTransform.dtoToPo(batchDto);

		return batchDao.add(batch);
	}

	@Override
	public boolean modifyBatch(BatchDto batchDto) {
		Batch batch = BatchTransform.dtoToPo(batchDto);

		return batchDao.update(batch);
	}

	@Override
	public boolean deleteBatch(String id) {
		
		return batchDao.delete(id);
	}

	@Override
	public List<BatchDto> findAllBatchDto() {
		List<Batch> lsan = batchDao.find(null);
		List<BatchDto> batchDtoAll = BatchTransform.poLstToDtoLst(lsan);

		return batchDtoAll;
	}

	@Override
	public Page<BatchDto> findPage(Pageable<BatchDto> pageable) {
		Pageable<Batch> batchPageable = null;
		if (pageable != null) {

			batchPageable = new Pageable<Batch>();
			batchPageable.setEntity(BatchTransform.dtoToPo(pageable.getEntity()));
			batchPageable.setOrderDirection(pageable.getOrderDirection());
			batchPageable.setPageNumber(pageable.getPageNumber());
			batchPageable.setPageSize(pageable.getPageSize());
			batchPageable.setSearchProperty(pageable.getSearchProperty());
		}

		Page<Batch> batchPage = batchDao.findPage(batchPageable);
		Page<BatchDto> page = null;
		if (batchPage != null) {
			List<Batch> content = batchPage.getContent();
			page = new Page<BatchDto>(
					BatchTransform.poLstToDtoLst(content),
					batchPage.getTotal(), pageable);
		}
		return page;
	}

}
