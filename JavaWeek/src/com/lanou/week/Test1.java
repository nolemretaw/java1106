package com.lanou.week;
/**
 * 官方定义的分类：
 * 成员变量(在整个类中都有效，有默认值)
 * 	1、静态成员变量
	 * （a、属于类的，类在加载时就会立即为静态成员变量去申请内存空间
	 * 	b、与类一起存放在内存的方法区中
	 * 	c、静态成员变量可以直接通过类名调用，只有一份，是类中所有对象所共享的
	 * ）
 * 	2、非静态成员变量（属性）
 * 		a、属于对象的，每个对象独享一份
 * 		b、依附于对象，在构造对象时会为其分配内存空间（堆）
 * 		c、静态方法不能直接访问非静态成员变量
 * 		原因：类加载时间比对象构建时间要早，在调用静态方法时不一定有对象的存在
 * 局部变量（在当前这个方法中有效，没有默认值）
 * 	1、参数变量
 * 	2、局部变量
 * 
 * 字符串是常量，改变字符串为创建一个新的字符串
 * 
 * 定义方法时尽量先定义成静态方法
 * 定义变量时尽量将变量定义成非静态成员变量
 * */
public class Test1 {
		static int m;//静态成员变量
		int n;//非静态成员变量
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m);
		Test1 test1 = new Test1();
		System.out.println(test1.n);
	}
	
	public static int add(int a,int b){
		System.out.println(m);
		int c =10;//局部变量
		return a+b+c;
	}
	
}
