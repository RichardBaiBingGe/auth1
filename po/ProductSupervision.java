package cn.com.wito.auth.po;

import java.io.Serializable;
import java.util.Date;

public class ProductSupervision implements Serializable{
	
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public ProductSupervision() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ProductSupervision(Long id, String supervisionCode,
				String batchcode, Date createTime, Integer supervisionDel) {
			super();
			this.id = id;
			this.supervisionCode = supervisionCode;
			this.batchcode = batchcode;
			this.createTime = createTime;
			this.supervisionDel = supervisionDel;
		}
	    
	    
	    

}
