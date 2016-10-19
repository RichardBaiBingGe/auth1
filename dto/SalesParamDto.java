package cn.com.wito.auth.dto;

import java.math.BigDecimal;
import java.util.Date;

public class SalesParamDto {

	/**
	 * 图形分析
	 */
	public enum ChartType {
		table,//表格
		bar,//柱形图
		pie,//饼形图
		curve//曲线图
	}
	
	/**
	 * 统计方式
	 */
	public enum TimeType {
		total,//汇总
		day,//天
		week,//周
		month,//月
		season,//季节
		years//年
	}
	
	/**
	 * 分组方式
	 */
	public enum GroupType {
		product,//商品
		productCategory,//商品类型
		productPrice,//商品价格
		nodeStatus,//网点类型
		node,//部署网点
		machine,//机器
		machineType,//机器类型 
		machineUser,//机器管理员
		paymentMethod//支付类型 
	}
	
	//private ChartType chartType;
	
	private Integer timeType;
	
	private Integer groupType;
	
	private Long productCategory;
	
	private Long product;
	
	private BigDecimal price;
	
	private Date beginDate; 
	
	private Date endDate;
	
	private String machine;
	
	private String paymentMethod;
	
	private String roleCode;

//	public ChartType getChartType() {
//		return chartType;
//	}
//
//	public void setChartType(ChartType chartType) {
//		this.chartType = chartType == null ? ChartType.table : chartType;
//	}

	public Integer getTimeType() {
		return timeType;
	}

	public void setTimeType(Integer timeType) {
		this.timeType = timeType;
	}

	public Integer getGroupType() {
		return groupType;
	}

	public void setGroupType(Integer groupType) {
		this.groupType = groupType;
	}

	public Long getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(Long productCategory) {
		this.productCategory = productCategory;
	}

	public Long getProduct() {
		return product;
	}

	public void setProduct(Long product) {
		this.product = product;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
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

	public String getMachine() {
		return machine;
	}

	public void setMachine(String machine) {
		this.machine = machine;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
}
