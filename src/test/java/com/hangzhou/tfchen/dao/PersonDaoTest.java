package com.hangzhou.tfchen.dao;

import com.hangzhou.tfchen.bean.Son;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hangzhou.tfchen.bean.Person;

import java.util.Date;
import java.util.List;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016年10月31日 下午2:38:21 @描述： @注意事项：
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class PersonDaoTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private IPersonDao personDao;

    @Autowired
    private ISonDao sonDao;

    public PersonDaoTest() {
        // TODO Auto-generated constructor stub
    }

    @Test
    public void savePersonTest() {
        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            person.setBirthDay(new Date());
            person.setAge(i);
            person.setCity("hangzhou" + i);
            person.setName("chentf" + i);
            person.setBirthDay(new Date());
            personDao.savePerson(person);
        }
    }

    @Test
    public void findPersonWhereIdBelowTest() {
        int id = 19838;
        List<Person> personList = personDao.findPersonWhereIdBelow(id);
        for (Person p : personList) {
            System.out.println(p.getName());
            for (int i = 0; i < 100; i++) {
                Son son = new Son();
                son.setAge(i);
                son.setPersonId(p.getId());
                son.setName("son" + i);
//                sonDao.saveSon(son);
            }
        }
    }

    @Test
    public void selectPersonContantSonWhereIdBelowTest() {
        Long start = System.currentTimeMillis();
        int id = 50000;
        List<Person> personList = personDao.findPersonContantSonWhereIdBelow(id);
//        System.out.println(JSONArray.fromObject(personList));
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
        start = end;
        List<Person> personList1 = personDao.findPersonContantSonWhereIdBelow2(id);
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    public void findWithRowHandlerTest() {
        int id = 19838;
        personDao.findWithRowHandler(id);
    }

}
