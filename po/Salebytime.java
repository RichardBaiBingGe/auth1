package cn.com.wito.auth.po;

import java.math.BigDecimal;

public class Salebytime {
	
	private Integer timePart;
	
	private BigDecimal salesAmount;
	
	private Integer salesVolume;
	
	private Double rate;

	public Integer getTimePart() {
		return timePart;
	}

	public void setTimePart(Integer timePart) {
		this.timePart = timePart;
	}

	public BigDecimal getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(BigDecimal salesAmount) {
		this.salesAmount = salesAmount;
	}

	public Integer getSalesVolume() {
		return salesVolume;
	}

	public void setSalesVolume(Integer salesVolume) {
		this.salesVolume = salesVolume;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}
	
}
