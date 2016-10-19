package cn.com.wito.auth.dao.impl;




import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.dao.ProductCategoryDao;
import cn.com.wito.auth.po.ProductCategory;
/**
 * 添加商品分类
 * @author FJG
 *
 */
@Repository("productCategoryDaoImp")
public class ProductCategoryDaoImp extends BaseDao<ProductCategory> implements ProductCategoryDao {

	public static final String FIND_PC_SELECT = "findall";  
	
	@Override
	public List<ProductCategory> findAll() {
            List<ProductCategory> pc=getSqlSessionTemplate().selectList(this.getSqlId(FIND_PC_SELECT));
		return pc;
	}

	

}
