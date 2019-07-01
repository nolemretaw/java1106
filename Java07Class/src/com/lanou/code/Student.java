package com.lanou.code;

/*
 	局部变量与成员变量(属性)的区别？
 	1、从定义位置区分
 	属性定义在类的内部，而局部变量定义在方法内部
 	2、从作用范围区分
 	属性作用于整个类，而局部变量作用于声明此变量的方法内部
 	3、从初值区分
 	属性默认有初值，引用类型为null，整数为0，浮点数为0.0
 	而局部变量没有默认初值，使用时必须保证有初值
 	4、从生命周期区分
 	属性随着对象的创建而生成，随着对象的回收而销毁
 	而局部变量随着方法的调用而生成，方法结束而销毁
 	5、当一个方法中的局部变量与属性重名时，局部变量的优先级更高
 	6、不同的方法中可以存在同名的局部变量
 */
public class Student {
	
	/*
	 	属性的访问修饰符有四种：
	 	public公开的，protected受保护的，缺省，private私有
	 	为了满足javaBean的设计规范采用private
	 	将类的内部实现细节进行隐藏，不允许外界直接访问
	 	达到了封装的目的
	 */
	private String name;
	private int age;
	/*
	 	属性私有，但是还是需要进行赋值、取值
	 	赋值我们称为setter方法，完成对私有属性的赋值
	 	取值我们称为getter方法，完成对私有属性的取值
	 */
	/*
	 	setter方法赋值，为私有属性赋值是
	 	有参无返的方法
	 	并且方法要对外使用，所有访问修饰符为public
	 	赋值不需要返回值，所以返回值为void
	 	方法名：set + 属性名首字母变大写
	 	参数类型要与属性类型一致，并且参数名与属性名一致
	 */
	/*
	 	this 关键字只能出现在对象方法中
	 	this 代表的是调用当前方法的对象！！！
	 */
	public void setName(String name) {
		System.out.println(this);
		this.name = name;
	}
	/*public static void test() {
		System.out.println(this);
	}*/
	/*
	 	getter方法取值
	 	无参有返的方法
	 	并且方法要对外使用，所有访问修饰符为public
	 	取值需要得到属性的值，所以返回值为获取的私有属性的类型
	 	方法名：get + 属性名首字母变大写
	 */
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void introduce() {
		String name = "";
		System.out.println(this.age);
	}
	
	
	
}
