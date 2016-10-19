package cn.com.wito.auth.dto;

import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.constants.UserType;

/**
 * 系统用户基本信息
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
public class SysUserDto {

	/**
	 * 用户code
	 */
	private String code;

	/**
	 * 用户名称
	 */
	private String name;

	/**
	 * 用户登录名称
	 */
	private String loginName;

	/**
	 * 登录密码
	 */
	private String password;

	/**
	 * 用户头像路径
	 */
	private String avatarImg;

	/**
	 * 手机号
	 */
	private String mobilePhone;

	/**
	 * 用户所属主体的编码
	 */
	private String subjectCode;

	/**
	 * 主体名称
	 */
	private String subjectName;

	/**
	 * 用户所属角色code
	 */
	private String roleCode;

	/**
	 * 用户所属角色的名称
	 */
	private String roleName;

	/**
	 * 是否启用
	 */
	private EnableFlagType enableFlag;

	/**
	 * 用户类型
	 */
	private UserType userType;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 创建人
	 */
	private String createBy;

	/**
	 * 更新人
	 */
	private String updateBy;

	public SysUserDto() {

	}

	public SysUserDto(String code) {
		this.code = code;
	}

	public SysUserDto(String name, String loginName, String password,
			String subjectCode, String subjectName, String roleCode,
			String roleName, EnableFlagType enableFlag, String remark,
			String createBy, String updateBy) {
		super();
		this.name = name;
		this.loginName = loginName;
		this.password = password;
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.roleCode = roleCode;
		this.roleName = roleName;
		this.enableFlag = enableFlag;
		this.remark = remark;
		this.createBy = createBy;
		this.updateBy = updateBy;
	}

	public SysUserDto(String code, String name, String loginName,
			String password, String avatarImg, String mobilePhone,
			String subjectCode, String subjectName, String roleCode,
			String roleName, EnableFlagType enableFlag, UserType userType,
			String remark, String createBy, String updateBy) {
		super();
		this.code = code;
		this.name = name;
		this.loginName = loginName;
		this.password = password;
		this.avatarImg = avatarImg;
		this.mobilePhone = mobilePhone;
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.roleCode = roleCode;
		this.roleName = roleName;
		this.enableFlag = enableFlag;
		this.userType = userType;
		this.remark = remark;
		this.createBy = createBy;
		this.updateBy = updateBy;
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

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatarImg() {
		return avatarImg;
	}

	public void setAvatarImg(String avatarImg) {
		this.avatarImg = avatarImg;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
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

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	@Override
	public String toString() {
		return "SysUserDto [code=" + code + ", name=" + name + ", loginName="
				+ loginName + ", password=" + password + ", avatarImg="
				+ avatarImg + ", mobilePhone=" + mobilePhone + ", subjectCode="
				+ subjectCode + ", subjectName=" + subjectName + ", roleCode="
				+ roleCode + ", roleName=" + roleName + ", enableFlag="
				+ enableFlag + ", userType=" + userType + ", remark=" + remark
				+ ", createBy=" + createBy + ", updateBy=" + updateBy + "]";
	}

}
