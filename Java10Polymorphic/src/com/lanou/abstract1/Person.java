package com.lanou.abstract1;

/*
 	抽象类的应用场景
 		1.某些情况下,父类只知道子类应该包含什么方法,但并不关心子类如何实现,约束子类必须有的方法
 		2.从多个具有相同行为的类中抽象出来一个抽象类,以这个抽象类作为子类的模板,从而避免了子类设计的随意性
 */
//使用abstract修饰一个类,则此类称为抽象类!
/*
 	抽象类的特点:
 	
 */
public abstract class Person {
	
	public abstract void smoking();

}
