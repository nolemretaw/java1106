package com.lanou.reflect;

class Drum {
	
//	public Drum(String name) {
//		
//	}
	public void play() {
		System.out.println("如微尘正在打鼓");
	}
}
public class ClassDemo1 {
	/*`在面向对象的世界里 	万事万物皆对象
	 * 类也是对象，它是java.lang.Class 类的实例对象
	 * There is class named Class.
	 */
	public static void main(String[] args) {
//		Drum drum = new Drum();
		//Drum 这个对象 如何表示
		//任意一个类都是Class类实例，这个实例对象有三种表示对象
		//1、 实际在告诉我们每一个类类都有一个隐藏的类属性 class
		
		Class c = Drum.class;//已知类名时使用
		System.out.println(c);
		
		//2、 
//		Class c1 = drum.getClass();//已知类的对象的getClass()方法，获取该对象所属类的类型
//		System.out.println(c1);
		/*
		 * 	c 和c1 表示了Drum类的类型(Class type)
		 * 万事万物皆对象
		 * 类也是对象，是Class类的实例对象，这个对象我们称为类的类型，类类型，而且类的类型也就是这个对象只有一份，
		 * 一个类只可能是Class类的一个实例对象
		 */
		//3、 第三种方式可以动态的加载一个类
		Class c2 = null;
		try {
			c2 = Class.forName("com.lanou.reflect.Drum");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c2);
		
		/*
		 * 	获取到类的类型之后，完全可以通过类类型，来创建该类的实例对象 执行newInstance()方法
		 * 但是返回值默认是Object对象，可以强转
		 * 
		 */
		try {
			//如果采用这种方式创建对象，必须保证无参构造的存在
			Drum d = (Drum)c.newInstance();
			d.play();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
