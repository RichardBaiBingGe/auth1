package cn.com.wito.auth.service.mgr.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.constants.UserType;
import cn.com.wito.auth.dao.IVendingMachineDao;
import cn.com.wito.auth.dao.SysRoleDao;
import cn.com.wito.auth.dao.SysUserDao;
import cn.com.wito.auth.dto.VendingMachineDto;
import cn.com.wito.auth.exception.BussinessException;
import cn.com.wito.auth.exception.DaoException;
import cn.com.wito.auth.po.SysRole;
import cn.com.wito.auth.po.SysUser;
import cn.com.wito.auth.po.VendingMachine;
import cn.com.wito.auth.service.gencode.CodeConstructor;
import cn.com.wito.auth.service.mgr.VendingMachineMgrService;
import cn.com.wito.auth.transform.VendingMachineTransform;

/**
 * 售货机管理业务实现
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
@Service("vendingMachineMgrService")
public class VendingMachineMgrServiceImpl implements VendingMachineMgrService {

	@Resource
	private IVendingMachineDao vendingMachineDao;
	
	
	@Resource
	private SysUserDao sysUserDao;
	
	@Resource
	private SysRoleDao sysRoleDao;


	@Override
	public Page<VendingMachineDto> findPage(Pageable<VendingMachineDto> pageable) {
		Pageable<VendingMachine> vendingMachinePageable = new Pageable<VendingMachine>();
		if (pageable != null) {
			vendingMachinePageable.setEntity(VendingMachineTransform
					.dtoToPo(pageable.getEntity()));
			vendingMachinePageable.setOrderDirection(pageable
					.getOrderDirection());
			vendingMachinePageable.setPageNumber(pageable.getPageNumber());
			vendingMachinePageable.setPageSize(pageable.getPageSize());
			vendingMachinePageable.setSearchProperty(pageable
					.getSearchProperty());
			vendingMachinePageable.setSearchValue(pageable.getSearchValue());
		}

		Page<VendingMachine> vendingMachinePage = vendingMachineDao
				.findPage(vendingMachinePageable);
		Page<VendingMachineDto> page = null;
		if (vendingMachinePage != null) {
			List<VendingMachine> content = vendingMachinePage.getContent();
			page = new Page<VendingMachineDto>(
					VendingMachineTransform.poLstToDtoLst(content),
					vendingMachinePage.getTotal(), pageable);
		}
		return page;
	}

	@Override
	public VendingMachineDto find(String code) {
		VendingMachine vendingMachine = vendingMachineDao.find(code);
		return VendingMachineTransform.poToDto(vendingMachine);
	}

	@Override
	public boolean add(VendingMachineDto vendingMachineDto)
			throws BussinessException {
		VendingMachine vendingMachine = VendingMachineTransform
				.dtoToPo(vendingMachineDto);
		if (vendingMachine != null) {
			String machineNo = vendingMachine.getSerNum();
			if (existMachineNo(null, machineNo)) {
				// 序列号已存在
				throw new BussinessException("重复的机器序列号");
			}
			vendingMachine.setCode(CodeConstructor.getMachineCode());
		}
		
		boolean flag =vendingMachineDao.add(vendingMachine);
		
		
		vendingMachineDao .addRoleStore("20150808142559559", vendingMachine.getCode());
		return flag;
	}

	@Override
	public boolean modify(VendingMachineDto vendingMachineDto)
			throws BussinessException {
		VendingMachine vendingMachine = VendingMachineTransform
				.dtoToPo(vendingMachineDto);
		if (vendingMachine != null) {
			String code = vendingMachine.getCode();
			String machineNo = vendingMachine.getSerNum();
			if (existMachineNo(code, machineNo)) {
				// 序列号已存在
				throw new BussinessException("重复的机器序列号");
			}
		}
		return vendingMachineDao.update(vendingMachine);
	}

	@Override
	public boolean delete(String code) {
		return vendingMachineDao.delete(code);
	}

	@Override
	public boolean existMachineNo(String code, String machineNo) {
		VendingMachine vm = new VendingMachine();
//		vm.setCode(code);
		vm.setSerNum(machineNo);
		List<VendingMachine> existVMLst = vendingMachineDao.find(vm);
		boolean result = false;
		if (existVMLst == null || existVMLst.isEmpty()) {
			result = false;
		} else {
			for (VendingMachine vendingMachine : existVMLst) {
				if (vendingMachine.getCode().equals(code)) {
					continue;
				}
				if (vendingMachine.getSerNum().equals(machineNo)) {
					result = true;
					break;
				}
			}
		}
		return result;
	}
	
	@Override
	public List<VendingMachineDto> findVendingMachineByUserCode(String userCode) {
		SysUser sysUser = sysUserDao.find(userCode);
		List<VendingMachineDto> vendingMachines = new ArrayList<VendingMachineDto>();
		if (sysUser != null) {
			UserType userType = UserType.fromCode(sysUser.getType());
			if (userType == UserType.SYSTEM) {
				// 获取所有的subject
				vendingMachines = VendingMachineTransform.poLstToDtoLst(vendingMachineDao
						.find(new VendingMachine()));
			} else {
				vendingMachines = findRoleVendingMachine(sysUser.getRoleCode()) ;
			}
		}
		return vendingMachines;
	}

	@Override
	public List<VendingMachineDto> findRoleVendingMachine(String roleCode) {
		List<VendingMachine> machineList = vendingMachineDao.findRoleVM(roleCode);
		List<VendingMachineDto> result = VendingMachineTransform.poLstToDtoLst(machineList);
		return result;
	}
		
	@Transactional(rollbackFor=DaoException.class)
	public boolean addRoleVM(String roleCode, List<String> machineCodes)
			throws BussinessException {
			// 检查角色存不存在
			SysRole role = sysRoleDao.find(roleCode);
			if (role == null || role.getCode() == null) {
				// 角色不存在
				throw new BussinessException("角色不存在");
			}
			vendingMachineDao.deleteDataRoleVmByRoleCode(roleCode);
			if (machineCodes != null) {
			for (String machineCode : machineCodes) {
				vendingMachineDao.addRoleStore(roleCode, machineCode);
			}
		}
		return true;
	}
	//机器状态监控List
	@Override
	public Page<VendingMachineDto> findPage1(Pageable<VendingMachineDto> pageable) throws Exception {
		Pageable<VendingMachine> vendingMachinePageable = new Pageable<VendingMachine>();
		if (pageable != null) {
			vendingMachinePageable.setEntity(VendingMachineTransform
					.dtoToPo(pageable.getEntity()));
			vendingMachinePageable.setOrderDirection(pageable
					.getOrderDirection());
			vendingMachinePageable.setPageNumber(pageable.getPageNumber());
			vendingMachinePageable.setPageSize(pageable.getPageSize());
			vendingMachinePageable.setSearchProperty(pageable
					.getSearchProperty());
			vendingMachinePageable.setSearchValue(pageable.getSearchValue());
		}

		Page<VendingMachine> vendingMachinePage = vendingMachineDao
				.findPage1(vendingMachinePageable);
		Page<VendingMachineDto> page = null;
		if (vendingMachinePage != null) {
			List<VendingMachine> content = vendingMachinePage.getContent();
			List<VendingMachine> content1 =new ArrayList<VendingMachine>();
			for(int i=0;i<content.size();i++){
				VendingMachine sm=content.get(i);
				Demo dm=new Demo();
				int a=dm.getMachinestate(sm.getSerNum().toString());
				sm.setStatas(a);
				content1.add(sm);
			}
			page = new Page<VendingMachineDto>(
					VendingMachineTransform.poLstToDtoLst(content1),
					vendingMachinePage.getTotal(), pageable);
		}
		return page;
	}
}
