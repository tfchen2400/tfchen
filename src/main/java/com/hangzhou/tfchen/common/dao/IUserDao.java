package com.hangzhou.tfchen.common.dao;

import com.hangzhou.tfchen.common.bean.User;

import java.sql.SQLException;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2017/1/4 15:43
 * @描述：
 * @注意事项：
 */
public interface IUserDao {
    /**
     * 根据用户名密码查找user
     * @param user
     * @return
     */
    User findUserByCondition(User user) throws SQLException;
}
