package cn.com.wito.auth.dto;

import java.util.Date;

public class ProductSupervisionDto {
	
	   private Long id;

	    private String supervisionCode;

	    private String batchcode;

	    private Date createTime;

	    private Integer supervisionDel;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getSupervisionCode() {
			return supervisionCode;
		}

		public void setSupervisionCode(String supervisionCode) {
			this.supervisionCode = supervisionCode;
		}

		public String getBatchcode() {
			return batchcode;
		}

		public void setBatchcode(String batchcode) {
			this.batchcode = batchcode;
		}

		public Date getCreateTime() {
			return createTime;
		}

		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}

		public Integer getSupervisionDel() {
			return supervisionDel;
		}

		public void setSupervisionDel(Integer supervisionDel) {
			this.supervisionDel = supervisionDel;
		}

		public ProductSupervisionDto() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ProductSupervisionDto(Long id, String supervisionCode,
				String batchcode, Date createTime, Integer supervisionDel) {
			super();
			this.id = id;
			this.supervisionCode = supervisionCode;
			this.batchcode = batchcode;
			this.createTime = createTime;
			this.supervisionDel = supervisionDel;
		}

	    
	    

}
