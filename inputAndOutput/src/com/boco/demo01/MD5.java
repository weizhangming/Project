package com.boco.demo01;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	
	public final static String getMD5(String s) {
		char str[] = null;
		MessageDigest mdTemp = null;
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };
		byte[] strTemp = s.getBytes();
		try {
			mdTemp = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		mdTemp.update(strTemp);
		byte[] md = mdTemp.digest();
		int j = md.length;
		str = new char[j * 2];
		int k = 0;
		for (int i = 0; i < j; i++) {
			byte byte0 = md[i];
			str[k++] = hexDigits[byte0 >>> 4 & 0xf];
			str[k++] = hexDigits[byte0 & 0xf];
		}
		return new String(str);
	}

	public static void main(String[] args) {
		System.out.println(MD5.getMD5("liujingzhi"));
	}

}
