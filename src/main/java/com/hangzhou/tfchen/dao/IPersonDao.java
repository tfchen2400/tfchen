package com.hangzhou.tfchen.dao;

import com.hangzhou.tfchen.bean.Person;

import java.util.List;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016/10/12 14:31
 * @描述：
 * @注意事项：
 */
public interface IPersonDao {
    /**
     * @param person
     */
    public void savePerson(Person person);

    /**
     * @param id
     * @return
     */
    public List<Person> findPersonWhereIdBelow(Integer id);

    /**
     * @param id
     * @return
     */
    public List<Person> findPersonContantSonWhereIdBelow(Integer id);

    /**
     * @param id
     * @return
     */
    public List<Person> findPersonContantSonWhereIdBelow2(Integer id);

    /**
     * @param id
     */
    public void findWithRowHandler(Integer id);
}
