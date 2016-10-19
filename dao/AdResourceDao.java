package cn.com.wito.auth.dao;

import java.util.List;
import cn.com.wito.auth.po.AdResource;
/**
 * 添加资源接口
 * 
 * @author wy<895791598@qq.com>
 * 
 */
public interface AdResourceDao extends IDao<AdResource>{

	public boolean releaseAd(String adCode,String serNum);
	public List<String> findAdMachine(String adCode);
	public boolean deleteAdMachine(String adCode);

	public List<String> findAllMachine(String userCode);
	
}
