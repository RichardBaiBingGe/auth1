package cn.com.wito.auth.dao.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.com.wito.auth.dao.AdResourceDao;
import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.exception.DaoException;
import cn.com.wito.auth.po.AdResource;

/**
 * 添加资源
 * 
 * @author wy<895791598@qq.com>
 * 
 */
@Repository("adResourceDao")
public class AdResourceDaoImpl extends BaseDao<AdResource> implements AdResourceDao{

	public static final String CHANGE_ADVERT_MACHINE="changeAdvertMachine";
//	@Override
//	public boolean changeAdvertMachine(HashMap sm) {
//		int count = 0;
//		try {
//			count = this.getSqlSessionTemplate().update(
//					this.getSqlId(CHANGE_ADVERT_MACHINE), sm);
//		} catch (RuntimeException e) {
//			throw new DaoException(e.getCause());
//		}
//		return count > 0 ? true : false;
//	}

	
	private static final String INSERT_RELEASE="insert_release";
	private static final String SELECT_ADMACHINE="select_admachine";
	private static final String DELETE_ADMACHINE="delete_admachine";
	private static final String SELECT_ALLSERNUM="select_allsernum";
	
	@Override
	public boolean releaseAd(String adCode, String serNum) {
		Map<String, Object> queryMap = new HashMap<String, Object>();
		queryMap.put("adCode", adCode);
		queryMap.put("serNum", serNum);
		int count = 0;
		try {
			count = this.getSqlSessionTemplate().insert(
					INSERT_RELEASE, queryMap);
		} catch (RuntimeException e) {
			throw new DaoException(e.getCause());
		}
		return count > 0 ? true : false;
	}
	
	@Override
	public List<String> findAdMachine(String adCode) {
		List<String> adMachinelst=null;
		try {
			adMachinelst = this.getSqlSessionTemplate().selectList(
					SELECT_ADMACHINE, adCode);
		} catch (RuntimeException e) {
			throw new DaoException(e.getCause());
		}
		return adMachinelst;
	}

	@Override
	public boolean deleteAdMachine(String adCode) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("adCode", adCode);
		int count = 0;
		try {
			count = this.getSqlSessionTemplate().delete(
					DELETE_ADMACHINE, map);
		} catch (RuntimeException e) {
			throw new DaoException(e.getCause());
		}
		return count > 0 ? true : false;
	}

	@Override
	public List<String> findAllMachine(String userCode) {
		List<String> serNumLst=null;
		try {
			serNumLst = this.getSqlSessionTemplate().selectList(
					SELECT_ALLSERNUM,userCode);
		} catch (RuntimeException e) {
			throw new DaoException(e.getCause());
		}
		return serNumLst;
	}
}
