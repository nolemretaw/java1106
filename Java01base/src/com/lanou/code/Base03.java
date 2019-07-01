package com.lanou.code;

public class Base03 {

	public static void main(String[] args) {
		// 常量与变量,变量:栈区 ; 常量:常量池
/*
 * 常量在常量池独一份,不能发生改变
 * 变量在栈区,是一块存储空间,存储的值可以发生改变
 * 数据类型 变量名 = 初值;
 * 
 * java中的数据类型分为两种:
 * 基本数据类型;引用数据类型
 * 	基本数据类型:
 * 		整型:
 * 			byte 字节型
 * 			short 短整型
 * 			int 整型
 * 			long 长整型
 * 		浮点型:
 * 			flout 单精度浮点型
 * 			double 双精度浮点型
 * 		字符型:
 * 			char
 * 		布尔型:
 * 			boolean
 * 	引用数据类型:
 * 		类,数组
 *  */
//		变量类型声明时,初值一定要与数据类型匹配
		byte age = 28;
		short size = 100;
		int length = 2500000;
		long money = 111111111;
//		可以打印常量,变量或组合形式
		System.out.println("length = " + length);
//		字符串+数值  是做拼接
//		变量名的命名规则:
/*		1.以数字,字母,下划线,$符号组成,且数字不能开头
 * 		2.变量名不能重复命名
 * 		3.变量名不能与系统内部的关键字或者保留字重名
 * 		4.见名知意采用,驼峰法命名
 * 类名首字母大写,变量名首字母小写,方法名首字母小写
 */
//		浮点数默认是double型,加上f才是float型
//		整数默认是int型
		float score = 99.9f;
		double weight=98.9;
		char c = 'A';
		System.out.println(c + 10);
//		布尔类型 boolean true false
		/*
		 布尔类型的变量常以is  can  has开头
		 * 
		 */
		boolean isBoy = true;
		boolean hasMoney = true;
		boolean canFly = false;
	}

}