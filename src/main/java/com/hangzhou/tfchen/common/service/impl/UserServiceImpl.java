package com.hangzhou.tfchen.common.service.impl;

import com.hangzhou.tfchen.common.bean.User;
import com.hangzhou.tfchen.common.dao.IUserDao;
import com.hangzhou.tfchen.common.service.IUserService;
import com.hangzhou.tfchen.util.EncypterUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.sql.SQLException;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2017/1/4 15:42
 * @描述：
 * @注意事项：
 */
@Service
public class UserServiceImpl implements IUserService {

    private IUserDao userDao;

    @Override
    public User doLogin(User user) throws SQLException {
        User res = null;
//        res = userDao.findUserByCondition(user);
        if (res != null) {
            // 比较密码
            String pwd = res.getPassword();
//            String pwdReal = EncypterUtil.getInstacne().jasyptDecrypt(pwd);
            String pwdReal = pwd;
            if (!StringUtils.equals(pwdReal, user.getPassword())) {
                res = null;
            }
        }
        return res;
    }
}
