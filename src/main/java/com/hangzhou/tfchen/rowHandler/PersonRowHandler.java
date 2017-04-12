package com.hangzhou.tfchen.rowHandler;

import com.hangzhou.tfchen.bean.Person;
import com.ibatis.sqlmap.client.event.RowHandler;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016/12/8 8:45
 * @描述：
 * @注意事项：
 */
public class PersonRowHandler implements RowHandler {
    @Override
    public void handleRow(Object o) {
        Person p = (Person) o;
        System.out.println(p.getName());
    }
}
