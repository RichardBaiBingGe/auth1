package cn.com.wito.auth.dto;

import java.util.Date;

public class MachineOrderDto {
	private String serNum;
    private String code;
    private String name;
    private String temp;
    private String address;
    private String offsetAmount;
    private String weixinPrice;
    private String weixinNum;
    private String ePayPrice;
    private String ePayNum;
    private String zhiFuBaoPrice;
    private String zhiFuBaoNum;
    private String changAnTongPrice;
    private String changAnTongNum;
    private String idCardPrice;
    private String idCardNum;
    private String quantity;
    public MachineOrderDto(){
    	
    }
	public MachineOrderDto(String serNum,String code,String name,String temp,String address,String offsetAmount,
			String weixinPrice,String weixinNum,String ePayPrice,String ePayNum,String zhiFuBaoPrice,String zhiFuBaoNum
			,String changAnTongPrice,String changAnTongNum,String idCardPrice,String idCardNum,String quantity) {
			super();
			this.serNum=serNum;
			this.code=code;
			this.name=name;
			this.temp=temp;
			this.address=address;
			this.offsetAmount=offsetAmount;
			this.weixinPrice=weixinPrice;
			this.weixinNum=weixinNum;
			this.ePayPrice=ePayPrice;
			this.ePayNum=ePayNum;
			this.zhiFuBaoPrice=zhiFuBaoPrice;
			this.zhiFuBaoNum=zhiFuBaoNum;
			this.changAnTongPrice=changAnTongPrice;
			this.changAnTongNum=changAnTongNum;
			this.idCardPrice=idCardPrice;
			this.idCardNum=idCardNum;
			this.quantity=quantity;
	}

public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

@Override
public String toString() {
return "MachineOrderDto [serNum=" + serNum + ",code=" + code + ", name=" + name + ", temp="
		+ temp + ", address=" + address + ", offsetAmount=" + offsetAmount
		+ ", weixinPrice=" + weixinPrice 
		+ ", weixinNum=" + weixinNum
		+ ", ePayPrice=" + ePayPrice+ 
		", ePayNum=" + ePayNum+ 
		", zhiFuBaoPrice=" + zhiFuBaoPrice+ ", zhiFuBaoNum=" + zhiFuBaoNum+ ""
		+ ", changAnTongPrice=" + changAnTongPrice+ ", changAnTongNum=" + changAnTongNum+ ""
		+ ", idCardPrice=" + idCardPrice+ ", idCardNum=" + idCardNum+ ", quantity=" + quantity+ "]";
}
    

	public String getSerNum() {
		return serNum;
	}


	public String getCode() {
		return code;
	}


	public String getName() {
		return name;
	}


	public String getTemp() {
		return temp;
	}


	public String getAddress() {
		return address;
	}


	public String getOffsetAmount() {
		return offsetAmount;
	}


	public String getWeixinPrice() {
		return weixinPrice;
	}


	public String getWeixinNum() {
		return weixinNum;
	}


	public String getEPayPrice() {
		return ePayPrice;
	}


	public String getEPayNum() {
		return ePayNum;
	}


	public String getZhiFuBaoPrice() {
		return zhiFuBaoPrice;
	}


	public String getZhiFuBaoNum() {
		return zhiFuBaoNum;
	}


	public String getChangAnTongPrice() {
		return changAnTongPrice;
	}


	public String getChangAnTongNum() {
		return changAnTongNum;
	}


	public String getIdCardPrice() {
		return idCardPrice;
	}


	public String getIdCardNum() {
		return idCardNum;
	}


	public void setSerNum(String serNum) {
		this.serNum = serNum;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setTemp(String temp) {
		this.temp = temp;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setOffsetAmount(String offsetAmount) {
		this.offsetAmount = offsetAmount;
	}


	public void setWeixinPrice(String weixinPrice) {
		this.weixinPrice = weixinPrice;
	}


	public void setWeixinNum(String weixinNum) {
		this.weixinNum = weixinNum;
	}


	public void setEPayPrice(String ePayPrice) {
		this.ePayPrice = ePayPrice;
	}


	public void setEPayNum(String ePayNum) {
		this.ePayNum = ePayNum;
	}


	public void setZhiFuBaoPrice(String zhiFuBaoPrice) {
		this.zhiFuBaoPrice = zhiFuBaoPrice;
	}


	public void setZhiFuBaoNum(String zhiFuBaoNum) {
		this.zhiFuBaoNum = zhiFuBaoNum;
	}


	public void setChangAnTongPrice(String changAnTongPrice) {
		this.changAnTongPrice = changAnTongPrice;
	}


	public void setChangAnTongNum(String changAnTongNum) {
		this.changAnTongNum = changAnTongNum;
	}


	public void setIdCardPrice(String idCardPrice) {
		this.idCardPrice = idCardPrice;
	}


	public void setIdCardNum(String idCardNum) {
		this.idCardNum = idCardNum;
	}

}