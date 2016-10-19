package cn.com.wito.auth.po;

import java.math.BigDecimal;

public class Carddetail {

	private String code;
	
	private String serNum;

	private String name;

	private Long id;

	private String aisleCode;

	private String paymentName;

	private String orderTime;
	
	private Integer paymentStatus;
	
	private BigDecimal amountPaid;
	
	private String payAccount;
	
	private String nodetype;

	
	
	public String getNodetype() {
		return nodetype;
	}

	public void setNodetype(String nodetype) {
		this.nodetype = nodetype;
	}

	public String getPayAccount() {
		return payAccount;
	}

	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}

	public BigDecimal getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(BigDecimal amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSerNum() {
		return serNum;
	}

	public void setSerNum(String serNum) {
		this.serNum = serNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAisleCode() {
		return aisleCode;
	}

	public void setAisleCode(String aisleCode) {
		this.aisleCode = aisleCode;
	}

	public String getPaymentName() {
		return paymentName;
	}

	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public Integer getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(Integer paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
}
