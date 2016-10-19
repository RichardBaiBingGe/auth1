package cn.com.wito.auth.service.mgr;

import java.util.List;

import cn.com.wito.auth.dto.ProductCategoryDto;
import cn.com.wito.auth.exception.BussinessException;
import cn.com.wito.auth.po.ProductCategory;

/**
 *  商品分类管理接口
 * @author FJG
 *
 */
public interface ProductCategoryMgrService {
    //根据字段查询用户信息
	public List<ProductCategory> find(ProductCategoryDto pcd);
	//根据id查询用户信息
	public ProductCategoryDto findProductCategory(String id);
	//增加商品分类
	public boolean addProductCategory(ProductCategoryDto pcd)throws BussinessException;
	//修改商品分类
	public boolean modifyProductCategory(ProductCategoryDto pcd);
	//删除商品分类
	public boolean deleteProductCategory(String num);
	//查询所有商品分类信息
	public List<ProductCategoryDto> findAll();
	
}
