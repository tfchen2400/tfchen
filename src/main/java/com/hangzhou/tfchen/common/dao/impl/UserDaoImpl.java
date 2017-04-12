package com.hangzhou.tfchen.common.dao.impl;

import com.hangzhou.tfchen.common.bean.User;
import com.hangzhou.tfchen.common.dao.IUserDao;
import com.hangzhou.tfchen.dao.BaseDao;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2017/1/4 15:45
 * @描述：
 * @注意事项：
 */
@Service
public class UserDaoImpl extends BaseDao implements IUserDao {
    @Override
    public User findUserByCondition(User user) throws SQLException {
        return (User) this.getSqlMapClient().queryForObject("findUserByCondition", user);
    }
}
