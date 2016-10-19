package cn.com.wito.auth.dto;

import java.util.Date;

import cn.com.wito.auth.constants.FreeTakeSectionType;

public class YbFreeTakeDto {
	private Long id;
	/*机器编号*/
	private String serNum;
	/*机器名称*/
	private String machineSn;
	/*商品编号*/
	private String sn;
	/*商品名称*/
	private String productSn;
	/*频次*/
	private Integer frequency;
	/*创建时间*/
	private Date createDate;
	/*修改时间*/
	private Date updateDate;
	/*时间间隔*/
	private Integer sectionNum;
	/*时间单位*/
	private FreeTakeSectionType sectionType;
	
	public YbFreeTakeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public YbFreeTakeDto(Long id, String serNum, String machineSn, String sn,
			String productSn, Integer frequency, Date createDate,
			Date updateDate, Integer sectionNum, FreeTakeSectionType sectionType) {
		super();
		this.id = id;
		this.serNum = serNum;
		this.machineSn = machineSn;
		this.sn = sn;
		this.productSn = productSn;
		this.frequency = frequency;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.sectionNum = sectionNum;
		this.sectionType = sectionType;
	}

	//增加和修改的构造方法
	public YbFreeTakeDto(String machineSn, String productSn, Integer frequency,
			Date createDate, Date updateDate, Integer sectionNum, FreeTakeSectionType sectionType) {
		super();
		this.machineSn = machineSn;
		this.productSn = productSn;
		this.frequency = frequency;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.sectionNum = sectionNum;
		this.sectionType = sectionType;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getMachineSn() {
		return machineSn;
	}

	public void setMachineSn(String machineSn) {
		this.machineSn = machineSn;
	}

	public String getProductSn() {
		return productSn;
	}
	public void setProductSn(String productSn) {
		this.productSn = productSn;
	}
	public Integer getFrequency() {
		return frequency;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getSerNum() {
		return serNum;
	}

	public void setSerNum(String serNum) {
		this.serNum = serNum;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public Integer getSectionNum() {
		return sectionNum;
	}

	public void setSectionNum(Integer sectionNum) {
		this.sectionNum = sectionNum;
	}

	public FreeTakeSectionType getSectionType() {
		return sectionType;
	}

	public void setSectionType(FreeTakeSectionType sectionType) {
		this.sectionType = sectionType;
	}
	
	
}
