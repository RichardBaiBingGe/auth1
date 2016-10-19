package cn.com.wito.auth.dao;

import java.util.List;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.po.Order;

public interface OrderDao extends IDao<Order> {
    /**
     * Combined Query Paging
     * */
	public Page<Order> findPage2(Pageable<Order> pageable,Order order);
	/**
	 * Combined Query method maximum number of records
	 * */
	public long count1(Pageable<Order> pageable,Order order);
	public Order getMothOrderPrice();
	public Order getAllOrderPrice();
	public List<Order> getYearMonthOrderPrice();
}
