package com.hangzhou.tfchen.dao.impl;

import com.hangzhou.tfchen.bean.Person;
import com.hangzhou.tfchen.dao.IPersonDao;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016/10/12 14:32
 * @描述：
 * @注意事项：
 */
public class PersonDaoImpl extends BaseDao implements IPersonDao {
    @Override
    public void savePerson(Person person) {
        System.out.println("person = [" + person + "]");
    }
}
