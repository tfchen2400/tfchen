package com.hangzhou.tfchen.dao.impl;

import com.hangzhou.tfchen.bean.Son;
import com.hangzhou.tfchen.dao.ISonDao;
import org.springframework.stereotype.Service;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016/12/7 15:40
 * @描述：
 * @注意事项：
 */
@Service
public class SonDaoImpl extends BaseDao implements ISonDao {
    @Override
    public void saveSon(Son son) {
        this.getSqlMapClientTemplate().insert("insertSon", son);
    }
}
