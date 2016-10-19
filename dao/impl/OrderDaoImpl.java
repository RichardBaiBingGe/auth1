package cn.com.wito.auth.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.constants.Constants;
import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.dao.OrderDao;
import cn.com.wito.auth.exception.DaoException;
import cn.com.wito.auth.po.Order;

/**
 * 订单管理
 * @author FJG
 *
 */

@Repository("orderDao")

public class OrderDaoImpl extends BaseDao<Order> implements OrderDao {
	public static final String GET_MOTH_ORDER_PRICE="getMothOrderPrice";
	public static final String GET_ALL_ORDER_PRICE="getAllOrderPrice";
	public static final String GET_YEAR_MONTH_ORDER_PRICE="getYearMonthOrderPrice";
	
	@Override
	public Page<Order> findPage2(Pageable<Order> pageable, Order order) {
		Map<String, Object> queryMap = new HashMap<String, Object>();
		int pageNum = 0;
		int pageSize = 0;
		long total = 0;
		if(order != null){
			String sn=order.getSn();
			String consignee=order.getConsignee();
			String phone=order.getPhone();
			String paymentMethodName=order.getPaymentMethodName();
			String usercode=order.getShipperName();
			String tname=order.getShipperCode();
			queryMap.put("Sn",sn);
			queryMap.put("Consignee",consignee);
			queryMap.put("Phone",phone);
			queryMap.put("PaymentMethodName",paymentMethodName);
			queryMap.put("userCode",usercode);
			queryMap.put("Tname",tname);
		}
		if (pageable != null) {
			pageNum = pageable.getPageNumber();
			pageSize = pageable.getPageSize();
			total = count1(pageable,order);
			int start = (pageNum - 1) * pageSize;
			int end = pageSize;
			queryMap.put("start", start);
			queryMap.put("limit", end);
		}
		List<Order> contents = new ArrayList<Order>();
		try {
			contents = this.getSqlSessionTemplate().selectList(
					this.getSqlId(Constants.FIND_PAGE2), queryMap);
		} catch (RuntimeException e) {
			throw new DaoException(e.getCause());
		}
		Page<Order> page = new Page<Order>(contents, total, pageable);
		return page;
	}


	public long count1(Pageable<Order> pageable, Order order) {
		Map<String, Object> queryMap = new HashMap<String, Object>();
		if(order != null){
			String sn=order.getSn();
			String consignee=order.getConsignee();
			String phone=order.getPhone();
			String paymentMethodName=order.getPaymentMethodName();
			String usercode=order.getShipperName();
			String tname=order.getShipperCode();
			queryMap.put("Sn",sn);
			queryMap.put("Consignee",consignee);
			queryMap.put("Phone",phone);
			queryMap.put("PaymentMethodName",paymentMethodName);
			queryMap.put("userCode",usercode);
			queryMap.put("Tname",tname);
		}
		long count = this.getSqlSessionTemplate().selectOne(
				this.getSqlId(Constants.COUNT), queryMap);
		return count;
	}
	public Order getMothOrderPrice() {
		return this.getSqlSessionTemplate().selectOne(
				this.getSqlId(GET_MOTH_ORDER_PRICE));
		}
	public Order getAllOrderPrice() {
		return this.getSqlSessionTemplate().selectOne(
				this.getSqlId(GET_ALL_ORDER_PRICE));
		}
	public List<Order> getYearMonthOrderPrice() {
		return this.getSqlSessionTemplate().selectList(
				this.getSqlId(GET_YEAR_MONTH_ORDER_PRICE));
		}
}
