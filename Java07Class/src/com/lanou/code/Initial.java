package com.lanou.code;

/*
 	测试类 用来测试代码的。
 */
public class Initial {
	
	public static void main(String[] args) {
		//创建对象
		//类名 对象名 = new 构造方法;
		//数据类型 变量名 = 初值; int a = 10;
		/*
		 	new关键字是用来创建对象的，对象本身存在于堆区
		 	person是变量名，也可以认为是对象名，存在栈区
		 	person存储的是对象在堆区的地址，所以操作
		 	person就相当于操作对象本身
		 	
		 	只要是new出来的对象，哪怕内部属性一致
		 	他们在堆区中的地址也不一样
		 */
		Person person = new Person();
		person.name = "晨晨";
		person.gender = "男";
		person.age = 18;
		person.height = 180.0;
		
		Person person1 = new Person();
		person1.name = "晨晨";
		person1.gender = "男";
		person1.age = 18;
		person1.height = 180.0;
		
		System.out.println(person);
		System.out.println(person1);
		
		//类中对象方法的调用语法: 对象名.方法
		person.introduce();
		
		//创建一个学生对象
		Student student = new Student();
		System.out.println(student);
		student.setName("张选");
		System.out.println(student.getName());
		student.introduce();
		
	}
}












