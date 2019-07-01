package oop;

import oop.Outer.Inner;
import oop.Outer.Inner2;

/**
 * 
	内部类
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.name = "aa";
		//Inner inner = outer.new Inner();
		//实例内部类对象构建
		Inner inner = new Outer().new Inner();
		
		//静态内部类对象的构建
		Outer.age = 10;
		Inner2 inner2 = new Inner2();
		
		
		//匿名内部类
		Father father = new Father(){
			@Override
			public void eat() {
				System.out.println("吃狗屎");
			}
		};
		father.eat();
		
		new IA() {
			//匿名内部类
			@Override
			public void m1() {
				System.out.println("aaaa");
			}	
		}.m1();;
		
	}
}

class Father {
	public void eat() {
		System.out.println("吃屎");
	}
}
interface IA {
	void m1();
}
/*class aa implements IA {
	@Override
	public void m1() {
		
	}
}*/
/*class Child extends Father {
	@Override
	public void eat() {
		System.out.println("吃狗屎");
	}
}*/

class Outer {
	//实例变量就是属性
	String name;
	static int age;
	//实例内部类(实例就是对象)
	class Inner {
		private void say() {

		}
	}
	//静态内部类
	static class Inner2 {
		
	}
	//局部内部类
	public void m1() {
		String msg;
		class Inner3 {
			
		}
		Inner3 inner3 = new Inner3();
	}
}