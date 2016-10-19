package cn.com.wito.auth.dto;

import java.util.Date;

import cn.com.wito.auth.constants.EnableFlagType;


/**
 * 机器布放实体
 * 
 * @author 
 * 
 */
public class AdMachineStorageDto {

	private String code;

	private String serNum;

	private String name;

	private String address;
	
	//网点类型
	private String nodeTypes;
	
	//商圈
	private String district;

	private Date storageDate;
	
	private EnableFlagType storageStates;
	
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
		this.nodeTypes = nodeTypes == null ? null : nodeTypes.trim();
	}

	public Date getStorageDate() {
		return storageDate;
	}

	public void setStorageDate(Date storageDate) {
		this.storageDate = storageDate;
	}

	public EnableFlagType getStorageStates() {
		return storageStates;
	}

	public void setStorageStates(EnableFlagType storageStates) {
		this.storageStates = storageStates;
	}
	

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
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

	public AdMachineStorageDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdMachineStorageDto(String code, String serNum, String name,
			String address, String nodeTypes, String district,
			Date storageDate, EnableFlagType storageStates, Long nodeId,
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