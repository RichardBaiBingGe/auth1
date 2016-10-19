package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import cn.com.wito.auth.constants.EnableFlagType;
import cn.com.wito.auth.dto.StoreDto;
import cn.com.wito.auth.po.Store;

public class StoreTransform {

	public static StoreDto poToDto(Store store) {
		StoreDto storeDto = null;
		if (store != null) {
			Integer flag = store.getEnableFlag();
			EnableFlagType enableType = flag == null ? null : EnableFlagType
					.fromCode(flag);
			storeDto = new StoreDto(store.getCode(), store.getName(),
					store.getAddress(), store.getLatitude(),
					store.getLongitude(), store.getSentPrice(),
					store.getBusinessTime(), store.getSentScope(),
					store.getSubjectCode(), store.getSubjectName(),
					store.getRemark(),enableType, store.getCreateBy(),
					store.getCreateDate(), store.getUpdateBy(),
					store.getUpdateDate());
		}
		return storeDto;
	}

	public static List<StoreDto> poLstToDtoLst(List<Store> stores) {
		List<StoreDto> storeDtoLst = new ArrayList<StoreDto>();
		if (stores != null) {
			for (Store store : stores) {
				StoreDto storeDto = poToDto(store);
				storeDtoLst.add(storeDto);
			}
		}
		return storeDtoLst;
	}

	public static Store dtoToPo(StoreDto storeDto) {
		Store store = null;
		if (storeDto != null) {
			EnableFlagType type = storeDto.getEnableFlag();
			Integer flag = type == null ? null : type.getCode();
			store = new Store(flag, storeDto.getCreateBy(),
					storeDto.getCreateDate(), storeDto.getUpdateBy(),
					storeDto.getUpdateDate(), storeDto.getCode(),
					storeDto.getName(), storeDto.getAddress(),
					storeDto.getLatitude(), storeDto.getLongitude(),
					storeDto.getSentPrice(), storeDto.getBusinessTime(),
					storeDto.getSentScope(), storeDto.getSubjectCode(),
					storeDto.getSubjectName(), storeDto.getRemark());
		}
		return store;
	}

	public static List<Store> dtoLstTopoLst(List<StoreDto> storeDtoLst) {
		List<Store> stores = new ArrayList<Store>();
		if (storeDtoLst != null) {
			for (StoreDto storeDto : storeDtoLst) {
				Store store = dtoToPo(storeDto);
				stores.add(store);
			}
		}
		return stores;
	}

}
