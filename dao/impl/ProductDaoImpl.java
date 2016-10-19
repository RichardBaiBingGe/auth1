package cn.com.wito.auth.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.constants.Constants;
import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.dao.ProductDao;
import cn.com.wito.auth.exception.DaoException;
import cn.com.wito.auth.po.Product;

@Repository("productDao")
public class ProductDaoImpl extends BaseDao<Product> implements ProductDao {

	public static final String COUNT2 = "count2";

	public Page<Product> findPage2(Pageable<Product> pageable, Product product) {
		Map<String, Object> queryMap = new HashMap<String, Object>();
		int pageNum = 0;
		int pageSize = 0;
		long total = 0;
		if(product != null){
			String sn=product.getSn();
			String pname=product.getName();
			Long productCategory=product.getProductCategory();
			queryMap.put("Sn",sn);
			queryMap.put("Pname", pname);
			queryMap.put("ProductCategory", productCategory);
		}
		if (pageable != null) {
			pageNum = pageable.getPageNumber();
			pageSize = pageable.getPageSize();
			total = count1(pageable,product);
			int start = (pageNum - 1) * pageSize;
			int end = pageSize;
			queryMap.put("start", start);
			queryMap.put("limit", end);
		}
		List<Product> contents = new ArrayList<Product>();
		try {
			contents = this.getSqlSessionTemplate().selectList(
					this.getSqlId(Constants.FIND_PAGE2), queryMap);
		} catch (RuntimeException e) {
			throw new DaoException(e.getCause());
		}
		Page<Product> page =new Page<Product>(contents,total,pageable);
		return page;
	}


	public long count1(Pageable<Product> pageable, Product product) {
		Map<String, Object> queryMap = new HashMap<String, Object>();
		if(product != null){
			String sn=product.getSn();
			String pname=product.getName();
			Long productCategory=product.getProductCategory();
			queryMap.put("Sn",sn);
			queryMap.put("Pname", pname);
			queryMap.put("ProductCategory", productCategory);
		}
		long count = this.getSqlSessionTemplate().selectOne(
				this.getSqlId(Constants.COUNT), queryMap);
		return count;
	}


	@Override
	public long countSn(String sn) {
		Map<String, Object> queryMap = new HashMap<String, Object>();
		queryMap.put("Sn", sn);
		Long count=this.getSqlSessionTemplate().selectOne(
				this.getSqlId(COUNT2),queryMap);
		return count;
	}


	@Override
	public boolean productDel(Product pc) {
		int count = 0;
		try {
			count = this.getSqlSessionTemplate().update(
					this.getSqlId(Constants.UPDATE),pc);
		} catch (RuntimeException e) {
			throw new DaoException(e.getCause());
		}
		return count > 0 ? true : false;
	}

}
