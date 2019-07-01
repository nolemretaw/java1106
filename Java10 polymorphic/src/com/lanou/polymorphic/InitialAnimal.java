package com.lanou.polymorphic;

import java.util.ArrayList;
import java.util.List;

public class InitialAnimal {
	//���ݴ����ʳ��õ���Ӧʳ��Ķ���
	public Animal getAnimal(String food) {
		if (food.equals("ʺ")) {
			//����һ����
			return new Dog();
		}
		if (food.equals("��")) {
			//����һ��è
			return new Cat();
		}
		return null;
	}
	
	//�ۿ�����Զ��� �� è
	public static void watch(Animal animal) {
		System.out.println("��ʼ�ۿ�~");
		animal.eat();
		System.out.println("�ۿ�����");
	}
	/*public void watch(Dog dog) {
		System.out.println("��ʼ�ۿ�~");
		dog.eat();
		System.out.println("�ۿ�����");
	}
	
	public void watch(Cat cat) {
		System.out.println("��ʼ�ۿ�~");
		cat.eat();
		System.out.println("�ۿ�����");
	}*/
	
	
	
	
	
	
	public static void main(String[] args) {
		/*Animal animal = new Animal();
		animal.eat();
		Dog dog = new Dog();
		dog.eat();
		Cat cat = new Cat();
		cat.eat();*/
		
		//���������ָ����������
		/*
		 	�̳ж�̬
		 	1���̳й�ϵ
		 	2���Ը��෽��������д
		 	3����������ָ���������
		 */
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		animal1.eat();
		animal2.eat();
		//���ȥ�ж�һ����������͵�����ʲô����
		/*
		 	instanceof �ؼ��������ж϶�����ʲô����
		 	���ƥ�䷵��true �����ƥ�䷵��false
		 */
		System.out.println(animal1 instanceof Dog);
		if (animal1 instanceof Dog) {
			Dog dog = (Dog)animal1;
			dog.watchDoor();
		}
		
		
		Animal a = new Animal();
		/*
		 	instanceof �ڱ����ڣ�������
		 	�����������дʱ������ʱ���ࡢ���ࡢ����
		 	
		 	instanceof ��������
		 	���������Ϊ���ֻ�и���ͱ��࣬����Ͳ�������
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
