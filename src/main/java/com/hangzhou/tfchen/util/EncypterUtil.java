package com.hangzhou.tfchen.util;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * jasypt加密公共类
 * 
 * @author tfche
 *
 */
public class EncypterUtil {

	private static EncypterUtil encypterUtil;

	private static final String MASTER_KEY = "tfchen5211";

	private BasicTextEncryptor textEncryptor;

	private EncypterUtil() {
		// TODO Auto-generated constructor stub
		textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(MASTER_KEY);
	}

	public static EncypterUtil getInstacne() {
		if (encypterUtil == null)
			encypterUtil = new EncypterUtil();
		return encypterUtil;
	}

	public String jasyptEncrypt(String str) {
		return textEncryptor.encrypt(str);
	}

	public String jasyptDecrypt(String str) {
		return textEncryptor.decrypt(str);
	}
	
	public static void main(String[] args) {
		String ss = "tfchen5211";
		EncypterUtil encypterUtil = new EncypterUtil();
		
		for (int i = 0; i < 100; i++) {
			String encrypted = encypterUtil.textEncryptor.encrypt(ss);
		    String decrypted = encypterUtil.textEncryptor.decrypt(encrypted);
		    System.out.println(encrypted);
		    System.out.println(decrypted);
		}
	}
}
