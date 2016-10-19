package cn.com.wito.auth.po;

import java.io.Serializable;


/**
 * 商圈实体
 * 
 * @author baibingge
 * 
 */
public class AdDistrict implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 7978813403516390413L;

	private Long id;

    private String dCode;

    private String dName;

    private Integer dStatus;

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

    public Integer getDStatus() {
        return dStatus;
    }

    public void setDStatus(Integer dStatus) {
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

	public AdDistrict() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdDistrict(Long id, String dCode, String dName, Integer dStatus,
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