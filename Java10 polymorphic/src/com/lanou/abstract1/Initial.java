package com.lanou.abstract1;

public class Initial {
	public static void main(String[] args) {
		Person person = new Student();
		Person person2 = new Worker();
		
		Rectangle rectangle = new Rectangle("red", "5", 100, 50);
		rectangle.draw();
		System.out.println(rectangle.perimeter());
		System.out.println(rectangle.area());
		
		Circle circle = new Circle("yellow", "1", 10);
		circle.draw();
		System.out.println(circle.perimeter());
		System.out.println(circle.area());
		
	}
}
