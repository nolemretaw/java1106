package com.lanou.factory;

public class Test {
	public static void main(String[] args) {
		Shape shape = ShapeFactory.getShape("Circle");
		shape.draw();
		Shape shape2 = ShapeFactory.getShape("Rectangle");
		shape2.draw();
	}
}
