package cn.com.wito.auth.po;

import cn.com.wito.auth.constants.EnableFlagType;

/**
 * 系统角色
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
public class SysRole extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8215228087161886414L;

	/**
	 * 角色code
	 */
	private String code;

	/**
	 * 角色名称
	 */
	private String name;

	/**
	 * 角色所属实体类型
	 */
	private Integer subjectType;

	/**
	 * 角色所属实体code
	 */
	private String subjectCode;

	/**
	 * 角色所属实体name
	 */
	private String subjectName;

	/**
	 * 备注
	 */
	private String remark;
	/*
	 * 角色父类code
	 */
	private String parentCode;
	public SysRole() {

	}

	public SysRole(String code, String name, String remark, Integer enableFlag,
			String createBy, String updateBy, String subjectCode,
			String subjectName,String parentCode) {
		super();
		this.code = code;
		this.name = name;
		this.remark = remark;
		this.setEnableFlag(enableFlag);
		this.setCreateBy(createBy);
		this.setUpdateBy(updateBy);
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.parentCode=parentCode;
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

	public Integer getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(Integer subjectType) {
		this.subjectType = subjectType;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "SysRole [code=" + code + ", name=" + name + ", subjectType="
				+ subjectType + ", subjectCode=" + subjectCode + 
				", remark="+ remark+",subjectName="+subjectName+ ", parentCode="+ parentCode + "," 
				+ ","+ super.toString() + "]";
	}

}
