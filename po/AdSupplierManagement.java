package cn.com.wito.auth.po;


/**
 * 供货商实体
 * 
 * @author baibingge
 * 
 */

public class AdSupplierManagement {
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

    private Integer sStatus;

    private String attributeValue0;

    private String attributeValue1;

    private String attributeValue2;

    private String attributeValue3;

    public Long getSId() {
        return sId;
    }

    public void setSId(Long sId) {
        this.sId = sId;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getSLinkman() {
        return sLinkman;
    }

    public void setSLinkman(String sLinkman) {
        this.sLinkman = sLinkman == null ? null : sLinkman.trim();
    }

    public String getSLinkmanphone() {
        return sLinkmanphone;
    }

    public void setSLinkmanphone(String sLinkmanphone) {
        this.sLinkmanphone = sLinkmanphone == null ? null : sLinkmanphone.trim();
    }

    public String getSAddress() {
        return sAddress;
    }

    public void setSAddress(String sAddress) {
        this.sAddress = sAddress == null ? null : sAddress.trim();
    }

    public String getSEmail() {
        return sEmail;
    }

    public void setSEmail(String sEmail) {
        this.sEmail = sEmail == null ? null : sEmail.trim();
    }

    public String getSTel() {
        return sTel;
    }

    public void setSTel(String sTel) {
        this.sTel = sTel == null ? null : sTel.trim();
    }

    public String getSFax() {
        return sFax;
    }

    public void setSFax(String sFax) {
        this.sFax = sFax == null ? null : sFax.trim();
    }

    public String getSPostcode() {
        return sPostcode;
    }

    public void setSPostcode(String sPostcode) {
        this.sPostcode = sPostcode == null ? null : sPostcode.trim();
    }

    public String getSFoodcirculationpermit() {
        return sFoodcirculationpermit;
    }

    public void setSFoodcirculationpermit(String sFoodcirculationpermit) {
        this.sFoodcirculationpermit = sFoodcirculationpermit == null ? null : sFoodcirculationpermit.trim();
    }

    public String getSProductionlicense() {
        return sProductionlicense;
    }

    public void setSProductionlicense(String sProductionlicense) {
        this.sProductionlicense = sProductionlicense == null ? null : sProductionlicense.trim();
    }

    public String getSBusinesslicensenumber() {
        return sBusinesslicensenumber;
    }

    public void setSBusinesslicensenumber(String sBusinesslicensenumber) {
        this.sBusinesslicensenumber = sBusinesslicensenumber == null ? null : sBusinesslicensenumber.trim();
    }

    public String getSTaxregistrationnumber() {
        return sTaxregistrationnumber;
    }

    public void setSTaxregistrationnumber(String sTaxregistrationnumber) {
        this.sTaxregistrationnumber = sTaxregistrationnumber == null ? null : sTaxregistrationnumber.trim();
    }

    public String getSBankaccount() {
        return sBankaccount;
    }

    public void setSBankaccount(String sBankaccount) {
        this.sBankaccount = sBankaccount == null ? null : sBankaccount.trim();
    }

    public String getSAccountnumber() {
        return sAccountnumber;
    }

    public void setSAccountnumber(String sAccountnumber) {
        this.sAccountnumber = sAccountnumber == null ? null : sAccountnumber.trim();
    }

    public String getSRemarks() {
        return sRemarks;
    }

    public void setSRemarks(String sRemarks) {
        this.sRemarks = sRemarks == null ? null : sRemarks.trim();
    }

    public Integer getSStatus() {
        return sStatus;
    }

    public void setSStatus(Integer sStatus) {
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
    public AdSupplierManagement(){
    	
    }
	public AdSupplierManagement(Long sId, String sName, String sLinkman,
			String sLinkmanphone, String sAddress, String sEmail, String sTel,
			String sFax, String sPostcode, String sFoodcirculationpermit,
			String sProductionlicense, String sBusinesslicensenumber,
			String sTaxregistrationnumber, String sBankaccount,
			String sAccountnumber, String sRemarks, Integer sStatus,
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
	
	public String toString() {
		return "AdSupplierManagement ["
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