package cn.com.wito.auth.service.mgr;

import java.util.Date;
import java.util.List;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.CarddetailDto;
import cn.com.wito.auth.dto.CarddetailParamDto;
import cn.com.wito.auth.dto.ProductDto;
import cn.com.wito.auth.dto.SalesParamDto;
import cn.com.wito.auth.po.Salebytime;
import cn.com.wito.auth.po.Sales;

public interface StatisticsMgrService {

	public Salebytime getSalebytimeAmountVolume(Date beginDate, Date endDate, int hour, String machine, String userCode);
	
	public List<Sales> getSalesAmountVolume(SalesParamDto salesParamDto, String userCode);
	
	public Page<CarddetailDto> findPage(Pageable<CarddetailDto> pageable, CarddetailParamDto carddetailParamDto, String userCode);
	
	public List<ProductDto> getProductFromCategory(long productCategoryId);
}
