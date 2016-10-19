package cn.com.wito.auth.dao.impl;


import org.springframework.stereotype.Repository;
import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.dao.BatchDao;
import cn.com.wito.auth.po.Batch;

@Repository("BatchDao")
public class BatchDaoImpl extends BaseDao<Batch> implements BatchDao {


}
