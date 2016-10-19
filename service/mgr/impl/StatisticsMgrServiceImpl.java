package cn.com.wito.auth.service.mgr.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dao.StatisticsDao;
import cn.com.wito.auth.dao.SysUserDao;
import cn.com.wito.auth.dto.CarddetailDto;
import cn.com.wito.auth.dto.CarddetailParamDto;
import cn.com.wito.auth.dto.ProductDto;
import cn.com.wito.auth.dto.SalesParamDto;
import cn.com.wito.auth.po.Carddetail;
import cn.com.wito.auth.po.Salebytime;
import cn.com.wito.auth.po.Sales;
import cn.com.wito.auth.po.SysUser;
import cn.com.wito.auth.service.mgr.StatisticsMgrService;
import cn.com.wito.auth.transform.CarddetailTransform;

/**
 * 
 * @author wangxing
 *
 */
@Service("statisticsMgrService")
public class StatisticsMgrServiceImpl implements StatisticsMgrService{

	@Resource(name = "statisticsDao")
	private StatisticsDao statisticsDao;
	
	@Resource(name="sysUserDao")
	private SysUserDao sysUserDao;
	
	
	public Salebytime getSalebytimeAmountVolume(Date beginDate, Date endDate, int hour, String machine, String userCode) {
		
		SysUser sysUser = sysUserDao.find(userCode);
		return statisticsDao.getSalebytimeAmountVolume(beginDate, endDate, hour, machine, sysUser.getRoleCode());
	}
	
	public List<Sales> getSalesAmountVolume(SalesParamDto salesParamDto, String userCode) {
		
		SysUser sysUser = sysUserDao.find(userCode);
		salesParamDto.setRoleCode(sysUser.getRoleCode());
		
		return statisticsDao.getSalesAmountVolume(salesParamDto);
	}

	public Page<CarddetailDto> findPage(Pageable<CarddetailDto> pageable, CarddetailParamDto carddetailParamDto, String userCode) {
		
		Pageable<Carddetail> carddetailPageable = new Pageable<Carddetail>();
		if (pageable != null) {
			carddetailPageable.setEntity(CarddetailTransform.dtoToPo(pageable.getEntity()));
			carddetailPageable.setOrderDirection(pageable.getOrderDirection());
			carddetailPageable.setPageNumber(pageable.getPageNumber());
			carddetailPageable.setPageSize(pageable.getPageSize());
			carddetailPageable.setSearchProperty(pageable.getSearchProperty());
			carddetailPageable.setSearchValue(pageable.getSearchValue());
		}
		
		SysUser sysUser = sysUserDao.find(userCode);
		carddetailParamDto.setRoleCode(sysUser.getRoleCode());
		
		Page<Carddetail> carddetailPage = statisticsDao.findPage(carddetailPageable, carddetailParamDto);
		
		Page<CarddetailDto> page = null; 
		if (carddetailPage != null) {
			List<Carddetail> content = carddetailPage.getContent();
			page = new Page<CarddetailDto>(CarddetailTransform.poListToDtoList(content), carddetailPage.getTotal(), pageable);
		}
		return page;
	}

	@Override
	public List<ProductDto> getProductFromCategory(long productCategoryId) {
		return statisticsDao.getProductFromCategory(productCategoryId);
	}

}
