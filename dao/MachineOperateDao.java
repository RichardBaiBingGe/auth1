package cn.com.wito.auth.dao;

import java.util.HashMap;
import java.util.List;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.po.AisleProduct;
import cn.com.wito.auth.po.MachineOrder;
import cn.com.wito.auth.po.VendingMachineProerties;

public interface MachineOperateDao extends IDao<VendingMachineProerties> {

	List<VendingMachineProerties> findMachineProertiesList(String serNum);
	List<AisleProduct> datagridgoodsDetail(AisleProduct sm);
	List<VendingMachineProerties> findMachineProertiesListByCode(String serNum);
	List<VendingMachineProerties> findMachineProertiesProduct();
	VendingMachineProerties findProductByid(String productId);
	Page<MachineOrder> findMachineorder(Pageable<MachineOrder> pageable);
	long findMachineorderCount(Pageable<MachineOrder> pageable);
}
