package com.hangzhou.tfchen.webservice;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016年10月31日 下午3:08:30 @描述： @注意事项：
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TfchenRestful extends AbstractJUnit4SpringContextTests {

	public TfchenRestful() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private ITfchenRestful tfchenRestful;

	@Test
	public void methodOneGetTest() {
		Assert.assertEquals("hellohello", tfchenRestful.methodOneGet("hello"));
	}

	@Test
	public void methodOnePostTest() {
		Assert.assertEquals("hellohello", tfchenRestful.methodOnePost("hello"));
	}
}
