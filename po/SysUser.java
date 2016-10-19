package cn.com.wito.auth.po;

/**
 * 系统用户基本信息
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
public class SysUser extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4795183357949792611L;

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
	 * 角色code
	 */
	private String roleCode;

	/**
	 * 角色名称
	 */
	private String roleName;

	/**
	 * 用户类型
	 */
	private Integer type;

	/**
	 * 备注
	 */
	private String remark;

	public SysUser() {

	}

	public SysUser(String code, String name, String loginName, String password,
			String avatarImg, String mobilePhone, String subjectCode,
			String subjectName, String roleCode, String roleName, Integer type,
			String remark, Integer enableFlag, String createBy, String updateBy) {
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
		this.type = type;
		this.remark = remark;
		this.setEnableFlag(enableFlag);
		this.setCreateBy(createBy);
		this.setUpdateBy(updateBy);
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
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

	@Override
	public String toString() {
		return "SysUser [code=" + code + ", name=" + name + ", loginName="
				+ loginName + ", password=" + password + ", avatarImg="
				+ avatarImg + ", mobilePhone=" + mobilePhone + ", subjectCode="
				+ subjectCode + ", subjectName=" + subjectName + ", roleCode="
				+ roleCode + ", roleName=" + roleName + ", type=" + type
				+ ", remark=" + remark + "]";
	}

}
