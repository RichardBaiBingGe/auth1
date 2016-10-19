package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import cn.com.wito.auth.constants.PaymentStatusType;
import cn.com.wito.auth.dto.CarddetailDto;
import cn.com.wito.auth.po.Carddetail;

public class CarddetailTransform {

	
	public static Carddetail dtoToPo(CarddetailDto cardDetailDto) {
		Carddetail carddetail = null;
		if (cardDetailDto != null) {
			
			PaymentStatusType paymentStatusType = cardDetailDto.getPaymentStatus();
			Integer paymentStatusCode = paymentStatusType == null ? null : paymentStatusType.getCode();
			
			
			carddetail = new Carddetail();
			carddetail.setAisleCode(cardDetailDto.getAisleCode());
			carddetail.setCode(cardDetailDto.getCode());
			carddetail.setId(cardDetailDto.getId());
			carddetail.setName(cardDetailDto.getName());
			carddetail.setOrderTime(cardDetailDto.getOrderTime());
			carddetail.setPaymentName(cardDetailDto.getPaymentName());
			carddetail.setPaymentStatus(paymentStatusCode);
			carddetail.setSerNum(cardDetailDto.getSerNum());
			carddetail.setAmountPaid(cardDetailDto.getAmountPaid());
			carddetail.setPayAccount(cardDetailDto.getPayAccount());
			carddetail.setNodetype(cardDetailDto.getNodetype());
		}
		return carddetail;
	}
	
	public static CarddetailDto poToDto(Carddetail cardDetail) {
		CarddetailDto carddetailDto = null;
		if (cardDetail != null) {
			PaymentStatusType paymentStatusType = PaymentStatusType.fromCode(cardDetail.getPaymentStatus());
			
			carddetailDto = new CarddetailDto();
			carddetailDto.setAisleCode(cardDetail.getAisleCode());
			carddetailDto.setCode(cardDetail.getCode());
			carddetailDto.setId(cardDetail.getId());
			carddetailDto.setName(cardDetail.getName());
			carddetailDto.setOrderTime(cardDetail.getOrderTime());
			carddetailDto.setPaymentName(cardDetail.getPaymentName());
			carddetailDto.setPaymentStatus(paymentStatusType);
			carddetailDto.setSerNum(cardDetail.getSerNum());
			carddetailDto.setAmountPaid(cardDetail.getAmountPaid());
			carddetailDto.setPayAccount(cardDetail.getPayAccount());
			carddetailDto.setNodetype(cardDetail.getNodetype());
		}
		return carddetailDto;
	}
	
	public static List<CarddetailDto> poListToDtoList(List<Carddetail> carddetails) {
		List<CarddetailDto> list = new ArrayList<CarddetailDto>();
		if (carddetails != null) {
			for (Carddetail carddetail : carddetails) {
				CarddetailDto carddetailDto = poToDto(carddetail);
				list.add(carddetailDto);
			}
		}
		return list;
	}
}
