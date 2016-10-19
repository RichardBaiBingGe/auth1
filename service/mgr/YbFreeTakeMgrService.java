package cn.com.wito.auth.service.mgr;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.YbFreeTakeDto;

/**
 * 
 * @author zhangdi
 *
 */
public interface YbFreeTakeMgrService {
	/**
	 * 增加免费领项
	 * 
	 * @param 
	 * @return
	 */
	public boolean addYbFreeTake(YbFreeTakeDto ybFreeTakeDto);
	/**
	 * 修改免费领项
	 * 
	 * @param 
	 * @return
	 */
	public boolean modifyYbFreeTake(YbFreeTakeDto ybFreeTakeDto);
	/**
	 * 删除免费领项
	 * 
	 * @param 
	 * @return
	 */
	public boolean deleteYbFreeTake(Long id);
	/**
	 * 分页查找免费领项
	 * 
	 * @param 
	 * @return
	 */
	public Page<YbFreeTakeDto> findPage(Pageable<YbFreeTakeDto> pageable);
	/**
	 * 根据id查询单条记录
	 * 
	 * @param code
	 * @return
	 */
	public YbFreeTakeDto find(Long id);
	
}
