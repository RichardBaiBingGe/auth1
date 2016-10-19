package cn.com.wito.auth.po;

import java.util.Date;


/**
 * 机器布放实体
 * 
 * @author 
 * 
 */
public class AdMachineStorage {

	private String code;

	private String serNum;

	private String name;

	private String address;
	//网点类型
	private String nodeTypes;
	
	//商圈
	private String district;

	private Date storageDate;
	
	private Integer storageStates;
	
	
	
	private Long nodeId;
	
	private Long districtId;
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public String getSerNum() {
		return serNum;
	}

	public void setSerNum(String serNum) {
		this.serNum = serNum == null ? null : serNum.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getNodeTypes() {
		return nodeTypes;
	}

	public void setNodeTypes(String nodeTypes) {
		this.nodeTypes = nodeTypes == null ? null : nodeTypes.trim() ;
	}
	

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district == null ? null : district.trim();
	}

	public Date getStorageDate() {
		return storageDate;
	}

	public void setStorageDate(Date storageDate) {
		this.storageDate = storageDate;
	}

	public Integer getStorageStates() {
		return storageStates;
	}

	public void setStorageStates(Integer storageStates) {
		this.storageStates = storageStates;
	}

	public Long getNodeId() {
		return nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public AdMachineStorage() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public AdMachineStorage(String code, String serNum, String name,
			String address, String nodeTypes, String district,
			Date storageDate, Integer storageStates, Long nodeId,
			Long districtId) {
		super();
		this.code = code;
		this.serNum = serNum;
		this.name = name;
		this.address = address;
		this.nodeTypes = nodeTypes;
		this.district = district;
		this.storageDate = storageDate;
		this.storageStates = storageStates;
		this.nodeId = nodeId;
		this.districtId = districtId;
	}

	@Override
	public String toString() {
		return "MachineStorage [code=" + code +
				", serNum=" + serNum + 
				", name=" + name + 
				", address=" + address + 
				", nodeTypes="+ nodeTypes + 
				", storageDate=" + storageDate + 
				", storageStates="+ storageStates + 
				", district="+ district + 
				", nodeId="+ nodeId + 
				", districtId="+ districtId + 
				"]";
	}





}