package com.lanou.regex;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern类主要用于封装一个正则表达式字符串
 * Matcher:用于封装正则表达式和字符串匹配的结果
 * **/
public class PattenTest {
	public static void main(String[] args) {
		//定义待匹配的字符串
		String content =new Scanner(System.in).nextLine();
		//定义正则表达式字符串
		String regex ="尼玛|fuck|你妹";
		//将正则表达式字符串封装到pattern对象中
		Pattern pattern = Pattern.compile(regex);
		
		//用于封装 正则表达式和字符串的匹配 结果
		Matcher matcher = pattern.matcher(content);
		
		//检测字符串中是否含有正则表达式中规定的敏感字
		//find()每次调用就向后匹配一段
		while (matcher.find()) {
			//group()取刚才匹配的关键字时，前提时先调用find()，并返回true
			String keyWord = matcher.group();
			System.out.println(keyWord);
			//替换匹配到的字串
			content=content.replace(keyWord, "****");
			
			//取出匹配到的串的起始下标
//			int start = matcher.start();
//			int end = matcher.end();
//			System.out.println(start);
//			System.out.println(end);
		}
		System.out.println(content);
		
		
		
	}
}
