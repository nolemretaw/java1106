package com.lanou.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		//����������ʽ
		System.out.println("������");
		String mString = new Scanner(System.in).nextLine();
//		//������
//		String keyWords ="����|����|ϰ��ƽ";
//		mString = mString.replaceAll(keyWords, "*****");
//		System.out.println(mString);
		//ƥ���ʽ  name.�ļ���׺.���
		String regex = "^name\\..+\\.\\d+$";
//		String regex2 = "\\.";
		
		Pattern pattern = Pattern.compile(regex);
		boolean flag = pattern.matches(regex, mString);
		//mString = mString.replaceAll(regex, "*****");
		System.out.println(flag);
	}
	//^name\.\w+\.([1-9][0-9])+$
}
