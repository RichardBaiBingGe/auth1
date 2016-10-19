package cn.com.wito.auth.service.mgr;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.VendingMachineDto;

/**
 * 售货机广告功能
 * @author wangxing
 */
public interface AdMachineMgrService {

	/**
	 * 分页查询查询角色下的售货机信息
	 */
	public Page<VendingMachineDto> findPage(Pageable<VendingMachineDto> pageable);
	
	/**
	 * 查询售货机广告资源
	 */
	public String findAdResource(String machineCode);
	
	/**
	 * 更新售货机广告资源
	 */
	public boolean updateAdResource(String code, String adResourceCodes);
	
	/**
	 * 售货机广告资源下载
	 */
	public File download(String code, HttpServletResponse response, HttpServletRequest request);
}
