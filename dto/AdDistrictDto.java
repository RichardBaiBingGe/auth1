package cn.com.wito.auth.dto;

import cn.com.wito.auth.constants.EnableFlagType;



/**
 * 商圈实体
 * 
 * @author baibingge
 * 
 */
public class AdDistrictDto  {


	private Long id;

    private String dCode;

    private String dName;

    private EnableFlagType dStatus;

    private String attributeValue0;

    private String attributeValue1;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDCode() {
        return dCode;
    }

    public void setDCode(String dCode) {
        this.dCode = dCode == null ? null : dCode.trim();
    }

    public String getDName() {
        return dName;
    }

    public void setDName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public EnableFlagType getDStatus() {
        return dStatus;
    }

    public void setDStatus(EnableFlagType dStatus) {
        this.dStatus = dStatus;
    }

    public String getAttributeValue0() {
        return attributeValue0;
    }

    public void setAttributeValue0(String attributeValue0) {
        this.attributeValue0 = attributeValue0 == null ? null : attributeValue0.trim();
    }

    public String getAttributeValue1() {
        return attributeValue1;
    }

    public void setAttributeValue1(String attributeValue1) {
        this.attributeValue1 = attributeValue1 == null ? null : attributeValue1.trim();
    }

	public AdDistrictDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdDistrictDto(Long id, String dCode, String dName, EnableFlagType dStatus,
			String attributeValue0, String attributeValue1) {
		super();
		this.id = id;
		this.dCode = dCode;
		this.dName = dName;
		this.dStatus = dStatus;
		this.attributeValue0 = attributeValue0;
		this.attributeValue1 = attributeValue1;
	}
    
    
	@Override
	public String toString() {
		return "AdDistrict [id=" + id + ", dCode=" + dCode + ", dName="
				+ dName + ", dStatus=" + dStatus +"]";
	}

}