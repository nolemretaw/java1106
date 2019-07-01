package com.lanou.animal;

public class Dog extends Animal{
	/*继承父类时,子类如果不满足父类方法中的实现
	 * 可以重写,执行子类的实现
	 * 重写得保证:
	 * 		访问修饰, 返回值类型, 方法名, 参数类型, 参数, 个数都一致
	 * 没有继承就没有重写
	 * 
	 *重写的请况有三种:
	 *只保留父类的实现
	 *1. 不对方法进行重写
	 *2. 内部执行父类的方法
	 *只保留子类的实现
	 *	重写
	 *既有父类的实现,也有子类的实现
	 */
	public void eat(){
		System.out.println("狗在吃骨头");
		
	}
}
