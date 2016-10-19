package cn.com.wito.auth.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;

import cn.com.wito.auth.components.Order.Direction;
import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.constants.Constants;
import cn.com.wito.auth.exception.DaoException;
import cn.com.wito.auth.po.SysRole;
import cn.com.wito.common.utils.reflection.EntityReflectionUtils;

/**
 * 数据访问基础父类
 * 
 * @author wujia
 * 
 * @param <T>
 */
public abstract class BaseDao<T> implements IDao<T> {

	/**
	 * 得到SQLID
	 * 
	 * @param id
	 * @return
	 */
	protected String getSqlId(String id) {
		return getSqlId(this.getClass(), id);
	}

	/**
	 * 得到SQLID
	 * 
	 * @param clazz
	 * @param id
	 * @return
	 */
	protected String getSqlId(Class<?> clazz, String id) {
		String sqlId = null;
		if (clazz != null) {
			sqlId = clazz.getName() + Constants.POINT + id;
		}
		return sqlId;
	}

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	@Override
	public T find(Serializable id) {
		return this.getSqlSessionTemplate().selectOne(
				this.getSqlId(Constants.SELECT), id);
	}

	@Override
	public List<T> find(T t) {
		return this.getSqlSessionTemplate().selectList(
				this.getSqlId(Constants.SELECT_ALL), t);
	}
	@Override
	public List<T> find1(String parentCode) {
		return this.getSqlSessionTemplate().selectList(
				this.getSqlId(Constants.SELECT1), parentCode);
	}
	@Override
	public Page<T> findPage(Pageable<T> pageable) {
		Map<String, Object> queryMap = constructBaseQueryMap(pageable);
		int pageNum = 0;
		int pageSize = 0;
		long total = 0;
		if (pageable != null) {
			pageNum = pageable.getPageNumber();
			pageSize = pageable.getPageSize();
			total = count(pageable);
			int start = (pageNum - 1) * pageSize;
			int end = pageSize;
			queryMap.put("start", start);
			queryMap.put("limit", end);
		}
		List<T> contents = new ArrayList<T>();
		try {
			contents = this.getSqlSessionTemplate().selectList(
					this.getSqlId(Constants.FIND_PAGE), queryMap);
		} catch (RuntimeException e) {
			throw new DaoException(e.getCause());
		}
		Page<T> page = new Page<T>(contents, total, pageable);
		return page;
	}
	@Override
	public Page<T> findPage1(Pageable<T> pageable) {
		Map<String, Object> queryMap = constructBaseQueryMap(pageable);
		int pageNum = 0;
		int pageSize = 0;
		long total = 0;
		if (pageable != null) {
			pageNum = pageable.getPageNumber();
			pageSize = pageable.getPageSize();
			total = count1(pageable);
			int start = (pageNum - 1) * pageSize;
			int end = pageSize;
			queryMap.put("start", start);
			queryMap.put("limit", end);
		}
		List<T> contents = new ArrayList<T>();
		try {
			contents = this.getSqlSessionTemplate().selectList(
					this.getSqlId(Constants.FIND_PAGE1), queryMap);
		} catch (RuntimeException e) {
			throw new DaoException(e.getCause());
		}
		Page<T> page = new Page<T>(contents, total, pageable);
		return page;
	}
	@Override
	public long count1(Pageable<T> pageable) {
		Map<String, Object> queryMap = constructBaseQueryMap(pageable);
		long count1 = this.getSqlSessionTemplate().selectOne(
				this.getSqlId(Constants.COUNT1), queryMap);
		return count1;
	}
	@Override
	public long count(Pageable<T> pageable) {
		Map<String, Object> queryMap = constructBaseQueryMap(pageable);
		long count = this.getSqlSessionTemplate().selectOne(
				this.getSqlId(Constants.COUNT), queryMap);
		return count;
	}

	@Override
	public boolean update(T t) {
		int count = 0;
		try {
			count = this.getSqlSessionTemplate().update(
					this.getSqlId(Constants.UPDATE), t);
		} catch (RuntimeException e) {
			throw new DaoException(e.getCause());
		}
		return count > 0 ? true : false;
	}

	@Override
	public boolean add(T t) {
		int count = 0;
		try {
			count = this.getSqlSessionTemplate().insert(
					this.getSqlId(Constants.INSERT), t);
		} catch (RuntimeException e) {
			throw new DaoException(e.getCause());
		}
		return count > 0 ? true : false;
	}

	@Override
	public boolean delete(Serializable id) {
		int count = 0;
		try {
			count = this.getSqlSessionTemplate().delete(
					this.getSqlId(Constants.DELETE), id);
		} catch (RuntimeException e) {
			throw new DaoException(e.getCause());
		}
		return count > 0 ? true : false;
	}
	
	/**
	 * 构造基础的queryMap
	 * 
	 * @param pageable
	 * @return
	 */
	private Map<String, Object> constructBaseQueryMap(Pageable<T> pageable) {
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
			T entity = pageable.getEntity();
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
