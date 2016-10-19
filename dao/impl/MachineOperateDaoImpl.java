package cn.com.wito.auth.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.com.wito.auth.components.Order.Direction;
import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.dao.MachineOperateDao;
import cn.com.wito.auth.exception.DaoException;
import cn.com.wito.auth.po.AisleProduct;
import cn.com.wito.auth.po.MachineOrder;
import cn.com.wito.auth.po.VendingMachineProerties;
import cn.com.wito.common.utils.reflection.EntityReflectionUtils;

/**
 * 查询售货机通道
 * 
 * @author zhangxiaodong
 * 
 */
@Repository("MachineOperateDao")
public class MachineOperateDaoImpl extends BaseDao<VendingMachineProerties> implements MachineOperateDao {

	/**
	 * 根据用户code查询实体
	 */
	public static final String FIND_BY_MACHINE_CODE = "findByMachineCode";
	public static final String FIND_MACHINEPROERTIES_BYCODE = "findMachineProertiesListByCode";
	public static final String FIND_MACHINEPROERTIES_PRODUCT = "findMachineProertiesProduct";
	public static final String FIND_PRODUCT_BYID = "findProductByid";
	public static final String FIND_MACHINE_ORDER="findMachineorder";
	public static final String FIND_MACHINE_ORDER_CODE="findMachineorderCode";
	public static final String FIND_DATAGRID_GOODS_DETAIL="findDatagridgoodsDetail";
	@Override
	public List<VendingMachineProerties> findMachineProertiesList(String serNum) {
		return this.getSqlSessionTemplate().selectList(
				this.getSqlId(FIND_BY_MACHINE_CODE), serNum);
	}
	@Override
	public List<AisleProduct> datagridgoodsDetail(AisleProduct sm) {
		return this.getSqlSessionTemplate().selectList(
				this.getSqlId(FIND_DATAGRID_GOODS_DETAIL), sm);
	}
	@Override
	public List<VendingMachineProerties> findMachineProertiesListByCode(String serNum) {
		return this.getSqlSessionTemplate().selectList(
				this.getSqlId(FIND_MACHINEPROERTIES_BYCODE), serNum);
	}
	@Override
	public List<VendingMachineProerties> findMachineProertiesProduct() {
		return this.getSqlSessionTemplate().selectList(
				this.getSqlId(FIND_MACHINEPROERTIES_PRODUCT));
	}
	@Override
	public VendingMachineProerties findProductByid(String productId) {
		return this.getSqlSessionTemplate().selectOne(
				this.getSqlId(FIND_PRODUCT_BYID), productId);
	}
	@Override
	public Page<MachineOrder> findMachineorder(Pageable<MachineOrder> pageable) {
		Map<String, Object> queryMap = constructBaseQueryMap1(pageable);
		int pageNum = 0;
		int pageSize = 0;
		long total = 0;
		if (pageable != null) {
			pageNum = pageable.getPageNumber();
			pageSize = pageable.getPageSize();
			total = findMachineorderCount(pageable);
			int start = (pageNum - 1) * pageSize;
			int end = pageSize;
			queryMap.put("start", start);
			queryMap.put("limit", end);
		}
		List<MachineOrder> contents = new ArrayList<MachineOrder>();
		try {
			contents = this.getSqlSessionTemplate().selectList(
					this.getSqlId(FIND_MACHINE_ORDER), queryMap);
		} catch (RuntimeException e) {
			throw new DaoException(e.getCause());
		}
		Page<MachineOrder> page = new Page<MachineOrder>(contents, total, pageable);
		return page;
	}
	@Override
	public long findMachineorderCount(Pageable<MachineOrder> pageable) {
		BaseDao bs=new BaseDao() {
		};
		Map<String, Object> queryMap = constructBaseQueryMap1(pageable);
		long count = this.getSqlSessionTemplate().selectOne(
				this.getSqlId(FIND_MACHINE_ORDER_CODE), queryMap);
		return count;
	}
	/**
	 * 构造基础的queryMap
	 * 
	 * @param pageable
	 * @return
	 */
	private Map<String, Object> constructBaseQueryMap1(Pageable<MachineOrder> pageable) {
		Map<String, Object> queryMap = new HashMap<String, Object>();
		if (pageable != null) {

			String searchProperty = pageable.getSearchProperty();
			String searchValue = pageable.getSearchValue();
			queryMap.put("searchProperty", searchProperty);
			queryMap.put("searchValue", searchValue);
			String orderProperty = pageable.getOrderProperty();
			Direction direction = pageable.getOrderDirection();
			if (orderProperty != null) {
				queryMap.put("orderProperty", orderProperty);
				queryMap.put("orderDirection", direction.toString());
			}
			MachineOrder entity = pageable.getEntity();
			Map<String, Object> entityFields = EntityReflectionUtils
					.fields(entity);
			if (entityFields != null) {
				for (String key : entityFields.keySet()) {
					Object value = entityFields.get(key);
					if (key != null && value != null) {
						queryMap.put(key, value);
					}
				}
			}
		}
		return queryMap;
	}
}
