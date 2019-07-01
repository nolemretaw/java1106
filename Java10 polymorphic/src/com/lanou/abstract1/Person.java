package com.lanou.abstract1;

/*
	抽象类的应用场景
	1、某些情况下，父类只知道子类应该包含什么方法，但并不关心子类如何实现
	约束子类必须有的方法 
	2、从多个具有相同行为的类中抽象出一个抽象类，以这个抽象类作为子类的模板
	从而避免了子类设计的随意性
*/
//使用abstract修饰一个类，则此类称为抽象类！
//1、使用abstract来定义抽象类
//2、使用abstract来定义抽象方法，只有声明，没有实现，没有大括号的实现体
//3、包含抽象方法的类肯定是抽象类
//4、抽象类内部，可以有抽象方法也可以没有，也可以有普通方法
//5、抽象类不能直接实例化(创建)对象  not new
/*
	6、一个类继承了抽象类,如果此类为抽象类，可以不实现继承的抽象方法
	但如果是普通类，则必须实现抽象方法
*/
//7、抽象类内部的抽象方法，在声明时，不允许出现private final static关键字

public abstract class Person {
	
	private String name;
	private String gender;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Person() {
		
	}
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public abstract void smoking();
	
	public void study() {
		System.out.println("人类正在学习~");
	}
}





