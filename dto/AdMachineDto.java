package cn.com.wito.auth.dto;

import java.util.Date;

/**
 * 售货机广告资源实体
 * @author wangxing
 *
 */
public class AdMachineDto {
	
	private Long id;
	
	private String machineCode;

	private String resourceCode;
	
	private Date createDate;
	
	private Date modifyDate;
	
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMachineCode() {
		return machineCode;
	}

	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}

	public String getResourceCode() {
		return resourceCode;
	}

	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public AdMachineDto() {
		
	}
	
	/**
	 * 
	 * @param machineCode
	 * @param resourceCode
	 * @param createDate
	 * @param modifyDate
	 * @param remark
	 */
	public AdMachineDto(String machineCode, String resourceCode, Date createDate, Date modifyDate, String remark) {

		this.machineCode = machineCode;
		this.resourceCode = resourceCode;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "AdMachineDto [id=" + id + ", machineCode=" + machineCode + ", resourceCode=" + resourceCode
				+ ", createDate=" + createDate + ", modifyDate=" + modifyDate
				+ ", remark=" + remark + "]";
	}
}
