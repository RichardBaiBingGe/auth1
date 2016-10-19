package cn.com.wito.auth.dto;

import java.util.Date;

import cn.com.wito.auth.constants.AdResourceType;
import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.constants.ResourceTypeEnum;

/**
 * 系统资源
 * 
 * @author wy<895791598@qq.com>
 * 
 */
public class AdResourceDto {
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
    private AdResourceType type;

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
    private EnableFlagType enableFlag;

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
    
    private String filename;
    
    public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	/**
     * 
     *  文件类型
     */
    private String fileType;
    /**
     * 
     *  广告类型
     */
    private ResourceTypeEnum resourceType;
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

    public AdResourceType getType() {
        return type;
    }

    public void setType(AdResourceType type) {
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

    public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public ResourceTypeEnum getResourceType() {
		return resourceType;
	}

	public void setResourceType(ResourceTypeEnum resourceType) {
		this.resourceType = resourceType;
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
	 * @param fileType
	 */
	public AdResourceDto(String code, String name, AdResourceType type,
			String resourceUrl, String clickUrl, String remark,
			String subjectCode, String subjectName,EnableFlagType enableFlag, String createBy,
			Date createDate, String updateBy, Date updateDate, String fileType,ResourceTypeEnum resourceType,
			Date startTime,Date endTime) {
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

	public AdResourceDto() {
		// TODO Auto-generated constructor stub
	}


	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "AdResourceDto [id=" + id + ", code=" + code + ", name=" + name
				+ ", type=" + type + ", resourceUrl=" + resourceUrl
				+ ", clickUrl=" + clickUrl + ", remark=" + remark
				+ ", subjectCode=" + subjectCode + ", subjectName="
				+ subjectName + ", enableFlag=" + enableFlag + ", createBy="
				+ createBy + ", createDate=" + createDate + ", updateBy="
				+ updateBy + ", updateDate=" + updateDate + ", fileType=" + fileType +", resourceType=" + resourceType + "]";
	}
    
}