package cn.com.wito.auth.service.mgr.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.constants.UserType;
import cn.com.wito.auth.dao.IStoreDao;
import cn.com.wito.auth.dao.IVendingMachineDao;
import cn.com.wito.auth.dao.SysResourceDao;
import cn.com.wito.auth.dao.SysRoleDao;
import cn.com.wito.auth.dao.SysSubjectDao;
import cn.com.wito.auth.dao.SysUserDao;
import cn.com.wito.auth.dto.StoreDto;
import cn.com.wito.auth.dto.SysResourceDto;
import cn.com.wito.auth.dto.SysRoleDto;
import cn.com.wito.auth.dto.VendingMachineDto;
import cn.com.wito.auth.exception.BussinessException;
import cn.com.wito.auth.exception.DaoException;
import cn.com.wito.auth.po.Store;
import cn.com.wito.auth.po.SysResource;
import cn.com.wito.auth.po.SysRole;
import cn.com.wito.auth.po.SysUser;
import cn.com.wito.auth.po.VendingMachine;
import cn.com.wito.auth.service.gencode.CodeConstructor;
import cn.com.wito.auth.service.mgr.SysRoleMgrService;
import cn.com.wito.auth.transform.StoreTransform;
import cn.com.wito.auth.transform.SysResourceTransform;
import cn.com.wito.auth.transform.SysRoleTransform;
import cn.com.wito.auth.transform.VendingMachineTransform;

/**
 * 角色信息管理的业务实现类
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
@Service("sysRoleMgrService")
public class SysRoleMgrServiceImpl implements SysRoleMgrService {

	@Resource
	private SysUserDao sysUserDao;

	@Resource
	private SysRoleDao sysRoleDao;
	@Resource
	private IVendingMachineDao vendingMachineDao;

	@Resource
	private SysResourceDao sysResourceDao;
	@Resource
	private SysSubjectDao sysSubjectDao;
	@Resource
	private IStoreDao iStoreDao;
	@Resource
	private IStoreDao storeDao;
	@Resource
	private IVendingMachineDao iVendingMachineDao;
	
	@Override
	public SysRoleDto findRole(String roleCode) {
		SysRole sysRole = sysRoleDao.find(roleCode);
		SysRoleDto sysRoleDto = SysRoleTransform.poToDto(sysRole);
		return sysRoleDto;
	}
	
	@Override
	public List<SysRoleDto> findRoleListBySubject(String subjectCode) {
		List<SysRole> SysRole = sysRoleDao.findBySubjectCode(subjectCode);
		List<SysRoleDto> SysRoleDto = SysRoleTransform.poLstToDtoLst(SysRole);
		return SysRoleDto;
	}

	@Override
	public Page<SysRoleDto> findPage(Pageable<SysRoleDto> pageable,
			String operatorUserCode) throws BussinessException {

		SysUser operatorUser = sysUserDao.find(operatorUserCode);
		if (operatorUser == null || operatorUser.getCode() == null) {
			throw new BussinessException("非法操作");
		}
		Integer type = operatorUser.getType();
		UserType userType = UserType.fromCode(type);
		Page<SysRoleDto> pages = null;
		if (userType == UserType.SYSTEM) {
			// 系统管理员，全局权限
			pages = findPage(pageable);
		} else {
			// 用户，只能操作该subject下的用户
			String subjectCode = operatorUser.getSubjectCode();
			if (pageable.getEntity() == null) {
				pageable.setEntity(new SysRoleDto());
			}
			pageable.getEntity().setSubjectCode(subjectCode);
			pages = findPage(pageable);
		}
		// else if (userType == UserType.USER) {
		// // 用户，只能操作该subject下的用户
		// String subjectCode = operatorUser.getSubjectCode();
		// pageable.getEntity().setSubjectCode(subjectCode);
		// pages = findPage(pageable);
		// }
		return pages;
	}

	/**
	 * 分页查询
	 * 
	 * @param pageable
	 * @return
	 */
	private Page<SysRoleDto> findPage(Pageable<SysRoleDto> pageable) {
		Pageable<SysRole> rolePageable = null;
		if (pageable != null) {
			SysRoleDto sysRoleDto = pageable.getEntity();
			SysRole sysRole = SysRoleTransform.dtoToPo(sysRoleDto);
			rolePageable = new Pageable<SysRole>(pageable.getPageNumber(),
					pageable.getPageSize());
			rolePageable.setOrderDirection(pageable.getOrderDirection());
			rolePageable.setOrderProperty(pageable.getOrderProperty());
			rolePageable.setSearchProperty(pageable.getSearchProperty());
			rolePageable.setSearchValue(pageable.getSearchValue());
			rolePageable.setEntity(sysRole);
		}
		Page<SysRole> rolePages = sysRoleDao.findPage(rolePageable);
		Page<SysRoleDto> pages = null;
		if (rolePages != null) {
			List<SysRole> sysRole = rolePages.getContent();
			List<SysRoleDto> sysRoleDtoLst = SysRoleTransform
					.poLstToDtoLst(sysRole);
			pages = new Page<SysRoleDto>(sysRoleDtoLst, rolePages.getTotal(),
					pageable);
		}
		return pages;
	}

	@Override
	public List<SysResourceDto> findRoleResource(String roleCode) {
		List<SysResource> sysResourceLst = sysResourceDao
				.findByRoleCode(roleCode);
		List<SysResourceDto> result = SysResourceTransform
				.poLstToDtoLst(sysResourceLst);
		return result;
	}

	@Override
	public boolean addRole(SysRoleDto sysRoleDto) {
		sysRoleDto.setCode(CodeConstructor.getRoleCode());
		SysRole sysRole = SysRoleTransform.dtoToPo(sysRoleDto);
		return sysRoleDao.add(sysRole);
	}

	@Override
	public boolean modifyRole(SysRoleDto sysRoleDto) {
		SysRole sysRole = SysRoleTransform.dtoToPo(sysRoleDto);
		return sysRoleDao.update(sysRole);
	}

	/**
	 * <P>
	 * 删除资源-角色表中关联关系
	 * <P>
	 * 插入新的关系
	 * 
	 * @param roleCode
	 * @param sysResourceDtoLst
	 * @return
	 * @throws BussinessException
	 */
	@Transactional(rollbackFor = DaoException.class)
	@Override
	public boolean modifyResource(String roleCode, List<String> sysResourceCodes)
			throws BussinessException {
		if (sysResourceCodes != null) {
			// 检查角色存不存在
			SysRole role = sysRoleDao.find(roleCode);
			if (role == null || role.getCode() == null) {
				// 角色不存在
				throw new BussinessException("角色不存在");
			}
			sysRoleDao.deleteRoleResource(roleCode);
			for (String resourceCode : sysResourceCodes) {
				sysRoleDao.addRoleResouce(roleCode, resourceCode);
			}
		}
		return true;
	}

	/**
	 * 删除角色
	 * <P>
	 * 删除角色-权限关联关系
	 * <P>
	 * 若用户拥有该角色，抛出异常
	 */
	@Transactional(rollbackFor = DaoException.class)
	@Override
	public boolean deleteRole(String roleCode) throws BussinessException {
		int count = sysUserDao.isRoleCount(roleCode);
		if (count > 0) {
			// 存在用户是该角色
			throw new BussinessException("删除失败,该角色正被用户关联.");
		}
		boolean deleteRole = sysRoleDao.delete(roleCode);
		if (deleteRole) {
			sysRoleDao.deleteRoleResource(roleCode);
		}
		return deleteRole;
	}

	@Override
	public List<SysRoleDto> findRoleAll(String operatorUserCode)
			throws BussinessException {
		SysRoleDto role = new SysRoleDto();
		SysUser operatorUser = sysUserDao.find(operatorUserCode);
		if (operatorUser == null || operatorUser.getCode() == null) {
			throw new BussinessException("非法操作");
		}
		Integer type = operatorUser.getType();
		UserType userType = UserType.fromCode(type);
		if (userType == UserType.SYSTEM) {
			// 系统管理员，全局权限
		} else {
			// 用户，只能操作该subject下的用户
			String subjectCode = operatorUser.getSubjectCode();
			role.setSubjectCode(subjectCode);
		}
		// else if (userType == UserType.USER) {
		// // 用户，只能操作该subject下的用户
		// String subjectCode = operatorUser.getSubjectCode();
		// role.setSubjectCode(subjectCode);
		// }
		SysRole sysRole = SysRoleTransform.dtoToPo(role);
		List<SysRole> sysRoleLst = sysRoleDao.find(sysRole);
		List<SysRoleDto> sysRoleDtoAll = SysRoleTransform
				.poLstToDtoLst(sysRoleLst);
		return sysRoleDtoAll;
	}

	

	@Override
	public List<SysRoleDto> getRuleSource() {
		List<SysRole> resources = sysRoleDao.find(null);
		List<SysRoleDto> resourceDtos = SysRoleTransform
				.poLstToDtoLst(resources);
		return resourceDtos;
	}
	@Override
	public List<SysRoleDto> getRuleSource1(String parentCode) {
		List<SysRole> resources = sysRoleDao.find1(parentCode);
		List<SysRoleDto> resourceDtos = SysRoleTransform
				.poLstToDtoLst(resources);
		return resourceDtos;
	}
	@Override
	public Page<Store> findStoreAll() {
		Page<Store> rolelist = storeDao.findPage1(null);
		return rolelist;
	}
	public Page<Store> findRoleStore(Pageable<Store> resDtoLst) {
		Page<Store> rolelist = storeDao.findPage1(resDtoLst);
		return rolelist;
	}
	
	
	
	
//获取门店列表（张小东）
	@Override
	public Page<StoreDto> findRoleStore1(Pageable<StoreDto> pageable,String operatorUserCode) {
		Pageable<Store> resDtoLst = new Pageable<Store>();
		SysUser operatorUser = sysUserDao.find(operatorUserCode);
		if (pageable != null) {
			resDtoLst
					.setEntity(StoreTransform.dtoToPo(pageable.getEntity()));
			resDtoLst.setOrderDirection(pageable.getOrderDirection());
			resDtoLst.setPageNumber(pageable.getPageNumber());
			resDtoLst.setPageSize(pageable.getPageSize());
			resDtoLst.setSearchProperty(pageable.getSearchProperty());
			resDtoLst.setSearchValue(pageable.getSearchValue());
		}
		Page<Store> storePage=new Page<Store>();
		if (operatorUser.getType() == UserType.SYSTEM.getCode()) {
			 storePage = findStoreAll();
		} else if (operatorUser.getType() == UserType.USER_SYSTEM.getCode()) {
			// 属于系统管理员
			String roleCode = operatorUser.getRoleCode();
			 storePage =findRoleStore(resDtoLst);
		}
		Page<StoreDto> page = null;
		if (storePage != null) {
			List<Store> content = storePage.getContent();
			page = new Page<StoreDto>(StoreTransform.poLstToDtoLst(content),
					storePage.getTotal(), pageable);
		}
		return page;
	}
	
	@Override
	public List<VendingMachineDto> findVendingMachineAll() {
		List<VendingMachine> vendingMachine = vendingMachineDao.find(null);;
		return VendingMachineTransform.poLstToDtoLst(vendingMachine);
	}
	@Override
	public List<VendingMachineDto> findRoleVendingMachine(String roleCode) {
		List<VendingMachine> machineList = vendingMachineDao.findRoleVM(roleCode);
		List<VendingMachineDto> result = VendingMachineTransform.poLstToDtoLst(machineList);
		return result;
	}
	//根据登录角色获取售货机信息
	public List<VendingMachineDto> findRoleVendingMachine1(String operatorUserCode){
		SysUser operatorUser = sysUserDao.find(operatorUserCode);
		List<VendingMachineDto> resDtoLst = null;
			if (operatorUser.getType() == UserType.SYSTEM.getCode()) {
				resDtoLst = findVendingMachineAll();
			} else if (operatorUser.getType() == UserType.USER_SYSTEM.getCode()) {
				// 属于系统管理员
				String roleCode = operatorUser.getRoleCode();
				resDtoLst =findRoleVendingMachine(roleCode);
			}
		return resDtoLst;
	}
}
