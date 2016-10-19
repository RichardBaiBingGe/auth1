package cn.com.wito.auth.service.mgr;


import java.util.List;
import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.ProductSupervisionDto;


public interface ProductSupervisionMgrService {
	
	/**
	 * 
	 * 
	 * @param 
	 * @return
	 */
	public boolean addProductSupervisionMgr(ProductSupervisionDto productSupervisionDto);
	
	/**
	 * 
	 * 
	 * @param 
	 * @return
	 */
	public boolean modifyProductSupervision(ProductSupervisionDto productSupervisionDto);
	
	/**
	 * 
	 * 
	 * @param
	 * @return
	 */
	public boolean deleteProductSupervision(String id);
	/**
	 * 
	 * 
	 * @param
	 * @return
	 */
	public List<ProductSupervisionDto> findAllProductSupervision() ;
	/**
	 * 
	 * 
	 * @param
	 * @return
	 */
	
	public Page<ProductSupervisionDto> findPage(Pageable<ProductSupervisionDto> pageable);
}
