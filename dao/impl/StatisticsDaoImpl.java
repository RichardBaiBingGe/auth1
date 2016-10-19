package cn.com.wito.auth.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.constants.Constants;
import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.dao.StatisticsDao;
import cn.com.wito.auth.dto.CarddetailParamDto;
import cn.com.wito.auth.dto.ProductDto;
import cn.com.wito.auth.dto.SalesParamDto;
import cn.com.wito.auth.exception.DaoException;
import cn.com.wito.auth.po.Carddetail;
import cn.com.wito.auth.po.Salebytime;
import cn.com.wito.auth.po.Sales;

/**
 *  
 * @author wangxing
 *
 */
@Repository("statisticsDao")
public class StatisticsDaoImpl extends BaseDao<Salebytime> implements StatisticsDao{

	public static final String FIND_SALEBYTIME_AMOUNT_VOLUME = "findSalebytimeAmountVolume";
	
	public static final String FIND_SALES_AMOUNT_VOLUME = "findSalesAmountVolume";
	
	public static final String FIND_PRODUCT_FROM_CATEGORY = "findProductFromCategory";
	
	public Salebytime getSalebytimeAmountVolume(Date beginDate, Date endDate, int hour, String machine, String userCode) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("beginDate", beginDate);
		map.put("endDate", endDate);
		map.put("hour", hour);
		map.put("machine", machine);
		map.put("userCode", userCode);
		
		return this.getSqlSessionTemplate().selectOne(this.getSqlId(FIND_SALEBYTIME_AMOUNT_VOLUME),map);
		
	}
	
	public List<Sales> getSalesAmountVolume(SalesParamDto salesParamDto) {
		
		return this.getSqlSessionTemplate().selectList(this.getSqlId(FIND_SALES_AMOUNT_VOLUME),salesParamDto);
	}

	public Page<Carddetail> findPage(Pageable<Carddetail> pageable, CarddetailParamDto carddetailParamDto) {

		int pageNum = 0;
		int pageSize = 0;
		long total = 0;
		if (pageable != null) {
			pageNum = pageable.getPageNumber();
			pageSize = pageable.getPageSize();
			total = this.getSqlSessionTemplate().selectOne(
					this.getSqlId(Constants.COUNT), carddetailParamDto);
			int start = (pageNum - 1) * pageSize;
			int end = pageSize;
			carddetailParamDto.setLimit(end);
			carddetailParamDto.setStart(start);
		}
		List<Carddetail> contents = new ArrayList<Carddetail>();
		try {
			contents = this.getSqlSessionTemplate().selectList(
					this.getSqlId(Constants.FIND_PAGE), carddetailParamDto);
		} catch (RuntimeException e) {
			throw new DaoException(e.getCause());
		}
		Page<Carddetail> page = new Page<Carddetail>(contents, total, pageable);
		return page;
	}
	
	public List<ProductDto> getProductFromCategory(long productCategoryId) {
		
		return this.getSqlSessionTemplate().selectList(this.getSqlId(FIND_PRODUCT_FROM_CATEGORY),productCategoryId);
	}
	
}
