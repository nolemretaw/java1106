package com.lanou.code;

public class DogInitial {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setBreed("¹þÊ¿Ææ");
		System.out.println(dog.getBreed());
		dog.setAge(3);
		System.out.println(dog.getAge());
		dog.setColour("ºÚ°×");
		System.out.println(dog.getColour());
		
		Dog dog1 = new Dog();
		dog1.setBreed("ÈøÄ¦Ò®");
		System.out.println(dog1.getBreed());
		dog1.setAge(2);
		System.out.println(dog1.getAge());
		dog1.setColour("°×");
		System.out.println(dog1.getColour());
	}
}
