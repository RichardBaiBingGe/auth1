package cn.com.wito.auth.service.mgr;

import java.util.List;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.OrderDto;


/**
 * 订单管理的业务接口
 * 
 * @author FJG
 * 
 */
public interface OrderMgrService {
	// 根据订单ID查询订单信息
	public OrderDto findOrder(Long OrderID);

	// 分页查询订单信息
	public Page<OrderDto> findPage(Pageable<OrderDto> pageable);
	// 组合分页查询订单信息
    public Page<OrderDto> findPage2(Pageable<OrderDto> pageable,OrderDto orderDto);

	// 修改订单信息
	public boolean modifyOrder(OrderDto orderDto);

	// 删除订单
	public boolean deleteOrder(Long OrderID);
	//查询当月订单收入
	public OrderDto getMothOrderPrice();
	//查询所有订单收入
	public OrderDto getAllOrderPrice();
	//查询近一年每月收入
	public List<OrderDto> getYearMonthOrderPrice();

}
