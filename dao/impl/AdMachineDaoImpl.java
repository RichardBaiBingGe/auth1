package cn.com.wito.auth.dao.impl;

import org.springframework.stereotype.Repository;

import cn.com.wito.auth.dao.AdMachineDao;
import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.po.AdMachine;

/**
 * 
 * @author wangxing
 *
 */
@Repository("adMachineDao")
public class AdMachineDaoImpl extends BaseDao<AdMachine> implements AdMachineDao{

}
