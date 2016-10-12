package com.hangzhou.tfchen.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * 加载sqlmapclient的类 很重要
 * 
 * @author tfche 2016年7月19日11:31:16
 */
public class BaseDao extends SqlMapClientDaoSupport {

	@Autowired
	@Qualifier("sqlMapClient")
	public void setSqlMapClientForAutowire(SqlMapClient sqlMapClient) {
		super.setSqlMapClient(sqlMapClient);
	}

}
