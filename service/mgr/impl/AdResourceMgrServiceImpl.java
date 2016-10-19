package cn.com.wito.auth.service.mgr.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.constants.UserType;
import cn.com.wito.auth.dao.AdResourceDao;
import cn.com.wito.auth.dao.SysUserDao;
import cn.com.wito.auth.dto.AdResourceDto;
import cn.com.wito.auth.exception.BussinessException;
import cn.com.wito.auth.po.AdResource;
import cn.com.wito.auth.po.SysUser;
import cn.com.wito.auth.service.gencode.CodeConstructor;
import cn.com.wito.auth.service.mgr.AdResourceMgrService;
import cn.com.wito.auth.transform.AdResourceTransform;

/**
 * 系统资源管理实现
 * 
 * @author wy<895791598@qq.com>
 * @author wujia
 */
@Service("adResourceMgrService")
public class AdResourceMgrServiceImpl implements AdResourceMgrService {

	@Resource
	private AdResourceDao adResourceDao;

	@Resource
	private SysUserDao sysUserDao;
	
	@Override
	public AdResourceDto findAdResource(String code) {
		AdResource adResource = adResourceDao.find(code);
		AdResourceDto adResourceDto = AdResourceTransform.poToDto(adResource);
		return adResourceDto;
	}

	@Override
	public Page<AdResourceDto> findPage(Pageable<AdResourceDto> pageable,
			String operatorUserCode) throws BussinessException {
		if (pageable != null) {
			SysUser sysUser = sysUserDao.find(operatorUserCode);
			if (sysUser == null) {
				throw new BussinessException("操作异常");
			}
			if (sysUser.getType() == UserType.SYSTEM.getCode()) {
				// 系统管理员,查看所有的权限
			} else {
				// 普通用户
				String subjectCode = sysUser.getSubjectCode();
				if (pageable.getEntity() == null) {
					pageable.setEntity(new AdResourceDto());
				}
				pageable.getEntity().setSubjectCode(subjectCode);
			}
			// else if (sysUser.getType() == UserType.USER.getCode()) {
			// // 普通用户
			// String subjectCode = sysUser.getSubjectCode();
			// pageable.getEntity().setSubjectCode(subjectCode);
			// }
		}
		Page<AdResourceDto> page = findPage(pageable);
		return page;
	}

	private Page<AdResourceDto> findPage(Pageable<AdResourceDto> pageable) {
		Pageable<AdResource> subjectPageable = null;
		if (pageable != null) {
			AdResourceDto sysSubjectDto = pageable.getEntity();
			AdResource sysSubject = AdResourceTransform.dtoToPo(sysSubjectDto);
			subjectPageable = new Pageable<AdResource>(
					pageable.getPageNumber(), pageable.getPageSize());
			subjectPageable.setOrderDirection(pageable.getOrderDirection());
			subjectPageable.setOrderProperty(pageable.getOrderProperty());
			subjectPageable.setSearchProperty(pageable.getSearchProperty());
			subjectPageable.setSearchValue(pageable.getSearchValue());
			subjectPageable.setEntity(sysSubject);
		}
		Page<AdResource> subjectPages = adResourceDao.findPage(subjectPageable);
		Page<AdResourceDto> pages = null;
		if (subjectPages != null) {
			List<AdResource> sysSubject = subjectPages.getContent();
			List<AdResourceDto> sysSubjectDtoLst = AdResourceTransform
					.poLstToDtoLst(sysSubject);
			pages = new Page<AdResourceDto>(sysSubjectDtoLst,
					subjectPages.getTotal(), pageable);
		}
		return pages;
	}

	@Override
	public boolean addAdResource(AdResourceDto adResourceDto,
			String operatorUserCode) throws BussinessException {
		adResourceDto.setCode(CodeConstructor.getSubjectCode());
		AdResource subject = AdResourceTransform.dtoToPo(adResourceDto);
		SysUser sysUser = sysUserDao.find(operatorUserCode);
		if (sysUser == null) {
			throw new BussinessException("操作异常");
		}
		String userName = sysUser.getName();
		subject.setCreateBy(userName);
		subject.setUpdateBy(userName);
		subject.setSubjectCode(sysUser.getSubjectCode());
		subject.setSubjectName(sysUser.getSubjectName());
		
		if(adResourceDto.getResourceType().name().equals("publics")){
			releaseAllMachine(adResourceDto.getCode(),sysUser.getRoleCode());
		}
		return adResourceDao.add(subject);
	}

	@Override
	public boolean modifyAdResource(AdResourceDto adResourceDto,
			String operatorUserCode) throws BussinessException {
		AdResource subject = AdResourceTransform.dtoToPo(adResourceDto);
		SysUser sysUser = sysUserDao.find(operatorUserCode);
		if (sysUser == null) {
			throw new BussinessException("操作异常");
		}
		String userName = sysUser.getName();
		subject.setUpdateBy(userName);
		if(adResourceDto.getResourceType().name().equals("publics")){
			releaseAllMachine(adResourceDto.getCode(),sysUser.getRoleCode());
		}
		return adResourceDao.update(subject);
	}

	@Override
	public boolean deleteAdResource(String ResourceCode) {
		return adResourceDao.delete(ResourceCode);
	}

	@Override
	public List<AdResourceDto> findAllAdResource(String operatorUserCode)
			throws BussinessException {
		AdResourceDto adResourceDto = new AdResourceDto();
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
			adResourceDto.setSubjectCode(subjectCode);
		}
		AdResource adResource = AdResourceTransform.dtoToPo(adResourceDto);
		List<AdResource> adResourceLst = adResourceDao.find(adResource);
		List<AdResourceDto> adResourceDtoAll = AdResourceTransform
				.poLstToDtoLst(adResourceLst);
		return adResourceDtoAll;
	}

	@Override
	public boolean releaseAdResource(String adCode, List<String> SerNumList) {
		boolean b=false;
		if(adCode!=null && SerNumList!=null){
			adResourceDao.deleteAdMachine(adCode);
			for (String serNum : SerNumList) {
				b=adResourceDao.releaseAd(adCode,serNum);
			}
		}
		return b;
	}

	@Override
	public List<String> findAdMachine(String adCode) {
		List<String> AdMachinelst=adResourceDao.findAdMachine(adCode);
		return AdMachinelst;
	}

	@Override
	public boolean releaseAllMachine(String adCode,String userCode) {
		List<String> serNumlst=adResourceDao.findAllMachine(userCode);
		
		boolean b=releaseAdResource(adCode,serNumlst);
		return b;
	}


}
