package com.hangzhou.tfchen.util.test;

import com.hangzhou.tfchen.util.EncypterUtil;

import junit.framework.TestCase;

public class EncypterUtilTest extends TestCase {

	public EncypterUtilTest() {
		// TODO Auto-generated constructor stub
	}

	public void testEncypter() {
		String str = "hzmc";
		EncypterUtil encypterUtil = EncypterUtil.getInstacne();
		String enstr = encypterUtil.jasyptEncrypt(str);
		String destr = encypterUtil.jasyptDecrypt(enstr);
		assertEquals(str, destr);
	}
}
