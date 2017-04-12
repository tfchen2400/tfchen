package com.hangzhou.tfchen.common.dao.impl;

import com.hangzhou.tfchen.common.bean.Content;
import com.hangzhou.tfchen.common.dao.IContentDao;
import com.hangzhou.tfchen.dao.BaseDao;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2017/1/4 15:03
 * @描述：
 * @注意事项：
 */
@Service
public class ContentDaoImpl extends BaseDao implements IContentDao {
    @Override
    public Content findContent(int id) throws SQLException {
        return (Content) this.getSqlMapClient().queryForObject("findContent", id);
    }
}
