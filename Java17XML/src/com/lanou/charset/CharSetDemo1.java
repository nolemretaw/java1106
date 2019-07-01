package com.lanou.charset;

import java.io.UnsupportedEncodingException;

public class CharSetDemo1 {
	public static void printByte(byte[] bs) {
		for (byte b : bs) {
			System.out.print(b + " ");
		}
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		/*�ַ���������Ŀ��һ��Ҫ����ͳһ,
		 * Eclipse ��Win��Ĭ�ϱ����ʽΪGBK,
		 * ��MacOs��Ĭ�ϸ�ʽΪutf-8
		 * 
		 * io�������ļ�ʱ,���뱣֤д���ļ����ȡ�ļ��ı����ʽһ��,�����ļ����������
		 */
		String string = "�й�";
		//getBytes()�����ǵõ�һ������ϵͳĬ�ϵı����ʽ���ֽ�����
		byte[] bytes = string.getBytes();//GBK
		byte[] bytes2 =string.getBytes("utf-8");//utf-8
		printByte(bytes);
		System.out.println();
		printByte(bytes2);
		
		System.out.println(new String(bytes,"GBK"));
		System.out.println(new String(bytes2,"utf-8"));
	}

}
