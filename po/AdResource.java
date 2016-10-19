package cn.com.wito.auth.po;

import java.util.Date;


/**
 * 系统资源实体
 * 
 * @author wy<895791598@qq.com>
 * 
 */
public class AdResource {
    private Long id;

    /**
     * 广告资源
     */
    private String code;

    /**
     * 资源名称
     */
    private String name;

    /**
     *
     *资源类型(图片/视频)
     */
    private Integer type;

    /**
     *
     * 资源存储url
     */
    private String resourceUrl;

    /**
     * 
     * 点击资源的url
     */
    private String clickUrl;

    /**
     *
     * 备注信息
     */
    private String remark;

    /**
     *
     * 公司Code
     */
    private String subjectCode;
    
    /**
    *
    * 公司Name
    */
    private String subjectName;
    /**
     *
     * 是否启用
     */
    private Integer enableFlag;

    /**
     *
     * 创建人Code
     */
    private String createBy;

    /**
     *
     * 创建时间
     */
    private Date createDate;

    /**
     *
     * 更新人Code
     */
    private String updateBy;

    /**
     *
     * 更新时间
     */
    private Date updateDate;

    /**
     * 
     * 文件类型
     */
    private String fileType;
    /**
     * 
     * 广告类型
     */
    private Integer resourceType;
    /**
     * 
     * 开始时间
     */
    private Date startTime;
    /**
     * 
     * 结束时间
     */
    private Date endTime;
    
    
	public Integer getResourceType() {
		return resourceType;
	}

	public void setResourceType(Integer resourceType) {
		this.resourceType = resourceType;
	}

	/**
	 * @param code
	 * @param name
	 * @param type
	 * @param resourceUrl
	 * @param clickUrl
	 * @param remark
	 * @param subjectCode
	 * @param enableFlag
	 * @param createBy
	 * @param createDate
	 * @param updateBy
	 * @param updateDate
	 */
	public AdResource(String code, String name, Integer type,
			String resourceUrl, String clickUrl, String remark,
			String subjectCode, String subjectName,Integer enableFlag, String createBy,
			Date createDate, String updateBy, Date updateDate, String fileType,Integer resourceType,Date startTime,Date endTime) {
		this.code = code;
		this.name = name;
		this.type = type;
		this.resourceUrl = resourceUrl;
		this.clickUrl = clickUrl;
		this.remark = remark;
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.enableFlag = enableFlag;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
		this.fileType = fileType;
		this.resourceType=resourceType;
		this.startTime=startTime;
		this.endTime=endTime;
	}

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl == null ? null : resourceUrl.trim();
    }

    public String getClickUrl() {
        return clickUrl;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl == null ? null : clickUrl.trim();
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    public String getSubjectCode() {
        return subjectCode;
    }
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode == null ? null : subjectCode.trim();
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
    
    public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

    public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public AdResource() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param code
	 * @param name
	 * @param type
	 * @param resourceUrl
	 * @param clickUrl
	 * @param remark
	 * @param subjectCode
	 * @param subjectName
	 * @param enableFlag
	 * @param createBy
	 * @param createDate
	 * @param updateBy
	 * @param updateDate
	 */
	public AdResource(Long id, String code, String name, Integer type,
			String resourceUrl, String clickUrl, String remark,
			String subjectCode, String subjectName, Integer enableFlag,
			String createBy, Date createDate, String updateBy, Date updateDate,Integer resourceType) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.type = type;
		this.resourceUrl = resourceUrl;
		this.clickUrl = clickUrl;
		this.remark = remark;
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.enableFlag = enableFlag;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
		this.resourceType=resourceType;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
    
}