package com.hangzhou.tfchen.util.test;

import com.hangzhou.tfchen.util.Calculator;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	public CalculatorTest() {
		// TODO Auto-generated constructor stub
	}

	public void testAdd() throws Exception {
		Calculator calculator = new Calculator();
		int sum = calculator.add(1, 2);
		Assert.assertEquals(3, sum);
	}

	public void testMultiply() throws Exception {
		Calculator calculator = new Calculator();
		int product = calculator.multiply(2, 4);
		Assert.assertEquals(8, product);
	}
}
