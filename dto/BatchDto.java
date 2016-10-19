package cn.com.wito.auth.dto;

import java.io.Serializable;
import java.util.Date;

public class BatchDto implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    private String batchCode;

    private Long productId;

    private String productCode;

    private Date productionDate;

    private Date validDate;

    private Integer selfLife;

    private Date createDate;

    private Date modifyDate;

    private String createBy;

    private String updateBy;
    
    private Integer count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode == null ? null : batchCode.trim();
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Integer getSelfLife() {
        return selfLife;
    }

    public void setSelfLife(Integer selfLife) {
        this.selfLife = selfLife;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public BatchDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BatchDto(Long id, String batchCode, Long productId,
			String productCode, Date productionDate, Date validDate,
			Integer selfLife, Date createDate, Date modifyDate,
			String createBy, String updateBy, Integer count) {
		super();
		this.id = id;
		this.batchCode = batchCode;
		this.productId = productId;
		this.productCode = productCode;
		this.productionDate = productionDate;
		this.validDate = validDate;
		this.selfLife = selfLife;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.createBy = createBy;
		this.updateBy = updateBy;
		this.count = count;
	}

	
    
    
}