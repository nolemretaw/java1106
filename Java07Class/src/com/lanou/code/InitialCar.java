package com.lanou.code;

public class InitialCar {
	public static void main(String[] args) {
		
		Car car = new Car();
		car.setBrand("����740");
		/*
		 	1���Ƽ�ʹ������.�����Է���
		 	2�����Ƽ�ʹ�ö�����.�����Է���
		 */
		Car.count++;
//		car.count++;
		Car car1 = new Car();
		Car.count++;
		System.out.println(Car.count);
		
		Car.staticMethod();
		car.staticMethod();
		car.nonStaticMethod();
		
		Car car2 = new Car("���۴�G");
		System.out.println(car2.getBrand());
		
		
		
		
		
		
		
	
		
	}
}
