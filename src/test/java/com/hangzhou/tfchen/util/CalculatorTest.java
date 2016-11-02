package com.hangzhou.tfchen.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016年10月31日 下午3:37:33 @描述： @注意事项：
 *
 */
public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		int sum = calculator.add(1, 2);
		Assert.assertEquals(3, sum);
	}

	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		int product = calculator.multiply(2, 4);
		Assert.assertEquals(8, product);
	}

}
