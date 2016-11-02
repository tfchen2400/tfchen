package com.hangzhou.tfchen.util;

import org.junit.Assert;
import org.junit.Test;

public class EncypterUtilTest {

	public EncypterUtilTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testEncypter() {
		String str = "hzmc";
		EncypterUtil encypterUtil = EncypterUtil.getInstacne();
		String enstr = encypterUtil.jasyptEncrypt(str);
		String destr = encypterUtil.jasyptDecrypt(enstr);
		Assert.assertEquals(str, destr);
	}
}
