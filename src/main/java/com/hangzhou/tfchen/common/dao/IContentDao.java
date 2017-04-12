package com.hangzhou.tfchen.common.dao;

import com.hangzhou.tfchen.common.bean.Content;

import java.sql.SQLException;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2017/1/4 15:02
 * @描述：
 * @注意事项：
 */
public interface IContentDao {
    /**
     * 根据ID查找content
     *
     * @param id
     * @return
     */
    Content findContent(int id) throws SQLException;
}
