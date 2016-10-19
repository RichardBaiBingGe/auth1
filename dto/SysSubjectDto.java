package cn.com.wito.auth.dto;

import java.util.Date;

import cn.com.wito.auth.constants.EnableFlagType;

/**
 * 系统主题信息
 * 
 * @author wy<895791598@qq.com>
 * 
 */
public class SysSubjectDto {
	private Long id;

	/**
	 * 
	 * 公司Code
	 */
	private String code;

	/**
	 * 
	 * 公司名称
	 */
	private String name;

	/**
	 * 公司地址
	 */
	private String address;

	/**
	 * 
	 * 联系人名称
	 */
	private String linkmanName;

	/**
	 * 
	 * 联系人电话
	 */
	private String linkmanTel;

	/**
	 * 
	 * 联系人qq
	 */
	private String linkmanQq;

	/**
	 * 
	 * 公司主营业务
	 */
	private String business;

	/**
	 * 
	 * 备注
	 */
	private String remark;

	/**
	 * 
	 * 是否启用
	 */
	private EnableFlagType enableFlag;

	/**
	 * 
	 * 创建人
	 */
	private String createBy;

	/**
	 * 
	 * 创建日期
	 */
	private Date createDate;

	/**
	 * 
	 * 更新人
	 */
	private String updateBy;

	/**
	 * 
	 * 更新日期
	 */
	private Date updateDate;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getLinkmanName() {
		return linkmanName;
	}

	public void setLinkmanName(String linkmanName) {
		this.linkmanName = linkmanName == null ? null : linkmanName.trim();
	}

	public String getLinkmanTel() {
		return linkmanTel;
	}

	public void setLinkmanTel(String linkmanTel) {
		this.linkmanTel = linkmanTel == null ? null : linkmanTel.trim();
	}

	public String getLinkmanQq() {
		return linkmanQq;
	}

	public void setLinkmanQq(String linkmanQq) {
		this.linkmanQq = linkmanQq == null ? null : linkmanQq.trim();
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business == null ? null : business.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
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
		this.createBy = createBy == null ? null : createBy.trim();
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
		this.updateBy = updateBy == null ? null : updateBy.trim();
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "SysSubject [id=" + id + ", code=" + code + ", name=" + name
				+ ", address=" + address + ", linkmanName=" + linkmanName
				+ ", linkmanTel=" + linkmanTel + ", linkmanQq=" + linkmanQq
				+ ", business=" + business + ", remark=" + remark
				+ ", enableFlag=" + enableFlag + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", updateBy=" + updateBy
				+ ", updateDate=" + updateDate + "]";
	}

	/**
	 * 
	 * @param code
	 * @param name
	 * @param address
	 * @param linkmanName
	 * @param linkmanTel
	 * @param linkmanQq
	 * @param business
	 * @param remark
	 * @param enableFlag
	 * @param createBy
	 * @param createDate
	 * @param updateBy
	 * @param updateDate
	 */
	public SysSubjectDto(String code, String name, String address,
			String linkmanName, String linkmanTel, String linkmanQq,
			String business, String remark, EnableFlagType enableFlag,
			String createBy, Date createDate, String updateBy, Date updateDate) {

		this.code = code;
		this.name = name;
		this.address = address;
		this.linkmanName = linkmanName;
		this.linkmanTel = linkmanTel;
		this.linkmanQq = linkmanQq;
		this.business = business;
		this.remark = remark;
		this.enableFlag = enableFlag;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	public SysSubjectDto() {

	}

}