package cn.com.wito.auth.dao;

import java.util.Date;
import java.util.List;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.CarddetailParamDto;
import cn.com.wito.auth.dto.ProductDto;
import cn.com.wito.auth.dto.SalesParamDto;
import cn.com.wito.auth.po.Carddetail;
import cn.com.wito.auth.po.Salebytime;
import cn.com.wito.auth.po.Sales;

public interface StatisticsDao {

	public Salebytime getSalebytimeAmountVolume(Date beginDate, Date endDate, int hour, String machine, String userCode);
	
	public List<Sales> getSalesAmountVolume(SalesParamDto salesParamDto);
	
	public Page<Carddetail> findPage(Pageable<Carddetail> pageable, CarddetailParamDto carddetailParamDto);
	
	public List<ProductDto> getProductFromCategory(long productCategoryId);
}
