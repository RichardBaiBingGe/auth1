package cn.com.wito.auth.dto;

import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.constants.ResourceType;

public class SysResourceDto {

	/**
	 * 权限code
	 */
	private String code;

	/**
	 * 权限名称
	 */
	private String name;

	/**
	 * 资源控制的url
	 */
	private String url;

	/**
	 * 权限名称
	 */
	private String permission;

	/**
	 * 资源权限类型
	 */
	private ResourceType type;

	/**
	 * 资源启用与否
	 */
	private EnableFlagType enableFlag;

	/**
	 * 父级ID
	 */
	private String parentCode;

	/**
	 * 资源层级
	 */
	private Integer level;

	/**
	 * 排序字段
	 */
	private Integer orderBy;

	/**
	 * 父级层级
	 */
	private Integer parentLevel;
	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 更新人code
	 */
	private String updateBy;

	/**
	 * 创建人code
	 */
	private String createBy;

	public SysResourceDto() {

	}

	public SysResourceDto(String name, String url, ResourceType resourceType,
			EnableFlagType enableFlag, String parentCode, int parentLevel,
			String remark, String createBy) {
		super();
		this.name = name;
		this.url = url;
		this.type = resourceType;
		this.enableFlag = enableFlag;
		this.parentCode = parentCode;
		this.parentLevel = parentLevel;
		this.remark = remark;
		this.createBy = createBy;
	}

	public SysResourceDto(String code, String name, String url,
			ResourceType type, EnableFlagType enableFlagType) {
		super();
		this.code = code;
		this.name = name;
		this.url = url;
		this.type = type;
		this.enableFlag = enableFlagType;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public ResourceType getType() {
		return type;
	}

	public void setType(ResourceType type) {
		this.type = type;
	}

	public EnableFlagType getEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(EnableFlagType enableFlag) {
		this.enableFlag = enableFlag;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public Integer getLevel() {
		return level;
	}

	public Integer getParentLevel() {
		return parentLevel;
	}

	public void setParentLevel(Integer parentLevel) {
		this.parentLevel = parentLevel;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Integer getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(Integer orderBy) {
		this.orderBy = orderBy;
	}

	@Override
	public String toString() {
		return "SysResourceDto [code=" + code + ", name=" + name + ", url="
				+ url + ", permission=" + permission + ", type=" + type
				+ ", enableFlag=" + enableFlag + ", parentCode=" + parentCode
				+ ", level=" + level + ", parentLevel=" + parentLevel
				+ ", remark=" + remark + ", updateBy=" + updateBy
				+ ", createBy=" + createBy + "]";
	}

	/**
	 * @param code
	 * @param name
	 * @param url
	 * @param permission
	 * @param type
	 * @param enableFlag
	 * @param parentCode
	 * @param level
	 * @param parentLevel
	 * @param remark
	 * @param updateBy
	 * @param createBy
	 */
	public SysResourceDto(String code, String name, String url,
			String permission, ResourceType type, EnableFlagType enableFlag,
			String parentCode, Integer level, Integer parentLevel,
			String remark, String updateBy, String createBy) {
		this.code = code;
		this.name = name;
		this.url = url;
		this.permission = permission;
		this.type = type;
		this.enableFlag = enableFlag;
		this.parentCode = parentCode;
		this.level = level;
		this.parentLevel = parentLevel;
		this.remark = remark;
		this.updateBy = updateBy;
		this.createBy = createBy;
	}
}
