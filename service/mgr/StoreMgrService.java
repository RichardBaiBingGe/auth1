package cn.com.wito.auth.service.mgr;

import java.util.List;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.StoreDto;
import cn.com.wito.auth.dto.SysSubjectDto;
import cn.com.wito.auth.exception.BussinessException;

/**
 * 门店管理业务接口
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
public interface StoreMgrService {

	/**
	 * 分页查询
	 * 
	 * @param pageable
	 * @return
	 */
	public Page<StoreDto> findPage(Pageable<StoreDto> pageable);

	/**
	 * 根据code查询单个门店
	 * 
	 * @param code
	 * @return
	 */
	public StoreDto find(String code);
	
	/**
	 * 增加门店
	 * 
	 * @param storeDto
	 * @return
	 */
	public boolean add(StoreDto storeDto);

	/**
	 * 修改门店
	 * 
	 * @param storeDto
	 * @return
	 */
	public boolean modify(StoreDto storeDto);

	/**
	 * 删除门店
	 * 
	 * @param code
	 * @return
	 */
	public boolean delete(String code);

	
	public List<StoreDto> findStoreByUserCode(String userCode);
	
	/**
	 * 根据角色code查询角色拥有的门店信息
	 * 
	 * @param roleCode
	 * @return
	 */
	public List<StoreDto> findRoleStore(String roleCode );
	
	public boolean addRoleStore(String roleCode,List<String> storeCodes) throws BussinessException;

}
