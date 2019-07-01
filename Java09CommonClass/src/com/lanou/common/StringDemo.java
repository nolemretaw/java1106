package com.lanou.common;

public class StringDemo {

	public static void main(String[] args) {
		/*字符串类在java.lang包下,是用来存储文本信息的一个类
		 * 此类在以后涉及到文本操作时是必须的类,学习一个类,系统内部类,
		 * 主要学习的是方法
		 * 
		 */
		//构造方法
		String str = "Hello";
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = new String("Hello");
		System.out.println(str == str1);
		System.out.println(str.equals(str2));
		System.out.println(str2.equals(str2));
		/*equals方法用来比较对象是否相同
		 * 默认实现是比较地址,而字符串内部对equals方法进行了重写,改为比较内容,所以以后字符串比较时
		 * 采用equals方法,而非== ,我们自己定义的类 如果想通过比较属性的值是否一致 来表示是否相等
		 * ,也可以对equals方法进行重写
		 */
		//字符串长度
		String string = "Hello World! Hello";
		System.out.println(string.length());
		//全大写, 全小写
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		//字符串截取
		//从传入下标开始一直截到最后,从开始下标截取,到结束下标前一个
		System.out.println(string.substring(6));
		System.out.println(string.substring(2, 5));
		//判断以什么为开头结尾
		System.out.println(string.startsWith("Hel"));
		System.out.println(string.startsWith("?"));
		//替换
		/*
		 * replaceAll会用新内容将所有要被替换的内容进行替换
		 * replaceFirst只换第一个要被替换的内容
		 */
		System.out.println(string.replaceAll("Hello", "hello"));
		System.out.println(string.replaceFirst("Hello", "shit"));
		//分割
		String[] strs = string.split(" ");
		for(String s : strs) {
			System.out.println(s);
		}
	}
}
