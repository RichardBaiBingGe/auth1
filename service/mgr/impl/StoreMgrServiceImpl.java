package cn.com.wito.auth.service.mgr.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.constants.UserType;
import cn.com.wito.auth.dao.IStoreDao;
import cn.com.wito.auth.dao.SysRoleDao;
import cn.com.wito.auth.dao.SysUserDao;
import cn.com.wito.auth.dto.StoreDto;
import cn.com.wito.auth.exception.BussinessException;
import cn.com.wito.auth.exception.DaoException;
import cn.com.wito.auth.po.Store;
import cn.com.wito.auth.po.SysRole;
import cn.com.wito.auth.po.SysUser;
import cn.com.wito.auth.service.gencode.CodeConstructor;
import cn.com.wito.auth.service.mgr.StoreMgrService;
import cn.com.wito.auth.transform.StoreTransform;

/**
 * 门店管理业务实现
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
@Service("storeMgrService")
public class StoreMgrServiceImpl implements StoreMgrService {

	@Resource
	private IStoreDao storeDao;

	@Resource
	private SysUserDao sysUserDao;

	@Resource
	private SysRoleDao sysRoleDao;

	@Override
	public Page<StoreDto> findPage(Pageable<StoreDto> pageable) {
		Pageable<Store> storePageable = new Pageable<Store>();
		if (pageable != null) {
			storePageable
					.setEntity(StoreTransform.dtoToPo(pageable.getEntity()));
			storePageable.setOrderDirection(pageable.getOrderDirection());
			storePageable.setPageNumber(pageable.getPageNumber());
			storePageable.setPageSize(pageable.getPageSize());
			storePageable.setSearchProperty(pageable.getSearchProperty());
			storePageable.setSearchValue(pageable.getSearchValue());
		}

		Page<Store> storePage = storeDao.findPage(storePageable);
		Page<StoreDto> page = null;
		if (storePage != null) {
			List<Store> content = storePage.getContent();
			page = new Page<StoreDto>(StoreTransform.poLstToDtoLst(content),
					storePage.getTotal(), pageable);
		}
		return page;
	}

	@Override
	public StoreDto find(String code) {
		Store store = storeDao.find(code);
		return StoreTransform.poToDto(store);
	}

	@Override
	public boolean add(StoreDto storeDto) {
		Store store = StoreTransform.dtoToPo(storeDto);
		if (store != null) {
			store.setCode(CodeConstructor.getStoreCode());
		}
		
		boolean flag = storeDao.add(store);

		storeDao.addRoleStore("20150808142559559", store.getCode());

		return flag;
	}

	@Override
	public boolean modify(StoreDto storeDto) {
		Store store = StoreTransform.dtoToPo(storeDto);
		return storeDao.update(store);
	}

	@Override
	public boolean delete(String code) {
		return storeDao.delete(code);
	}

	@Override
	public List<StoreDto> findStoreByUserCode(String userCode) {
		SysUser sysUser = sysUserDao.find(userCode);
		List<StoreDto> stores = new ArrayList<StoreDto>();
		if (sysUser != null) {
			UserType userType = UserType.fromCode(sysUser.getType());
			StoreDto storeDto = null;
			if (userType == UserType.SYSTEM) {
				// 获取所有的subject
				stores = StoreTransform.poLstToDtoLst(storeDao
						.find(new Store()));
			} else {
				String storeCode = sysUser.getSubjectCode();
				Store store = storeDao.find(storeCode);
				storeDto = StoreTransform.poToDto(store);
				stores.add(storeDto);
			}
		}
		return stores;
	}

	public List<StoreDto> findRoleStore(String roleCode) {
		List<Store> rolelist = storeDao.findRoleStore(roleCode);
		List<StoreDto> result = StoreTransform.poLstToDtoLst(rolelist);
		return result;
	}
	@Transactional(rollbackFor=DaoException.class)
	public boolean addRoleStore(String roleCode, List<String> storeCodes) throws BussinessException {
			// 检查角色存不存在
			SysRole role = sysRoleDao.find(roleCode);
			if (role == null || role.getCode() == null) {
				// 角色不存在
				throw new BussinessException("角色不存在");
			}
			storeDao.deleteDataRoleResByRoleCode(roleCode);
		if (storeCodes != null) {
			for (String storeCode : storeCodes) {
				storeDao.addRoleStore(roleCode, storeCode);
			}
		}
		return true;
	}

}
