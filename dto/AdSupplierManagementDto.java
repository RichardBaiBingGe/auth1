package cn.com.wito.auth.dto;

import cn.com.wito.auth.constants.EnableFlagType;


/**
 * 供货商实体
 * 
 * @author baibingge
 * 
 */

public class AdSupplierManagementDto {
    private Long sId;

    private String sName;

    private String sLinkman;

    private String sLinkmanphone;

    private String sAddress;

    private String sEmail;

    private String sTel;

    private String sFax;

    private String sPostcode;

    private String sFoodcirculationpermit;

    private String sProductionlicense;

    private String sBusinesslicensenumber;

    private String sTaxregistrationnumber;

    private String sBankaccount;

    private String sAccountnumber;

    private String sRemarks;

    private EnableFlagType sStatus;

    private String attributeValue0;

    private String attributeValue1;

    private String attributeValue2;

    private String attributeValue3;

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsLinkman() {
        return sLinkman;
    }

    public void setsLinkman(String sLinkman) {
        this.sLinkman = sLinkman == null ? null : sLinkman.trim();
    }

    public String getsLinkmanphone() {
        return sLinkmanphone;
    }

    public void setsLinkmanphone(String sLinkmanphone) {
        this.sLinkmanphone = sLinkmanphone == null ? null : sLinkmanphone.trim();
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress == null ? null : sAddress.trim();
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail == null ? null : sEmail.trim();
    }

    public String getsTel() {
        return sTel;
    }

    public void setsTel(String sTel) {
        this.sTel = sTel == null ? null : sTel.trim();
    }

    public String getsFax() {
        return sFax;
    }

    public void setsFax(String sFax) {
        this.sFax = sFax == null ? null : sFax.trim();
    }

    public String getsPostcode() {
        return sPostcode;
    }

    public void setsPostcode(String sPostcode) {
        this.sPostcode = sPostcode == null ? null : sPostcode.trim();
    }

    public String getsFoodcirculationpermit() {
        return sFoodcirculationpermit;
    }

    public void setsFoodcirculationpermit(String sFoodcirculationpermit) {
        this.sFoodcirculationpermit = sFoodcirculationpermit == null ? null : sFoodcirculationpermit.trim();
    }

    public String getsProductionlicense() {
        return sProductionlicense;
    }

    public void setsProductionlicense(String sProductionlicense) {
        this.sProductionlicense = sProductionlicense == null ? null : sProductionlicense.trim();
    }

    public String getsBusinesslicensenumber() {
        return sBusinesslicensenumber;
    }

    public void setsBusinesslicensenumber(String sBusinesslicensenumber) {
        this.sBusinesslicensenumber = sBusinesslicensenumber == null ? null : sBusinesslicensenumber.trim();
    }

    public String getsTaxregistrationnumber() {
        return sTaxregistrationnumber;
    }

    public void setsTaxregistrationnumber(String sTaxregistrationnumber) {
        this.sTaxregistrationnumber = sTaxregistrationnumber == null ? null : sTaxregistrationnumber.trim();
    }

    public String getsBankaccount() {
        return sBankaccount;
    }

    public void setsBankaccount(String sBankaccount) {
        this.sBankaccount = sBankaccount == null ? null : sBankaccount.trim();
    }

    public String getsAccountnumber() {
        return sAccountnumber;
    }

    public void setsAccountnumber(String sAccountnumber) {
        this.sAccountnumber = sAccountnumber == null ? null : sAccountnumber.trim();
    }

    public String getsRemarks() {
        return sRemarks;
    }

    public void setsRemarks(String sRemarks) {
        this.sRemarks = sRemarks == null ? null : sRemarks.trim();
    }

    public EnableFlagType getsStatus() {
        return sStatus;
    }

    public void setsStatus(EnableFlagType sStatus) {
        this.sStatus = sStatus;
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

    public String getAttributeValue2() {
        return attributeValue2;
    }

    public void setAttributeValue2(String attributeValue2) {
        this.attributeValue2 = attributeValue2 == null ? null : attributeValue2.trim();
    }

    public String getAttributeValue3() {
        return attributeValue3;
    }

    public void setAttributeValue3(String attributeValue3) {
        this.attributeValue3 = attributeValue3 == null ? null : attributeValue3.trim();
    }
    
    

	public AdSupplierManagementDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdSupplierManagementDto(Long sId, String sName, String sLinkman,
			String sLinkmanphone, String sAddress, String sEmail, String sTel,
			String sFax, String sPostcode, String sFoodcirculationpermit,
			String sProductionlicense, String sBusinesslicensenumber,
			String sTaxregistrationnumber, String sBankaccount,
			String sAccountnumber, String sRemarks, EnableFlagType sStatus,
			String attributeValue0, String attributeValue1,
			String attributeValue2, String attributeValue3) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sLinkman = sLinkman;
		this.sLinkmanphone = sLinkmanphone;
		this.sAddress = sAddress;
		this.sEmail = sEmail;
		this.sTel = sTel;
		this.sFax = sFax;
		this.sPostcode = sPostcode;
		this.sFoodcirculationpermit = sFoodcirculationpermit;
		this.sProductionlicense = sProductionlicense;
		this.sBusinesslicensenumber = sBusinesslicensenumber;
		this.sTaxregistrationnumber = sTaxregistrationnumber;
		this.sBankaccount = sBankaccount;
		this.sAccountnumber = sAccountnumber;
		this.sRemarks = sRemarks;
		this.sStatus = sStatus;
		this.attributeValue0 = attributeValue0;
		this.attributeValue1 = attributeValue1;
		this.attributeValue2 = attributeValue2;
		this.attributeValue3 = attributeValue3;
	}

	public AdSupplierManagementDto(String sName, String sLinkman,
			String sLinkmanphone, String sAddress, String sEmail, String sTel,
			String sFax, String sPostcode, String sFoodcirculationpermit,
			String sProductionlicense, String sBusinesslicensenumber,
			String sTaxregistrationnumber, String sBankaccount,
			String sAccountnumber, String sRemarks, EnableFlagType sStatus,
			String attributeValue0, String attributeValue1,
			String attributeValue2, String attributeValue3) {
		super();
		this.sName = sName;
		this.sLinkman = sLinkman;
		this.sLinkmanphone = sLinkmanphone;
		this.sAddress = sAddress;
		this.sEmail = sEmail;
		this.sTel = sTel;
		this.sFax = sFax;
		this.sPostcode = sPostcode;
		this.sFoodcirculationpermit = sFoodcirculationpermit;
		this.sProductionlicense = sProductionlicense;
		this.sBusinesslicensenumber = sBusinesslicensenumber;
		this.sTaxregistrationnumber = sTaxregistrationnumber;
		this.sBankaccount = sBankaccount;
		this.sAccountnumber = sAccountnumber;
		this.sRemarks = sRemarks;
		this.sStatus = sStatus;
		this.attributeValue0 = attributeValue0;
		this.attributeValue1 = attributeValue1;
		this.attributeValue2 = attributeValue2;
		this.attributeValue3 = attributeValue3;
	}
	
	public String toString() {
		return "AdSupplierManagementDto ["
				+ "sId="+ sId +
				",sName=" + sName +
				", sLinkman="+ sLinkman +
				", sLinkmanphone=" + sLinkmanphone +
				", sAddress=" + sAddress +
				", sEmail=" + sEmail +
				", sTel=" + sTel +
				", sFax=" + sFax +
				", sPostcode=" + sPostcode +
				", sFoodcirculationpermit=" + sFoodcirculationpermit +
				", sProductionlicense=" + sProductionlicense +
				", sBusinesslicensenumber=" + sBusinesslicensenumber +
				", sTaxregistrationnumber=" + sTaxregistrationnumber +
				", sBankaccount=" + sBankaccount +
				", sAccountnumber=" + sAccountnumber +
				", sRemarks=" + sRemarks +
				", sStatus=" + sStatus +
				", attributeValue0=" + attributeValue0 +
				", attributeValue1=" + attributeValue1 +
				", attributeValue2=" + attributeValue2 +
				", attributeValue3=" + attributeValue3 +
				"]";
	}

	
    
    
}