package com.lanou.code;

public class TypeChange {

	public static void main(String[] args) {
		/*
		 * java中的数据类型转换分为两种
		 * 自动类型转换  小类型 ==>大类型
		 * 		系统内部数值运算时,有可能出现数值越界的问题,此时为了保证数值的精度,系统会自动做类型提升
		 * 1 ' byte, char, short 与整数运算时,会提升为int型 
		 * 2 ' int 运算如果越界,不会提升类型,而会损失精度
		 * 3 ' long与任意整型做运算时,得到的还是long
		 * 4 ' float与除double外的数据运算时,得到的还是float型, 不会提升
		 * 5 ' double与任意类型运算,都是double类型
		 * 强制类型转换 大类型==>小类型
		 * 强制类型转换,需要注意的问题:精度缺失; 语法问题:(数据类型)值,将原有类型转换为括号内的值
		 * 
		 */
		byte a = 10;
	}

}
