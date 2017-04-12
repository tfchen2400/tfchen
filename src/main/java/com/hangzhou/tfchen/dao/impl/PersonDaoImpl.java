package com.hangzhou.tfchen.dao.impl;

import com.hangzhou.tfchen.rowHandler.PersonRowHandler;
import org.springframework.stereotype.Service;

import com.hangzhou.tfchen.bean.Person;
import com.hangzhou.tfchen.dao.IPersonDao;

import java.util.List;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016/10/12 14:32
 * @描述：
 * @注意事项：
 */
@Service
public class PersonDaoImpl extends BaseDao implements IPersonDao {
    @Override
    public void savePerson(Person person) {
        this.getSqlMapClientTemplate().insert("insertPerson", person);
    }

    @Override
    public List<Person> findPersonWhereIdBelow(Integer id) {
        return this.getSqlMapClientTemplate().queryForList("selectPersonWhereIdBelow", id);
    }

    @Override
    public List<Person> findPersonContantSonWhereIdBelow(Integer id) {
        return this.getSqlMapClientTemplate().queryForList("selectPersonContantSonWhereIdBelow", id);
    }

    @Override
    public List<Person> findPersonContantSonWhereIdBelow2(Integer id) {
        return this.getSqlMapClientTemplate().queryForList("findPersonContantSonWhereIdBelow2", id);
    }

    @Override
    public void findWithRowHandler(Integer id) {
        PersonRowHandler p = new PersonRowHandler();
        this.getSqlMapClientTemplate().queryWithRowHandler("selectPersonWhereIdBelow", id, p);
    }

}
