package cn.com.wito.auth.dto;

import java.util.Date;

import cn.com.wito.auth.constants.PaymentStatusType;

public class CarddetailParamDto {

	
	
private String machine;
	
	private Date beginDate; 
	
	private Date endDate;
	
	private String paymentMethod;
	
	private String payAccount;
	
	private Long nodetype;
	
	private Integer start;
	
	private Integer limit;
	
	private String roleCode;

	public String getMachine() {
		return machine;
	}

	public void setMachine(String machine) {
		this.machine = machine;
	}

	public Date getBeginDate() {
		return beginDate == null ? new Date() : beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate ;
	}

	public Date getEndDate() {
		return endDate == null ? new Date() : endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	
	
	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public String getPayAccount() {
		return payAccount;
	}

	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}

	public Long getNodetype() {
		return nodetype;
	}

	public void setNodetype(Long nodetype) {
		this.nodetype = nodetype;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

}
