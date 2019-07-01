package com.lanou.polymorphic;

public class InitialAnimal {
	public static void main(String[] args) {
		/*Animal animal = new Animal();
		animal.eat();
		Dog dog = new Dog();
		dog.eat();
		Cat cat = new Cat();
		cat.eat();*/
		
		//父类的引用指向的是子类对象
		/*
		 	继承多态
		 		1.继承关系
		 		2.对父类方法进行重写
		 		3.父类引用指向子类对象
		 */
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		animal1.eat();
		animal2.eat();
		//如何判断一个对象的类型到底是什么类型
		/*
		 	instanceof 关键字用来判断对象是什么类型
		 	如果匹配返回true 如果不匹配返回false
		 */
		System.out.println(animal1 instanceof Dog);
		Dog dog = (Dog)animal1;
		dog.watchDoor();
		/*
		 	instanceof 在编译器,编码器
		 	对象的类型书写时,可以是父类,本类,子类
		 	
		 	instanceof 在运行期
		 	对象的类型为真的只有父类和本类,子类就不满足了
		 */
	}
}
