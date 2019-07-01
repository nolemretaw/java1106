package com.lanou.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		//定义正则表达式
		System.out.println("请留言");
		String mString = new Scanner(System.in).nextLine();
//		//敏感字
//		String keyWords ="国家|政府|习近平";
//		mString = mString.replaceAll(keyWords, "*****");
//		System.out.println(mString);
		//匹配格式  name.文件后缀.序号
		String regex = "^name\\..+\\.\\d+$";
//		String regex2 = "\\.";
		
		Pattern pattern = Pattern.compile(regex);
		boolean flag = pattern.matches(regex, mString);
		//mString = mString.replaceAll(regex, "*****");
		System.out.println(flag);
	}
	//^name\.\w+\.([1-9][0-9])+$
}
