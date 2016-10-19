package cn.com.wito.auth.service.mgr.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.constants.Constants;
import cn.com.wito.auth.dao.OrderDao;
import cn.com.wito.auth.dto.AdSysPlanDto;
import cn.com.wito.auth.dto.OrderDto;
import cn.com.wito.auth.dto.VendingMachineProertiesDto;
import cn.com.wito.auth.po.AdSysPlan;
import cn.com.wito.auth.po.Order;
import cn.com.wito.auth.po.VendingMachineProerties;
import cn.com.wito.auth.service.mgr.OrderMgrService;
import cn.com.wito.auth.transform.AdSysPlanTransform;
import cn.com.wito.auth.transform.OrderTransform;
import cn.com.wito.auth.transform.VendingMachineProertiesform;

/**
 * 订单管理
 * 
 * @author FJG
 * 
 */
@Service("orderMgrService")
public class OrderMgrServiceImpl implements OrderMgrService {

	@Resource
	private OrderDao orderDao;

	public OrderDto findOrder(Long OrderID) {
		Order order = orderDao.find(OrderID);
		OrderDto orderDto = OrderTransform.poToDto(order);
		return orderDto;
	}

	public Page<OrderDto> findPage(Pageable<OrderDto> pageable) {
		Pageable<Order> orderPageable = new Pageable<Order>();
		if (pageable != null) {
			orderPageable
					.setEntity(OrderTransform.DtoTopo(pageable.getEntity()));
			orderPageable.setOrderDirection(pageable.getOrderDirection());
			orderPageable.setPageNumber(pageable.getPageNumber());
			orderPageable.setPageSize(pageable.getPageSize());
			orderPageable.setSearchProperty(pageable.getSearchProperty());
			orderPageable.setSearchValue(pageable.getSearchValue());
		}
		Page<Order> orderPage = orderDao.findPage(orderPageable);
		Page<OrderDto> page = null;
		if (orderPage != null) {
			List<Order> content = orderPage.getContent();
			page = new Page<OrderDto>(OrderTransform.poLstToDtoLst(content),
					orderPage.getTotal(), pageable);
		}
		return page;
	}

	public boolean modifyOrder(OrderDto orderDto) {
		Order order = OrderTransform.DtoTopo(orderDto);
		return orderDao.update(order);
	}

	public boolean deleteOrder(Long OrderID) {

		return orderDao.delete(OrderID);
	}


	public Page<OrderDto> findPage2(Pageable<OrderDto> pageable,
			OrderDto orderDto) {
		Pageable<Order> orderPageable = new Pageable<Order>();
		if (pageable != null) {
			orderPageable
					.setEntity(OrderTransform.DtoTopo(pageable.getEntity()));
			orderPageable.setOrderDirection(pageable.getOrderDirection());
			orderPageable.setPageNumber(pageable.getPageNumber());
			orderPageable.setPageSize(pageable.getPageSize());
			orderPageable.setSearchProperty(pageable.getSearchProperty());
			orderPageable.setSearchValue(pageable.getSearchValue());
		}
		Order order=null;
		if(orderDto != null){
			order = OrderTransform.DtoTopo(orderDto);
		}
		Page<Order> orderPage = orderDao.findPage2(orderPageable,order);
		Page<OrderDto> page = null;
		if (orderPage != null) {
			List<Order> content = orderPage.getContent();
			page = new Page<OrderDto>(OrderTransform.poLstToDtoLst(content),
					orderPage.getTotal(), pageable);
		}
		return page;
	}
	public OrderDto getMothOrderPrice() {
		Order order  = orderDao.getMothOrderPrice();
		OrderDto orderDto = OrderTransform.poToDto(order);
		return orderDto;
	}
	public OrderDto getAllOrderPrice(){
		Order order  = orderDao.getAllOrderPrice();
		OrderDto orderDto = OrderTransform.poToDto(order);
		return orderDto;
	}
	public List<OrderDto> getYearMonthOrderPrice(){
		List<Order> rolelist = orderDao.getYearMonthOrderPrice();
		List<OrderDto> result = OrderTransform.poLstToDtoLst(rolelist);
		return result;
	}
}
