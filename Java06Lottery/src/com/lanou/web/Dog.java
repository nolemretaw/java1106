package com.lanou.web;

public class Dog extends Animal {
	
	/*
	 	继承父类时，子类如果不满足于父类中方法的实现
	 	可以重写，执行子类独有的实现！
	 	重写得保证：
	 		访问修饰、返回值类型、方法名、参数类型、顺序、个数
	 		都一致！
	 	没有继承就没有重写！
	 */
	@Override
	/*
		重写的情况有三种：
		只保留父类的实现
			1、不对方法进行重写
			2、内部执行父类的方法
		只保留子类的实现
		既有父类的实现，也有子类的实现
	 */
	public void eat() {
		super.eat();
		System.out.println("狗在吃粑粑~");
	}
	
	
	
	
	
}
