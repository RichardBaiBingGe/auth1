package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import cn.com.wito.auth.dto.SaleHistoryDetailDto;
import cn.com.wito.auth.po.SaleHistoryDetail;

public final class SaleHistoryDetialTransform {
	/**
	 * PO对象转DTO
	 * 
	 * @param saleHistoryDetail
	 * @return
	 */
	public static SaleHistoryDetailDto poToDto(SaleHistoryDetail saleHistoryDetail) {
		SaleHistoryDetailDto saleHistoryDetailDto = null;
		if (saleHistoryDetail != null) {
				saleHistoryDetailDto = new SaleHistoryDetailDto(saleHistoryDetail.getId(),saleHistoryDetail.getCode(),saleHistoryDetail.getSerNum(),
				saleHistoryDetail.getName(),saleHistoryDetail.getStoreName(),saleHistoryDetail.getAddress(),saleHistoryDetail.getNodeName(),saleHistoryDetail.getOffsetAmount(),
				saleHistoryDetail.getQuantity()
			);
		}
		return saleHistoryDetailDto;
	}

	/**
	 * PO List 转 DTO List
	 * 
	 * @param saleHistoryDetaillst
	 * @return
	 */
	public static List<SaleHistoryDetailDto> poLstToDtoLst(List<SaleHistoryDetail> saleHistoryDetaillst) {
		List<SaleHistoryDetailDto> saleHistoryDetailDtolst = new ArrayList<SaleHistoryDetailDto>();
		if (saleHistoryDetaillst != null) {
			SaleHistoryDetailDto saleHistoryDetailDto = null;
			for (SaleHistoryDetail saleHistoryDetail : saleHistoryDetaillst) {
				saleHistoryDetailDto = poToDto(saleHistoryDetail);
				saleHistoryDetailDtolst.add(saleHistoryDetailDto);
			}
		}
		return saleHistoryDetailDtolst;
	}

	public static SaleHistoryDetail dtoToPo(SaleHistoryDetailDto saleHistoryDetailDto) {
		SaleHistoryDetail saleHistoryDetail = null;
		if (saleHistoryDetailDto != null) {
				saleHistoryDetail = new SaleHistoryDetail(saleHistoryDetailDto.getId(),saleHistoryDetailDto.getCode(),saleHistoryDetailDto.getSerNum(),
				saleHistoryDetailDto.getName(),saleHistoryDetailDto.getStoreName(),saleHistoryDetailDto.getAddress(),saleHistoryDetailDto.getNodeName(),saleHistoryDetailDto.getOffsetAmount(),
				saleHistoryDetailDto.getQuantity()
			);
		}
		return saleHistoryDetail;
	}

	public static List<SaleHistoryDetail> dtoLstToPoLst(List<SaleHistoryDetailDto> saleHistoryDetailDtoLst) {
		List<SaleHistoryDetail> saleHistoryDetailLst = new ArrayList<SaleHistoryDetail>();
		if (saleHistoryDetailDtoLst != null) {
			SaleHistoryDetail saleHistoryDetail = null;
			for (SaleHistoryDetailDto saleHistoryDetailDto : saleHistoryDetailDtoLst) {
				saleHistoryDetail = dtoToPo(saleHistoryDetailDto);
				saleHistoryDetailLst.add(saleHistoryDetail);
			}
		}
		return saleHistoryDetailLst;
	}

}
