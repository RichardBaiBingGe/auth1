package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;
import cn.com.wito.auth.dto.BatchDto;
import cn.com.wito.auth.po.Batch;

public class BatchTransform {

	/**
	 * Dto转PO
	 * 
	 * @param BatchDto
	 * @return
	 */
	public static Batch dtoToPo(BatchDto batchDto) {
		Batch batch = null;
		if (batchDto != null) {

			batch = new Batch(batchDto.getId(), batchDto.getBatchCode(),
					batchDto.getProductId(), batchDto.getProductCode(),
					batchDto.getProductionDate(), batchDto.getValidDate(),
					batchDto.getSelfLife(), batchDto.getCreateDate(),
					batchDto.getModifyDate(), batchDto.getCreateBy(),
					batchDto.getUpdateBy(),batchDto.getCount()
					);
		}

		return batch;
	}

	/**
	 * PO对象转换成Dto对象
	 * 
	 * @param BatchDto
	 * @return
	 */
	public static BatchDto poToDto(Batch batch) {
		BatchDto dto = null;
		if (batch != null) {

			dto = new BatchDto(
					batch.getId(), batch.getBatchCode(),
					batch.getProductId(), batch.getProductCode(),
					batch.getProductionDate(), batch.getValidDate(),
					batch.getSelfLife(), batch.getCreateDate(),
					batch.getModifyDate(), batch.getCreateBy(),
					batch.getUpdateBy(),batch.getCount()
					);

		}
		return dto;
	}

	/**
	 * PO对象集合转换成Dto对象集合
	 * 
	 * @param BatchLst
	 * @return
	 */
	public static List<BatchDto> poLstToDtoLst(List<Batch> singleProductLst) {
		List<BatchDto> dtoLst = new ArrayList<BatchDto>();
		for (Batch batch : singleProductLst) {
			BatchDto dto = poToDto(batch);
			dtoLst.add(dto);
		}
		return dtoLst;
	}

}
