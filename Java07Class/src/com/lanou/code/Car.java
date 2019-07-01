package com.lanou.code;

public class Car {
	
	//声明一个变量来记录模板Car生成的实例数量
	/*
	 	static修饰属性，则该属性称为类属性
	 	那么类属性与对象属性的区别是什么呢？
	 	1、别名：
	 	对象属性、成员变量、非静态变量
	 	类属性、静态成员变量、静态变量
	 	2、生命周期：
	 	对象属性随着对象的创建而生成，对象销毁则销毁
	 	类属性随着类的加载而生成，jvm虚拟机终止或者程序退出
	 	类销毁时随之销毁
	 	3、存储位置：
	 	对象属性属于对象所以在堆区，而类属性属于类所在属于
	 	数据共享区
	 	4、访问方式：
	 	对象属性只能由对象去访问，而类属性既可以由类直接访问，
	 	也可以由对象访问，但是建议采用类访问！
	 */
	static int count;
	private String brand;
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	//定义两个方法，一个静态的，一个非静态的
	/*
	 	1、static修饰方法，则方法变为类方法
	 	调用时可以使用类名，也可以使用对象，但是推荐使用
	 	类名！而对象方法，只能由对象调用！
	 	2、类方法中只能直接访问类属性(static)，不能直接访问
	 	对象属性，而对象方法中，都可以直接访问！想要在类方法中
	 	访问对象属性，必须先创建对象，由对象访问
	 	3、静态方法中只能直接调用静态方法，想要调用非静态方法
	 	先创建对象，再由对象调用非静态方法。而非静态方法中
	 	既可以直接调用静态方法，也可以直接调用非静态方法！
	 */
	public static void staticMethod() {
		System.out.println("我是一个静态方法，也叫类方法");
		System.out.println(count);
//		System.out.println(brand);
		Car car = new Car();
		System.out.println(car.getBrand());
//		car.nonStaticMethod();
	}
	public void nonStaticMethod() {
		System.out.println("我是一个非静态方法，也叫对象方法");
		System.out.println(count);
		System.out.println(brand);
		staticMethod();
	}
	
	/*
	 	构造方法用来创建对象
	 	构造方法的名称与类名一致，且没有返回值，不是
	 	代表要写void，而是直接省略返回值的部分！！！
	 	1、一个类内部如果没有手动书写构造方法，那么系统
	 	默认会为此类提供一个无参数的构造方法！
	 	2、当手动书写了有参构造方法，那么无参的就不会默认
	 	提供了，就需要我们手动将无参的构造方法声明出来！
	 */
	
	//有参构造方法，可以在创建对象时，完成对属性的赋值
	//有参构造的参数名称与类型要与属性一致
	public Car() {
		
	}
	public Car(String brand) {
//		this.brand = brand;
		setBrand(brand);
	}
	
}
