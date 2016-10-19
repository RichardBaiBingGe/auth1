package cn.com.wito.auth.dto;

import java.util.Date;

import cn.com.wito.auth.constants.EnableFlagType;

public class VendingMachineDto {

	/**
	 * 售货机code
	 */
	private String code;

	/**
	 * 售货机序列号
	 */
	private String serNum;

	/**
	 * 售货机名称
	 */
	private String name;

	/**
	 * 经度
	 */
	private String latitude;

	/**
	 * 纬度
	 */
	private String longitude;

	/**
	 * 地址
	 */
	private String address;
	

	/**
	 * 商铺编号
	 * 
	 */
	private String storeCode;
	
	/**
	 * 商铺名称
	 * 
	 */
	private String storeName;

	private String deliverySubjectCode;

	private String deliverySubjectName;

	private String operateSubjectCode;

	private String operateSubjectName;

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
	private Integer statas;
	public Integer getStatas() {
		return statas;
	}

	public void setStatas(Integer statas) {
		this.statas = statas;
	}

	/**
	 * 标识位置信息
	 * value：0：经纬度
	 * value：1：挂靠门店
	 */
	private Integer locationType;
	
	public VendingMachineDto() {

	}

	public VendingMachineDto(String code,Integer statas, String serNum, String name,
			String latitude, String longitude, String address,String storeCode,String storeName,
			String deliverySubjectCode, String deliverySubjectName,
			String operateSubjectCode, String operateSubjectName,
			String remark, EnableFlagType enableFlag, String createBy,
			Date createDate, String updateBy, Date updateDate,Integer locationType) {
		super();
		this.code = code;
		this.statas=statas;
		this.serNum = serNum;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.address = address;
		this.storeCode = storeCode;
		this.storeName = storeName;
		this.deliverySubjectCode = deliverySubjectCode;
		this.deliverySubjectName = deliverySubjectName;
		this.operateSubjectCode = operateSubjectCode;
		this.operateSubjectName = operateSubjectName;
		this.remark = remark;
		this.enableFlag = enableFlag;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
		this.locationType = locationType;
		
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
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

	public String getDeliverySubjectCode() {
		return deliverySubjectCode;
	}

	public void setDeliverySubjectCode(String deliverySubjectCode) {
		this.deliverySubjectCode = deliverySubjectCode;
	}

	public String getDeliverySubjectName() {
		return deliverySubjectName;
	}

	public void setDeliverySubjectName(String deliverySubjectName) {
		this.deliverySubjectName = deliverySubjectName;
	}

	public String getOperateSubjectCode() {
		return operateSubjectCode;
	}

	public void setOperateSubjectCode(String operateSubjectCode) {
		this.operateSubjectCode = operateSubjectCode;
	}

	public String getOperateSubjectName() {
		return operateSubjectName;
	}

	public void setOperateSubjectName(String operateSubjectName) {
		this.operateSubjectName = operateSubjectName;
	}

	public Integer getLocationType() {
		return locationType;
	}

	public void setLocationType(Integer locationType) {
		this.locationType = locationType;
	}

	@Override
	public String toString() {
		return "VendingMachineDto [code=" + code + ",statas="+statas+", serNum=" + serNum
				+ ", name=" + name + ", latitude=" + latitude + ", longitude="
				+ longitude + ", address=" + address + ", deliverySubjectCode="
				+ deliverySubjectCode + ", deliverySubjectName="
				+ deliverySubjectName + ", operateSubjectCode="
				+ operateSubjectCode + ", operateSubjectName="
				+ operateSubjectName + ", remark=" + remark + ", enableFlag="
				+ enableFlag + ", createBy=" + createBy + ", createDate="
				+ createDate + ", updateBy=" + updateBy + ", updateDate="
				+ updateDate + ",statas="+statas+"]";
	}

}
