package com.lanou.polymorphic;

import java.util.ArrayList;
import java.util.List;

public class InitialAnimal {
	//根据传入的食物得到对应食物的动物
	public Animal getAnimal(String food) {
		if (food.equals("屎")) {
			//返回一个狗
			return new Dog();
		}
		if (food.equals("鱼")) {
			//返回一个猫
			return new Cat();
		}
		return null;
	}
	
	//观看动物吃东西 狗 猫
	public static void watch(Animal animal) {
		System.out.println("开始观看~");
		animal.eat();
		System.out.println("观看结束");
	}
	/*public void watch(Dog dog) {
		System.out.println("开始观看~");
		dog.eat();
		System.out.println("观看结束");
	}
	
	public void watch(Cat cat) {
		System.out.println("开始观看~");
		cat.eat();
		System.out.println("观看结束");
	}*/
	
	
	
	
	
	
	public static void main(String[] args) {
		/*Animal animal = new Animal();
		animal.eat();
		Dog dog = new Dog();
		dog.eat();
		Cat cat = new Cat();
		cat.eat();*/
		
		//父类的引用指向的子类对象
		/*
		 	继承多态
		 	1、继承关系
		 	2、对父类方法进行重写
		 	3、父类引用指向子类对象
		 */
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		animal1.eat();
		animal2.eat();
		//如何去判断一个对象的类型到底是什么类型
		/*
		 	instanceof 关键字用来判断对象是什么类型
		 	如果匹配返回true 如果不匹配返回false
		 */
		System.out.println(animal1 instanceof Dog);
		if (animal1 instanceof Dog) {
			Dog dog = (Dog)animal1;
			dog.watchDoor();
		}
		
		
		Animal a = new Animal();
		/*
		 	instanceof 在编译期，编码期
		 	对象的类型书写时，可以时父类、本类、子类
		 	
		 	instanceof 在运行期
		 	对象的类型为真的只有父类和本类，子类就不满足了
		 */
		System.out.println(a instanceof Object);
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Dog);
		
		Dog d = new Dog();
		Cat c = new Cat();
		watch(d);
		watch(c);
	
		
		
		
		
		
		
		
		
		
	}
}
