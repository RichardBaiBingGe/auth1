package cn.com.wito.auth.po;

import java.util.Date;

public class AisleProduct {
	
    private Long id;

    private String machineCode;

    private String aisleCode;

    private String productCode;

    private String batchCode;

    private String etcMonitorCode;

    private Date createDate;

    private Date modifyDate;

    

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode == null ? null : machineCode.trim();
    }

    public String getAisleCode() {
        return aisleCode;
    }

    public void setAisleCode(String aisleCode) {
        this.aisleCode = aisleCode == null ? null : aisleCode.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode == null ? null : batchCode.trim();
    }

    public String getEtcMonitorCode() {
        return etcMonitorCode;
    }

    public void setEtcMonitorCode(String etcMonitorCode) {
        this.etcMonitorCode = etcMonitorCode == null ? null : etcMonitorCode.trim();
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
	public AisleProduct() {
		super();
		
	}
	public String toString() {
		return "AisleProduct [id=" + id + ",machineCode=" + machineCode + ", aisleCode=" + aisleCode + ", productCode="
				+ productCode + ", batchCode=" + batchCode + ", etcMonitorCode=" + etcMonitorCode
				+ ", createDate=" + createDate+ ", modifyDate=" + modifyDate+ 
				 "]";
		}
	public AisleProduct(Long id, String machineCode,
			String aisleCode,String productCode,
			String batchCode,String etcMonitorCode,Date createDate,Date modifyDate) {
		super();
		this.id = id;
		this.machineCode = machineCode;
		this.aisleCode = aisleCode;
		this.productCode = productCode;
		this.batchCode = batchCode;
		this.etcMonitorCode = etcMonitorCode;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
	}
}