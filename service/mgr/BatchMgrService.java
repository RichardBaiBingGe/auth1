package cn.com.wito.auth.service.mgr;


import java.util.List;
import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.BatchDto;


public interface BatchMgrService {
	
	/**
	 * 
	 * 
	 * @param 
	 * @return
	 */
	public boolean addBatchMgr(BatchDto batch);
	
	/**
	 * 
	 * 
	 * @param 
	 * @return
	 */
	public boolean modifyBatch(BatchDto batchDto);
	
	/**
	 * 
	 * 
	 * @param
	 * @return
	 */
	public boolean deleteBatch(String id);
	/**
	 * 
	 * 
	 * @param
	 * @return
	 */
	public List<BatchDto> findAllBatchDto() ;
	/**
	 * 
	 * 
	 * @param
	 * @return
	 */
	
	public Page<BatchDto> findPage(Pageable<BatchDto> pageable);
}
