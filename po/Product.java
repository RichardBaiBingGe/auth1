package cn.com.wito.auth.po;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品
 * 
 * @author FJG
 * 
 */
public class Product {

	/** 商品ID */
	private Long id;
	/** 商品创建日期 */
	private Date createDate;
	/** 商品修改日期 */
	private Date modifyDate;
	/** 已分配库存 */
	private Integer allocatedStock;
	/** 商品属性值0 */
	private String attributeValue0;
	/** 商品属性值1 */
	private String attributeValue1;
	/** 商品属性值10 */
	private String attributeValue10;
	/** 商品属性值11 */
	private String attributeValue11;
	/** 商品属性值12 */
	private String attributeValue12;
	/** 商品属性值13 */
	private String attributeValue13;
	/** 商品属性值14 */
	private String attributeValue14;
	/** 商品属性值15 */
	private String attributeValue15;
	/** 商品属性值16 */
	private String attributeValue16;
	/** 商品属性值17 */
	private String attributeValue17;
	/** 商品属性值18 */
	private String attributeValue18;
	/** 商品属性值19 */
	private String attributeValue19;
	/** 商品属性值2 */
	private String attributeValue2;
	/** 商品属性值3 */
	private String attributeValue3;
	/** 商品属性值4 */
	private String attributeValue4;
	/** 商品属性值5 */
	private String attributeValue5;
	/** 商品属性值6 */
	private String attributeValue6;
	/** 商品属性值7 */
	private String attributeValue7;
	/** 商品属性值8 */
	private String attributeValue8;
	/** 商品属性值9 */
	private String attributeValue9;
	/** 成本价 */
	private BigDecimal cost;
	/** 商品全称 */
	private String fullName;
	/** 点击数 */
	private Long hits;
	/** 展示图片 */
	private String image;
	/** 是否为赠品 */
	private Boolean isGift;
	/** 是否列出 */
	private Boolean isList;
	/** 是否上架 */
	private Boolean isMarketable;
	/** 是否置顶 */
	private Boolean isTop;
	/** 搜索关键词 */
	private String keyword;
	/** 市场价 */
	private BigDecimal marketPrice;
	/** 备注 */
	private String memo;
	/** 月点击数 */
	private Long monthHits;
	/** 月点击数更新日期 */
	private Date monthHitsDate;
	/** 周销量更新日期 */
	private Long monthSales;
	/** 月销量更新日期 */
	private Date monthSalesDate;
	/** 商品名称 */
	private String name;
	/** 赠送积分 */
	private Long point;
	/** 销售价 */
	private BigDecimal price;
	/** 销量 */
	private Long sales;
	/** 评分 */
	private Float score;
	/** 评分数 */
	private Long scoreCount;
	/** 页面描述 */
	private String seoDescription;
	/** 页面关键词 */
	private String seoKeywords;
	/** 页面标题 */
	private String seoTitle;
	/** 商品编号 */
	private String sn;
	/** 库存 */
	private Integer stock;
	/** 库存备注 */
	private String stockMemo;
	/** 总评分 */
	private Long totalScore;
	/** 单位 */
	private String unit;
	/** 周点击数 */
	private Long weekHits;
	/** 周点击数更新日期 */
	private Date weekHitsDate;
	/** 周销量 */
	private Long weekSales;
	/** 周销量更新日期 */
	private Date weekSalesDate;
	/** 重量 */
	private Integer weight;
	/** 品牌 */
	private Long brand;
	/** 货品 */
	private Long goods;
	/** 商品分类 */
	private Long productCategory;
	/** 商品所属商圈 */
	private Long businessArea;
	/** 所属商户 Code */
	private String operateSubjectCode;
	/** 所属商户 名称 */
	private String operateSubjectName;
	/** 店名 */
	private String storeName;
	/** 介绍 */
	private String introduction;
	/** 逻辑删除状态 */
	private Long productDel;
	
	//产地
	private String producingarea;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Integer getAllocatedStock() {
		return allocatedStock;
	}

	public void setAllocatedStock(Integer allocatedStock) {
		this.allocatedStock = allocatedStock;
	}

	public String getAttributeValue0() {
		return attributeValue0;
	}

	public void setAttributeValue0(String attributeValue0) {
		this.attributeValue0 = attributeValue0 == null ? null : attributeValue0
				.trim();
	}

	public String getAttributeValue1() {
		return attributeValue1;
	}

	public void setAttributeValue1(String attributeValue1) {
		this.attributeValue1 = attributeValue1 == null ? null : attributeValue1
				.trim();
	}

	public String getAttributeValue10() {
		return attributeValue10;
	}

	public void setAttributeValue10(String attributeValue10) {
		this.attributeValue10 = attributeValue10 == null ? null
				: attributeValue10.trim();
	}

	public String getAttributeValue11() {
		return attributeValue11;
	}

	public void setAttributeValue11(String attributeValue11) {
		this.attributeValue11 = attributeValue11 == null ? null
				: attributeValue11.trim();
	}

	public String getAttributeValue12() {
		return attributeValue12;
	}

	public void setAttributeValue12(String attributeValue12) {
		this.attributeValue12 = attributeValue12 == null ? null
				: attributeValue12.trim();
	}

	public String getAttributeValue13() {
		return attributeValue13;
	}

	public void setAttributeValue13(String attributeValue13) {
		this.attributeValue13 = attributeValue13 == null ? null
				: attributeValue13.trim();
	}

	public String getAttributeValue14() {
		return attributeValue14;
	}

	public void setAttributeValue14(String attributeValue14) {
		this.attributeValue14 = attributeValue14 == null ? null
				: attributeValue14.trim();
	}

	public String getAttributeValue15() {
		return attributeValue15;
	}

	public void setAttributeValue15(String attributeValue15) {
		this.attributeValue15 = attributeValue15 == null ? null
				: attributeValue15.trim();
	}

	public String getAttributeValue16() {
		return attributeValue16;
	}

	public void setAttributeValue16(String attributeValue16) {
		this.attributeValue16 = attributeValue16 == null ? null
				: attributeValue16.trim();
	}

	public String getAttributeValue17() {
		return attributeValue17;
	}

	public void setAttributeValue17(String attributeValue17) {
		this.attributeValue17 = attributeValue17 == null ? null
				: attributeValue17.trim();
	}

	public String getAttributeValue18() {
		return attributeValue18;
	}

	public void setAttributeValue18(String attributeValue18) {
		this.attributeValue18 = attributeValue18 == null ? null
				: attributeValue18.trim();
	}

	public String getAttributeValue19() {
		return attributeValue19;
	}

	public void setAttributeValue19(String attributeValue19) {
		this.attributeValue19 = attributeValue19 == null ? null
				: attributeValue19.trim();
	}

	public String getAttributeValue2() {
		return attributeValue2;
	}

	public void setAttributeValue2(String attributeValue2) {
		this.attributeValue2 = attributeValue2 == null ? null : attributeValue2
				.trim();
	}

	public String getAttributeValue3() {
		return attributeValue3;
	}

	public void setAttributeValue3(String attributeValue3) {
		this.attributeValue3 = attributeValue3 == null ? null : attributeValue3
				.trim();
	}

	public String getAttributeValue4() {
		return attributeValue4;
	}

	public void setAttributeValue4(String attributeValue4) {
		this.attributeValue4 = attributeValue4 == null ? null : attributeValue4
				.trim();
	}

	public String getAttributeValue5() {
		return attributeValue5;
	}

	public void setAttributeValue5(String attributeValue5) {
		this.attributeValue5 = attributeValue5 == null ? null : attributeValue5
				.trim();
	}

	public String getAttributeValue6() {
		return attributeValue6;
	}

	public void setAttributeValue6(String attributeValue6) {
		this.attributeValue6 = attributeValue6 == null ? null : attributeValue6
				.trim();
	}

	public String getAttributeValue7() {
		return attributeValue7;
	}

	public void setAttributeValue7(String attributeValue7) {
		this.attributeValue7 = attributeValue7 == null ? null : attributeValue7
				.trim();
	}

	public String getAttributeValue8() {
		return attributeValue8;
	}

	public void setAttributeValue8(String attributeValue8) {
		this.attributeValue8 = attributeValue8 == null ? null : attributeValue8
				.trim();
	}

	public String getAttributeValue9() {
		return attributeValue9;
	}

	public void setAttributeValue9(String attributeValue9) {
		this.attributeValue9 = attributeValue9 == null ? null : attributeValue9
				.trim();
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName == null ? null : fullName.trim();
	}

	public Long getHits() {
		return hits;
	}

	public void setHits(Long hits) {
		this.hits = hits;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image == null ? null : image.trim();
	}

	public Boolean getIsGift() {
		return isGift;
	}

	public void setIsGift(Boolean isGift) {
		this.isGift = isGift;
	}

	public Boolean getIsList() {
		return isList;
	}

	public void setIsList(Boolean isList) {
		this.isList = isList;
	}

	public Boolean getIsMarketable() {
		return isMarketable;
	}

	public void setIsMarketable(Boolean isMarketable) {
		this.isMarketable = isMarketable;
	}

	public Boolean getIsTop() {
		return isTop;
	}

	public void setIsTop(Boolean isTop) {
		this.isTop = isTop;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword == null ? null : keyword.trim();
	}

	public BigDecimal getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(BigDecimal marketPrice) {
		this.marketPrice = marketPrice;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo == null ? null : memo.trim();
	}

	public Long getMonthHits() {
		return monthHits;
	}

	public void setMonthHits(Long monthHits) {
		this.monthHits = monthHits;
	}

	public Date getMonthHitsDate() {
		return monthHitsDate;
	}

	public void setMonthHitsDate(Date monthHitsDate) {
		this.monthHitsDate = monthHitsDate;
	}

	public Long getMonthSales() {
		return monthSales;
	}

	public void setMonthSales(Long monthSales) {
		this.monthSales = monthSales;
	}

	public Date getMonthSalesDate() {
		return monthSalesDate;
	}

	public void setMonthSalesDate(Date monthSalesDate) {
		this.monthSalesDate = monthSalesDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Long getPoint() {
		return point;
	}

	public void setPoint(Long point) {
		this.point = point;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Long getSales() {
		return sales;
	}

	public void setSales(Long sales) {
		this.sales = sales;
	}

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public Long getScoreCount() {
		return scoreCount;
	}

	public void setScoreCount(Long scoreCount) {
		this.scoreCount = scoreCount;
	}

	public String getSeoDescription() {
		return seoDescription;
	}

	public void setSeoDescription(String seoDescription) {
		this.seoDescription = seoDescription == null ? null : seoDescription
				.trim();
	}

	public String getSeoKeywords() {
		return seoKeywords;
	}

	public void setSeoKeywords(String seoKeywords) {
		this.seoKeywords = seoKeywords == null ? null : seoKeywords.trim();
	}

	public String getSeoTitle() {
		return seoTitle;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle == null ? null : seoTitle.trim();
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn == null ? null : sn.trim();
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getStockMemo() {
		return stockMemo;
	}

	public void setStockMemo(String stockMemo) {
		this.stockMemo = stockMemo == null ? null : stockMemo.trim();
	}

	public Long getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Long totalScore) {
		this.totalScore = totalScore;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit == null ? null : unit.trim();
	}

	public Long getWeekHits() {
		return weekHits;
	}

	public void setWeekHits(Long weekHits) {
		this.weekHits = weekHits;
	}

	public Date getWeekHitsDate() {
		return weekHitsDate;
	}

	public void setWeekHitsDate(Date weekHitsDate) {
		this.weekHitsDate = weekHitsDate;
	}

	public Long getWeekSales() {
		return weekSales;
	}

	public void setWeekSales(Long weekSales) {
		this.weekSales = weekSales;
	}

	public Date getWeekSalesDate() {
		return weekSalesDate;
	}

	public void setWeekSalesDate(Date weekSalesDate) {
		this.weekSalesDate = weekSalesDate;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Long getBrand() {
		return brand;
	}

	public void setBrand(Long brand) {
		this.brand = brand;
	}

	public Long getGoods() {
		return goods;
	}

	public void setGoods(Long goods) {
		this.goods = goods;
	}

	public Long getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(Long productCategory) {
		this.productCategory = productCategory;
	}

	public Long getBusinessArea() {
		return businessArea;
	}

	public void setBusinessArea(Long businessArea) {
		this.businessArea = businessArea;
	}

	public String getOperateSubjectCode() {
		return operateSubjectCode;
	}

	public void setOperateSubjectCode(String operateSubjectCode) {
		this.operateSubjectCode = operateSubjectCode == null ? null
				: operateSubjectCode.trim();
	}

	public String getOperateSubjectName() {
		return operateSubjectName;
	}

	public void setOperateSubjectName(String operateSubjectName) {
		this.operateSubjectName = operateSubjectName == null ? null
				: operateSubjectName.trim();
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName == null ? null : storeName.trim();
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction == null ? null : introduction.trim();
	}

	public Long getProductDel() {
		return productDel;
	}

	public void setProductDel(Long productDel) {
		this.productDel = productDel;
	}
	

	public String getProducingarea() {
		return producingarea;
	}

	public void setProducingarea(String producingarea) {
		this.producingarea = producingarea;
	}

	public Product() {
		super();
	}

	
	public Product(Long id, Date createDate, Date modifyDate,
			Integer allocatedStock, String attributeValue0,
			String attributeValue1, String attributeValue10,
			String attributeValue11, String attributeValue12,
			String attributeValue13, String attributeValue14,
			String attributeValue15, String attributeValue16,
			String attributeValue17, String attributeValue18,
			String attributeValue19, String attributeValue2,
			String attributeValue3, String attributeValue4,
			String attributeValue5, String attributeValue6,
			String attributeValue7, String attributeValue8,
			String attributeValue9, BigDecimal cost, String fullName,
			Long hits, String image, Boolean isGift, Boolean isList,
			Boolean isMarketable, Boolean isTop, String keyword,
			BigDecimal marketPrice, String memo, Long monthHits,
			Date monthHitsDate, Long monthSales, Date monthSalesDate,
			String name, Long point, BigDecimal price, Long sales, Float score,
			Long scoreCount, String seoDescription, String seoKeywords,
			String seoTitle, String sn, Integer stock, String stockMemo,
			Long totalScore, String unit, Long weekHits, Date weekHitsDate,
			Long weekSales, Date weekSalesDate, Integer weight, Long brand,
			Long goods, Long productCategory, Long businessArea,
			String operateSubjectCode, String operateSubjectName,
			String storeName, String introduction, Long productDel,
			String producingarea) {
		super();
		this.id = id;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.allocatedStock = allocatedStock;
		this.attributeValue0 = attributeValue0;
		this.attributeValue1 = attributeValue1;
		this.attributeValue10 = attributeValue10;
		this.attributeValue11 = attributeValue11;
		this.attributeValue12 = attributeValue12;
		this.attributeValue13 = attributeValue13;
		this.attributeValue14 = attributeValue14;
		this.attributeValue15 = attributeValue15;
		this.attributeValue16 = attributeValue16;
		this.attributeValue17 = attributeValue17;
		this.attributeValue18 = attributeValue18;
		this.attributeValue19 = attributeValue19;
		this.attributeValue2 = attributeValue2;
		this.attributeValue3 = attributeValue3;
		this.attributeValue4 = attributeValue4;
		this.attributeValue5 = attributeValue5;
		this.attributeValue6 = attributeValue6;
		this.attributeValue7 = attributeValue7;
		this.attributeValue8 = attributeValue8;
		this.attributeValue9 = attributeValue9;
		this.cost = cost;
		this.fullName = fullName;
		this.hits = hits;
		this.image = image;
		this.isGift = isGift;
		this.isList = isList;
		this.isMarketable = isMarketable;
		this.isTop = isTop;
		this.keyword = keyword;
		this.marketPrice = marketPrice;
		this.memo = memo;
		this.monthHits = monthHits;
		this.monthHitsDate = monthHitsDate;
		this.monthSales = monthSales;
		this.monthSalesDate = monthSalesDate;
		this.name = name;
		this.point = point;
		this.price = price;
		this.sales = sales;
		this.score = score;
		this.scoreCount = scoreCount;
		this.seoDescription = seoDescription;
		this.seoKeywords = seoKeywords;
		this.seoTitle = seoTitle;
		this.sn = sn;
		this.stock = stock;
		this.stockMemo = stockMemo;
		this.totalScore = totalScore;
		this.unit = unit;
		this.weekHits = weekHits;
		this.weekHitsDate = weekHitsDate;
		this.weekSales = weekSales;
		this.weekSalesDate = weekSalesDate;
		this.weight = weight;
		this.brand = brand;
		this.goods = goods;
		this.productCategory = productCategory;
		this.businessArea = businessArea;
		this.operateSubjectCode = operateSubjectCode;
		this.operateSubjectName = operateSubjectName;
		this.storeName = storeName;
		this.introduction = introduction;
		this.productDel = productDel;
		this.producingarea = producingarea;
	}

	
	public String toString() {
		return "ProductCategory [id=" + id + ",createDate=" + createDate + ","
				+ "modifyDate=" + modifyDate + ",allocatedStock="
				+ allocatedStock + "," + "attributeValue0=" + attributeValue0
				+ ", attributeValue1=" + attributeValue1
				+ ", attributeValue10=" + attributeValue10
				+ ", attributeValue11=" + attributeValue11
				+ ", attributeValue12=" + attributeValue12
				+ ", attributeValue13=" + attributeValue13
				+ ", attributeValue14=" + attributeValue14
				+ ", attributeValue15=" + attributeValue15
				+ ",attributeValue16=" + attributeValue16
				+ ",attributeValue17=" + attributeValue17 + ","
				+ "attributeValue18=" + attributeValue18 + ",attributeValue19="
				+ attributeValue19 + "," + "attributeValue2=" + attributeValue2
				+ ", attributeValue3=" + attributeValue3 + ", attributeValue4="
				+ attributeValue4 + ", attributeValue5=" + attributeValue5
				+ ", attributeValue6=" + attributeValue6 + ", attributeValue7="
				+ attributeValue7 + ", attributeValue8=" + attributeValue8
				+ ", attributeValue9=" + attributeValue9 + ",cost=" + cost
				+ ",fullName=" + fullName + "," + "hits=" + hits + ",image="
				+ image + "," + "isGift=" + isGift + ", isList=" + isList
				+ ", isMarketable=" + isMarketable + ", isTop=" + isTop
				+ ", keyword=" + keyword + ", marketPrice=" + marketPrice
				+ ", memo=" + memo + ", monthHits=" + monthHits
				+ ",monthHitsDate=" + monthHitsDate + ",monthSales="
				+ monthSales + "," + "monthSalesDate=" + monthSalesDate
				+ ",name=" + name + "," + "point=" + point + ", price=" + price
				+ ", sales=" + sales + ", score=" + score + ", scoreCount="
				+ scoreCount + ", seoDescription=" + seoDescription
				+ ", seoKeywords=" + seoKeywords + ", seoTitle=" + seoTitle
				+ ",sn=" + sn + ",stock=" + stock + "," + "stockMemo="
				+ stockMemo + ",totalScore=" + totalScore + "," + "unit="
				+ unit + ", weekHits=" + weekHits + ", weekHitsDate="
				+ weekHitsDate + ", weekSales=" + weekSales
				+ ", weekSalesDate=" + weekSalesDate + ", weight=" + weight
				+ ", brand=" + brand + ", goods=" + goods + ",productCategory="
				+ productCategory + ",businessArea=" + businessArea + ","
				+ "operateSubjectCode=" + operateSubjectCode
				+ ",operateSubjectName=" + operateSubjectName + ","
				+ "storeName=" + storeName + ", introduction=" + introduction
				+ "]";
	}
}