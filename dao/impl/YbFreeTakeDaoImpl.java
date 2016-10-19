package cn.com.wito.auth.dao.impl;

import org.springframework.stereotype.Repository;
import cn.com.wito.auth.dao.BaseDao;
import cn.com.wito.auth.dao.YbFreeTakeDao;
import cn.com.wito.auth.po.YbFreeTake;

@Repository("YbFreeTakeDao")
public class YbFreeTakeDaoImpl extends BaseDao<YbFreeTake> implements
		YbFreeTakeDao {
}
