package cn.com.wito.auth.po;

import java.math.BigDecimal;
import java.util.Date;

public class VendingMachineProerties {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String machineCode;

    private String aisleCode;

    private String productCode;

    private String productName;

    private BigDecimal price;

    private Integer amount;

    private String picUrl;
    private String machineCode1; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }
    public VendingMachineProerties() {

   	}
    

	public String getMachineCode1() {
		return machineCode1;
	}

	public void setMachineCode1(String machineCode1) {
		this.machineCode1 = machineCode1;
	}

	public VendingMachineProerties(Long id,Date createDate,Date modifyDate,String machineCode,
   			String aisleCode,String productCode,String productName,BigDecimal price,Integer amount,String picUrl,String machineCode1) {
   		super();
   		this.id=id;
   		this.createDate=createDate;
   		this.modifyDate=modifyDate;
   		this.machineCode=machineCode;
   		this.aisleCode=aisleCode;
   		this.productCode=productCode;
   		this.productName=productName;
   		this.price=price;
   		this.amount=amount;
   		this.picUrl=picUrl;
   		this.machineCode1=machineCode1;	
   	}

   	@Override
   	public String toString() {
   		return "VendingMachineProertiesDto [id=" + id + ",createDate=" + createDate + ", modifyDate=" + modifyDate + ", machineCode="
   				+ machineCode + ", aisleCode=" + aisleCode + ", productCode=" + productCode
   				+ ", productName=" + productName 
   				+ ", price=" + price
   				+ ", amount=" + amount+ ", picUrl=" + picUrl+", machineCode1=" + machineCode1+ "]";
   	}
}