package cn.com.wito.auth.service.mgr.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dao.AdSysPlanDao;
import cn.com.wito.auth.dto.AdSysPlanDto;
import cn.com.wito.auth.po.AdSysPlan;
import cn.com.wito.auth.service.gencode.CodeConstructor;
import cn.com.wito.auth.service.mgr.AdSysPlanMgrService;
import cn.com.wito.auth.transform.AdSysPlanTransform;
/**
 * 系统计划管理实现
 * 
 * @author wy<895791598@qq.com>
 * 
 */
@Service("adSysPlanMgrService")
public class AdSysPlanMgrServiceImpl implements AdSysPlanMgrService {
	
	@Resource
	private AdSysPlanDao adSysPlanDao;
	@Override
	public AdSysPlanDto findAdSysPlan(String code) {
		AdSysPlan adSysPlan  = adSysPlanDao.find(code);
		AdSysPlanDto adSysPlanDto = AdSysPlanTransform.poToDto(adSysPlan);
		return adSysPlanDto;
	}

	@Override
	public Page<AdSysPlanDto> findPage(Pageable<AdSysPlanDto> pageable) {
		Pageable<AdSysPlan> subjectPageable = null;
		if (pageable != null) {
			AdSysPlanDto sysSubjectDto = pageable.getEntity();
			AdSysPlan sysSubject = AdSysPlanTransform.dtoToPo(sysSubjectDto);
			subjectPageable = new Pageable<AdSysPlan>(pageable.getPageNumber(),
					pageable.getPageSize());
			subjectPageable.setOrderDirection(pageable.getOrderDirection());
			subjectPageable.setOrderProperty(pageable.getOrderProperty());
			subjectPageable.setSearchProperty(pageable.getSearchProperty());
			subjectPageable.setSearchValue(pageable.getSearchValue());
			subjectPageable.setEntity(sysSubject);
		}
		Page<AdSysPlan> subjectPages = adSysPlanDao.findPage(subjectPageable);
		Page<AdSysPlanDto> pages = null;
		if (subjectPages != null) {
			List<AdSysPlan> sysSubject = subjectPages.getContent();
			List<AdSysPlanDto> sysSubjectDtoLst = AdSysPlanTransform
					.poLstToDtoLst(sysSubject);
			pages = new Page<AdSysPlanDto>(sysSubjectDtoLst, subjectPages.getTotal(),
					pageable);
		}
		return pages;
	}

	@Override
	public boolean addAdSysPlan(AdSysPlanDto adSysPlanDto) {
		adSysPlanDto.setCode(CodeConstructor.getSubjectCode());
		AdSysPlan subject = AdSysPlanTransform.dtoToPo(adSysPlanDto);
		return adSysPlanDao.add(subject);
	}

	@Override
	public boolean modifyAdSysPlan(AdSysPlanDto adSysPlanDto) {
		AdSysPlan subject = AdSysPlanTransform.dtoToPo(adSysPlanDto);
		return adSysPlanDao.update(subject);
	}

	@Override
	public boolean deleteAdSysPlan(String SysPlanCode) {
		return adSysPlanDao.delete(SysPlanCode);
	}

}
