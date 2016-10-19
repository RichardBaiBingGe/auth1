package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.constants.MachineOrderStatusType;
import cn.com.wito.auth.constants.OrderMakedType;
import cn.com.wito.auth.constants.OrderSourceType;
import cn.com.wito.auth.constants.OrderStatusType;
import cn.com.wito.auth.constants.PaymentStatusType;
import cn.com.wito.auth.constants.ShippingStatusType;
import cn.com.wito.auth.dto.OrderDto;
import cn.com.wito.auth.po.Order;

/**
 * PO对象转DTO
 * 
 * @param OrderDao
 * @return
 */
public class OrderTransform {
	public static OrderDto poToDto(Order order) {
		OrderDto orderDto = null;
		if (order != null) {
			/** 是否已分配库存 */
			Integer isAllocatedStock = order.getIsAllocatedStock();
			EnableFlagType isAllocatedStockType = isAllocatedStock == null ? null
					: EnableFlagType.fromCode(isAllocatedStock);
			/** 是否开据发票 */
			Integer isInvoice = order.getIsInvoice();
			EnableFlagType isInvoiceType = isInvoice == null ? null
					: EnableFlagType.fromCode(isInvoice);
			/** 餐厅制作状态 */
			Integer orderMaked = order.getOrderMaked();
			OrderMakedType orderMakedType = orderMaked == null ? null
					: OrderMakedType.fromCode(orderMaked);
			/** 订单状态 */
			Integer orderStatus = order.getOrderStatus();
			OrderStatusType orderStatusType = orderStatus == null ? null
					: OrderStatusType.fromCode(orderStatus);
			/** 支付状态 */
			Integer paymentStatus = order.getPaymentStatus();
			PaymentStatusType paymentStatusType = paymentStatus == null ? null
					: PaymentStatusType.fromCode(paymentStatus);
			/** 配送状态 */
			Integer shippingStatus = order.getShippingStatus();
			ShippingStatusType shippingStatusType = shippingStatus == null ? null
					: ShippingStatusType.fromCode(shippingStatus);
			/** 售货机订单状态 */
			Integer machineOrderStatus = order.getMachineOrderStatus();
			MachineOrderStatusType machineOrderStatusType = machineOrderStatus == null ? null
					: MachineOrderStatusType.fromCode(machineOrderStatus);
			/** 订单来源 */
			Integer orderSource = order.getOrderSource();
			OrderSourceType orderSourceType = orderSource == null ? null
					: OrderSourceType.fromCode(orderSource);

			orderDto = new OrderDto(order.getId(), order.getCreateDate(),
					order.getModifyDate(), order.getAddress(),
					order.getAmountPaid(), order.getAreaName(),
					order.getConsignee(), order.getCouponDiscount(),
					order.getExpire(), order.getFee(), order.getFreight(),
					order.getInvoiceTitle(), isAllocatedStockType,
					isInvoiceType, order.getLockExpire(), order.getMemo(),
					order.getOffsetAmount(), orderStatusType,
					order.getPaymentMethodName(), paymentStatusType,
					order.getPhone(), order.getPoint(), order.getPromotion(),
					order.getPromotionDiscount(),
					order.getShippingMethodName(), shippingStatusType,
					order.getSn(), order.getTax(), order.getZipCode(),
					order.getArea(), order.getCouponCode(), order.getMember(),
					order.getOperator(), order.getPaymentMethod(),
					order.getShippingMethod(), order.getAdminName(),
					order.getExpireDate(), order.getExpireTime(),
					order.getItemsSize(), orderMakedType, orderSourceType,
					order.getOrderTime(), order.getPrintCount(),
					order.getShipperCode(), order.getShipperName(),
					order.getAdmin(), machineOrderStatusType,
					order.getVendingMachine(), order.getPaymentTime(),
					order.getBarCode(), order.getStore(),
					order.getOperateSubjectCode(),
					order.getOperateSubjectName(), order.getMachineId(),
					order.getMachine());
		}

		return orderDto;
	}

	public static List<OrderDto> poLstToDtoLst(List<Order> lstorder) {
		List<OrderDto> lstorderDto = new ArrayList<OrderDto>();
		if (lstorder != null) {
			OrderDto orderDto = null;
			for (Order or : lstorder) {
				orderDto = poToDto(or);
				lstorderDto.add(orderDto);
			}
		}
		return lstorderDto;
	}

	public static Order DtoTopo(OrderDto orderDto) {
		Order order = null;
		if (orderDto != null) {
			/** 是否已分配库存 */
			EnableFlagType isAllocatedStock = orderDto.getIsAllocatedStock();
			/** 是否开据发票 */
			EnableFlagType invoice = orderDto.getIsInvoice();
			/** 餐厅制作状态 */
			OrderMakedType orderMaked = orderDto.getOrderMaked();
			/** 订单状态 */
			OrderStatusType orderStatus = orderDto.getOrderStatus();
			/** 支付状态 */
			PaymentStatusType paymentStatus = orderDto.getPaymentStatus();
			/** 配送状态 */
			ShippingStatusType shippingStatus = orderDto.getShippingStatus();
			/** 售货机订单状态 */
			MachineOrderStatusType machineOrderStatus = orderDto
					.getMachineOrderStatus();
			/** 订单来源 */
			OrderSourceType orderSource = orderDto.getOrderSource();

			order = new Order(orderDto.getId(), orderDto.getCreateDate(),
					orderDto.getModifyDate(), orderDto.getAddress(),
					orderDto.getAmountPaid(), orderDto.getAreaName(),
					orderDto.getConsignee(), orderDto.getCouponDiscount(),
					orderDto.getExpire(), orderDto.getFee(),
					orderDto.getFreight(), orderDto.getInvoiceTitle(),
					isAllocatedStock == null ? null : isAllocatedStock
							.getCode(), invoice == null ? null
							: invoice.getCode(), orderDto.getLockExpire(),
					orderDto.getMemo(), orderDto.getOffsetAmount(),
					orderStatus == null ? null : orderStatus.getCode(),
					orderDto.getPaymentMethodName(),
					paymentStatus == null ? null : paymentStatus.getCode(),
					orderDto.getPhone(), orderDto.getPoint(),
					orderDto.getPromotion(), orderDto.getPromotionDiscount(),
					orderDto.getShippingMethodName(),
					shippingStatus == null ? null : shippingStatus.getCode(),
					orderDto.getSn(), orderDto.getTax(), orderDto.getZipCode(),
					orderDto.getArea(), orderDto.getCouponCode(),
					orderDto.getMember(), orderDto.getOperator(),
					orderDto.getPaymentMethod(), orderDto.getShippingMethod(),
					orderDto.getAdminName(), orderDto.getExpireDate(),
					orderDto.getExpireTime(), orderDto.getItemsSize(),
					orderMaked == null ? null : orderMaked.getCode(),
					orderSource == null ? null : orderSource.getCode(),
					orderDto.getOrderTime(), orderDto.getPrintCount(),
					orderDto.getShipperCode(), orderDto.getShipperName(),
					orderDto.getAdmin(), machineOrderStatus == null ? null
							: machineOrderStatus.getCode(),
					orderDto.getVendingMachine(), orderDto.getPaymentTime(),
					orderDto.getBarCode(), orderDto.getStore(),
					orderDto.getOperateSubjectCode(),
					orderDto.getOperateSubjectName(), orderDto.getMachineId(),
					orderDto.getMachine());
		}
		return order;
	}

	public static List<Order> DtoLstTopoLst(List<OrderDto> lsdto) {
		List<Order> lstorder = new ArrayList<Order>();
		if (lsdto != null) {
			Order order = null;
			for (OrderDto ordto : lsdto) {
				order = DtoTopo(ordto);
				lstorder.add(order);
			}
		}
		return lstorder;
	}
}
