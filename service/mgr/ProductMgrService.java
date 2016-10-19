package cn.com.wito.auth.service.mgr;

import java.util.List;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dto.ProductDto;
import cn.com.wito.auth.po.Product;

/**
 * 商品管理的业务接口
 * @author FJG
 *
 */
public interface ProductMgrService {
    //组合分页查询商品信息
	public Page<ProductDto> findPage(Pageable<ProductDto> pageable);
	//修改商品信息
	public boolean modifyProduct(ProductDto pcDto);
	//删除商品信息
	public boolean deleteProduct(Long ProductID);
	//添加商品信息
	public boolean addProduct(ProductDto pcDto);
	// 组合分页查询商品信息
    public Page<ProductDto> findPage2(Pageable<ProductDto> pageable,ProductDto pcDto);
	//查询所有商品信息
    public List<ProductDto> findAll();
    //逻辑删除删除商品信息
    public boolean productDel(Product pc);
}
