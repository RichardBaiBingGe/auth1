package cn.com.wito.auth.po;

import java.math.BigDecimal;
/**
 * 历史销售明细实体
 * 
 * @author ZhangDi
 * 
 */
public class SaleHistoryDetail {
		/*序号 */
		private Long id;
		/*机器出厂号 */
		private String code;
		/*售货机序列号 */
		private String serNum;
		/*售货机名称 */
		private String name;
		/*门店名称 */
		private String storeName;
		/* 地址*/
		private String address;
		/* 网点类型*/
		private String nodeName;
		/*销售额*/
		private BigDecimal offsetAmount;
		/*销售数量*/
		private BigDecimal quantity;
		
		public SaleHistoryDetail() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public SaleHistoryDetail(Long id, String code, String serNum,
				String name, String storeName, String address, String nodeName,
				BigDecimal offsetAmount, BigDecimal quantity) {
			super();
			this.id = id;
			this.code = code;
			this.serNum = serNum;
			this.name = name;
			this.storeName = storeName;
			this.address = address;
			this.nodeName = nodeName;
			this.offsetAmount = offsetAmount;
			this.quantity = quantity;
		}

		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getSerNum() {
			return serNum;
		}
		public void setSerNum(String serNum) {
			this.serNum = serNum;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStoreName() {
			return storeName;
		}
		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getNodeName() {
			return nodeName;
		}
		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}
		public BigDecimal getOffsetAmount() {
			return offsetAmount;
		}
		public void setOffsetAmount(BigDecimal offsetAmount) {
			this.offsetAmount = offsetAmount;
		}
		public BigDecimal getQuantity() {
			return quantity;
		}
		public void setQuantity(BigDecimal quantity) {
			this.quantity = quantity;
		}
		
}
