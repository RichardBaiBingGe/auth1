package cn.com.wito.auth.dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.dao.SaleHistoryDetailDao;
import cn.com.wito.auth.dto.SaleHistoryDetailDto;
import cn.com.wito.auth.exception.DaoException;
import cn.com.wito.auth.po.SaleHistoryDetail;
import cn.com.wito.auth.transform.SaleHistoryDetialTransform;
/**
 * 历史销售明细
 * 
 * @author ZhangDi
 * 
 */
@Service("SaleHistoryDetailDaoImpl")
public class SaleHistoryDetailDaoImpl extends BaseDao<SaleHistoryDetailDto> implements SaleHistoryDetailDao {
	
	public static final String FIND_SALEHISTORY_DETAIL = "findSaleHistoryDetail";
	public static final String FIND_SALEHISTORY_COUNT = "findSaleHistoryCount";
	
	public Page<SaleHistoryDetailDto> findList(String nodeType,String paymentMethodName,Date beginDate,Date endDate,Pageable<SaleHistoryDetailDto> pageable){
			Map<String, Object> queryMap = new HashMap<String, Object>();
			queryMap.put("operateSubjectCode", pageable.getEntity().getOperateSubjectCode());//用户权限设置
			queryMap.put("nodeType", nodeType);
			queryMap.put("paymentMethodName", paymentMethodName);	
			queryMap.put("beginDate", beginDate);
			queryMap.put("endDate", endDate);
			int pageNum = 0;
			int pageSize = 0;
			long total = 0;
			if (pageable != null) {
				pageNum = pageable.getPageNumber();
				pageSize = pageable.getPageSize();
				total = count(nodeType,paymentMethodName,beginDate,endDate,pageable);
				int start = (pageNum - 1) * pageSize;
				int end = pageSize;
				queryMap.put("start", start);
				queryMap.put("limit", end);
			}
		
			List<SaleHistoryDetail> contents=null;
			List<SaleHistoryDetailDto> lsdto=null;
			try {
				contents = this.getSqlSessionTemplate().selectList(
				this.getSqlId(FIND_SALEHISTORY_DETAIL), queryMap);
			    lsdto=SaleHistoryDetialTransform.poLstToDtoLst(contents);
			} catch (RuntimeException e) {
				throw new DaoException(e.getCause());
			}
			Page<SaleHistoryDetailDto> page = new Page<SaleHistoryDetailDto>(lsdto, total, pageable);
			return page;
		}
	
	public long count(String nodeType,String paymentMethodName,Date beginDate,Date endDate,Pageable<SaleHistoryDetailDto> pageable) {
		Map<String, Object> queryMap = new HashMap<String, Object>();
		queryMap.put("operateSubjectCode", pageable.getEntity().getOperateSubjectCode());
		queryMap.put("nodeType", nodeType);
		queryMap.put("paymentMethodName", paymentMethodName);	
		queryMap.put("beginDate", beginDate);
		queryMap.put("endDate", endDate);
		long count = this.getSqlSessionTemplate().selectOne(
				this.getSqlId(FIND_SALEHISTORY_COUNT), queryMap);
		return count;
	}

	
}
