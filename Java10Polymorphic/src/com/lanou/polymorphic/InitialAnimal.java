package com.lanou.polymorphic;

public class InitialAnimal {
	public static void main(String[] args) {
		/*Animal animal = new Animal();
		animal.eat();
		Dog dog = new Dog();
		dog.eat();
		Cat cat = new Cat();
		cat.eat();*/
		
		//���������ָ������������
		/*
		 	�̳ж�̬
		 		1.�̳й�ϵ
		 		2.�Ը��෽��������д
		 		3.��������ָ���������
		 */
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		animal1.eat();
		animal2.eat();
		//����ж�һ����������͵�����ʲô����
		/*
		 	instanceof �ؼ��������ж϶�����ʲô����
		 	���ƥ�䷵��true �����ƥ�䷵��false
		 */
		System.out.println(animal1 instanceof Dog);
		Dog dog = (Dog)animal1;
		dog.watchDoor();
		/*
		 	instanceof �ڱ�����,������
		 	�����������дʱ,�����Ǹ���,����,����
		 	
		 	instanceof ��������
		 	���������Ϊ���ֻ�и���ͱ���,����Ͳ�������
		 */
	}
}
