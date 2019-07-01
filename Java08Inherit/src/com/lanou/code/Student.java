package com.lanou.code;
/*
 * 继承是一种is a 的关系
 * 继承的内容:
 * 父类中所有的属性,私有属性继承过来不能直接访问,但是可以通过setter, getter来访问
 * 和赋值
 * 父类中所有的方法除了构造方法都能继承
 */
/*继承的设计原则:
 * 将公共的属性或方法放在父类中,子类只需要继承父类就可以把
 * 这些属性和方法拿到. 只不过私有属性不允许直接访问,但是可以通过继承来的setter, getter来访问
 * 而子类只需要书写自己独有的属性和方法就可以
 * 优点:大大减少了代码量,使设计更合理
 * 
 * 继承的语法格式:
 * 子类  + extends + 父类{}   
 */
/*	继承的特点：
 	1、没有父类的类称为根类，Java中根类是Object
 	2、继承的上层：父类		继承的下层：子类
 	3、继承的内容，所有的成员变量(私有的不能直接访问)和方法(除了构造方法)
 	4、Java中的继承为单继承！！！ 你的亲生父亲只有一个！
 	一个类可以有多个子类，但是一个类只能有一个父类！
 	5、继承是单向的，不能相互继承
 	6、继承有传递性 Person Student CollegeStudent
 	大学生继承学生，学生继承人类，那么大学生就具有学生和人类的所有属性和方法
 	7、子类如果不满意父类的方法实现，可以重写

 */
public class Student extends Person{
	private String id;
	private String classname;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	private void test() {
		System.out.println(getName());
	}
	
	
	
}
