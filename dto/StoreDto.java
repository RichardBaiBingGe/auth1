package cn.com.wito.auth.dto;

import java.util.Date;

import cn.com.wito.auth.constants.EnableFlagType;

public class StoreDto {

	/**
	 * code
	 */
	private String code;

	/**
	 * 门店名称
	 */
	private String name;

	/**
	 * 门店地址
	 */
	private String address;

	/**
	 * 门店纬度
	 */
	private String latitude;

	/**
	 * 门店经度
	 */
	private String longitude;

	/**
	 * 起送价格
	 */
	private String sentPrice;

	/**
	 * 营业时间
	 */
	private String businessTime;

	/**
	 * 派送范围
	 */
	private String sentScope;

	/**
	 * 所属主体
	 */
	private String subjectCode;

	/**
	 * 主体名称
	 */
	private String subjectName;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 是否启用
	 */
	private EnableFlagType enableFlag;

	/**
	 * 创建人code
	 */
	private String createBy;

	/**
	 * 创建日期
	 */
	private Date createDate;

	/**
	 * 更新人code
	 */
	private String updateBy;

	/**
	 * 更新时间
	 */
	private Date updateDate;
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getSentPrice() {
		return sentPrice;
	}

	public void setSentPrice(String sentPrice) {
		this.sentPrice = sentPrice;
	}

	public String getBusinessTime() {
		return businessTime;
	}

	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}

	public String getSentScope() {
		return sentScope;
	}

	public void setSentScope(String sentScope) {
		this.sentScope = sentScope;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public EnableFlagType getEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(EnableFlagType enableFlag) {
		this.enableFlag = enableFlag;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public StoreDto() {

	}

	public StoreDto(String code, String name, String address, String latitude,
			String longitude, String sentPrice, String businessTime,
			String sentScope, String subjectCode, String subjectName,
			String remark, EnableFlagType enableFlag, String createBy,
			Date createDate, String updateBy, Date updateDate) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.sentPrice = sentPrice;
		this.businessTime = businessTime;
		this.sentScope = sentScope;
		this.remark = remark;
		this.enableFlag = enableFlag;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	/**
	 * @param code
	 * @param name
	 * @param address
	 * @param latitude
	 * @param longitude
	 * @param sentPrice
	 * @param businessTime
	 * @param sentScope
	 * @param subjectCode
	 * @param subjectName
	 * @param remark
	 * @param enableFlag
	 */
	public StoreDto(String code, String name, String address, String latitude,
			String longitude, String sentPrice, String businessTime,
			String sentScope, String subjectCode, String subjectName,
			String remark, EnableFlagType enableFlag) {
		this.code = code;
		this.name = name;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.sentPrice = sentPrice;
		this.businessTime = businessTime;
		this.sentScope = sentScope;
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.remark = remark;
		this.enableFlag = enableFlag;
	}

}
