package com.lanou.week;

class A{
	public A(){
		System.out.println("---A()---");
	}
}
class B{
	public B(){
		System.out.println("---B()---");
	}
}
class M{
	public M(){
		System.out.println("---M()---");
	}
}
class N{
	public N(){
		System.out.println("---N()---");
	}
}

class Father{
	static{
		N n = new N();
	}
	/**属性在构建对象之前初始化
	 * 但是可以初始化的时候赋值,
	 * 也可以在构建完对象之后赋值
	 * */
	A a = new A();
	static M m = new M();
	public Father(){
		System.out.println("---Father()---");
	}
}

class Child extends Father{
	public Child(){
		System.out.println("---Child()---");
	}
	B b = new B();
	static N n = new N();
	static{
		M m = new M();
	}
}
/**
 * 子类对象的构建步骤
 * 1、加载父类,为父类分配内存空间
 * 2、按顺序加载父类的静态成员变量和静态代码块
 * 3、加载子类,为子类分配内存空间
 * 4、按顺序加载子类的静态成员变量和静态代码块
 * 5、按顺序初始化父类属性(非静态成员变量)
 * 6、调用父类构造器构建父类对象
 * 7、按顺序初始化子类属性
 * 8、调用子类构造器构建子类对象
 */
public class Test4 {
	public static void main(String[] args) {
		Child c = new Child();
	}
}


