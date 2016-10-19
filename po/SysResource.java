package cn.com.wito.auth.po;

/**
 * 系统权限表实体
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
public class SysResource extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4775009683949017915L;

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
	private String type;

	/**
	 * 备注
	 */
	private String remark;

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

	public SysResource() {

	}

	public SysResource(String code, String name, String url, String permission,
			String type, String remark, String parentCode, Integer level,
			Integer enableFlag, String createBy, Integer orderBy) {
		super();
		this.code = code;
		this.name = name;
		this.url = url;
		this.permission = permission;
		this.type = type;
		this.remark = remark;
		this.parentCode = parentCode;
		this.level = level;
		this.orderBy = orderBy;
		this.setEnableFlag(enableFlag);
		this.setCreateBy(createBy);
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(Integer orderBy) {
		this.orderBy = orderBy;
	}

	@Override
	public String toString() {
		return "SysResource [code=" + code + ", name=" + name + ", url=" + url
				+ ", permission=" + permission + ", type=" + type + ", remark="
				+ remark + ", parentCode=" + parentCode + ", level=" + level
				+ "," + super.toString() + "]";
	}

}
