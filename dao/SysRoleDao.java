package cn.com.wito.auth.dao;

import java.util.List;






import cn.com.wito.auth.po.Store;
import cn.com.wito.auth.po.SysRole;
import cn.com.wito.auth.po.SysSubject;

public interface SysRoleDao extends IDao<SysRole> {

	List<SysRole> findByUserCode(String userCode);
	
	List<SysRole> findBySubjectCode(String subjectCode);

	boolean deleteRoleResource(String roleCode);

	boolean addRoleResouce(String roleCode, String resourceCode);

}
