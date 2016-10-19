package cn.com.wito.auth.dao;



import java.util.List;

import cn.com.wito.auth.po.ProductCategory;

/**
 * 添加商品分类接口
 * @author FJG
 *
 */
public interface ProductCategoryDao extends IDao<ProductCategory> {
    
   public List<ProductCategory> findAll();
}