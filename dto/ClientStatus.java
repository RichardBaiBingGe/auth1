package cn.com.wito.auth.dto;

import java.io.Serializable;
import java.util.Date;

public class ClientStatus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7166289929407130613L;

	private String uuid;

	private Date lastTickTime;

	private String lastIpAddress;

	private String seriesNum;

	public ClientStatus() {

	}

	public ClientStatus(String uuid, String seriesNum, Date lastTickTime,
			String lastIpAddress) {
		super();
		this.uuid = uuid;
		this.seriesNum = seriesNum;
		this.lastTickTime = lastTickTime;
		this.lastIpAddress = lastIpAddress;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getLastTickTime() {
		return lastTickTime;
	}

	public void setLastTickTime(Date lastTickTime) {
		this.lastTickTime = lastTickTime;
	}

	public String getLastIpAddress() {
		return lastIpAddress;
	}

	public void setLastIpAddress(String lastIpAddress) {
		this.lastIpAddress = lastIpAddress;
	}

	public String getSeriesNum() {
		return seriesNum;
	}

	public void setSeriesNum(String seriesNum) {
		this.seriesNum = seriesNum;
	}

	@Override
	public String toString() {
		return "ClientStatus [uuid=" + uuid + ", lastTickTime=" + lastTickTime
				+ ", lastIpAddress=" + lastIpAddress + ", seriesNum="
				+ seriesNum + "]";
	}

}
