package cn.com.wito.auth.dao.impl;

import org.springframework.stereotype.Repository;

import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.dao.AdNodeDao;
import cn.com.wito.auth.po.AdNode;

/**
 * 
 * @author baibingge
 *
 */
@Repository("adNodeDao")
public class AdNodeDaoImpl extends BaseDao<AdNode> implements AdNodeDao{

}
