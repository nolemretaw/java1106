package com.lanou.util;

import java.util.Random;

public class StringUtil {
	/**
	 * ��a-z A-Z 0-9
	 * ����һ����λ�������֤��
	 * */
	public static String createValidateCode(){
		StringBuffer sBuffer = new StringBuffer();
		for(char c='a';c<'z';c++){
			sBuffer.append(c);
		}
		for(char c='A';c<'Z';c++){
			sBuffer.append(c);
		}
		for(char c='0';c<='9';c++){
			sBuffer.append(c);
		}
		sBuffer.append("������Ÿ�Ƽ����޹�˾");
		String code = "";
		for (int i = 0; i < 4; i++) {
			int index = new Random().nextInt(sBuffer.length());
			code += sBuffer.charAt(index);
		}
		return code;
		
	}
}
