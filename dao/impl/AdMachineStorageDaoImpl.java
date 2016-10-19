package cn.com.wito.auth.dao.impl;


import org.springframework.stereotype.Repository;

import cn.com.wito.auth.dao.AdMachineStorageDao;
import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.po.AdMachineStorage;


@Repository("adMachineStorageDao")
public class AdMachineStorageDaoImpl extends BaseDao<AdMachineStorage> implements AdMachineStorageDao {

}
