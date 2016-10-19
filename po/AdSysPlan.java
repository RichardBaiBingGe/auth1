package cn.com.wito.auth.po;

import java.util.Date;

/**
 * 系统计划实体
 * 
 * @author wy<895791598@qq.com>
 * 
 */
public class AdSysPlan {

	/**
	 * 
	 * 主键自动增长
	 * 
	 */
	private Long id;

	/**
	 * 
	 * 广告排期计划
	 * 
	 */
	private String code;

	/**
	 * 
	 * 当前日期
	 * 
	 */
	private Date curDate;

	/**
	 * 
	 * 资源Code
	 * 
	 */
	private String resourceCode;

	/**
	 * 资源名称
	 */
	private String resourceName;

	/**
	 * 
	 * 锁定状态
	 * 
	 */
	private Boolean lockStatus;

	/**
	 * 
	 * 是否有效
	 * 
	 */
	private Integer enableFlag;

	/**
	 * 
	 * 创建人code
	 * 
	 */
	private String createBy;

	/**
	 * 
	 * 创建时间
	 * 
	 */
	private Date createDate;

	/**
	 * 
	 * 更新人
	 * 
	 */
	private String updateBy;

	/**
	 * 
	 * 更新日期
	 * 
	 */
	private Date updateDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCurDate() {
		return curDate;
	}

	public void setCurDate(Date curDate) {
		this.curDate = curDate;
	}

	public String getResourceCode() {
		return resourceCode;
	}

	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode == null ? null : resourceCode.trim();
	}

	public Boolean getLockStatus() {
		return lockStatus;
	}

	public void setLockStatus(Boolean lockStatus) {
		this.lockStatus = lockStatus;
	}

	public Integer getEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(Integer enableFlag) {
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	@Override
	public String toString() {
		return "AdSysPlan [id=" + id + ", code=" + code + ", curDate="
				+ curDate + ", resourceCode=" + resourceCode + ", lockStatus="
				+ lockStatus + ", enableFlag=" + enableFlag + ", createBy="
				+ createBy + ", createDate=" + createDate + ", updateBy="
				+ updateBy + ", updateDate=" + updateDate + "]";
	}

	/**
	 * @param code
	 * @param curDate
	 * @param resourceCode
	 * @param lockStatus
	 * @param enableFlag
	 * @param createBy
	 * @param createDate
	 * @param updateBy
	 * @param updateDate
	 */
	public AdSysPlan(String code, Date curDate, String resourceCode,
			String resourceName, Boolean lockStatus, Integer enableFlag,
			String createBy, Date createDate, String updateBy, Date updateDate) {
		this.code = code;
		this.curDate = curDate;
		this.resourceCode = resourceCode;
		this.resourceName = resourceName;
		this.lockStatus = lockStatus;
		this.enableFlag = enableFlag;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	public AdSysPlan() {
		// TODO Auto-generated constructor stub
	}
}