package cn.com.wito.auth.service.mgr;

import java.util.List;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.SysSubjectDto;

/**
 * 系统主题管理
 * 
 * @author wy<895791598@qq.com>
 * 
 */
public interface SysSubjectMgrService {
	/**
	 * 根据主题code查询权限
	 * 
	 * @param code
	 * @return
	 */
	public SysSubjectDto findSubject(String code);

	/**
	 * 根据用户code查询主体
	 * 
	 * @param userCode
	 * @return
	 */
	public List<SysSubjectDto> findSubjectByUserCode(String userCode);
	
	/**
	 * 根据分页查询子集
	 * 
	 * @param parentCode
	 * @return
	 */
	public Page<SysSubjectDto> findPage(Pageable<SysSubjectDto> pageable);

	/**
	 * 增加主题
	 * 
	 * @param sysResourceDto
	 * @return
	 */
	public boolean addSubject(SysSubjectDto subjectdto);

	/**
	 * 修改主题
	 * 
	 * @param sysResourceDto
	 * @return
	 */
	public boolean modifySubject(SysSubjectDto subjectdto);

	/**
	 * 删除主题
	 * 
	 * @param subjectCode
	 * @return
	 */
	public boolean deleteSubject(String subjectCode);
}
