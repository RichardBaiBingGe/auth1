package cn.com.wito.auth.dao;

import java.util.Date;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.SaleHistoryDetailDto;
/**
 * 历史销售明细
 * 
 * @author ZhangDi
 * 
 */
public interface SaleHistoryDetailDao extends IDao<SaleHistoryDetailDto> {
	public Page<SaleHistoryDetailDto> findList(String nodeType,String paymentMethodName,Date beginDate,Date endDate,Pageable<SaleHistoryDetailDto> pageable);
}
