package com.hwh.utils;

import java.util.Random;

public class StringUtils {

	/**
	 * @Title: generateWord 
	 * @Description: (生成随机字符串) 
	 * @param length
	 * @return
	 */
	private static String generateWord(int length) {
		final String allChar = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(allChar.charAt(random.nextInt(allChar.length())));
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(generateWord(32));
	}
		
}
