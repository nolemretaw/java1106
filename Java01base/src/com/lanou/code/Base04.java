package com.lanou.code;

public class Base04 {

	public static void main(String[] args) {
		/*
		 * 变量的声明位置
		 *		方法内部或者代码段内部
		 *		方法不仅限于main()
		 * 变量的作用范围
		 * 		变量只能在声明此变量的函数及其子函数内部访问
		 * java中没有赋初值是不能访问的
		 */
		int a;
		a = 11;
		System.out.println(a);
		//如果多个变量的类型一样,可以放在同一行声明,变量之间以 , 隔开
		float height = 185.0f , weight = 98.08f;
	}

}
