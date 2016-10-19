package cn.com.wito.auth.dao;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.po.Product;

/**
 * 商品
 * @author FJG
 * 
 */
public interface ProductDao extends IDao<Product> {
	 /**
     * Combined Query Paging
     * */
	public Page<Product> findPage2(Pageable<Product> pageable,Product product);
	/**
	 * Combined Query method maximum number of records
	 * */
	public long count1(Pageable<Product> pageable,Product product);
	/**
	 * 根据商品编号获取记录数
	 * */
	public long countSn(String sn);
	/**
	 * 根据商品ID删除商品
	 * */
	public boolean productDel(Product pc);
	
}