package cn.com.wito.auth.dto;

import cn.com.wito.auth.constants.EnableFlagType;

public class SysRoleDto {

	/**
	 * 角色code
	 */
	private String code;

	/**
	 * 角色名称
	 */
	private String name;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 创建人code
	 */
	private String createBy;

	/**
	 * 更新人code
	 */
	private String updateBy;

	/**
	 * 角色启用与否
	 */
	private EnableFlagType enableFlag;

	/**
	 * 角色所属实体code
	 */
	private String subjectCode;

	/**
	 * 角色所属实体名称
	 */
	private String subjectName;
	/*
	 * 角色父类code
	 */
	private String parentCode;
	

	public SysRoleDto() {

	}

	public SysRoleDto(String code, String name, String remark, String createBy,
			String updateBy, EnableFlagType enableFlag, String subjectCode,
			String subjectName,String parentCode) {
		super();
		this.code = code;
		this.name = name;
		this.remark = remark;
		this.createBy = createBy;
		this.updateBy = updateBy;
		this.enableFlag = enableFlag;
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.parentCode = parentCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public EnableFlagType getEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(EnableFlagType enableFlag) {
		this.enableFlag = enableFlag;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}


	@Override
	public String toString() {
		return "SysRoleDto [code=" + code + ", name=" + name + ", remark="
				+ remark + ", createBy=" + createBy + ", updateBy=" + updateBy
				+ ", enableFlag=" + enableFlag 
				+ ", subjectCode=" + subjectCode
				+ ", parentCode=" + parentCode+ "]";
	}

}
