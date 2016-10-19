package cn.com.wito.auth.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体基类
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
public class BaseEntity implements Serializable {

	public BaseEntity() {
		super();
	}

	public BaseEntity(Long id, Integer enableFlag, String createBy,
			Date createDate, String updateBy, Date updateDate) {
		super();
		this.id = id;
		this.enableFlag = enableFlag;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2743202855833253497L;

	/**
	 * id,自增
	 */
	private Long id;

	/**
	 * 是否启用
	 */
	private Integer enableFlag;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Integer getEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(Integer enableFlag) {
		this.enableFlag = enableFlag;
	}

	@Override
	public String toString() {
		return "BaseEntity [id=" + id + ", enableFlag=" + enableFlag
				+ ", createBy=" + createBy + ", createDate=" + createDate
				+ ", updateBy=" + updateBy + ", updateDate=" + updateDate + "]";
	}

}
