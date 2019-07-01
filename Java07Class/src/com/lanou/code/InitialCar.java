package com.lanou.code;

public class InitialCar {
	public static void main(String[] args) {
		
		Car car = new Car();
		car.setBrand("宝马740");
		/*
		 	1、推荐使用类名.类属性访问
		 	2、不推荐使用对象名.类属性访问
		 */
		Car.count++;
//		car.count++;
		Car car1 = new Car();
		Car.count++;
		System.out.println(Car.count);
		
		Car.staticMethod();
		car.staticMethod();
		car.nonStaticMethod();
		
		Car car2 = new Car("奔驰大G");
		System.out.println(car2.getBrand());
		
		
		
		
		
		
		
	
		
	}
}
