package cn.com.wito.auth.service.mgr.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.constants.UserType;
import cn.com.wito.auth.dao.SysSubjectDao;
import cn.com.wito.auth.dao.SysUserDao;
import cn.com.wito.auth.dto.SysSubjectDto;
import cn.com.wito.auth.po.SysSubject;
import cn.com.wito.auth.po.SysUser;
import cn.com.wito.auth.service.gencode.CodeConstructor;
import cn.com.wito.auth.service.mgr.SysSubjectMgrService;
import cn.com.wito.auth.transform.SysSubjectTransform;

/**
 * 系统主题管理实现
 * 
 * @author wy<895791598@qq.com>
 * 
 */
@Service("sysSubjectMgrService")
public class SysSubjectSerivceImpl implements SysSubjectMgrService {

	@Resource
	private SysSubjectDao subjectDao;

	@Resource
	private SysUserDao sysUserDao;

	@Override
	public SysSubjectDto findSubject(String code) {
		SysSubject subject = subjectDao.find(code);
		SysSubjectDto dto = SysSubjectTransform.poToDto(subject);
		return dto;
	}

	@Override
	public boolean addSubject(SysSubjectDto subjectdto) {
		subjectdto.setCode(CodeConstructor.getSubjectCode());
		SysSubject subject = SysSubjectTransform.dtoToPo(subjectdto);
		return subjectDao.add(subject);
	}

	@Override
	public boolean modifySubject(SysSubjectDto subjectdto) {
		SysSubject subject = SysSubjectTransform.dtoToPo(subjectdto);
		return subjectDao.update(subject);
	}

	@Override
	public boolean deleteSubject(String subjectCode) {
		return subjectDao.delete(subjectCode);
	}

	@Override
	public Page<SysSubjectDto> findPage(Pageable<SysSubjectDto> pageable) {
		Pageable<SysSubject> subjectPageable = null;
		if (pageable != null) {
			SysSubjectDto sysSubjectDto = pageable.getEntity();
			SysSubject sysSubject = null;
			if (sysSubjectDto != null) {
				sysSubject = SysSubjectTransform.dtoToPo(sysSubjectDto);
			}
			subjectPageable = new Pageable<SysSubject>(
					pageable.getPageNumber(), pageable.getPageSize());
			subjectPageable.setOrderDirection(pageable.getOrderDirection());
			subjectPageable.setOrderProperty(pageable.getOrderProperty());
			subjectPageable.setSearchProperty(pageable.getSearchProperty());
			subjectPageable.setSearchValue(pageable.getSearchValue());
			subjectPageable.setEntity(sysSubject);
		}
		Page<SysSubject> subjectPages = subjectDao.findPage(subjectPageable);
		Page<SysSubjectDto> pages = null;
		if (subjectPages != null) {
			List<SysSubject> sysSubject = subjectPages.getContent();
			List<SysSubjectDto> sysSubjectDtoLst = SysSubjectTransform
					.poLstToDtoLst(sysSubject);
			pages = new Page<SysSubjectDto>(sysSubjectDtoLst,
					subjectPages.getTotal(), pageable);
		}
		return pages;
	}

	@Override
	public List<SysSubjectDto> findSubjectByUserCode(String userCode) {
		SysUser sysUser = sysUserDao.find(userCode);
		List<SysSubjectDto> sysSubjects = new ArrayList<SysSubjectDto>();
		if (sysUser != null) {
			UserType userType = UserType.fromCode(sysUser.getType());
			SysSubjectDto sysSubjectDto = null;
			if (userType == UserType.SYSTEM) {
				// 获取所有的subject
				sysSubjects = SysSubjectTransform.poLstToDtoLst(subjectDao
						.find(new SysSubject()));
			} else {
				String subjectCode = sysUser.getSubjectCode();
				SysSubject sysSubject = subjectDao.find(subjectCode);
				sysSubjectDto = SysSubjectTransform.poToDto(sysSubject);
				sysSubjects.add(sysSubjectDto);
			}
			// else if (userType == UserType.USER) {
			// String subjectCode = sysUser.getSubjectCode();
			// SysSubject sysSubject = subjectDao.find(subjectCode);
			// sysSubjectDto = SysSubjectTransform.poToDto(sysSubject);
			// }
		}
		return sysSubjects;
	}

}
