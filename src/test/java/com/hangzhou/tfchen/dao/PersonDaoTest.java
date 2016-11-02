package com.hangzhou.tfchen.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hangzhou.tfchen.bean.Person;

/**
 * 
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016年10月31日 下午2:38:21 @描述： @注意事项：
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class PersonDaoTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private IPersonDao personDao;

	public PersonDaoTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void savePersonTest() {
		Person person = new Person();
		person.setName("chentf");
		personDao.savePerson(person);
	}

}
