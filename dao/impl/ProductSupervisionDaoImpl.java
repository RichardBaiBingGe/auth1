package cn.com.wito.auth.dao.impl;
import org.springframework.stereotype.Repository;
import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.dao.ProductSupervisionDao;
import cn.com.wito.auth.po.ProductSupervision;


@Repository("ProductSupervisionDao")
public class ProductSupervisionDaoImpl extends BaseDao<ProductSupervision> implements ProductSupervisionDao {

}
