package com.hangzhou.tfchen.common.service;

import com.hangzhou.tfchen.common.bean.User;

import java.sql.SQLException;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2017/1/4 15:36
 * @描述：
 * @注意事项：
 */
public interface IUserService {
    /**
     * 根据用户名密码登陆
     * 有则返回user对象，没有则返回空
     *
     * @param user
     * @return
     */
    User doLogin(User user) throws SQLException;
}
