package com.hangzhou.tfchen.dao;


import com.hangzhou.tfchen.common.bean.Content;
import com.hangzhou.tfchen.common.dao.ContentMapper;
import com.hangzhou.tfchen.common.dao.IContentDao;
import com.hangzhou.tfchen.common.service.IContentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.SQLException;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016年10月31日 下午2:38:21 @描述： @注意事项：
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class PersonDaoTest extends AbstractJUnit4SpringContextTests {

    @Resource
    private IContentDao contentDao;

    public PersonDaoTest() {
        // TODO Auto-generated constructor stub
    }

    @Test
    public void testGetContent() {
        Content res = contentDao.findContent(1);
        System.out.println(res);
    }

}
