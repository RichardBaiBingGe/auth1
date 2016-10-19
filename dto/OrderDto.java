package cn.com.wito.auth.dto;

import java.math.BigDecimal;
import java.util.Date;

import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.constants.MachineOrderStatusType;
import cn.com.wito.auth.constants.OrderMakedType;
import cn.com.wito.auth.constants.OrderSourceType;
import cn.com.wito.auth.constants.OrderStatusType;
import cn.com.wito.auth.constants.PaymentStatusType;
import cn.com.wito.auth.constants.ShippingStatusType;

/**
 * 订单
 * 
 * @author FJG
 * 
 */
public class OrderDto {
	/** 订单ID */
	private Long id;
	/** 订单创建日期 */
	private Date createDate;
	/** 订单修改日期 */
	private Date modifyDate;
	/** 订单地址 */
	private String address;
	/** 已付金额 */
	private BigDecimal amountPaid;
	/** 地区名称 */
	private String areaName;
	/** 收货人 */
	private String consignee;
	/** 优惠卷折扣 */
	private BigDecimal couponDiscount;
	/** 到期时间 */
	private Date expire;
	/** 支付手续费 */
	private BigDecimal fee;
	/** 运费 */
	private BigDecimal freight;
	/** 发票抬头 */
	private String invoiceTitle;
	/** 是否已分配库存 */
	private EnableFlagType isAllocatedStock;
	/** 是否开据发票 */
	private EnableFlagType isInvoice;
	/** 锁定到期时间 */
	private Date lockExpire;
	/** 附言 */
	private String memo;
	/** 调整金额 */
	private BigDecimal offsetAmount;
	/** 订单状态 */
	private OrderStatusType orderStatus;
	/** 支付方式名称 */
	private String paymentMethodName;
	/** 支付状态 */
	private PaymentStatusType paymentStatus;
	/** 电话 */
	private String phone;
	/** 赠送积分 */
	private Long point;
	/** 促销 */
	private String promotion;
	/** 促销折扣 */
	private BigDecimal promotionDiscount;
	/** 配送方式名称 */
	private String shippingMethodName;
	/** 配送状态 */
	private ShippingStatusType shippingStatus;
	/** 订单编号 */
	private String sn;
	/** 税金 */
	private BigDecimal tax;
	/** 邮编 */
	private String zipCode;
	/** 地区 */
	private Long area;
	/** 优惠码 */
	private Long couponCode;
	/** 会员 */
	private Long member;
	/** 客服人员 */
	private Long operator;
	/** 支付方式 */
	private Long paymentMethod;
	/** 配送方式 */
	private Long shippingMethod;
	/** 角色名称 */
	private String adminName;
	/** 送餐日期 */
	private Date expireDate;
	/** 送餐时间 */
	private String expireTime;
	/** 份数 */
	private Integer itemsSize;
	/** 餐厅制作状态 */
	private OrderMakedType orderMaked;
	/** 订单来源 */
	private OrderSourceType orderSource;
	/** 下单时间 */
	private String orderTime;
	/** 打印次数 */
	private Integer printCount;
	/** 配送员编码 */
	private String shipperCode;
	/** 配送员名称 */
	private String shipperName;
	/** 人员编号 */
	private Long admin;
	/** 售货机订单状态 */
	private MachineOrderStatusType machineOrderStatus;
	/** 售货机 */
	private Long vendingMachine;
	/** 支付时间 */
	private Date paymentTime;
	/** 图片地址 */
	private String barCode;
	/** 门店 */
	private Long store;
	/** 所属商户编号 */
	private String operateSubjectCode;
	/** 所属商户名称 */
	private String operateSubjectName;
	/** 机器ID */
	private Long machineId;
	/** 机器 */
	private byte[] machine;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public BigDecimal getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(BigDecimal amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName == null ? null : areaName.trim();
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee == null ? null : consignee.trim();
	}

	public BigDecimal getCouponDiscount() {
		return couponDiscount;
	}

	public void setCouponDiscount(BigDecimal couponDiscount) {
		this.couponDiscount = couponDiscount;
	}

	public Date getExpire() {
		return expire;
	}

	public void setExpire(Date expire) {
		this.expire = expire;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public BigDecimal getFreight() {
		return freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}

	public String getInvoiceTitle() {
		return invoiceTitle;
	}

	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
	}

	public EnableFlagType getIsAllocatedStock() {
		return isAllocatedStock;
	}

	public void setIsAllocatedStock(EnableFlagType isAllocatedStock) {
		this.isAllocatedStock = isAllocatedStock;
	}

	public EnableFlagType getIsInvoice() {
		return isInvoice;
	}

	public void setIsInvoice(EnableFlagType isInvoice) {
		this.isInvoice = isInvoice;
	}

	public Date getLockExpire() {
		return lockExpire;
	}

	public void setLockExpire(Date lockExpire) {
		this.lockExpire = lockExpire;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo == null ? null : memo.trim();
	}

	public BigDecimal getOffsetAmount() {
		return offsetAmount;
	}

	public void setOffsetAmount(BigDecimal offsetAmount) {
		this.offsetAmount = offsetAmount;
	}

	public OrderStatusType getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatusType orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPaymentMethodName() {
		return paymentMethodName;
	}

	public void setPaymentMethodName(String paymentMethodName) {
		this.paymentMethodName = paymentMethodName == null ? null
				: paymentMethodName.trim();
	}

	public PaymentStatusType getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatusType paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public Long getPoint() {
		return point;
	}

	public void setPoint(Long point) {
		this.point = point;
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion == null ? null : promotion.trim();
	}

	public BigDecimal getPromotionDiscount() {
		return promotionDiscount;
	}

	public void setPromotionDiscount(BigDecimal promotionDiscount) {
		this.promotionDiscount = promotionDiscount;
	}

	public String getShippingMethodName() {
		return shippingMethodName;
	}

	public void setShippingMethodName(String shippingMethodName) {
		this.shippingMethodName = shippingMethodName == null ? null
				: shippingMethodName.trim();
	}

	public ShippingStatusType getShippingStatus() {
		return shippingStatus;
	}

	public void setShippingStatus(ShippingStatusType shippingStatus) {
		this.shippingStatus = shippingStatus;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn == null ? null : sn.trim();
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode == null ? null : zipCode.trim();
	}

	public Long getArea() {
		return area;
	}

	public void setArea(Long area) {
		this.area = area;
	}

	public Long getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(Long couponCode) {
		this.couponCode = couponCode;
	}

	public Long getMember() {
		return member;
	}

	public void setMember(Long member) {
		this.member = member;
	}

	public Long getOperator() {
		return operator;
	}

	public void setOperator(Long operator) {
		this.operator = operator;
	}

	public Long getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(Long paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Long getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(Long shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName == null ? null : adminName.trim();
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime == null ? null : expireTime.trim();
	}

	public Integer getItemsSize() {
		return itemsSize;
	}

	public void setItemsSize(Integer itemsSize) {
		this.itemsSize = itemsSize;
	}

	public OrderMakedType getOrderMaked() {
		return orderMaked;
	}

	public void setOrderMaked(OrderMakedType orderMaked) {
		this.orderMaked = orderMaked;
	}

	public OrderSourceType getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(OrderSourceType orderSource) {
		this.orderSource = orderSource;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime == null ? null : orderTime.trim();
	}

	public Integer getPrintCount() {
		return printCount;
	}

	public void setPrintCount(Integer printCount) {
		this.printCount = printCount;
	}

	public String getShipperCode() {
		return shipperCode;
	}

	public void setShipperCode(String shipperCode) {
		this.shipperCode = shipperCode == null ? null : shipperCode.trim();
	}

	public String getShipperName() {
		return shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName == null ? null : shipperName.trim();
	}

	public Long getAdmin() {
		return admin;
	}

	public void setAdmin(Long admin) {
		this.admin = admin;
	}

	public MachineOrderStatusType getMachineOrderStatus() {
		return machineOrderStatus;
	}

	public void setMachineOrderStatus(MachineOrderStatusType machineOrderStatus) {
		this.machineOrderStatus = machineOrderStatus;
	}

	public Long getVendingMachine() {
		return vendingMachine;
	}

	public void setVendingMachine(Long vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	public Date getPaymentTime() {
		return paymentTime;
	}

	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode == null ? null : barCode.trim();
	}

	public Long getStore() {
		return store;
	}

	public void setStore(Long store) {
		this.store = store;
	}

	public String getOperateSubjectCode() {
		return operateSubjectCode;
	}

	public void setOperateSubjectCode(String operateSubjectCode) {
		this.operateSubjectCode = operateSubjectCode == null ? null
				: operateSubjectCode.trim();
	}

	public String getOperateSubjectName() {
		return operateSubjectName;
	}

	public void setOperateSubjectName(String operateSubjectName) {
		this.operateSubjectName = operateSubjectName == null ? null
				: operateSubjectName.trim();
	}

	public Long getMachineId() {
		return machineId;
	}

	public void setMachineId(Long machineId) {
		this.machineId = machineId;
	}

	public byte[] getMachine() {
		return machine;
	}

	public void setMachine(byte[] machine) {
		this.machine = machine;
	}

	public OrderDto() {
		super();
	}

	public OrderDto(Long id, String address, BigDecimal amountPaid,
			String areaName, String consignee, BigDecimal couponDiscount,
			Date expire, BigDecimal fee, BigDecimal freight,
			String invoiceTitle, EnableFlagType isAllocatedStock, EnableFlagType isInvoice,
			Date lockExpire, String memo, BigDecimal offsetAmount,
			OrderStatusType orderStatus, String paymentMethodName,
			PaymentStatusType paymentStatus, String phone, Long point, String promotion,
			BigDecimal promotionDiscount, String shippingMethodName,
			ShippingStatusType shippingStatus, String sn, BigDecimal tax, String zipCode,
			Long area, Long couponCode, Long member, Long operator,
			Long paymentMethod, Long shippingMethod, String adminName,
			Date expireDate, String expireTime, Integer itemsSize,
			OrderMakedType orderMaked, OrderSourceType orderSource, String orderTime,
			Integer printCount, String shipperCode, String shipperName,
			Long admin, MachineOrderStatusType machineOrderStatus, Long vendingMachine,
			Date paymentTime, String barCode, Long store,
			String operateSubjectCode, String operateSubjectName,
			Long machineId, byte[] machine) {
		super();
		this.id = id;
		this.address = address;
		this.amountPaid = amountPaid;
		this.areaName = areaName;
		this.consignee = consignee;
		this.couponDiscount = couponDiscount;
		this.expire = expire;
		this.fee = fee;
		this.freight = freight;
		this.invoiceTitle = invoiceTitle;
		this.isAllocatedStock = isAllocatedStock;
		this.isInvoice = isInvoice;
		this.lockExpire = lockExpire;
		this.memo = memo;
		this.offsetAmount = offsetAmount;
		this.orderStatus = orderStatus;
		this.paymentMethodName = paymentMethodName;
		this.paymentStatus = paymentStatus;
		this.phone = phone;
		this.point = point;
		this.promotion = promotion;
		this.promotionDiscount = promotionDiscount;
		this.shippingMethodName = shippingMethodName;
		this.shippingStatus = shippingStatus;
		this.sn = sn;
		this.tax = tax;
		this.zipCode = zipCode;
		this.area = area;
		this.couponCode = couponCode;
		this.member = member;
		this.operator = operator;
		this.paymentMethod = paymentMethod;
		this.shippingMethod = shippingMethod;
		this.adminName = adminName;
		this.expireDate = expireDate;
		this.expireTime = expireTime;
		this.itemsSize = itemsSize;
		this.orderMaked = orderMaked;
		this.orderSource = orderSource;
		this.orderTime = orderTime;
		this.printCount = printCount;
		this.shipperCode = shipperCode;
		this.shipperName = shipperName;
		this.admin = admin;
		this.machineOrderStatus = machineOrderStatus;
		this.vendingMachine = vendingMachine;
		this.paymentTime = paymentTime;
		this.barCode = barCode;
		this.store = store;
		this.operateSubjectCode = operateSubjectCode;
		this.operateSubjectName = operateSubjectName;
		this.machineId = machineId;
		this.machine = machine;
	}

	public OrderDto(Long id, Date createDate, Date modifyDate, String address,
			BigDecimal amountPaid, String areaName, String consignee,
			BigDecimal couponDiscount, Date expire, BigDecimal fee,
			BigDecimal freight, String invoiceTitle, EnableFlagType isAllocatedStock,
			EnableFlagType isInvoice, Date lockExpire, String memo,
			BigDecimal offsetAmount, OrderStatusType orderStatus,
			String paymentMethodName, PaymentStatusType paymentStatus, String phone,
			Long point, String promotion, BigDecimal promotionDiscount,
			String shippingMethodName, ShippingStatusType shippingStatus, String sn,
			BigDecimal tax, String zipCode, Long area, Long couponCode,
			Long member, Long operator, Long paymentMethod,
			Long shippingMethod, String adminName, Date expireDate,
			String expireTime, Integer itemsSize, OrderMakedType orderMaked,
			OrderSourceType orderSource, String orderTime, Integer printCount,
			String shipperCode, String shipperName, Long admin,
			MachineOrderStatusType machineOrderStatus, Long vendingMachine, Date paymentTime,
			String barCode, Long store, String operateSubjectCode,
			String operateSubjectName, Long machineId, byte[] machine) {
		super();
		this.id = id;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.address = address;
		this.amountPaid = amountPaid;
		this.areaName = areaName;
		this.consignee = consignee;
		this.couponDiscount = couponDiscount;
		this.expire = expire;
		this.fee = fee;
		this.freight = freight;
		this.invoiceTitle = invoiceTitle;
		this.isAllocatedStock = isAllocatedStock;
		this.isInvoice = isInvoice;
		this.lockExpire = lockExpire;
		this.memo = memo;
		this.offsetAmount = offsetAmount;
		this.orderStatus = orderStatus;
		this.paymentMethodName = paymentMethodName;
		this.paymentStatus = paymentStatus;
		this.phone = phone;
		this.point = point;
		this.promotion = promotion;
		this.promotionDiscount = promotionDiscount;
		this.shippingMethodName = shippingMethodName;
		this.shippingStatus = shippingStatus;
		this.sn = sn;
		this.tax = tax;
		this.zipCode = zipCode;
		this.area = area;
		this.couponCode = couponCode;
		this.member = member;
		this.operator = operator;
		this.paymentMethod = paymentMethod;
		this.shippingMethod = shippingMethod;
		this.adminName = adminName;
		this.expireDate = expireDate;
		this.expireTime = expireTime;
		this.itemsSize = itemsSize;
		this.orderMaked = orderMaked;
		this.orderSource = orderSource;
		this.orderTime = orderTime;
		this.printCount = printCount;
		this.shipperCode = shipperCode;
		this.shipperName = shipperName;
		this.admin = admin;
		this.machineOrderStatus = machineOrderStatus;
		this.vendingMachine = vendingMachine;
		this.paymentTime = paymentTime;
		this.barCode = barCode;
		this.store = store;
		this.operateSubjectCode = operateSubjectCode;
		this.operateSubjectName = operateSubjectName;
		this.machineId = machineId;
		this.machine = machine;
	}

	public String toString() {
		return "ProductCategory [id=" + id + ", createDate=" + createDate
				+ ", modifyDate=" + modifyDate + ",address=" + address
				+ ",amountPaid=" + amountPaid + ", areaName=" + areaName
				+ ", consignee=" + consignee + ", couponDiscount="
				+ couponDiscount + ", expire=" + expire + ", fee=" + fee
				+ ", freight=" + freight + ", invoiceTitle=" + invoiceTitle
				+ ", isAllocatedStock=" + isAllocatedStock + ",isInvoice="
				+ isInvoice + ",lockExpire=" + lockExpire + ",memo=" + memo
				+ ",offsetAmount=" + offsetAmount + ", orderStatus="
				+ orderStatus + ", paymentMethodName=" + paymentMethodName
				+ ", paymentStatus=" + paymentStatus + ", phone=" + phone
				+ ", point=" + point + ", promotion=" + promotion
				+ ", promotionDiscount=" + promotionDiscount
				+ ",shippingMethodName=" + shippingMethodName
				+ ", shippingStatus=" + shippingStatus + ", sn=" + sn
				+ ", tax=" + tax + ", zipCode=" + zipCode + ", area=" + area
				+ ", couponCode=" + couponCode + ", member=" + member
				+ ", operator=" + operator + ", paymentMethod=" + paymentMethod
				+ ", shippingMethod=" + shippingMethod + ",adminName="
				+ adminName + ", expireDate=" + expireDate + ", expireTime="
				+ expireTime + ", itemsSize=" + itemsSize + ", orderMaked="
				+ orderMaked + ", orderSource=" + orderSource + ", orderTime="
				+ orderTime + ", printCount=" + printCount + ", shipperCode="
				+ shipperCode + ", shipperName=" + shipperName + ", admin="
				+ admin + ",machineOrderStatus=" + machineOrderStatus
				+ ", vendingMachine=" + vendingMachine + ", paymentTime="
				+ paymentTime + ", barCode=" + barCode + ", store=" + store
				+ ", operateSubjectCode=" + operateSubjectCode
				+ ", operateSubjectName=" + operateSubjectName + ", machineId="
				+ machineId + ", machine=" + machine + "]";

	}
}
