package oop;

import oop.Outer.Inner;

/**
 * 内部类
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		o.name = "aa";
		//实例内部类对象构建
		Inner i = new Outer().new Inner();
		//静态内部类对象的构建
		Outer.age = 10;
		Outer.Inner2 i2 = new Outer.Inner2();
		Father f = new Father(){//（继承）匿名内部类
			@Override
			public void eat() {
			System.out.println("吃五碗面");
			}
		};
		f.eat();
		
		new IA(){//（继承）匿名内部类
			@Override
			public void m1() {
				System.out.println("addidas");
			}		
		}.m1();//省略了引用
	}
	
}

class Father{
	public void eat() {
		System.out.println("吃三碗面");
	}
}

interface IA{
		void m1();
}

/*class AA implements IA{
	@Override
	public void m1() {
		
	}
}
*/

/*class Child extends Father{
	@Override
	public void eat() {
	System.out.println("吃五碗面");
	}
}
*/

class Outer{
	String name;
	static int age;
	/** 实例内部类*/
	class Inner{
		public void say(){}
	}
	/**静态内部类*/
	static class Inner2{
		
	}
	/**局部内部类*/
	public void m1() {
		String mSg;
		class Inner3{
			
		}
		Inner3 i3 = new Inner3();
	}

}