package cn.com.wito.auth.service.mgr.impl;

import java.util.Date;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dao.SaleHistoryDetailDao;
import cn.com.wito.auth.dto.SaleHistoryDetailDto;
import cn.com.wito.auth.service.mgr.SaleHistoryMgrService;
/**
 * 历史销售明细
 * 
 * @author ZhangDi
 * 
 */
@Service("SaleHistoryMgrServiceImpl")
public class SaleHistoryMgrServiceImpl  implements SaleHistoryMgrService {
	@Resource
	private SaleHistoryDetailDao saleHistoryDetailDao;
	
	public Page<SaleHistoryDetailDto> findList(String nodeType,String paymentMethodName,Date beginDate,Date endDate,Pageable<SaleHistoryDetailDto> pageable){
		Page<SaleHistoryDetailDto> page=saleHistoryDetailDao.findList(nodeType, paymentMethodName,beginDate,endDate,pageable);
		return page;
	}
}
